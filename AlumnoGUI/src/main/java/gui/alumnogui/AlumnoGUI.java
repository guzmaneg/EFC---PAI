/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui.alumnogui;

import calendario.MiCalendario;
import calendario.MiCalendarioException;
import dao.AlumnoDaoSQL;
import dao.AlumnoDaoTXT;
import dao.DAO;
import dao.DaoException;
import dao.DaoFactory;
import dao.DaoFactoryException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import persona.Alumno;
import persona.PersonaInvalidaException;
import persona.PersonaNombreException;

/**
 *
 * @author g.guzman
 */
public class AlumnoGUI extends javax.swing.JFrame {

    private DAO<Alumno, Integer> dao;
    private AlumnoDaoTXT daoTxT;
    private AlumnoDaoSQL daoSQL;
    private static Map<String, String> configMap = new HashMap<>();
    private AlumnoModel alumnoModel;
    
    /**
     * Creates new form AlumnoGUI
     */
    public AlumnoGUI() throws PersonaInvalidaException, PersonaNombreException {
        try {
            initComponents();
            setLocationRelativeTo(null);
            setTitle("ABM Alumnos");
            
            alumnoModel = new AlumnoModel();
            alumnosTable.setModel(alumnoModel);
            
            List<Alumno> alumnos = new ArrayList<>();
            alumnos.add(new Alumno(24004600, "Juan", "Perez", 'M', new MiCalendario(23, 8, 1974)));
            alumnos.add(new Alumno(24004601, "Juana", "Gomez", 'F', new MiCalendario(1, 3, 2020)));
            
            alumnoModel.setAlumnos(alumnos);
            
        } catch (MiCalendarioException ex) {
            Logger.getLogger(AlumnoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filterPanel = new javax.swing.JPanel();
        tipoRepoComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        fileSelectedLabel = new javax.swing.JLabel();
        fileSelectedTextField = new javax.swing.JTextField();
        selectFileButton = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        gridPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alumnosTable = new javax.swing.JTable();
        buttonsPanel = new javax.swing.JPanel();
        createButton = new javax.swing.JButton();
        updteButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        filterPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        filterPanel.setToolTipText("Filtros");

        tipoRepoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TXT", "SQL" }));
        tipoRepoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoRepoComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione Tipo:");

        fileSelectedLabel.setText("Seleccione archivo:");

        fileSelectedTextField.setEnabled(false);

        selectFileButton.setText("...");
        selectFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFileButtonActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Mostrar todos");

        javax.swing.GroupLayout filterPanelLayout = new javax.swing.GroupLayout(filterPanel);
        filterPanel.setLayout(filterPanelLayout);
        filterPanelLayout.setHorizontalGroup(
            filterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(filterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(filterPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(tipoRepoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(filterPanelLayout.createSequentialGroup()
                        .addGroup(filterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fileSelectedLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(fileSelectedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        filterPanelLayout.setVerticalGroup(
            filterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(filterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(tipoRepoComboBox))
                .addGap(18, 18, 18)
                .addGroup(filterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileSelectedLabel)
                    .addComponent(fileSelectedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectFileButton))
                .addGap(12, 12, 12)
                .addComponent(jCheckBox1))
        );

        gridPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        alumnosTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(alumnosTable);

        buttonsPanel.setBackground(new java.awt.Color(204, 255, 255));
        buttonsPanel.setEnabled(false);

        createButton.setText("Crear");
        createButton.setEnabled(false);
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        updteButton.setText("Modificar");
        updteButton.setEnabled(false);
        updteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updteButtonActionPerformed(evt);
            }
        });

        viewButton.setText("Consultar");
        viewButton.setEnabled(false);
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Eliminar");
        deleteButton.setEnabled(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(viewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(updteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(createButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updteButton)
                .addGap(12, 12, 12)
                .addComponent(viewButton)
                .addGap(18, 18, 18)
                .addComponent(deleteButton)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout gridPanelLayout = new javax.swing.GroupLayout(gridPanel);
        gridPanel.setLayout(gridPanelLayout);
        gridPanelLayout.setHorizontalGroup(
            gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gridPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gridPanelLayout.setVerticalGroup(
            gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gridPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gridPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(gridPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFileButtonActionPerformed
        try {
            JFileChooser jfc = new JFileChooser();
            int resp = jfc.showOpenDialog(this);
            if (resp!=JFileChooser.APPROVE_OPTION) {
                return;
            }
            
            String absolutePath = jfc.getSelectedFile().getAbsolutePath();
            configMap.clear();
            configMap.put(DaoFactory.TIPO_DAO, DaoFactory.TIPO_DAO_TXT);
            configMap.put(DaoFactory.FILE_PATH, absolutePath);
            daoTxT = (AlumnoDaoTXT) DaoFactory.getInstance().createDao(configMap);
            dao = daoTxT;
            fileSelectedTextField.setText(absolutePath);
            enableButtons(true);
        } catch (DaoFactoryException ex) {
            Logger.getLogger(AlumnoGUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getLocalizedMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_selectFileButtonActionPerformed

    private void tipoRepoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoRepoComboBoxActionPerformed
        
        if (tipoRepoComboBox.getSelectedIndex()==0) {   // TXT
            if (daoTxT!=null) {
                dao = daoTxT;
            }
            fileSelectedLabel.setVisible(true);
            fileSelectedTextField.setVisible(true);
            selectFileButton.setVisible(true);
            
        }
        else { // SQL
            if (daoSQL!=null) {
                
                dao = daoSQL;
            }
            else {
                try {
                    configMap.clear();
                    configMap.put(DaoFactory.TIPO_DAO, DaoFactory.TIPO_DAO_SQL);
                    configMap.put(DaoFactory.URL_DB, "jdbc:mysql://localhost:3306/universidad");
                    configMap.put(DaoFactory.USER_DB, "root");
                    configMap.put(DaoFactory.PASS_DB, "root");

                    daoSQL = (AlumnoDaoSQL) DaoFactory.getInstance().createDao(configMap);
                    dao = daoSQL;
                } catch (DaoFactoryException ex) {
                    Logger.getLogger(AlumnoGUI.class.getName()).log(Level.SEVERE, null, ex);
                    // JoptionPane...
                }
            }
            fileSelectedLabel.setVisible(false);
            fileSelectedTextField.setVisible(false);
            selectFileButton.setVisible(false);
        }
    }//GEN-LAST:event_tipoRepoComboBoxActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        try {
            AlumnoDialog dialog = new AlumnoDialog(this, true, false, null);
            dialog.setVisible(true);

            AlumnoDTO dto = dialog.getDto();
            System.out.println("DTO:"+dto.getNombre()+" - "+dto.getDni());
            
            Alumno newAlu = null;
            try {
                newAlu = AlumnoMapper.dto2Alu(dto);
            } catch (PersonaInvalidaException | PersonaNombreException ex) {
                Logger.getLogger(AlumnoGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            dao.create(newAlu);
            
            // quitar
            alumnoModel.getAlumnos().add(newAlu);

            refreshTable();
           
        } catch (DaoException ex) {
            Logger.getLogger(AlumnoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_createButtonActionPerformed

    private void updteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updteButtonActionPerformed
        Alumno alumnoSeleccionado = getAlumnoFromTable();
        if (alumnoSeleccionado!=null) {
            AlumnoDialog dialog = new AlumnoDialog(this, true, false, AlumnoMapper.alu2Dto(alumnoSeleccionado));;
            dialog.setVisible(true);
            try {
                Alumno alu = AlumnoMapper.dto2Alu(dialog.getDto());
                try {
                    dao.update(alu);
                    refreshTable();
                } catch (DaoException ex) {
                    Logger.getLogger(AlumnoGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (PersonaInvalidaException | PersonaNombreException ex) {
                Logger.getLogger(AlumnoGUI.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, ex.getLocalizedMessage(), "Error", 
                        JOptionPane.ERROR_MESSAGE);
                dialog.setVisible(true);
            }
        }
    }//GEN-LAST:event_updteButtonActionPerformed

    private Alumno getAlumnoFromTable() {
        int selectedRow = alumnosTable.getSelectedRow();
        if (selectedRow<0) {
            JOptionPane.showMessageDialog(this, "Error");
            return null;
        }
        List<Alumno> alumnos = alumnoModel.getAlumnos();
        return alumnos.get(selectedRow);
    }
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        Alumno alumnoSeleccionado = getAlumnoFromTable();
        if (alumnoSeleccionado!=null) {
            int resp = JOptionPane.showConfirmDialog(this, "¿Está seguro eliminar el alumno?", "Eliminar", 
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (resp==JOptionPane.YES_OPTION) {
                try {
                    dao.deleteById(alumnoSeleccionado.getDni());
                    refreshTable();
                } catch (DaoException ex) {
                    Logger.getLogger(AlumnoGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        Alumno alumnoSeleccionado = getAlumnoFromTable();
        if (alumnoSeleccionado!=null) {
            AlumnoDialog dialog = new AlumnoDialog(this, true, true, AlumnoMapper.alu2Dto(alumnoSeleccionado));
            dialog.setVisible(true);
        }
    }//GEN-LAST:event_viewButtonActionPerformed

    public void refreshTable() throws DaoException {
        //alumnos.remove(selectedRow);
        //alumnoModel.setAlumnos(dao.findAll(true));
        alumnoModel.fireTableDataChanged();
    }

    public void enableButtons(boolean enable) {
        createButton.setEnabled(enable);
        updteButton.setEnabled(enable);
        viewButton.setEnabled(enable);
        deleteButton.setEnabled(enable);
    }

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
            java.util.logging.Logger.getLogger(AlumnoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlumnoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlumnoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlumnoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AlumnoGUI().setVisible(true);
                } catch (PersonaInvalidaException | PersonaNombreException ex) {
                    Logger.getLogger(AlumnoGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable alumnosTable;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel fileSelectedLabel;
    private javax.swing.JTextField fileSelectedTextField;
    private javax.swing.JPanel filterPanel;
    private javax.swing.JPanel gridPanel;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton selectFileButton;
    private javax.swing.JComboBox<String> tipoRepoComboBox;
    private javax.swing.JButton updteButton;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
