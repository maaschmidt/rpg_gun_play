package screens;

import models.Arma;
import models.Personagem;
import tools.Globais;

/**
 *
 * @author maaschmidt
 */
public class TelaLoja extends javax.swing.JFrame {

    Personagem personagemEscolhido = new Personagem();
    Arma armaEscolhida = new Arma();
    int idInimigo;
    int ammo = 250,
            quantAmmo = 0,
            life = 500,
            quantLife = 0;

    /**
     * Creates new form TelaLoja
     * @param idInimigo
     * @param personagemEscolhido
     * @param armaEscolhida
     */
    public TelaLoja(int idInimigo, Personagem personagemEscolhido, Arma armaEscolhida) {
        this.personagemEscolhido = personagemEscolhido;
        this.armaEscolhida = armaEscolhida;
        this.idInimigo = idInimigo;
        initComponents();
        setTela();
    }

    private void checkoutPlus(int item) {
        int valorCheckout;
        if (pnlCheckout.isVisible()) {
            valorCheckout = Integer.parseInt(lblValorTotal.getText());
            lblValorTotal.setText(String.valueOf(valorCheckout + item));
        }
        valorCheckout = Integer.parseInt(lblPrice.getText());
        lblPrice.setText(String.valueOf(valorCheckout + item));

    }

    private void checkoutLess(int item) {
        int valorCheckout;
        if (!lblQuantAmmo.getText().equals("[0]")) {
            valorCheckout = Integer.parseInt(lblValorTotal.getText());
            lblValorTotal.setText(String.valueOf(valorCheckout - item));
        } else if (!lblQuantVida.getText().equals("[0]")) {
            valorCheckout = Integer.parseInt(lblValorTotal.getText());
            lblValorTotal.setText(String.valueOf(valorCheckout - item));
        }
        valorCheckout = Integer.parseInt(lblPrice.getText());
        lblPrice.setText(String.valueOf(valorCheckout - item));
    }

    private void setTela() {
        Globais.ajustarImagem(getClass().getResource("/images/background/store.png"), lblFundo);
        Globais.ajustarButton(getClass().getResource("/images/buttons/ammo.png"), btnAmmo);
        Globais.ajustarButton(getClass().getResource("/images/buttons/life.png"), btnLife);
        Globais.ajustarButton(getClass().getResource("/images/buttons/checkout.png"), btnCheckout);
        Globais.ajustarImagem(getClass().getResource("/images/history/money.png"), lblMoneyIco);
        Globais.ajustarImagem(getClass().getResource("/images/buttons/ammo.png"), lblAmmoCheck);
        Globais.ajustarImagem(getClass().getResource("/images/buttons/life.png"), lblLifeCheck);
        pnlCheckout.setVisible(false);
        pgbMunicao.setValue(armaEscolhida.getMunicao());
        pgbVida.setValue(personagemEscolhido.getVida());
        lblMoney.setText(String.valueOf(personagemEscolhido.getDinheiro()));
        lblPrice.setText("0");
    }

    private void refreshTela(boolean tela) {
        pgbMunicao.setVisible(tela);
        pgbVida.setVisible(tela);
        lblMoney.setVisible(tela);
        lblPrice.setVisible(tela);
        lblMoneyIco.setVisible(tela);
        lblRS.setVisible(tela);
        lblRS1.setVisible(tela);
        btnCheckout.setVisible(tela);
        btnSairLoja.setVisible(tela);
    }

    private void refreshQuant() {
        lblQuantAmmo.setText("[" + String.valueOf(quantAmmo) + "]");
        lblQuantVida.setText("[" + String.valueOf(quantLife) + "]");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCheckout = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblAmmoCheck = new javax.swing.JLabel();
        lblLifeCheck = new javax.swing.JLabel();
        btnMenosVida = new javax.swing.JButton();
        btnMaisVIda = new javax.swing.JButton();
        btnMenosAmmo = new javax.swing.JButton();
        btnMaisAmmo = new javax.swing.JButton();
        lblQuantAmmo = new javax.swing.JLabel();
        lblQuantVida = new javax.swing.JLabel();
        btnSairCheck = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        lblValorTotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLife = new javax.swing.JButton();
        btnCheckout = new javax.swing.JButton();
        btnAmmo = new javax.swing.JButton();
        btnSairLoja = new javax.swing.JButton();
        lblPrice = new javax.swing.JLabel();
        lblRS1 = new javax.swing.JLabel();
        lblMoney = new javax.swing.JLabel();
        lblMoneyIco = new javax.swing.JLabel();
        lblRS = new javax.swing.JLabel();
        pgbMunicao = new javax.swing.JProgressBar();
        pgbVida = new javax.swing.JProgressBar();
        lblMunicao = new javax.swing.JLabel();
        lblVida = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCheckout.setBackground(new java.awt.Color(51, 51, 51));
        pnlCheckout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        pnlCheckout.setForeground(new java.awt.Color(51, 51, 51));
        pnlCheckout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHECKOUT");
        pnlCheckout.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 100));
        pnlCheckout.add(lblAmmoCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 130, 130));
        pnlCheckout.add(lblLifeCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 130, 130));

        btnMenosVida.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnMenosVida.setText("-");
        btnMenosVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosVidaActionPerformed(evt);
            }
        });
        pnlCheckout.add(btnMenosVida, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 50, -1));

        btnMaisVIda.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnMaisVIda.setText("+");
        btnMaisVIda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisVIdaActionPerformed(evt);
            }
        });
        pnlCheckout.add(btnMaisVIda, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 50, -1));

        btnMenosAmmo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnMenosAmmo.setText("-");
        btnMenosAmmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosAmmoActionPerformed(evt);
            }
        });
        pnlCheckout.add(btnMenosAmmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 50, -1));

        btnMaisAmmo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnMaisAmmo.setText("+");
        btnMaisAmmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisAmmoActionPerformed(evt);
            }
        });
        pnlCheckout.add(btnMaisAmmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 50, -1));

        lblQuantAmmo.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblQuantAmmo.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantAmmo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlCheckout.add(lblQuantAmmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 130, 30));

        lblQuantVida.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblQuantVida.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantVida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlCheckout.add(lblQuantVida, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 130, 30));

        btnSairCheck.setBackground(new java.awt.Color(102, 102, 102));
        btnSairCheck.setForeground(new java.awt.Color(255, 255, 255));
        btnSairCheck.setText("VOLTAR");
        btnSairCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairCheckActionPerformed(evt);
            }
        });
        pnlCheckout.add(btnSairCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        btnComprar.setBackground(new java.awt.Color(0, 204, 0));
        btnComprar.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        btnComprar.setForeground(new java.awt.Color(255, 255, 255));
        btnComprar.setText("COMPRAR");
        btnComprar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnComprar.setBorderPainted(false);
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        pnlCheckout.add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 200, 60));

        lblValorTotal.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lblValorTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblValorTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlCheckout.add(lblValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 140, 40));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("R$");
        pnlCheckout.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 40, 40));

        getContentPane().add(pnlCheckout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 650, 400));

        btnLife.setBorder(null);
        btnLife.setBorderPainted(false);
        btnLife.setContentAreaFilled(false);
        btnLife.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLife.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLifeActionPerformed(evt);
            }
        });
        getContentPane().add(btnLife, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 60, 60));

        btnCheckout.setForeground(new java.awt.Color(51, 51, 51));
        btnCheckout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnCheckout.setBorderPainted(false);
        btnCheckout.setContentAreaFilled(false);
        btnCheckout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnCheckout, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 40, 40));

        btnAmmo.setBorder(null);
        btnAmmo.setBorderPainted(false);
        btnAmmo.setContentAreaFilled(false);
        btnAmmo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAmmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmmoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAmmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 60, 60));

        btnSairLoja.setBackground(new java.awt.Color(102, 102, 102));
        btnSairLoja.setForeground(new java.awt.Color(255, 255, 255));
        btnSairLoja.setText("SAIR");
        btnSairLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairLojaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSairLoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        lblPrice.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrice.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 80, 20));

        lblRS1.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        lblRS1.setForeground(new java.awt.Color(255, 255, 255));
        lblRS1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRS1.setText("R$");
        lblRS1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(lblRS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, -1, -1));

        lblMoney.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblMoney.setForeground(new java.awt.Color(255, 255, 255));
        lblMoney.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMoney.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(lblMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 90, 20));

        lblMoneyIco.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(lblMoneyIco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        lblRS.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblRS.setForeground(new java.awt.Color(255, 255, 255));
        lblRS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRS.setText("R$");
        lblRS.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(lblRS, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        pgbMunicao.setFont(new java.awt.Font("Checkpoint Charlie", 0, 13)); // NOI18N
        pgbMunicao.setValue(75);
        pgbMunicao.setBorderPainted(false);
        pgbMunicao.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        pgbMunicao.setString("MUNICAO");
        pgbMunicao.setStringPainted(true);
        getContentPane().add(pgbMunicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        pgbVida.setFont(new java.awt.Font("Checkpoint Charlie", 0, 13)); // NOI18N
        pgbVida.setValue(75);
        pgbVida.setBorderPainted(false);
        pgbVida.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        pgbVida.setString("VIDA");
        pgbVida.setStringPainted(true);
        getContentPane().add(pgbVida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        lblMunicao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMunicao.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(lblMunicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblVida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVida.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(lblVida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblFundo.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        lblFundo.setPreferredSize(new java.awt.Dimension(730, 490));
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLifeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLifeActionPerformed
        checkoutPlus(life);
        quantLife += 10;
    }//GEN-LAST:event_btnLifeActionPerformed

    private void btnAmmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmmoActionPerformed
        checkoutPlus(ammo);
        quantAmmo += 10;
    }//GEN-LAST:event_btnAmmoActionPerformed

    private void btnCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckoutActionPerformed
        pnlCheckout.setVisible(true);
        refreshQuant();
        refreshTela(false);
        lblValorTotal.setText(lblPrice.getText());
    }//GEN-LAST:event_btnCheckoutActionPerformed

    private void btnSairCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairCheckActionPerformed
        pnlCheckout.setVisible(false);
        refreshTela(true);
    }//GEN-LAST:event_btnSairCheckActionPerformed

    private void btnMaisVIdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisVIdaActionPerformed
        checkoutPlus(life);
        quantLife += 10;
        refreshQuant();
    }//GEN-LAST:event_btnMaisVIdaActionPerformed

    private void btnMenosVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosVidaActionPerformed
        if (quantLife > 0) {
            checkoutLess(life);
            quantLife -= 10;
            refreshQuant();
        }
    }//GEN-LAST:event_btnMenosVidaActionPerformed

    private void btnMaisAmmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisAmmoActionPerformed
        checkoutPlus(ammo);
        quantAmmo += 10;
        refreshQuant();
    }//GEN-LAST:event_btnMaisAmmoActionPerformed

    private void btnMenosAmmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosAmmoActionPerformed
        if (quantAmmo > 0) {
            checkoutLess(ammo);
            quantAmmo -= 10;
            refreshQuant();
        }
    }//GEN-LAST:event_btnMenosAmmoActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        if (personagemEscolhido.getDinheiro() < Integer.parseInt(lblValorTotal.getText())){
            Globais.exibirMensagem("Sem dinheiro não!\nSeu pela saco!");
        } else {
            personagemEscolhido.setDinheiro(personagemEscolhido.getDinheiro() - 
                    Integer.parseInt(lblValorTotal.getText()));
            personagemEscolhido.setVida(personagemEscolhido.getVida() + quantLife);
            armaEscolhida.setMunicao(armaEscolhida.getMunicao() + quantAmmo);
            lblMoney.setText(String.valueOf(personagemEscolhido.getDinheiro()));
            refreshTela(true);
            pnlCheckout.setVisible(false);
            pgbMunicao.setValue(armaEscolhida.getMunicao());
            pgbVida.setValue(personagemEscolhido.getVida());
            quantAmmo = 0;
            quantLife = 0;
            refreshQuant();
            lblPrice.setText("0000");
            lblValorTotal.setText("0000");
        }
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnSairLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairLojaActionPerformed
        TelaMissao tela = new TelaMissao(idInimigo, personagemEscolhido, armaEscolhida);
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSairLojaActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TelaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TelaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TelaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TelaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TelaLoja().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAmmo;
    private javax.swing.JButton btnCheckout;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnLife;
    private javax.swing.JButton btnMaisAmmo;
    private javax.swing.JButton btnMaisVIda;
    private javax.swing.JButton btnMenosAmmo;
    private javax.swing.JButton btnMenosVida;
    private javax.swing.JButton btnSairCheck;
    private javax.swing.JButton btnSairLoja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAmmoCheck;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblLifeCheck;
    private javax.swing.JLabel lblMoney;
    private javax.swing.JLabel lblMoneyIco;
    private javax.swing.JLabel lblMunicao;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQuantAmmo;
    private javax.swing.JLabel lblQuantVida;
    private javax.swing.JLabel lblRS;
    private javax.swing.JLabel lblRS1;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JLabel lblVida;
    private javax.swing.JProgressBar pgbMunicao;
    private javax.swing.JProgressBar pgbVida;
    private javax.swing.JPanel pnlCheckout;
    // End of variables declaration//GEN-END:variables
}
