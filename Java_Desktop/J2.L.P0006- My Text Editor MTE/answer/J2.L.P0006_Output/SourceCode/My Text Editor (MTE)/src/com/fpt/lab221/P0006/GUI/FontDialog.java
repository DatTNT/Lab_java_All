/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.lab221.P0006.GUI;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author lab026
 */
public class FontDialog extends javax.swing.JDialog {

    /**
     * Creates new form Font
     *
     * @param parent
     * @param modal
     */
    public FontDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Font");
        AddListFont();
        AddListSize();
        setPreviewText();
    }

    private void AddListSize() {
        DefaultListModel model = new DefaultListModel();
        for (int i = 8; i < 49; i += 2) {
            model.addElement(i);
        }
        jListSize.setModel(model);
    }

    private void AddListFont() {
        GraphicsEnvironment ge = GraphicsEnvironment
                .getLocalGraphicsEnvironment();
        String fontNames[] = ge.getAvailableFontFamilyNames();
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < fontNames.length; i++) {
            model.addElement(fontNames[i]);
        }
        jListFont.setModel(model);
    }

    public void setPreviewText() {
        Font f = ((MyTextEditorFrame) this.getParent()).getjTextAreaNote().getFont();
        lbPreview.setFont(f);
        jTextFieldFont.setText(f.getFontName());
        jListFont.setSelectedValue(f.getFontName(), true);
        jListFontStyle.setSelectedIndex(f.getStyle());
        jTextFieldFontStyle.setText(jListFontStyle.getSelectedValue().toString());
        jTextFieldSize.setText(Integer.toString(f.getSize()));
        jListSize.setSelectedValue(f.getSize(), true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelFont = new javax.swing.JLabel();
        jTextFieldFont = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListFont = new javax.swing.JList<>();
        jLabelFontStyle = new javax.swing.JLabel();
        jTextFieldFontStyle = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListFontStyle = new javax.swing.JList<>();
        jLabelSize = new javax.swing.JLabel();
        jTextFieldSize = new javax.swing.JTextField();
        jButtonOk = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jPanelSample = new javax.swing.JPanel();
        lbPreview = new javax.swing.JLabel();
        jScrollPaneSize = new javax.swing.JScrollPane();
        jListSize = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelFont.setDisplayedMnemonic('f');
        jLabelFont.setText("Font:");
        jLabelFont.setToolTipText("");

        jListFont.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListFontValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListFont);

        jLabelFontStyle.setDisplayedMnemonic('y');
        jLabelFontStyle.setText("Font Style:");

        jListFontStyle.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Normal", "Bold", "Italic", "Bold Italic" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListFontStyle.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListFontStyleValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListFontStyle);

        jLabelSize.setDisplayedMnemonic('s');
        jLabelSize.setText("Size:");

        jButtonOk.setText("OK");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jPanelSample.setBorder(javax.swing.BorderFactory.createTitledBorder("Sample"));

        lbPreview.setText("AaBbYyZz");

        javax.swing.GroupLayout jPanelSampleLayout = new javax.swing.GroupLayout(jPanelSample);
        jPanelSample.setLayout(jPanelSampleLayout);
        jPanelSampleLayout.setHorizontalGroup(
            jPanelSampleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSampleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPreview)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanelSampleLayout.setVerticalGroup(
            jPanelSampleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSampleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPreview)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jListSize.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListSizeValueChanged(evt);
            }
        });
        jScrollPaneSize.setViewportView(jListSize);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldFont, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFont, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPaneSize, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldFontStyle, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 1, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabelFontStyle, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelSize, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jTextFieldSize))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanelSample, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFont)
                    .addComponent(jLabelFontStyle)
                    .addComponent(jLabelSize))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFontStyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPaneSize))
                .addGap(18, 18, 18)
                .addComponent(jPanelSample, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOk)
                    .addComponent(jButtonCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jListFontValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListFontValueChanged
        // TODO add your handling code here:
        Font current = lbPreview.getFont();
        String fontName = jListFont.getSelectedValue().toString();
        int fontStyle = current.getStyle();
        int fontSize = current.getSize();
        jTextFieldFont.setText(fontName);
        Font f = new Font(fontName, fontStyle, fontSize);
        lbPreview.setFont(f);
    }//GEN-LAST:event_jListFontValueChanged

    private void jListFontStyleValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListFontStyleValueChanged
        // TODO add your handling code here:
        Font current = lbPreview.getFont();
        String fontName = current.getFontName();
        int fontStyle = jListFontStyle.getSelectedIndex();
        int fontSize = current.getSize();
        jTextFieldFontStyle.setText(jListFontStyle.getSelectedValue().toString());
        Font f = new Font(fontName, fontStyle, fontSize);
        lbPreview.setFont(f);
    }//GEN-LAST:event_jListFontStyleValueChanged

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
        // TODO add your handling code here:
        ((MyTextEditorFrame) this.getParent())
                .getjTextAreaNote().setFont(lbPreview.getFont());
        dispose();
    }//GEN-LAST:event_jButtonOkActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jListSizeValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListSizeValueChanged
        Font current = lbPreview.getFont();
        String fontName = current.getFontName();
        int fontStyle = current.getStyle();
        int fontSize = (int) jListSize.getSelectedValue();

        jTextFieldSize.setText(jListSize.getSelectedValue().toString());
        Font f = new Font(fontName, fontStyle, fontSize);
        lbPreview.setFont(f);
    }//GEN-LAST:event_jListSizeValueChanged

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
            java.util.logging.Logger.getLogger(FontDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FontDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FontDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FontDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FontDialog dialog = new FontDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JLabel jLabelFont;
    private javax.swing.JLabel jLabelFontStyle;
    private javax.swing.JLabel jLabelSize;
    private javax.swing.JList<String> jListFont;
    private javax.swing.JList<String> jListFontStyle;
    private javax.swing.JList jListSize;
    private javax.swing.JPanel jPanelSample;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneSize;
    private javax.swing.JTextField jTextFieldFont;
    private javax.swing.JTextField jTextFieldFontStyle;
    private javax.swing.JTextField jTextFieldSize;
    private javax.swing.JLabel lbPreview;
    // End of variables declaration//GEN-END:variables
}
