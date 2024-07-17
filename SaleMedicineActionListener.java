import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;

public class SaleMedicineActionListener implements ActionListener {
    private double finalTotalPrice;
    private CartItem[] cart;
    private Connection databaseConnection;
    private SellMedicine currentWindow;

    public SaleMedicineActionListener(
            double finalTotalPrice,
            CartItem[] cart,
            Connection databaseConnection,
            SellMedicine currentWindow
    ) {
        this.finalTotalPrice = finalTotalPrice;
        this.cart = cart;
        this.databaseConnection = databaseConnection;
        this.currentWindow = currentWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (finalTotalPrice != 0) {
            try {
                // Step 1: Generate a unique bill ID
                String billId = generateBillId();

                // Step 2: Update quantity of medicines in the database
                updateMedicineQuantities(cart);

                // Step 3: Insert a new record into the "bill" table
                insertBillRecord(billId);

                // Step 4: Create a PDF document
                Document document = createBillPdf(billId);

                // Step 5: Add a table to the PDF to display medicine details
                addMedicineDetailsTable(document);

                // Step 6: Print a thank you message in the PDF
                addThankYouMessage(document);

                // Step 7: Save the PDF with a filename based on the billId
                savePdfDocument(document, billId);

                // Step 8: Close the PDF document
                document.close();

                // Step 9: Set the current window to not visible and open a new SellMedicine window
                currentWindow.setVisible(false);
                SellMedicine newWindow = new SellMedicine();
                newWindow.setVisible(true);

            } catch (Exception ex) {
                ex.printStackTrace();
                // Handle and display error message
            }
        }
    }

    private String generateBillId() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        return dateFormat.format(new Date());
    }

    private void updateMedicineQuantities(CartItem[] cart) throws SQLException {
        // Implement logic to update medicine quantities in the database
    }

    private void insertBillRecord(String billId) throws SQLException {
        String insertQuery = "INSERT INTO bill (bill_id, bill_date, total_paid) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = databaseConnection.prepareStatement(insertQuery)) {
            preparedStatement.setString(1, billId);
            preparedStatement.setDate(2, new java.sql.Date(System.currentTimeMillis()));
            preparedStatement.setDouble(3, finalTotalPrice);
            preparedStatement.executeUpdate();
        }
    }

    private Document createBillPdf(String billId) throws DocumentException, FileNotFoundException {
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, new FileOutputStream(billId + ".pdf"));
        document.open();
        document.add(new Paragraph("Bill ID: " + billId));
        return document;
    }

    private void addMedicineDetailsTable(Document document) throws DocumentException {
        PdfPTable table = new PdfPTable(3);
        table.setWidthPercentage(100);
        table.addCell(new Phrase("Medicine Name"));
        table.addCell(new Phrase("Quantity"));
        table.addCell(new Phrase("Price"));
        
        // Add rows to the table with medicine details from the cart
        for (CartItem item : cart) {
            table.addCell(item.getMedicineName());
            table.addCell(String.valueOf(item.getQuantity()));
            table.addCell(String.valueOf(item.getPrice()));
        }

        document.add(table);
    }

    private void addThankYouMessage(Document document) throws DocumentException {
        document.add(new Paragraph("Thank you for your purchase!"));
    }

    private void savePdfDocument(Document document, String billId) throws DocumentException, IOException {
        PdfWriter.getInstance(document, new FileOutputStream(billId + ".pdf"));
        document.close();
    }

    public static class CartItem {
        private String medicineName;
        private int quantity;
        private double price;

        public CartItem(String medicineName, int quantity, double price) {
            this.medicineName = medicineName;
            this.quantity = quantity;
            this.price = price;
        }

        public String getMedicineName() {
            return medicineName;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getPrice() {
            return price;
        }
    }
}