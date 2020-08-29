/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Control.ControlPedidos;
import Modelo.Detalle_Pedido;
import Modelo.Distribuidor;
import Modelo.EstadoEntrega;
import Modelo.Pedido;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Valentina
 */
public class PedidoConfirmarEntregaUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form PedidoConfirmarEntregaUI
     */
    private ControlPedidos controlPedidos;

    public PedidoConfirmarEntregaUI() {
        initComponents();
        controlPedidos = new ControlPedidos();
        this.TablePedidos.setModel(new PedidoTableModel());
        TablePedidos.updateUI();
        this.confEntregabtn.addActionListener(new ConfirmarEntregaListener());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablePedidos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        confEntregabtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        TablePedidos.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        TablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablePedidos.setGridColor(new java.awt.Color(255, 255, 255));
        TablePedidos.setSelectionBackground(new java.awt.Color(133, 198, 90));
        TablePedidos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TablePedidos);

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Confirmar Pedido Entregado");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Seleccione el pedido:");

        confEntregabtn.setBackground(new java.awt.Color(255, 255, 255));
        confEntregabtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/confirmarentregabtn.png"))); // NOI18N
        confEntregabtn.setBorderPainted(false);
        confEntregabtn.setContentAreaFilled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(341, 341, 341)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(confEntregabtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addGap(50, 50, 50)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(confEntregabtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablePedidos;
    private javax.swing.JButton confEntregabtn;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public class PedidoTableModel implements TableModel {

        @Override
        public int getRowCount() {
            return controlPedidos.getListaPedidos().size();
        }

        @Override
        public int getColumnCount() {
            return 6;
        }
        private String[] nombreColumnas = {"Código Pedido", "Distribuidor", "NIT", "Fecha", "Estado Entrega", "Total vendido", "Valor"};

        @Override
        public String getColumnName(int columnIndex) {
            return nombreColumnas[columnIndex];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            return String.class;
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return columnIndex == 3;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Pedido pedido = controlPedidos.getListaPedidos().get(rowIndex);

            switch (columnIndex) {
                case 0:
                    return pedido.getCodigo();
                case 1:
                    return pedido.getDistribuidor().getNombre();
                case 2:
                    return pedido.getDistribuidor().getNit();
                case 3:
                    return pedido.toString();
                case 4:
                    return pedido.getEstadoEntrega();
                case 5:
                    return pedido.getCant_vendida();
                case 6:
                    return pedido.getTotal();
            }
            return "";
        }

        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
//            DetalleCompra detalle = compra.getListaDetallesCompra().get(rowIndex);
//            if (columnIndex != 3) {
//                return;
//            }
//            detalle.setCantidad((int) aValue);

        }

        @Override
        public void addTableModelListener(TableModelListener l) {

        }

        @Override
        public void removeTableModelListener(TableModelListener l) {

        }

    }

    public class ConfirmarEntregaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                long cod_pedido = (long) TablePedidos.getValueAt(TablePedidos.getSelectedRow(), 0);
                Pedido pedido = controlPedidos.buscarPedido(cod_pedido);
                pedido.setEstadoEntrega(EstadoEntrega.Entregado);
                controlPedidos.actualizarPedido(pedido);
                TablePedidos.updateUI();
            } catch (Exception ex) {
                Logger.getLogger(PedidoConfirmarEntregaUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
