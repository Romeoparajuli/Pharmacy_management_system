
import doc.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;




public class UpdateMedicine extends javax.swing.JFrame {
     public String numberPattern = "^[0-9]*$";
     

    public UpdateMedicine() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtQuantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtMenuDate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtExpiry = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBatch = new javax.swing.JTextField();
        txtBrandname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtQuantity1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtMedicineId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 476));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Update Medicine");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 6, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(824, 6, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, 850, 10));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Batch Number");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Brand name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 109, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.png"))); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, -1, -1));

        txtQuantity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        getContentPane().add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 300, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Quantity (stock)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Price per Unit");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 90, 20));

        txtPrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 300, 30));

        txtMenuDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMenuDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMenuDateActionPerformed(evt);
            }
        });
        getContentPane().add(txtMenuDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 300, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Manufactured Date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        txtname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 364, 30));

        txtExpiry.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtExpiry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExpiryActionPerformed(evt);
            }
        });
        getContentPane().add(txtExpiry, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 300, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Expiry Date");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 109, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 71, -1));

        txtBatch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtBatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBatchActionPerformed(evt);
            }
        });
        getContentPane().add(txtBatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 300, -1));

        txtBrandname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtBrandname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtBrandname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 300, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Add Quantity");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, -1, -1));

        txtQuantity1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtQuantity1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantity1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtQuantity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 151, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Medicine ID");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 90, 20));

        txtMedicineId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMedicineId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicineIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtMedicineId, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 300, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    String medicineId=txtMedicineId.getText();
    String name = txtname.getText();
    String brandName = txtBrandname.getText();
    String quantity = txtQuantity.getText();
    String AddquantityStr = txtQuantity1.getText();
    String price = txtPrice.getText();
    String manufacturedDate = txtMenuDate.getText();
    String expiryDate = txtExpiry.getText();
    String batchNumber = txtBatch.getText();
    
    int totalQuantity=0;
    if(AddquantityStr.equals("")){
        totalQuantity = Integer.parseInt(quantity);
        
    }else{
    
    totalQuantity= Integer.parseInt(quantity)+Integer.parseInt(AddquantityStr);
    
    }
    
    if (medicineId.isEmpty()||name.isEmpty() || brandName.isEmpty() || quantity.isEmpty() || price.isEmpty()
            || manufacturedDate.isEmpty() || expiryDate.isEmpty() || batchNumber.isEmpty()) {
        JOptionPane.showMessageDialog(null, "All fields are required!");
    } 
    else if ( quantity.isEmpty()){
          JOptionPane.showMessageDialog(null, "Quantity field is invalid!");
        
    }
        else if ( price.isEmpty()){
          JOptionPane.showMessageDialog(null, "Price per unit field is invalid!");
        
    }
        else{
        try{
             Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("INSERT INTO medicine (uniqueId, name, brandName, quantity, price, manufacturedDate, expiryDate, batchNumber) VALUES (?, ?, ?, ?, ?, ?, ?,?)");
            ps.setString(1, medicineId);
            ps.setString(2, name);
            ps.setString(3, brandName);
            ps.setLong(4, totalQuantity);
            ps.setString(5, price);
            ps.setString(6, manufacturedDate);
            ps.setString(7, expiryDate);
            ps.setString(8, batchNumber);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Medicine Updated Sucessfully");
            setVisible(false);
            new UpdateMedicine().setVisible(true);
        }
        catch(Exception  e){
               JOptionPane.showMessageDialog(null, e);
        }
               

        
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtMenuDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMenuDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMenuDateActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtExpiryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExpiryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExpiryActionPerformed

    private void txtBatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBatchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBatchActionPerformed

    private void txtBrandnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandnameActionPerformed

    private void txtQuantity1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantity1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantity1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         // TODO add your handling code here:
        
      int checkMedicineExist = 0;
    String name = txtname.getText();
    
    if (name.equals("")) {
        JOptionPane.showMessageDialog(null, "Medicine name field is required");
    } else {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM medicine WHERE name = '" + name + "'");
            
            while (rs.next()) {
                txtname.setEditable(false);
                txtMedicineId.setEditable(false);
             txtMedicineId .setText(rs.getString("uniqueId"));
                txtBrandname.setText(rs.getString("BrandName"));
                txtQuantity.setText(rs.getString("quantity"));
                txtQuantity.setEditable(false);
                txtPrice.setText(rs.getString("price"));
                txtMenuDate.setText(rs.getString("manufacturedDate"));
                txtExpiry.setText(rs.getString("expiryDate"));
                txtBatch.setText(rs.getString("batchNumber"));
                
                checkMedicineExist=1;
                
            
            }

            // Close the result set and statement after use
            rs.close();
            st.close();
            
            if (checkMedicineExist == 0) {
                JOptionPane.showMessageDialog(null, "Medicine does not exist");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtMedicineIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicineIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicineIdActionPerformed

 
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
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtBatch;
    private javax.swing.JTextField txtBrandname;
    private javax.swing.JTextField txtExpiry;
    private javax.swing.JTextField txtMedicineId;
    private javax.swing.JTextField txtMenuDate;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtQuantity1;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
