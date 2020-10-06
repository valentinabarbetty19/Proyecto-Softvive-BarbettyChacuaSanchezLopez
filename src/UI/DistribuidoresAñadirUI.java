package UI;

import Control.ControlDistribuidores;
import Modelo.Distribuidor;
import Modelo.Planta;
import Modelo.TipoReproduccion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListDataListener;

public class DistribuidoresAñadirUI extends javax.swing.JInternalFrame {

    private ControlDistribuidores controlDistribuidores;

    public DistribuidoresAñadirUI() {
        initComponents();
        controlDistribuidores = new ControlDistribuidores();
        this.ciudadcbx.setModel(new CiudadModel());
        añadirbtn.addActionListener(new agregarDistribuidorListener());
        TextPrompt nombre = new TextPrompt("Ingrese un nombre", nomjT);
        TextPrompt nit = new TextPrompt("Ingrese un NIT", nitjT);
        TextPrompt tel = new TextPrompt("Ingrese un teléfono", teljT);
        TextPrompt email = new TextPrompt("Ingrese un e-mail", emailjT);
        //TextPrompt ciudad = new TextPrompt("Ciudad", ciudadjT);
        TextPrompt direccion = new TextPrompt("Ingrese una dirección", dirjT);
        cancelbtn.addActionListener(new borrarListener());
        this.close.addMouseListener(new clickCerrarListener());
        this.close1.addMouseListener(new clickCerrarListener());
        setLocation(0, -32);
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
        nitjT = new javax.swing.JTextField();
        nomjT = new javax.swing.JTextField();
        teljT = new javax.swing.JTextField();
        añadirbtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();
        emailjT = new javax.swing.JTextField();
        dirjT = new javax.swing.JTextField();
        ciudadcbx = new javax.swing.JComboBox(TipoReproduccion.values());
        ;
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        nitjT.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        nitjT.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nitjT.setSelectionColor(new java.awt.Color(133, 198, 90));
        nitjT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nitjTActionPerformed(evt);
            }
        });

        nomjT.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        nomjT.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nomjT.setSelectionColor(new java.awt.Color(133, 198, 90));
        nomjT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomjTActionPerformed(evt);
            }
        });

        teljT.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        teljT.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        teljT.setSelectionColor(new java.awt.Color(133, 198, 90));
        teljT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teljTActionPerformed(evt);
            }
        });

        añadirbtn.setBackground(new java.awt.Color(255, 255, 255));
        añadirbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/buttonAdd.png"))); // NOI18N
        añadirbtn.setBorder(null);
        añadirbtn.setBorderPainted(false);
        añadirbtn.setContentAreaFilled(false);

        cancelbtn.setBackground(new java.awt.Color(255, 255, 255));
        cancelbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/buttonCancel.png"))); // NOI18N
        cancelbtn.setBorder(null);
        cancelbtn.setBorderPainted(false);
        cancelbtn.setContentAreaFilled(false);

        emailjT.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        emailjT.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        emailjT.setSelectionColor(new java.awt.Color(133, 198, 90));
        emailjT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailjTActionPerformed(evt);
            }
        });

        dirjT.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        dirjT.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        dirjT.setSelectionColor(new java.awt.Color(133, 198, 90));
        dirjT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dirjTActionPerformed(evt);
            }
        });

        ciudadcbx.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(108, 169, 62));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/plus (2).png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Añadir Nuevo Distribuidor");

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/close.png"))); // NOI18N

        close1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        close1.setForeground(new java.awt.Color(255, 255, 255));
        close1.setText("Cerrar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(127, 127, 127)
                .addComponent(close)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(close1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Teléfono:");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Nombre:");

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("NIT:");

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("E-mail:");

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Dirección:");

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Ciudad:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(cancelbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(añadirbtn)
                .addGap(177, 177, 177))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(nitjT)
                    .addComponent(nomjT)
                    .addComponent(teljT)
                    .addComponent(emailjT)
                    .addComponent(dirjT)
                    .addComponent(ciudadcbx, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(204, 204, 204))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nitjT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomjT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teljT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailjT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dirjT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ciudadcbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(añadirbtn)
                    .addComponent(cancelbtn))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nitjTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nitjTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nitjTActionPerformed

    private void nomjTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomjTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomjTActionPerformed

    private void teljTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teljTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teljTActionPerformed

    private void emailjTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailjTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailjTActionPerformed

    private void dirjTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dirjTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dirjTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadirbtn;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JComboBox<String> ciudadcbx;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JTextField dirjT;
    private javax.swing.JTextField emailjT;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nitjT;
    private javax.swing.JTextField nomjT;
    private javax.swing.JTextField teljT;
    // End of variables declaration//GEN-END:variables

    public class CiudadModel implements ComboBoxModel {

        private Object selected = null;

        @Override
        public void setSelectedItem(Object anItem) {
            this.selected = anItem;
        }

        @Override
        public Object getSelectedItem() {
            return this.selected;
        }

        @Override
        public int getSize() {
            return 8;
        }

        @Override
        public Object getElementAt(int index) {
            switch (index) {
                case 0:
                    return "Cali";
                case 1:
                    return "Palmira";
                case 2:
                    return "Jumbo";
                case 3:
                    return "Tuluá";
                case 4:
                    return "Cartago";
                case 5:
                    return "Buenaventura";
                case 6:
                    return "Buga";
                case 7:
                    return "Ginebra";

            }
            return "";
        }

        @Override
        public void addListDataListener(ListDataListener l) {
        }

        @Override
        public void removeListDataListener(ListDataListener l) {
        }

    }

    public class agregarDistribuidorListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (nitjT.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar un NIT");
            }
            if (nomjT.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar un nombre");
            }
            if (teljT.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar un teléfono");
            }
            if (emailjT.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar un E-mail");
            }
            if (dirjT.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar una dirección");
            }
            if (ciudadcbx.getSelectedItem().equals(null)) {
                JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una ciudad");
            } else {
                try {
                    long nit = Long.parseLong(nitjT.getText());
                    String nom = nomjT.getText();
                    long tel = Long.parseLong(teljT.getText());
                    String email = emailjT.getText();
                    String direccion = dirjT.getText();
                    String ciudad = (String) ciudadcbx.getSelectedItem();
                    Distribuidor d = new Distribuidor(nit, nom, tel, email, direccion, ciudad);
                    controlDistribuidores.agregarDistribuidor(d);
                    JOptionPane.showMessageDialog(rootPane, "Distribuidor agregado con éxito");
                    cancelbtn.doClick();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                }
            }

        }
    }

    public class borrarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            nitjT.setText("");
            nomjT.setText("");
            teljT.setText("");
            emailjT.setText("");
            ciudadcbx.setSelectedItem(null);
            dirjT.setText("");
        }

    }

    public class clickCerrarListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

            setVisible(false);

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
