
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Records Section
 */
public class zodiacfinal extends javax.swing.JFrame {

    /**
     * Creates new form zodiacfinal
     */
    public zodiacfinal() {
        initComponents();
        
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        calculate = new javax.swing.JButton();
        outTF = new javax.swing.JTextField();
        mthTF = new javax.swing.JTextField();
        dayTF = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setLabelFor(dayTF);
        jLabel2.setText("DAY:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 110, 70, 20);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setLabelFor(mthTF);
        jLabel5.setText("Month:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 70, 70, 20);

        calculate.setBackground(new java.awt.Color(102, 102, 102));
        calculate.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        calculate.setForeground(new java.awt.Color(255, 255, 255));
        calculate.setText("OK");
        calculate.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));
        calculate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });
        getContentPane().add(calculate);
        calculate.setBounds(150, 150, 90, 30);

        outTF.setBackground(new java.awt.Color(51, 51, 51));
        outTF.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        outTF.setForeground(new java.awt.Color(255, 255, 255));
        outTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        outTF.setCaretColor(new java.awt.Color(255, 255, 255));
        outTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outTFActionPerformed(evt);
            }
        });
        getContentPane().add(outTF);
        outTF.setBounds(70, 198, 255, 50);

        mthTF.setBackground(new java.awt.Color(51, 51, 51));
        mthTF.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        mthTF.setForeground(new java.awt.Color(255, 255, 255));
        mthTF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.darkGray, null, null));
        mthTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mthTFActionPerformed(evt);
            }
        });
        getContentPane().add(mthTF);
        mthTF.setBounds(180, 70, 90, 20);

        dayTF.setBackground(new java.awt.Color(51, 51, 51));
        dayTF.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        dayTF.setForeground(new java.awt.Color(255, 255, 255));
        dayTF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.darkGray, null, null));
        getContentPane().add(dayTF);
        dayTF.setBounds(180, 110, 90, 20);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ZODIAC SIGN");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 30, 150, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
       double dayD, monthD;
        dayD = Double.parseDouble(dayTF.getText());
        monthD = Double.parseDouble(mthTF.getText());
        
        if ((monthD == 3 && dayD >= 21) || (monthD == 4 && dayD <= 19)) {
        outTF.setText("Your Jojak Sign is Aries");
        }
        else if ((monthD == 4 && dayD >= 20) || (monthD == 5 && dayD <= 20)) {
        outTF.setText("Your Jojak Sign is Taurus");
        }
        else if ((monthD == 5 && dayD >= 21) || (monthD == 6 && dayD <= 20)) {
        outTF.setText ("Your Jojak Sign is Gemini");
        }
        else if ((monthD == 6 && dayD >= 21) || (monthD == 7 && dayD <= 22)) {
        outTF.setText("Your Jojak Sign is Cancer") ;
        }
        else if ((monthD == 7 && dayD >= 23) || (monthD == 8 && dayD <= 22)) {
        outTF.setText("Your Jojak Sign is Leo") ;
        }
        else if ((monthD == 8 && dayD >= 23) || (monthD == 9 && dayD <= 22)) {
        outTF.setText("Your Jojak Sign is Virgo");
        }
        else if ((monthD == 9 && dayD >= 23) || (monthD == 10 && dayD <= 22)) {
        outTF.setText("Your Jojak Sign is Libra");
        }
        else if ((monthD == 10 && dayD >= 23) || (monthD == 11 && dayD <= 21)) {
        outTF.setText( "Your Jojak Sign is Scorpio");
        }
        else if ((monthD == 11 && dayD >= 22) || (monthD == 12 && dayD <= 21)) {
        outTF.setText("Your Jojak Sign is Sagittarius");
        }
        else if ((monthD == 12 && dayD >= 22) || (monthD == 1 && dayD <= 19)) {
        outTF.setText("Your Jojak Sign is Capricorn");
        }
        else if ((monthD == 1 && dayD >= 20) || (monthD == 2 && dayD <= 18)) {
        outTF.setText("Your Jojak Sign is Aquarius"); 
        } 
        else if ((monthD == 2 && dayD >= 19) || (monthD == 3 && dayD <= 20)) {
        outTF.setText("Your Jojak Sign is Pisces"); 
        }
        else {
        outTF.setText(""); // Invalid date
        }
    }//GEN-LAST:event_calculateActionPerformed

    private void outTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outTFActionPerformed

    private void mthTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mthTFActionPerformed
        
    }//GEN-LAST:event_mthTFActionPerformed

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
            java.util.logging.Logger.getLogger(zodiacfinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(zodiacfinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(zodiacfinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(zodiacfinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new zodiacfinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculate;
    private javax.swing.JTextField dayTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mthTF;
    private javax.swing.JTextField outTF;
    // End of variables declaration//GEN-END:variables
}
