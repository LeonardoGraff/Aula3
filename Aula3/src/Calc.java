/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author leonardo.graff
 */
public class Calc extends javax.swing.JFrame {

    /**
     * Creates new form Calc
     */
    public Calc() {
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

        painel1 = new javax.swing.JPanel();
        txtVizor = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B0 = new javax.swing.JButton();
        Bmultiplicacao = new javax.swing.JButton();
        Bdivisao1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);

        painel1.setBackground(new java.awt.Color(51, 51, 51));
        painel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtVizor.setBackground(new java.awt.Color(102, 102, 102));
        txtVizor.setFont(new java.awt.Font("BankGothic Lt BT", 1, 18)); // NOI18N
        txtVizor.setForeground(new java.awt.Color(0, 204, 0));
        txtVizor.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lblTitulo.setBackground(new java.awt.Color(51, 51, 51));
        lblTitulo.setFont(new java.awt.Font("BankGothic Lt BT", 3, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(153, 255, 153));
        lblTitulo.setText("Calculadora");
        lblTitulo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 51, 51), null, new java.awt.Color(51, 51, 51)));
        lblTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        B1.setBackground(new java.awt.Color(51, 51, 51));
        B1.setFont(new java.awt.Font("BankGothic Md BT", 1, 50)); // NOI18N
        B1.setForeground(new java.awt.Color(0, 204, 0));
        B1.setText("1");
        B1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setBackground(new java.awt.Color(51, 51, 51));
        B2.setFont(new java.awt.Font("BankGothic Md BT", 1, 50)); // NOI18N
        B2.setForeground(new java.awt.Color(0, 204, 0));
        B2.setText("2");
        B2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setBackground(new java.awt.Color(51, 51, 51));
        B3.setFont(new java.awt.Font("BankGothic Md BT", 1, 50)); // NOI18N
        B3.setForeground(new java.awt.Color(0, 204, 0));
        B3.setText("4");
        B3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setBackground(new java.awt.Color(51, 51, 51));
        B4.setFont(new java.awt.Font("BankGothic Md BT", 1, 50)); // NOI18N
        B4.setForeground(new java.awt.Color(0, 204, 0));
        B4.setText("5");
        B4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.setBackground(new java.awt.Color(51, 51, 51));
        B5.setFont(new java.awt.Font("BankGothic Md BT", 1, 50)); // NOI18N
        B5.setForeground(new java.awt.Color(0, 204, 0));
        B5.setText("6");
        B5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B6.setBackground(new java.awt.Color(51, 51, 51));
        B6.setFont(new java.awt.Font("BankGothic Md BT", 1, 50)); // NOI18N
        B6.setForeground(new java.awt.Color(0, 204, 0));
        B6.setText("7");
        B6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B7.setBackground(new java.awt.Color(51, 51, 51));
        B7.setFont(new java.awt.Font("BankGothic Md BT", 1, 50)); // NOI18N
        B7.setForeground(new java.awt.Color(0, 204, 0));
        B7.setText("8");
        B7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B8.setBackground(new java.awt.Color(51, 51, 51));
        B8.setFont(new java.awt.Font("BankGothic Md BT", 1, 50)); // NOI18N
        B8.setForeground(new java.awt.Color(0, 204, 0));
        B8.setText("9");
        B8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B9.setBackground(new java.awt.Color(51, 51, 51));
        B9.setFont(new java.awt.Font("BankGothic Md BT", 1, 50)); // NOI18N
        B9.setForeground(new java.awt.Color(0, 204, 0));
        B9.setText("3");
        B9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        B0.setBackground(new java.awt.Color(51, 51, 51));
        B0.setFont(new java.awt.Font("BankGothic Md BT", 1, 50)); // NOI18N
        B0.setForeground(new java.awt.Color(0, 204, 0));
        B0.setText("0");
        B0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });

        Bmultiplicacao.setBackground(new java.awt.Color(51, 51, 51));
        Bmultiplicacao.setFont(new java.awt.Font("BankGothic Md BT", 1, 50)); // NOI18N
        Bmultiplicacao.setForeground(new java.awt.Color(0, 204, 0));
        Bmultiplicacao.setText("*");
        Bmultiplicacao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bmultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmultiplicacaoActionPerformed(evt);
            }
        });

        Bdivisao1.setBackground(new java.awt.Color(51, 51, 51));
        Bdivisao1.setFont(new java.awt.Font("BankGothic Md BT", 1, 50)); // NOI18N
        Bdivisao1.setForeground(new java.awt.Color(0, 204, 0));
        Bdivisao1.setText("/");
        Bdivisao1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bdivisao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bdivisao1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1);
        painel1.setLayout(painel1Layout);
        painel1Layout.setHorizontalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVizor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painel1Layout.createSequentialGroup()
                        .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B0, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painel1Layout.createSequentialGroup()
                                .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painel1Layout.createSequentialGroup()
                                .addComponent(Bdivisao1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(Bmultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(painel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(lblTitulo)
                .addGap(100, 100, 100))
        );
        painel1Layout.setVerticalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitulo)
                .addGap(45, 45, 45)
                .addComponent(txtVizor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bdivisao1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bmultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(B0, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B9ActionPerformed

    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B0ActionPerformed

    private void BmultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmultiplicacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BmultiplicacaoActionPerformed

    private void Bdivisao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bdivisao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bdivisao1ActionPerformed

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
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B0;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton Bdivisao1;
    private javax.swing.JButton Bmultiplicacao;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel painel1;
    private javax.swing.JTextField txtVizor;
    // End of variables declaration//GEN-END:variables
}
