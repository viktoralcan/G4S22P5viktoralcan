package g4s22p5viktoralcan;

import Operaciones.Restar;
import Operaciones.Sumar;
import Operaciones.Mult;
import Operaciones.Div;
import javax.swing.ButtonGroup;

public class FrameP extends javax.swing.JFrame {

    public FrameP() {
        initComponents();
        this.setLocationRelativeTo(null);
        ButtonGroup gruporb = new ButtonGroup();
        gruporb.add(RBSuma);
        gruporb.add(RBResta);
        gruporb.add(RBDiv);
        gruporb.add(RBMul);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gruporb = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Num1 = new javax.swing.JTextField();
        Num2 = new javax.swing.JTextField();
        BtonSuma = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        R = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        RBSuma = new javax.swing.JRadioButton();
        RBResta = new javax.swing.JRadioButton();
        RBMul = new javax.swing.JRadioButton();
        RBDiv = new javax.swing.JRadioButton();
        BtnCalcular = new javax.swing.JButton();
        BtonRestar = new javax.swing.JButton();
        BtonMul = new javax.swing.JButton();
        BtonDiv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Operaciones");

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingrese el primer número:");

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ingrese el segundo número:");

        Num1.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        Num1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Num2.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        Num2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        BtonSuma.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        BtonSuma.setText("Suma");
        BtonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtonSumaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Resultado:");

        R.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        R.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel5.setText("Opciones");

        RBSuma.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        RBSuma.setText("Suma");

        RBResta.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        RBResta.setText("Resta");

        RBMul.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        RBMul.setText("Multiplicación");

        RBDiv.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        RBDiv.setText("División");

        BtnCalcular.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        BtnCalcular.setText("Calcular");
        BtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularActionPerformed(evt);
            }
        });

        BtonRestar.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        BtonRestar.setText("Restar");
        BtonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtonRestarActionPerformed(evt);
            }
        });

        BtonMul.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        BtonMul.setText("Multiplicar");
        BtonMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtonMulActionPerformed(evt);
            }
        });

        BtonDiv.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        BtonDiv.setText("Dividir");
        BtonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtonDivActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtonRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtonMul, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(84, 84, 84))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RBSuma)
                                    .addComponent(RBResta)
                                    .addComponent(RBMul)
                                    .addComponent(RBDiv))
                                .addGap(38, 38, 38))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(28, 28, 28)
                        .addComponent(RBSuma)
                        .addGap(18, 18, 18)
                        .addComponent(RBResta)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtonMul, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtonRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RBMul)
                        .addGap(18, 18, 18)
                        .addComponent(RBDiv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(BtnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtonSumaActionPerformed
        
        Sumar sumar = new Sumar();
        int n1, n2;
        n1 = Integer.parseInt(Num1.getText().toString());
        n2 = Integer.parseInt(Num2.getText().toString());
        
        R.setText(String.valueOf(sumar.suma(n1, n2)));
    }//GEN-LAST:event_BtonSumaActionPerformed

    private void BtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularActionPerformed
        
        int n1, n2;
        n1 = Integer.parseInt(Num1.getText().toString());
        n2 = Integer.parseInt(Num2.getText().toString());
        
        if(RBSuma.isSelected() == true) {
            Sumar sumar = new Sumar();
            R.setText(String.valueOf(sumar.suma(n1, n2)));
        }else
        
        if(RBResta.isSelected() == true) {
            Restar resta = new Restar();
            R.setText(String.valueOf(resta.resta(n1, n2)));
        }else
        
        if(RBMul.isSelected() == true) {
            Mult mul = new Mult();
            R.setText(String.valueOf(mul.mul(n1, n2)));
        }else
        
        if(RBDiv.isSelected() == true) {
            Div divi = new Div();
            R.setText(String.valueOf(divi.divi(n1, n2)));
        }
        
    }//GEN-LAST:event_BtnCalcularActionPerformed

    private void BtonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtonRestarActionPerformed

        Restar resta = new Restar();
        int n1, n2;
        n1 = Integer.parseInt(Num1.getText().toString());
        n2 = Integer.parseInt(Num2.getText().toString());
        
        R.setText(String.valueOf(resta.resta(n1, n2)));
        
    }//GEN-LAST:event_BtonRestarActionPerformed

    private void BtonMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtonMulActionPerformed

        Mult mul = new Mult();
        int n1, n2;
        n1 = Integer.parseInt(Num1.getText().toString());
        n2 = Integer.parseInt(Num2.getText().toString());
        
        R.setText(String.valueOf(mul.mul(n1, n2)));
        
    }//GEN-LAST:event_BtonMulActionPerformed

    private void BtonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtonDivActionPerformed

        Div divi = new Div();
        int n1, n2;
        n1 = Integer.parseInt(Num1.getText().toString());
        n2 = Integer.parseInt(Num2.getText().toString());
        
        R.setText(String.valueOf(divi.divi(n1, n2)));
        
    }//GEN-LAST:event_BtonDivActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FrameP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCalcular;
    private javax.swing.JButton BtonDiv;
    private javax.swing.JButton BtonMul;
    private javax.swing.JButton BtonRestar;
    private javax.swing.JButton BtonSuma;
    private javax.swing.JTextField Num1;
    private javax.swing.JTextField Num2;
    private javax.swing.JTextField R;
    private javax.swing.JRadioButton RBDiv;
    private javax.swing.JRadioButton RBMul;
    private javax.swing.JRadioButton RBResta;
    private javax.swing.JRadioButton RBSuma;
    private javax.swing.ButtonGroup gruporb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
