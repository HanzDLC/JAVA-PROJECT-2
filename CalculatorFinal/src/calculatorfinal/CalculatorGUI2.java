/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculatorfinal;

/**
 *
 * @author KuchiChai
 */
public class CalculatorGUI2 extends javax.swing.JFrame {
     
    double InputNum1;
    double InputNum2;
    double Result;
    
    String operator;
    
    /**
     * Creates new form CalculatorGUI2
     */
    public CalculatorGUI2() {
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

        Monitor = new javax.swing.JTextField();
        num3 = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        Subtract = new javax.swing.JButton();
        Multiply = new javax.swing.JButton();
        Divide = new javax.swing.JButton();
        Equals = new javax.swing.JButton();
        num1 = new javax.swing.JButton();
        Delete1 = new javax.swing.JButton();
        Add1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(350, 400));
        getContentPane().setLayout(null);

        Monitor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Monitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonitorActionPerformed(evt);
            }
        });
        getContentPane().add(Monitor);
        Monitor.setBounds(29, 30, 250, 50);

        num3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        num3.setText("3");
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });
        getContentPane().add(num3);
        num3.setBounds(119, 190, 50, 40);

        num7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        num7.setText("7");
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });
        getContentPane().add(num7);
        num7.setBounds(19, 110, 50, 40);

        num8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        num8.setText("8");
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });
        getContentPane().add(num8);
        num8.setBounds(69, 110, 50, 40);

        num4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        num4.setText("4");
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });
        getContentPane().add(num4);
        num4.setBounds(19, 150, 50, 40);

        num5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        num5.setText("5");
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });
        getContentPane().add(num5);
        num5.setBounds(69, 150, 50, 40);

        num6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        num6.setText("6");
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });
        getContentPane().add(num6);
        num6.setBounds(119, 150, 50, 40);

        num0.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        num0.setText("0");
        num0.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                num0HierarchyChanged(evt);
            }
        });
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });
        getContentPane().add(num0);
        num0.setBounds(19, 230, 50, 40);

        num2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        num2.setText("2");
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });
        getContentPane().add(num2);
        num2.setBounds(69, 190, 50, 40);

        num9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        num9.setText("9");
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });
        getContentPane().add(num9);
        num9.setBounds(119, 110, 50, 40);

        Clear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Clear.setText("CLR");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        getContentPane().add(Clear);
        Clear.setBounds(239, 110, 60, 40);

        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton12.setText("9");
        getContentPane().add(jButton12);
        jButton12.setBounds(119, 150, 50, 40);

        Subtract.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Subtract.setText("-");
        Subtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubtractActionPerformed(evt);
            }
        });
        getContentPane().add(Subtract);
        Subtract.setBounds(240, 190, 60, 40);

        Multiply.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Multiply.setText("X");
        Multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplyActionPerformed(evt);
            }
        });
        getContentPane().add(Multiply);
        Multiply.setBounds(180, 150, 60, 40);

        Divide.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Divide.setText("/");
        Divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivideActionPerformed(evt);
            }
        });
        getContentPane().add(Divide);
        Divide.setBounds(240, 150, 60, 40);

        Equals.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Equals.setText("=");
        Equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualsActionPerformed(evt);
            }
        });
        getContentPane().add(Equals);
        Equals.setBounds(180, 230, 120, 40);

        num1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        num1.setText("1");
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });
        getContentPane().add(num1);
        num1.setBounds(19, 190, 50, 40);

        Delete1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Delete1.setText("Del");
        Delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete1ActionPerformed(evt);
            }
        });
        getContentPane().add(Delete1);
        Delete1.setBounds(179, 110, 60, 40);

        Add1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Add1.setText("+");
        Add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add1ActionPerformed(evt);
            }
        });
        getContentPane().add(Add1);
        Add1.setBounds(179, 190, 60, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void InputNums(String n){
        String Nums = Monitor.getText() + n;
        Monitor.setText(Nums);
    }
    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6ActionPerformed
       InputNums("6");
    }//GEN-LAST:event_num6ActionPerformed

    private void num0HierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_num0HierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_num0HierarchyChanged

    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0ActionPerformed
            InputNums("0");
    }//GEN-LAST:event_num0ActionPerformed

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
        InputNums("2");
    }//GEN-LAST:event_num2ActionPerformed

    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9ActionPerformed
        InputNums("9");
    }//GEN-LAST:event_num9ActionPerformed
        
    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        Monitor.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void EqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualsActionPerformed
      InputNum2 = Double.parseDouble(Monitor.getText());
      if (operator == "+"){
          Result = InputNum1 + InputNum2;
          Monitor.setText(String.valueOf(Result));
      }
      else if (operator == "-"){
          Result = InputNum1 - InputNum2;
          Monitor.setText(String.valueOf(Result));
      }
      else if (operator == "*"){
          Result = InputNum1 * InputNum2;
          Monitor.setText(String.valueOf(Result));
      }
      else if (operator == "/"){
          Result = InputNum1 / InputNum2;
          Monitor.setText(String.valueOf(Result));
      }
        // TODO add your handling code here:
    }//GEN-LAST:event_EqualsActionPerformed

    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8ActionPerformed
        InputNums("8");
    }//GEN-LAST:event_num8ActionPerformed

    private void MonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonitorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MonitorActionPerformed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        InputNums("1");
    }//GEN-LAST:event_num1ActionPerformed

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3ActionPerformed
        InputNums("3");
    }//GEN-LAST:event_num3ActionPerformed

    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5ActionPerformed
        InputNums("5");
    }//GEN-LAST:event_num5ActionPerformed

    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4ActionPerformed
        InputNums("4");
    }//GEN-LAST:event_num4ActionPerformed

    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7ActionPerformed
        InputNums("7");
    }//GEN-LAST:event_num7ActionPerformed

    private void DivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivideActionPerformed
        InputNum1 = Double.parseDouble(Monitor.getText());
        Monitor.setText("");
        operator = "/";
    }//GEN-LAST:event_DivideActionPerformed

    private void Delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete1ActionPerformed
        String backSpc = null;
        
        if (Monitor.getText().length () > 0) {
            StringBuilder sb = new StringBuilder (Monitor.getText());
            sb.deleteCharAt(Monitor.getText().length()-1);
            backSpc = sb.toString();
            Monitor.setText(backSpc);
        }
        
    }//GEN-LAST:event_Delete1ActionPerformed

    private void Add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add1ActionPerformed
       InputNum1 = Double.parseDouble(Monitor.getText());
        Monitor.setText("");
        operator = "+";// TODO add your handling code here:
    }//GEN-LAST:event_Add1ActionPerformed

    private void MultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplyActionPerformed
       InputNum1 = Double.parseDouble(Monitor.getText());
        Monitor.setText("");
        operator = "*";
    }//GEN-LAST:event_MultiplyActionPerformed

    private void SubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubtractActionPerformed
        InputNum1 = Double.parseDouble(Monitor.getText());
        Monitor.setText("");
        operator = "-";// TODO add your handling code here:
    }//GEN-LAST:event_SubtractActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorGUI2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add1;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete1;
    private javax.swing.JButton Divide;
    private javax.swing.JButton Equals;
    private javax.swing.JTextField Monitor;
    private javax.swing.JButton Multiply;
    private javax.swing.JButton Subtract;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    // End of variables declaration//GEN-END:variables
}
