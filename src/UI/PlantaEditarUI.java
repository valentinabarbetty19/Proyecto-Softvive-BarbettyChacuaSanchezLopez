/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Control.ControlPlantas;
import Modelo.Planta;
import Modelo.TipoReproduccion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListDataListener;

/**
 *
 * @author xxval
 */
public class PlantaEditarUI extends javax.swing.JInternalFrame {

    private ControlPlantas controlPlantas;
    private Planta p;

    /**
     * Creates new form EditarPrecioPlantaUI
     */
    public PlantaEditarUI() {
        initComponents();
        this.controlPlantas = new ControlPlantas();
        this.plantasjC.setModel(new PlantasListener());
        this.acbtn.addActionListener(new EditPlantaListener());
        this.canbtn.addActionListener(new borrarListener());
        this.plantasjC.addActionListener(new buscarPlantaListener());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        plantasjC = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        precioNjT = new javax.swing.JTextField();
        tCrecjT = new javax.swing.JTextField();
        tGerjT = new javax.swing.JTextField();
        nomPjT = new javax.swing.JTextField();
        tRepjC = new javax.swing.JComboBox(TipoReproduccion.values());
        ;
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tReprod = new javax.swing.JLabel();
        cod = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        acbtn = new javax.swing.JButton();
        canbtn = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        plantasjC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Seleccione la planta:");

        precioNjT.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        precioNjT.setBorder(null);
        precioNjT.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        tCrecjT.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tCrecjT.setBorder(null);
        tCrecjT.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        tGerjT.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tGerjT.setBorder(null);
        tGerjT.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tGerjT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tGerjTActionPerformed(evt);
            }
        });

        nomPjT.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        nomPjT.setBorder(null);
        nomPjT.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        tRepjC.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Tipo de Reproducción:");

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Tiempo de Germinación:");

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Tiempo de Crecimiento:");

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Precio:");

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Nombre:");

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Código:");

        tReprod.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        cod.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cod.setForeground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Seleccione el tipo de reproducción:");

        acbtn.setBackground(new java.awt.Color(255, 255, 255));
        acbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/actualizar.png"))); // NOI18N
        acbtn.setBorder(null);
        acbtn.setBorderPainted(false);
        acbtn.setContentAreaFilled(false);

        canbtn.setBackground(new java.awt.Color(255, 255, 255));
        canbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/buttonCancel.png"))); // NOI18N
        canbtn.setBorder(null);
        canbtn.setBorderPainted(false);
        canbtn.setContentAreaFilled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(142, 142, 142)
                                    .addComponent(jLabel2))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(plantasjC, 0, 161, Short.MAX_VALUE)
                                    .addComponent(nomPjT)
                                    .addComponent(tReprod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tGerjT)
                                    .addComponent(tCrecjT)
                                    .addComponent(cod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tRepjC, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(precioNjT, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(canbtn)
                        .addGap(97, 97, 97)
                        .addComponent(acbtn)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plantasjC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tRepjC, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(nomPjT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tReprod, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tGerjT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tCrecjT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioNjT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(acbtn)
                    .addComponent(canbtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tGerjTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tGerjTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tGerjTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acbtn;
    private javax.swing.JButton canbtn;
    private javax.swing.JLabel cod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField nomPjT;
    private javax.swing.JComboBox plantasjC;
    private javax.swing.JTextField precioNjT;
    private javax.swing.JTextField tCrecjT;
    private javax.swing.JTextField tGerjT;
    private javax.swing.JComboBox<String> tRepjC;
    private javax.swing.JLabel tReprod;
    // End of variables declaration//GEN-END:variables

    public class PlantasListener implements ComboBoxModel {

        List<Planta> plantas = controlPlantas.getListaPlantas();
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
            return plantas.size();
        }

        @Override
        public Object getElementAt(int index) {
            return plantas.get(index);
        }

        @Override
        public void addListDataListener(ListDataListener l) {

        }

        @Override
        public void removeListDataListener(ListDataListener l) {

        }

    }

    public class buscarPlantaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            p = (Planta) plantasjC.getSelectedItem();
            String codg = p.getCodigo();
            String nom = p.getNombre();
            TipoReproduccion tp = p.getTipoReproduccion();
            int tGer = p.getTiempoGerminacion();
            int tCrec = p.getTiempoCrecimiento();
            int precio = p.getValor_unitario();
            cod.setText(codg);
            nomPjT.setText(nom);
            tReprod.setText(tp.toString());
            tGerjT.setText(Integer.toString(tGer));
            tCrecjT.setText(Integer.toString(tCrec));
            precioNjT.setText(Integer.toString(precio));
            tReprod.setText(p.getTipoReproduccion().toString());

        }

    }

    public class EditPlantaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String nom = nomPjT.getText();
                TipoReproduccion tr = (TipoReproduccion) tRepjC.getSelectedItem();
                int tGer = Integer.parseInt(tGerjT.getText());
                int tCrec = Integer.parseInt(tCrecjT.getText());
                int precio = Integer.parseInt(precioNjT.getText());
                p = (Planta) plantasjC.getSelectedItem();
                p.setValor_unitario(precio);
                p.setNombre(nom);
                p.setTipoReproduccion(tr);
                p.setTiempoGerminacion(tGer);
                p.setTiempoCrecimiento(tCrec);
                controlPlantas.actualizarPlanta(p);
                JOptionPane.showMessageDialog(rootPane, "Planta editada con éxito");
                canbtn.doClick();
            } catch (Exception ex) {
                Logger.getLogger(PlantaEditarUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public class borrarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            nomPjT.setText("");
            cod.setText("");
            tCrecjT.setText("");
            tGerjT.setText("");

            precioNjT.setText("");

        }

    }
}
