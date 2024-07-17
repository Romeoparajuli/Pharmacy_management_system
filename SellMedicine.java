
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import common.OpenPdf;
import java.sql.*;
import doc.ConnectionProvider;
import doc.PharmacyUtills;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.Date;

public class SellMedicine extends javax.swing.JFrame {

    public String numberPattern = "^[0-9]*$";
    public int finalTotalPrice = 0;
    private String billId = "";
    private String username = "";

    public SellMedicine() {
        initComponents();
    }

    public SellMedicine(String tempUsername) {
        initComponents();
        username = tempUsername;
        setLocationRelativeTo(null);

    }

    private void medicineName(String nameOrUniqueId) {

        DefaultTableModel model = (DefaultTableModel) medicineTable.getModel();
        model.setRowCount(0);
        try {
            java.sql.Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from medicine where name like '" + nameOrUniqueId + "%' or uniqueId like '" + nameOrUniqueId + "%'");
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("uniqueId") + "-   " + rs.getString("name")});

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    private void ClearMedicineFields() {
        txtUniqueId.setText("");
        txtName.setText("");
        txtBrandName.setText("");
        txtPrice.setText("");
        txtUnits.setText("");
        txtTotal.setText("");
    }

    public String getUniqueId(String prefix) {

        return prefix + System.nanoTime();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicineTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBrandName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtUnits = new javax.swing.JTextField();
        btnAddTocart = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        Purchase = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lblFinalTotalPrice = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUniqueId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Sell Medicine ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 6, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1364, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        jLabel2.setText("Search");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 76, 64, -1));

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 75, 452, -1));

        medicineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine"
            }
        ));
        medicineTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicineTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(medicineTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 115, -1, 624));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 82, -1));

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, 299, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Brand Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 82, -1));

        txtBrandName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtBrandName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtBrandName, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 299, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Price per Unit");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 90, 82, -1));

        txtPrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 130, 299, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Total Price ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 250, 82, 20));

        txtTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 290, 299, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("No.of Units ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 170, 82, -1));

        txtUnits.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUnits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnitsActionPerformed(evt);
            }
        });
        txtUnits.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUnitsKeyReleased(evt);
            }
        });
        getContentPane().add(txtUnits, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 200, 299, -1));

        btnAddTocart.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddTocart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add to cart.png"))); // NOI18N
        btnAddTocart.setText("Add to cart");
        btnAddTocart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTocartActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddTocart, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 350, -1, -1));

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "BrandName", "Price per Unit", "Number of Unit", "Total Price"
            }
        ));
        cartTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(cartTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 616, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 49, 1390, 10));

        Purchase.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Purchase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/generate bill & print.png"))); // NOI18N
        Purchase.setText("Purchase&Print");
        Purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PurchaseActionPerformed(evt);
            }
        });
        getContentPane().add(Purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 670, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Rs:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 670, 37, -1));

        lblFinalTotalPrice.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblFinalTotalPrice.setText("00");
        getContentPane().add(lblFinalTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 670, 90, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Medicine  ID");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 82, -1));

        txtUniqueId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUniqueId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniqueIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtUniqueId, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 299, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtBrandNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandNameActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtUnitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnitsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnitsActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:

        medicineName("");
        txtUniqueId.setEditable(false);
        txtName.setText("");
        txtBrandName.setEditable(false);
        txtPrice.setEditable(false);
        txtUnits.setEditable(true);
        txtTotal.setEditable(false);
    }//GEN-LAST:event_formComponentShown

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:

        String Search = txtSearch.getText();
        medicineName(Search);


    }//GEN-LAST:event_txtSearchKeyReleased

    private void medicineTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicineTableMouseClicked
        // TODO add your handling code here:

        int index = medicineTable.getSelectedRow();
        TableModel model = medicineTable.getModel();
        String nameOrUniqueId = model.getValueAt(index, 0).toString();
        String uniqueId[] = nameOrUniqueId.split("-", 0);

        try {
            java.sql.Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from medicine where uniqueId ='" + uniqueId[0] + "'");
            while (rs.next()) {
                txtUniqueId.setText(uniqueId[0]);
                txtName.setText(rs.getString("name"));
                txtBrandName.setText(rs.getString("brandname"));
                txtPrice.setText(rs.getString("price"));
                txtUnits.setText("");
                txtTotal.setText(" ");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_medicineTableMouseClicked

    private void txtUnitsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnitsKeyReleased
        // TODO add your handling code here:

        String noOfUnits = txtUnits.getText();
        if (!noOfUnits.equals("")) {
            String price = txtPrice.getText();
            if (!noOfUnits.matches(numberPattern)) {
                JOptionPane.showMessageDialog(null, " Number of Units Field is Invalid!");

            }

            int totalPrice = Integer.parseInt(noOfUnits) * Integer.parseInt(price);
            txtTotal.setText(String.valueOf(totalPrice));

        } else {
            txtTotal.setText("");

        }

    }//GEN-LAST:event_txtUnitsKeyReleased

    private void btnAddTocartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTocartActionPerformed
        // TODO add your handling code here:
        String noOfUnits = txtUnits.getText();
        String uniqueId = txtUniqueId.getText();
        int totalPriceInt = 0; // Declare totalPriceInt

        if (!noOfUnits.equals("") && !uniqueId.equals("")) {
            String name = txtName.getText();
            String brandName = txtBrandName.getText();
            String price = txtPrice.getText();
            String totalPrice = txtTotal.getText();
            int checkStock = 0;
            int checkMedicineAlreadyExistInCart = 0;

            try {
                // Check if the input fields contain valid integers
                int units = Integer.parseInt(noOfUnits);
                totalPriceInt = Integer.parseInt(totalPrice);

                java.sql.Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM medicine WHERE uniqueId = '" + uniqueId + "'");
                while (rs.next()) {
                    if (rs.getInt("quantity") >= units) {
                        checkStock = 1;
                    } else {
                        JOptionPane.showMessageDialog(null, "Medicine is out of Stock. Only " + rs.getInt("quantity") + " left");
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid numeric input.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

            if (checkStock == 1) {
                DefaultTableModel dtm = (DefaultTableModel) cartTable.getModel();
                if (cartTable.getRowCount() != 0) {
                    for (int i = 0; i < cartTable.getRowCount(); i++) {
                        if (dtm.getValueAt(i, 0).toString().equals(uniqueId)) {
                            checkMedicineAlreadyExistInCart = 1;
                            JOptionPane.showMessageDialog(null, "Medicine already exists in the cart");
                        }
                    }
                }
                if (checkMedicineAlreadyExistInCart == 0) {
                    // Modify the order of data when adding a row to cartTable
                    dtm.addRow(new Object[]{name, brandName, price, noOfUnits, totalPrice});
                    finalTotalPrice += totalPriceInt;
                    lblFinalTotalPrice.setText(String.valueOf(finalTotalPrice));
                    JOptionPane.showMessageDialog(null, "Added successfully");
                }
                ClearMedicineFields();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Number of Units and Medicine Field is Required!");
        }


    }//GEN-LAST:event_btnAddTocartActionPerformed

    private void txtUniqueIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniqueIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUniqueIdActionPerformed

    private void cartTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartTableMouseClicked
        // TODO add your handling code here:

        int selectedRow = cartTable.getSelectedRow();

        if (selectedRow >= 0) {
            int option = JOptionPane.showConfirmDialog(null, "Do you want to remove this medicine?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.YES_OPTION) {
                DefaultTableModel model = (DefaultTableModel) cartTable.getModel();
                String totalStr = model.getValueAt(selectedRow, 4).toString();

                try {
                    int total = Integer.parseInt(totalStr);
                    finalTotalPrice -= total;
                    lblFinalTotalPrice.setText(String.valueOf(finalTotalPrice));
                    model.removeRow(selectedRow);
                } catch (NumberFormatException e) {
                    // Handle parsing error if 'totalStr' is not a valid integer
                    JOptionPane.showMessageDialog(null, "Invalid total value.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No row selected.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_cartTableMouseClicked

    private void PurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PurchaseActionPerformed
        // TODO add your handling code here:
        if (finalTotalPrice != 0) {
            billId = getUniqueId("Bill-");
            DefaultTableModel dmt = (DefaultTableModel) cartTable.getModel();
            if (cartTable.getRowCount() != 0) {
                for (int i = 0; i < cartTable.getRowCount(); i++) {
                    try {
                        java.sql.Connection con = ConnectionProvider.getCon();
                        Statement st = con.createStatement();

                        st.executeUpdate("update medicine set quantity = quantity - " + Integer.parseInt(dmt.getValueAt(i, 4).toString()) + "  where uniqueId = " + Integer.parseInt(dmt.getValueAt(i, 0).toString()));

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            }
            try {
                SimpleDateFormat my = new SimpleDateFormat("dd-Mm-yyyy");
                Calendar cal = Calendar.getInstance();
                java.sql.Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                PreparedStatement ps = con.prepareStatement("insert into  bill(billId,billDate,totalPaid,generatedBy)values(?,?,?,?)");
                ps.setString(1, billId);
                ps.setString(2, my.format(cal.getTime()));
                ps.setLong(3, finalTotalPrice);
                ps.setString(4, username);
                ps.executeUpdate(); 

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);

            }

            com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
            try {
                PdfWriter.getInstance(doc, new FileOutputStream(PharmacyUtills.billPath + "" + billId + ".pdf"));
                doc.open();
                Paragraph PhamacyName = new Paragraph("                                                   Crimson Pharma         ");
                doc.add(PhamacyName);
                Paragraph starLine = new Paragraph(" *****************************************************************************************************         ");
                doc.add(starLine);
                Paragraph details = new Paragraph("\t Bill ID::" + billId + "\nDate::" + new Date() + "\nTotal Paid::" + finalTotalPrice);
                doc.add(details);
                Paragraph gent= new Paragraph("Generated By::"+username);
                doc.add(gent);
                doc.add(starLine);
                PdfPTable tbl = new PdfPTable(5);
                tbl.addCell("Name");
                tbl.addCell("Brand Name");
                tbl.addCell("Price Per Unit");
                tbl.addCell("Number of Units");
                tbl.addCell(" Sub Total Price ");
                for (int i=0; i<cartTable.getRowCount();i++){
                    String  a = cartTable.getValueAt(i, 0).toString();
                    String  b = cartTable.getValueAt(i, 1).toString();
                    String  c= cartTable.getValueAt(i, 2).toString();
                    String  d = cartTable.getValueAt(i, 3).toString();
                    String  e = cartTable.getValueAt(i, 4).toString();
                    tbl.addCell(a);
                    tbl.addCell(b);
                    tbl.addCell(c);
                    tbl.addCell(d);
                    tbl.addCell(e);
                }
                
                doc.add(tbl);
                doc.add(starLine);
                Paragraph Line= new Paragraph("Thank you, \n Get well soon ..");
                doc.add(Line);
                OpenPdf.openById(billId);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);

            }
            doc.close();

            setVisible(false);
            new SellMedicine(username).setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Please Add Medicine to Cart!");

        }
    }//GEN-LAST:event_PurchaseActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Purchase;
    private javax.swing.JButton btnAddTocart;
    private javax.swing.JTable cartTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFinalTotalPrice;
    private javax.swing.JTable medicineTable;
    private javax.swing.JTextField txtBrandName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtUniqueId;
    private javax.swing.JTextField txtUnits;
    // End of variables declaration//GEN-END:variables
}
