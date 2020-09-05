/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Valentina
 */
public class DistribuidoresUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form DistribuidoresUI
     */
    public DistribuidoresUI() {
        initComponents();
        this.AñadirDistri1.addMouseListener(new clickAddListener());
        this.AñadirDistri.addMouseListener(new clickAddListener());
        this.EditarDistri.addMouseListener(new clickEditListener());
        this.EditarDistri1.addMouseListener(new clickEditListener());
        this.VerDistri1.addMouseListener(new clickSeeListener());
        this.VerDistri.addMouseListener(new clickSeeListener());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        VerDistri1 = new javax.swing.JLabel();
        AñadirDistri = new javax.swing.JLabel();
        EditarDistri = new javax.swing.JLabel();
        AñadirDistri1 = new javax.swing.JLabel();
        VerDistri = new javax.swing.JLabel();
        EditarDistri1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        desktopd = new javax.swing.JDesktopPane();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jPanel9.setBackground(new java.awt.Color(133, 198, 90));

        VerDistri1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        VerDistri1.setForeground(new java.awt.Color(255, 255, 255));
        VerDistri1.setText("Ver Distribuidores");

        AñadirDistri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/plus (2).png"))); // NOI18N

        EditarDistri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/edit (1).png"))); // NOI18N

        AñadirDistri1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        AñadirDistri1.setForeground(new java.awt.Color(255, 255, 255));
        AñadirDistri1.setText("Agregar Nuevo Distribuidor");

        VerDistri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/list (1).png"))); // NOI18N

        EditarDistri1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        EditarDistri1.setForeground(new java.awt.Color(255, 255, 255));
        EditarDistri1.setText("Editar Distribuidores");

        jPanel10.setBackground(new java.awt.Color(108, 169, 62));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/distri.png"))); // NOI18N

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("GESTIONAR DISTRIBUIDORES");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addGap(138, 138, 138))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 287, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(AñadirDistri, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(AñadirDistri1))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(EditarDistri, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EditarDistri1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(VerDistri, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(VerDistri1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(AñadirDistri))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(AñadirDistri1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditarDistri, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditarDistri1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(VerDistri, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VerDistri1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(414, Short.MAX_VALUE))
        );

        desktopd.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout desktopdLayout = new javax.swing.GroupLayout(desktopd);
        desktopd.setLayout(desktopdLayout);
        desktopdLayout.setHorizontalGroup(
            desktopdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );
        desktopdLayout.setVerticalGroup(
            desktopdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(desktopd))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(desktopd)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AñadirDistri;
    private javax.swing.JLabel AñadirDistri1;
    private javax.swing.JLabel EditarDistri;
    private javax.swing.JLabel EditarDistri1;
    private javax.swing.JLabel VerDistri;
    private javax.swing.JLabel VerDistri1;
    private javax.swing.JDesktopPane desktopd;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
        public class clickAddListener implements MouseListener {

        private DistribuidoresAñadirUI distribuidoresAddUI;

        @Override
        public void mouseClicked(MouseEvent e) {

            if (distribuidoresAddUI == null) {
                distribuidoresAddUI = new DistribuidoresAñadirUI();
                desktopd.add(distribuidoresAddUI);
            }
            distribuidoresAddUI.setVisible(true);
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

    }

    public class clickSeeListener implements MouseListener {

        private DistribuidoresVerUI distribuidoresSeeUI;

        @Override
        public void mouseClicked(MouseEvent e) {

            if (distribuidoresSeeUI == null) {
                distribuidoresSeeUI = new DistribuidoresVerUI();
                desktopd.add(distribuidoresSeeUI);
            }
            distribuidoresSeeUI.setVisible(true);
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

    }

    public class clickEditListener implements MouseListener {

        private DistribuidoresEditarUI distribuidoresEditUI;

        @Override
        public void mouseClicked(MouseEvent e) {

            if (distribuidoresEditUI == null) {
                distribuidoresEditUI = new DistribuidoresEditarUI();
                desktopd.add(distribuidoresEditUI);
            }
            distribuidoresEditUI.setVisible(true);
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

    }

}