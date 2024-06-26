/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package multiplayerquizapplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import multiplayerquizapplication.QuestionSelectionPage;

/**
 *
 * @author Sabit
 */
public class LoginPage extends javax.swing.JFrame {

    private boolean player1LoginSuccessful = false;
    private boolean player2LoginSuccessful = false;
    public static Player playertopass1 , playertopass2;
    public static Player[] playersfromlogin;

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
        playersfromlogin = MultiplayerQuizApplication.playerRead("player.txt");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LoginLable1 = new javax.swing.JLabel();
        player1NameLabel = new javax.swing.JLabel();
        player1PasswordEntry = new javax.swing.JLabel();
        Player1NameTextField = new javax.swing.JTextField();
        Player1PasswordField = new javax.swing.JPasswordField();
        Player1LoginButton = new javax.swing.JButton();
        Player1RegisterButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        LoginLabel2 = new javax.swing.JLabel();
        player2NameLabel = new javax.swing.JLabel();
        player1PasswordLable = new javax.swing.JLabel();
        Player2NameTextField = new javax.swing.JTextField();
        Player2RegisterButton = new javax.swing.JButton();
        Player2LoginButton = new javax.swing.JButton();
        Player2PasswordField = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Login2Success = new javax.swing.JTextField();
        Login1Success = new javax.swing.JTextField();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(255, 255, 102));
        setLocation(new java.awt.Point(400, 100));
        setPreferredSize(new java.awt.Dimension(1080, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(540, 360));

        LoginLable1.setBackground(new java.awt.Color(255, 255, 255));
        LoginLable1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LoginLable1.setForeground(new java.awt.Color(0, 51, 51));
        LoginLable1.setText("Login Player 1");

        player1NameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        player1NameLabel.setForeground(new java.awt.Color(0, 51, 51));
        player1NameLabel.setText("Name        :");

        player1PasswordEntry.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        player1PasswordEntry.setForeground(new java.awt.Color(0, 51, 51));
        player1PasswordEntry.setText("Password :");

        Player1NameTextField.setBackground(new java.awt.Color(255, 255, 255));
        Player1NameTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Player1NameTextField.setForeground(new java.awt.Color(102, 102, 102));

        Player1PasswordField.setBackground(new java.awt.Color(255, 255, 255));
        Player1PasswordField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        Player1LoginButton.setBackground(new java.awt.Color(204, 0, 0));
        Player1LoginButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Player1LoginButton.setForeground(new java.awt.Color(0, 0, 0));
        Player1LoginButton.setText("Login");
        Player1LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Player1LoginButtonActionPerformed(evt);
            }
        });

        Player1RegisterButton.setBackground(new java.awt.Color(204, 0, 0));
        Player1RegisterButton.setForeground(new java.awt.Color(0, 0, 0));
        Player1RegisterButton.setText("Register");
        Player1RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Player1RegisterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addComponent(LoginLable1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(player1PasswordEntry)
                    .addComponent(Player1RegisterButton)
                    .addComponent(player1NameLabel, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Player1NameTextField)
                    .addComponent(Player1PasswordField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Player1LoginButton)))
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(LoginLable1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player1NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Player1NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player1PasswordEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Player1PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player1RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Player1LoginButton))
                .addGap(247, 247, 247))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(540, 360));

        LoginLabel2.setBackground(new java.awt.Color(255, 255, 255));
        LoginLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LoginLabel2.setForeground(new java.awt.Color(0, 51, 51));
        LoginLabel2.setText("Login Player 2");

        player2NameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        player2NameLabel.setForeground(new java.awt.Color(0, 51, 51));
        player2NameLabel.setText("Name        :");

        player1PasswordLable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        player1PasswordLable.setForeground(new java.awt.Color(0, 51, 51));
        player1PasswordLable.setText("Password :");

        Player2NameTextField.setBackground(new java.awt.Color(255, 255, 255));
        Player2NameTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Player2NameTextField.setForeground(new java.awt.Color(102, 102, 102));

        Player2RegisterButton.setBackground(new java.awt.Color(204, 0, 0));
        Player2RegisterButton.setForeground(new java.awt.Color(0, 0, 0));
        Player2RegisterButton.setText("Register");
        Player2RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Player2RegisterButtonActionPerformed(evt);
            }
        });

        Player2LoginButton.setBackground(new java.awt.Color(204, 0, 0));
        Player2LoginButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Player2LoginButton.setForeground(new java.awt.Color(0, 0, 0));
        Player2LoginButton.setText("Login");
        Player2LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Player2LoginButtonActionPerformed(evt);
            }
        });

        Player2PasswordField.setBackground(new java.awt.Color(255, 255, 255));
        Player2PasswordField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(player1PasswordLable)
                        .addGap(18, 18, 18)
                        .addComponent(Player2PasswordField)
                        .addGap(76, 76, 76))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(player2NameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(Player2NameTextField)
                        .addGap(77, 77, 77))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(Player2RegisterButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Player2LoginButton)
                .addGap(62, 62, 62))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addComponent(LoginLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(LoginLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player2NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Player2NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player1PasswordLable, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Player2PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player2RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Player2LoginButton))
                .addGap(247, 247, 247))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Login2Success.setEditable(false);
        Login2Success.setBackground(new java.awt.Color(255, 255, 102));
        Login2Success.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Login2Success.setForeground(new java.awt.Color(0, 0, 0));

        Login1Success.setEditable(false);
        Login1Success.setBackground(new java.awt.Color(51, 255, 255));
        Login1Success.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Login1Success.setForeground(new java.awt.Color(0, 0, 0));
        Login1Success.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login1SuccessActionPerformed(evt);
            }
        });

        ExitButton.setBackground(new java.awt.Color(51, 51, 51));
        ExitButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("Exit Game");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(505, 505, 505))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(497, 497, 497))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Login1Success, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Login2Success, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Login1Success, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Login2Success, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(ExitButton)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Player1RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Player1RegisterButtonActionPerformed
        // TODO add your handling code here:
        RegisterPage registerpage = new RegisterPage();
        registerpage.show();
        dispose();
    }//GEN-LAST:event_Player1RegisterButtonActionPerformed

    private void Player2RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Player2RegisterButtonActionPerformed
        // TODO add your handling code here:
        RegisterPage registerpage = new RegisterPage();
        registerpage.show();
        dispose();
    }//GEN-LAST:event_Player2RegisterButtonActionPerformed

    private void Player1LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Player1LoginButtonActionPerformed
        // TODO add your handling code here:
        String playerName = Player1NameTextField.getText();
        String playerPassword = Player1PasswordField.getText();
        boolean loginSuccessful = false;
        String playerName2 = Player2NameTextField.getText();
         
        if(playerName.equals(playerName2)){
            Login1Success.setText("Same name found!");
        }
        else{
        playertopass1 = MultiplayerQuizApplication.searchPlayer(playersfromlogin,playerName,playerPassword);

        if (playertopass1 != null) {
            player1LoginSuccessful = true;
           
            
            Login1Success.setText("Login successful");
            System.out.println(playertopass1.toString());
            
        } else {
            // Show error message
            Login1Success.setText("Player not found!");
            //System.out.println(playerName + "Doesn't exist!");
        }
        }
    }//GEN-LAST:event_Player1LoginButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        if (player1LoginSuccessful == true && player2LoginSuccessful == true) {
            QuestionSelectionPage questionselectionpage = new QuestionSelectionPage();
            questionselectionpage.show();
            dispose();
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Both player must be logged in to start.", "Login required.", javax.swing.JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        ExitPage exitpage = new ExitPage();
        exitpage.show();
        dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void Player1NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Player1NameTextFieldActionPerformed


    }//GEN-LAST:event_Player1NameTextFieldActionPerformed

    private void Player2LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Player2LoginButtonActionPerformed
        // TODO add your handling code here:
        String playerName = Player2NameTextField.getText();
        String playerPassword = Player2PasswordField.getText();
        boolean loginSuccessful = false;
        String playerName1 = Player1NameTextField.getText();
         
        if(playerName.equals(playerName1)){
            Login2Success.setText("Same name found!");
        }
        else{
         playertopass2 = MultiplayerQuizApplication.searchPlayer(playersfromlogin,playerName,playerPassword);

        if (playertopass2 != null) {
            player2LoginSuccessful = true;
            Login2Success.setText("Login Successful");
            System.out.println(playertopass2.toString());
            
        } else {
            // Show error message
            Login2Success.setText("Player Not Found");
            
        }
        }
    }//GEN-LAST:event_Player2LoginButtonActionPerformed

    private void Player1PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Player1PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Player1PasswordFieldActionPerformed

    private void Login1SuccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login1SuccessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Login1SuccessActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField Login1Success;
    private javax.swing.JTextField Login2Success;
    private javax.swing.JLabel LoginLabel2;
    private javax.swing.JLabel LoginLable1;
    private javax.swing.JButton Player1LoginButton;
    private javax.swing.JTextField Player1NameTextField;
    private javax.swing.JPasswordField Player1PasswordField;
    private javax.swing.JButton Player1RegisterButton;
    private javax.swing.JButton Player2LoginButton;
    private javax.swing.JTextField Player2NameTextField;
    private javax.swing.JPasswordField Player2PasswordField;
    private javax.swing.JButton Player2RegisterButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel player1NameLabel;
    private javax.swing.JLabel player1PasswordEntry;
    private javax.swing.JLabel player1PasswordLable;
    private javax.swing.JLabel player2NameLabel;
    // End of variables declaration//GEN-END:variables
}