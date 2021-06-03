/*
 * Copyright (c) 2006 - 2010 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.common.bobrowser.bo.editor;

import de.linogistix.common.bobrowser.api.BOLookup;
import de.linogistix.common.bobrowser.bo.BO;
import java.awt.Graphics;
import org.mywms.model.BasicEntity;
import org.openide.util.Lookup;

/**
 *
 * @author  trautm
 */
public class BOInplaceEditorPanel extends javax.swing.JPanel {
  
  private BasicEntity entity;
  
  /** Creates new form BOInplaceEditorPanel */
  public BOInplaceEditorPanel() {
    initComponents();
  }

  public BasicEntity getEntity() {
    return entity;
  }

  public void setEntity(BasicEntity entity) {
    this.entity = entity;
    BO bo;
 
    if (entity != null){
      inputField.setText(this.entity.toUniqueString());
    } else{
      inputField.setText("");
    }
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
  private void initComponents() {
    inputField = new javax.swing.JTextField();

    setLayout(new java.awt.BorderLayout());

    inputField.setEditable(false);
    inputField.setText("jTextField1");
    inputField.setBorder(null);
    add(inputField, java.awt.BorderLayout.CENTER);

  }// </editor-fold>//GEN-END:initComponents
  
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField inputField;
  // End of variables declaration//GEN-END:variables

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }



}
