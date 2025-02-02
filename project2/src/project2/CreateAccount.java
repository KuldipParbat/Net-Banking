package project2;


import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CreateAccount extends javax.swing.JFrame {

    /**
     * Creates new form CreateAccount
     */
    static public String Ac;
    public Connection connect;
    public CreateAccount() {
        initComponents();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Heading = new javax.swing.JLabel();
        BackButton = new javax.swing.JLabel();
        FirstName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LastName = new javax.swing.JTextField();
        MobileNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PanNumber = new javax.swing.JTextField();
        AccountNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AdharNumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        DebitNumber = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PIN = new javax.swing.JPasswordField();
        CheckButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CloseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 5));

        Heading.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        Heading.setForeground(new java.awt.Color(0, 0, 255));
        Heading.setText("Verify Your Bank Account");

        BackButton.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        BackButton.setForeground(new java.awt.Color(153, 153, 153));
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2/Images/icons8-back-arrow-30.png"))); // NOI18N
        BackButton.setText("Go Back");
        BackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });

        FirstName.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameActionPerformed(evt);
            }
        });

        jLabel3.setText("First Name");

        jLabel4.setText("Last Name");

        LastName.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameActionPerformed(evt);
            }
        });

        MobileNumber.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        MobileNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MobileNumberActionPerformed(evt);
            }
        });

        jLabel5.setText("Mobile Number");

        jLabel6.setText("Pan Number");

        PanNumber.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        PanNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PanNumberActionPerformed(evt);
            }
        });

        AccountNumber.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        AccountNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountNumberActionPerformed(evt);
            }
        });

        jLabel7.setText("Account Number");

        AdharNumber.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        AdharNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdharNumberActionPerformed(evt);
            }
        });

        jLabel8.setText("Adhar Number");

        DebitNumber.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        DebitNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DebitNumberActionPerformed(evt);
            }
        });

        jLabel9.setText("Debit Card Number");

        jLabel10.setText("PIN");

        CheckButton.setBackground(new java.awt.Color(0, 0, 255));
        CheckButton.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        CheckButton.setForeground(new java.awt.Color(255, 255, 255));
        CheckButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2/Images/icons8-search-client-30.png"))); // NOI18N
        CheckButton.setText("Check Details");
        CheckButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2/Images/icons8-circled-user-male-skin-type-1-2-100 (2).png"))); // NOI18N

        CloseButton.setBackground(new java.awt.Color(255, 0, 0));
        CloseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2/Images/icons8-close-window-30.png"))); // NOI18N
        CloseButton.setBorder(null);
        CloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseButtonMouseClicked(evt);
            }
        });
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(MobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(AccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(DebitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(142, 142, 142)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(LastName, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(PanNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(AdharNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(PIN)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(Heading))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(CheckButton)))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(BackButton)
                .addGap(310, 310, 310)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Heading)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AdharNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DebitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PIN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(CheckButton)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CheckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckButtonActionPerformed
        // TODO add your handling code here:
        String MobileNo = MobileNumber.getText();
        String PanNo = PanNumber.getText();
        String AccountNo = AccountNumber.getText();
        String AdharNo = AdharNumber.getText();
        String DebitCardNo = DebitNumber.getText();
        String PinNo = PIN.getText();
        boolean Checker = true;

        if(MobileNo.matches("^[0-9]*$") && MobileNo.length()==10){
            Checker=true;
            MobileNumber.setBackground(Color.GREEN);
        }
        else{
            Checker=false;
            MobileNumber.setBackground(new Color(246, 53, 40));
        }

        if(PanNo.length()==10){
            Checker=true;
            PanNumber.setBackground(Color.GREEN);
        }
        else{
            Checker=false;
            PanNumber.setBackground(new Color(246, 53, 40));
        }

        if(AccountNo.matches("^[0-9]*$") && AccountNo.length()==12){
            Checker=true;
            AccountNumber.setBackground(Color.GREEN);
        }
        else{
            Checker=false;
            AccountNumber.setBackground(new Color(246, 53, 40));
        }

        if(AdharNo.matches("^[0-9]*$") && AdharNo.length()==12){
            Checker=true;
            AdharNumber.setBackground(Color.GREEN);
        }
        else{
            Checker=false;
            AdharNumber.setBackground(new Color(246, 53, 40));
        }

        if(DebitCardNo.matches("^[0-9]*$") && DebitCardNo.length()==16){
            Checker=true;
            DebitNumber.setBackground(Color.GREEN);
        }
        else{
            Checker=false;
            DebitNumber.setBackground(new Color(246, 53, 40));
        }

        if(PinNo.matches("^[0-9]*$") && PinNo.length()==4){
            Checker=true;
            PIN.setBackground(Color.GREEN);
        }
        else{
            Checker=false;
            PIN.setBackground(new Color(246, 53, 40));
        }

        //        Database Connection and queries

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/rk_bank","root","Kuldip@2151");
            String query = "Select * from customer_detail where First_Name=? AND Last_Name=? AND Mobile_Number=? AND Pan_Number=? AND Account_Number=? AND Adhar_Number=? AND Debit_Card_Number=? AND Pin_Number=?";
            PreparedStatement pst = connect.prepareStatement(query);
            pst.setString(1, FirstName.getText());
            pst.setString(2, LastName.getText());
            pst.setString(3, MobileNumber.getText());
            pst.setString(4, PanNumber.getText());
            pst.setString(5, AccountNumber.getText());
            pst.setString(6, AdharNumber.getText());
            pst.setString(7, DebitNumber.getText());
            pst.setString(8, PIN.getText());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){

                Ac=  AccountNumber.getText();
    
                try {
                    String query2 = "Select * from logindetail where AccountNumber= ?";
                    PreparedStatement ps = connect.prepareStatement(query2);
                    ps.setString(1, AccountNumber.getText());
                    ResultSet rt = ps.executeQuery();
                    if(rt.next()){
                        JOptionPane.showMessageDialog(null, "You Have Alreay Created Account please login or Call to Bank");
                        setVisible(false);
                        new Login().setVisible(true);
                        dispose();
                    }
                    else{
                        MailVerification Mv = new MailVerification();
                        setVisible(false);
                        dispose();
                        Mv.setVisible(true);
                        FirstName.setText("");
                        LastName.setText("");
                        MobileNumber.setText("");
                        AccountNumber.setText("");
                        PanNumber.setText("");
                        AdharNumber.setText("");
                        DebitNumber.setText("");
                        PIN.setText("");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Credential ! Please Enter Valid Detail Or Call To Bank");

            }
            connect.close();
        } catch (ClassNotFoundException | SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
              JOptionPane.showMessageDialog(null, "We Cannot Communicate With Server! \n Please Check Your internet Connection or call to bank");
        }
    }//GEN-LAST:event_CheckButtonActionPerformed

    private void DebitNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DebitNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DebitNumberActionPerformed

    private void AdharNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdharNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdharNumberActionPerformed

    private void AccountNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccountNumberActionPerformed

    private void PanNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PanNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PanNumberActionPerformed

    private void MobileNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MobileNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MobileNumberActionPerformed

    private void LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameActionPerformed

    private void FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameActionPerformed

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        setVisible(false);
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_BackButtonMouseClicked

    private void CloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseButtonMouseClicked

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
         System.exit(0);
    }//GEN-LAST:event_CloseButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccountNumber;
    private javax.swing.JTextField AdharNumber;
    private javax.swing.JLabel BackButton;
    private javax.swing.JButton CheckButton;
    private javax.swing.JButton CloseButton;
    private javax.swing.JTextField DebitNumber;
    private javax.swing.JTextField FirstName;
    private javax.swing.JLabel Heading;
    private javax.swing.JTextField LastName;
    private javax.swing.JTextField MobileNumber;
    private javax.swing.JPasswordField PIN;
    private javax.swing.JTextField PanNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
