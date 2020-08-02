package Aplica;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import Clases.*;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class frmRegistro extends javax.swing.JFrame {

    Libro objLi;
    DefaultListModel moLibro, moEditorial, moClase, moAño, moPaginas, moCosto;
    DefaultListModel moEstadisticas;
    ValidarNumeros letra = new ValidarNumeros();
    int a = 0, b = 0, c = 0;

    public frmRegistro() {
        initComponents();
        llenaEditorial();
        llenaClase();
        cargaModelos();
        limitarAño();
        this.setLocationRelativeTo(null);
    }

    public void limitarAño() {
        this.txtaño.setDocument(new LimitadorCaracteres(txtaño, 4));
    }
    public void limitarPagina(){
        this.txtpaginas.setDocument(new LimitadorCaracteres(txtpaginas, 4));
    }
    public void limitarCosto(){
        this.txtcosto.setDocument(new LimitadorCaracteres(txtcosto, 3));
    }
    void cargaModelos() {
        moLibro = new DefaultListModel();
        moEditorial = new DefaultListModel();
        moClase = new DefaultListModel();
        moAño = new DefaultListModel();
        moPaginas = new DefaultListModel();
        moCosto = new DefaultListModel();
        moEstadisticas = new DefaultListModel();
        lstLibro.setModel(moLibro);
        lstEditorial.setModel(moEditorial);
        lstClase.setModel(moClase);
        lstAño.setModel(moAño);
        lstPaginas.setModel(moPaginas);
        lstCosto.setModel(moCosto);
        lstEstadisticas.setModel(moEstadisticas);
    }

    void llenaModelos() {
        moLibro.addElement(objLi.getNombre());
        moEditorial.addElement(objLi.getEditorial());
        moClase.addElement(objLi.getClase());
        moAño.addElement(objLi.getAño());
        moPaginas.addElement(objLi.getPaginas());
        moCosto.addElement(objLi.getCosto());
    }

    void llenaEditorial() {
        cboEditorial.addItem("A");
        cboEditorial.addItem("B");
        cboEditorial.addItem("C");
    }

    void llenaClase() {
        cboClase.addItem("Programacion");
        cboClase.addItem("Analisis");
        cboClase.addItem("Diseño");
    }

    String getLibro() {
        return nombre();
    }

    void conteo() {
        switch(ingresarClase()){
            case 0:
                a++;
                break;
            case 1:
                b++;
                break;
            case 2:
                c++;
                break;
        }
    }

    String nombre() {
        String nom;
        nom = txtNombre.getText();
        char[] caracteres = nom.toCharArray();
        caracteres[0] = Character.toUpperCase(caracteres[0]);
        for (int i = 0; i < nom.length() - 2; i++) {
            if (caracteres[i] == ' ' || caracteres[i] == '.' || caracteres[i] == ',') {
                caracteres[i + 1] = Character.toUpperCase(caracteres[i + 1]);
            }
        }
        return new String(caracteres);
    }
    int ingresarClase() {
        int tipo;
        tipo = cboEditorial.getSelectedIndex();
        return tipo;
    }

    String getEditorial() {
        return String.valueOf(cboEditorial.getSelectedItem());
    }

    String getClase() {
        return String.valueOf(cboClase.getSelectedItem());
    }

    int getAño() {
        return Integer.parseInt(txtaño.getText());
    }

    int getPaginas() {
        return Integer.parseInt(txtpaginas.getText());
    }

    double getCosto() {
        return Double.parseDouble(txtcosto.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        cboEditorial = new javax.swing.JComboBox<>();
        cboClase = new javax.swing.JComboBox<>();
        txtaño = new javax.swing.JTextField();
        txtpaginas = new javax.swing.JTextField();
        txtcosto = new javax.swing.JTextField();
        btnregistrar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstClase = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstEditorial = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstLibro = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        lstPaginas = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        lstCosto = new javax.swing.JList<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        lstAño = new javax.swing.JList<>();
        btnEstadistica = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        lstEstadisticas = new javax.swing.JList<>();
        btnGrafico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DEL LIBRO");

        txtNombre.setBackground(new java.awt.Color(102, 102, 102));
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "- - Nombre del Libro - -", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        cboEditorial.setBackground(new java.awt.Color(102, 102, 102));
        cboEditorial.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Editorial", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        cboClase.setBackground(new java.awt.Color(102, 102, 102));
        cboClase.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clase de Libro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        txtaño.setBackground(new java.awt.Color(102, 102, 102));
        txtaño.setForeground(new java.awt.Color(255, 255, 255));
        txtaño.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Año de edicion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        txtaño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtañoKeyPressed(evt);
            }
        });

        txtpaginas.setBackground(new java.awt.Color(102, 102, 102));
        txtpaginas.setForeground(new java.awt.Color(255, 255, 255));
        txtpaginas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Paginas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        txtpaginas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpaginasKeyPressed(evt);
            }
        });

        txtcosto.setBackground(new java.awt.Color(102, 102, 102));
        txtcosto.setForeground(new java.awt.Color(255, 255, 255));
        txtcosto.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Costo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        txtcosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcostoKeyPressed(evt);
            }
        });

        btnregistrar.setText("REGISTRAR");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        lstClase.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "C. de Libro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jScrollPane3.setViewportView(lstClase);

        lstEditorial.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "T. Editorial", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jScrollPane4.setViewportView(lstEditorial);

        lstLibro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "-- Nombre del Libro --", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jScrollPane5.setViewportView(lstLibro);

        lstPaginas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Paginas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jScrollPane7.setViewportView(lstPaginas);

        lstCosto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Costo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jScrollPane8.setViewportView(lstCosto);

        lstAño.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Año de Edicion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jScrollPane9.setViewportView(lstAño);

        btnEstadistica.setText("ESTADISTICA");
        btnEstadistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticaActionPerformed(evt);
            }
        });

        jScrollPane10.setViewportView(lstEstadisticas);

        btnGrafico.setText("GRAFICO");
        btnGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEstadistica, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtaño, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtpaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(txtcosto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cboEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboClase, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(btnGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane10))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(413, 413, 413))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cboClase, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addComponent(txtcosto)
                    .addComponent(txtpaginas)
                    .addComponent(txtaño))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEstadistica, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        String error=" Rellene todas las casillas";
        try {
            objLi = new Libro(getLibro(), getEditorial(), getClase(),
                    getAño(), getPaginas(), getCosto());
            llenaModelos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Error en la Aplicacion:" + error);
        }
        conteo();
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnEstadisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticaActionPerformed
        String error=" No hay Libro ingresados";
        try {
            moEstadisticas.clear();
            moEstadisticas.addElement(
                    "Numero de Libro de Análisis de la Editorial B es: " + objLi.getTAnalisis());
            int mayor = Integer.MIN_VALUE;
            int pos = 0;
            for (int i = 0; i < moLibro.getSize(); i++) {
                if (Integer.parseInt(moAño.elementAt(i).
                        toString()) > mayor) {
                    mayor = Integer.parseInt(moAño.elementAt(i).toString());
                    pos = i;
                }
            }
            moEstadisticas.addElement(
                    "Libro con el año de edición más reciente          : " + moLibro.getElementAt(pos));
            int menor = Integer.MAX_VALUE;
            for (int i = 0; i < moLibro.getSize(); i++) {
                if (Integer.parseInt(moPaginas.elementAt(i).
                        toString()) < menor) {
                    menor = Integer.parseInt(moPaginas.elementAt(i).toString());
                    pos = i;
                }
            }
            moEstadisticas.addElement("Editorial con libro de menor pagina es: " + moEditorial.getElementAt(pos));
            double mayorCosto = Double.MIN_VALUE;
            for (int i = 0; i < moLibro.getSize(); i++) {
                if (Double.parseDouble(moCosto.elementAt(i)
                        .toString()) > mayorCosto) {
                    mayorCosto = Double.parseDouble(moCosto.elementAt(i)
                            .toString());
                    pos = i;
                }
            }
            moEstadisticas.addElement("Libro con mayor costo es:   " + moLibro.getElementAt(pos));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en la Aplicacion: " + error);
        }
    }//GEN-LAST:event_btnEstadisticaActionPerformed

    private void btnGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficoActionPerformed

        try {
            DefaultCategoryDataset ds = new DefaultCategoryDataset();
            ds.addValue(a, "A", "");
            ds.addValue(b, "B", "");
            ds.addValue(c, "C", "");

            JFreeChart jf = ChartFactory.createBarChart3D("Grafico de Barras", "Tipo de Editorial", "Cantidad de Libros", ds, PlotOrientation.HORIZONTAL, true, true, true);
            ChartFrame f = new ChartFrame("Cantidad de Libros", jf);
            f.setSize(1000, 600);
            f.setLocationRelativeTo(null);
            f.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnGraficoActionPerformed

    private void txtañoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtañoKeyPressed
        letra.sLetras(txtaño);
    }//GEN-LAST:event_txtañoKeyPressed

    private void txtpaginasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpaginasKeyPressed
        letra.sLetras(txtpaginas);
    }//GEN-LAST:event_txtpaginasKeyPressed

    private void txtcostoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcostoKeyPressed
        letra.sLetras(txtcosto);
    }//GEN-LAST:event_txtcostoKeyPressed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        moLibro.removeAllElements();
        moAño.removeAllElements();
        moClase.removeAllElements();
        moCosto.removeAllElements();
        moEditorial.removeAllElements();
        moPaginas.removeAllElements();
        moEstadisticas.removeAllElements();
        txtNombre.requestFocus();
    }//GEN-LAST:event_btnlimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstadistica;
    private javax.swing.JButton btnGrafico;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JComboBox<String> cboClase;
    private javax.swing.JComboBox<String> cboEditorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JList<String> lstAño;
    private javax.swing.JList<String> lstClase;
    private javax.swing.JList<String> lstCosto;
    private javax.swing.JList<String> lstEditorial;
    private javax.swing.JList<String> lstEstadisticas;
    private javax.swing.JList<String> lstLibro;
    private javax.swing.JList<String> lstPaginas;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtaño;
    private javax.swing.JTextField txtcosto;
    private javax.swing.JTextField txtpaginas;
    // End of variables declaration//GEN-END:variables

}
