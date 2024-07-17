package doc;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Tables {

    public static void main(String args[]) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            //*  String createTableSQL = "CREATE TABLE appuser ("
            //  + "appuser_pk INT AUTO_INCREMENT PRIMARY KEY, "
            //  + "userRole VARCHAR(200), "
            //  + "name VARCHAR(200), "
            //  + "mobileNumber VARCHAR(10), "
            //   + "email VARCHAR(50), "
            //   + "username VARCHAR(50), "
            //   + "password VARCHAR(50), "
            //   + "address VARCHAR(50))";

            // st.execute(createTableSQL);
            //st.execute("insert into appuser( userRole,name,mobileNumber,email,username,password,address) values('Admin','Admin','0011001122','admin@email.com','admin','admin','nepal')");
             //st.executeUpdate("CREATE TABLE medicine (medicine_pk INT AUTO_INCREMENT PRIMARY KEY, uniqueId VARCHAR(200), name VARCHAR(200), brandName VARCHAR(200), quantity BIGINT, price BIGINT, manufacturedDate DATE, expiryDate DATE, batchNumber BIGINT)");
           //st.executeUpdate("DROP TABLE medicine ");
           //st.executeUpdate("CREATE TABLE bill  ( bill_pk INT AUTO_INCREMENT PRIMARY KEY,billId VARCHAR(200), billDate VARCHAR(59),  totalPaid BIGINT,generatedBy VARCHAR(20))");
            JOptionPane.showMessageDialog(null, "Table created successfully");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }
}
