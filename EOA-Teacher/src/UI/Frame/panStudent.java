package UI.Frame;
// Make By Bình An || AnLaVN || KatoVN

import Controller.LocalData;
import static Controller.LocalData.BLIND;
import static Controller.LocalData.Lang;
import static Controller.LocalData.PANICO;
import static Controller.LocalData.ParentFrame;
import static Controller.LocalData.U_TEXT;
import ObjectClass.SinhVien;
import com.AnLa.FILE.Log;
import com.AnLa.UI.Mode;
import java.awt.Color;
import java.awt.Frame;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import jnafilechooser.api.JnaFileChooser;

public class panStudent extends javax.swing.JPanel {

    public panStudent() {
        initComponents();
        Mode.setModeComponent(this);
        Mode.setModeComponent(Background);      Mode.setModeComponent(lblSTT);
        Mode.setModeComponent(txtIDSV);         txtIDSV.setBackground(BLIND);
        Mode.setModeComponent(txtNameSV);       txtNameSV.setBackground(BLIND);
        Mode.setModeComponent(lblAvatar);       lblAvatar.setBackground(BLIND);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new com.k33ptoo.components.KGradientPanel();
        lblSTT = new javax.swing.JLabel();
        txtIDSV = new javax.swing.JTextField();
        txtNameSV = new javax.swing.JTextField();
        icoRemove = new com.AnLa.UI.ImagePanel();
        icoImage = new com.AnLa.UI.ImagePanel();
        lblAvatar = new javax.swing.JLabel();

        Background.setkBorderRadius(25);
        Background.setkEndColor(PANICO);
        Background.setkStartColor(PANICO);

        lblSTT.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        lblSTT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSTT.setText("0");

        txtIDSV.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtIDSV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, U_TEXT));
        txtIDSV.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (txtIDSV.getText().equals(Lang.getString("EIDSV"))) {
                    txtIDSV.setText("");
                    Mode.setModeComponent(txtIDSV); txtIDSV.setBackground(BLIND);
                }
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (txtIDSV.getText().isEmpty()) {
                    txtIDSV.setForeground(Color.GRAY);
                    txtIDSV.setText(Lang.getString("EIDSV"));
                }
            }
        });

        txtNameSV.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtNameSV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, U_TEXT));
        txtNameSV.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (txtNameSV.getText().equals(Lang.getString("ENameSV"))) {
                    txtNameSV.setText("");
                    Mode.setModeComponent(txtNameSV); txtNameSV.setBackground(BLIND);
                }
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (txtNameSV.getText().isEmpty()) {
                    txtNameSV.setForeground(Color.GRAY);
                    txtNameSV.setText(Lang.getString("ENameSV"));
                }
            }
        });

        icoRemove.setBackground(BLIND);
        icoRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icoRemoveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icoRemoveMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoRemoveMousePressed(evt);
            }
        });

        icoRemove.setPic("src/UI/Image/Remove.png");

        javax.swing.GroupLayout icoRemoveLayout = new javax.swing.GroupLayout(icoRemove);
        icoRemove.setLayout(icoRemoveLayout);
        icoRemoveLayout.setHorizontalGroup(
            icoRemoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        icoRemoveLayout.setVerticalGroup(
            icoRemoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        icoImage.setBackground(BLIND);
        icoImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icoImageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icoImageMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoImageMousePressed(evt);
            }
        });
        icoImage.setPic("src/UI/Image/Image.png");

        javax.swing.GroupLayout icoImageLayout = new javax.swing.GroupLayout(icoImage);
        icoImage.setLayout(icoImageLayout);
        icoImageLayout.setHorizontalGroup(
            icoImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        icoImageLayout.setVerticalGroup(
            icoImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblAvatar.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        lblAvatar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAvatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAvatarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblSTT, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(txtIDSV, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(txtNameSV, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(icoImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(icoRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(icoImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icoRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSTT, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(txtIDSV)
                    .addComponent(txtNameSV))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void icoRemoveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoRemoveMouseEntered
        icoRemove.setPic("src/UI/Image/Remove2.png");
        repaint();
    }//GEN-LAST:event_icoRemoveMouseEntered

    private void icoRemoveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoRemoveMouseExited
        icoRemove.setPic("src/UI/Image/Remove.png");
        repaint();
    }//GEN-LAST:event_icoRemoveMouseExited

    private void icoImageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoImageMouseEntered
        icoImage.setPic("src/UI/Image/Image2.png");
        repaint();
    }//GEN-LAST:event_icoImageMouseEntered

    private void icoImageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoImageMouseExited
        icoImage.setPic("src/UI/Image/Image.png");
        repaint();
    }//GEN-LAST:event_icoImageMouseExited

    private void icoImageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoImageMousePressed
        JnaFileChooser SelectPic = new JnaFileChooser();
        SelectPic.addFilter(Lang.getString("Image"), "jpeg", "jpg", "png");
        if(SelectPic.showOpenDialog(LocalData.ParentWindow)){
            BigLoader loader = new BigLoader(ParentFrame, true);
            loader.setInfor("/UI/Image/Cloud.gif", Lang.getString("UpFCSV"));
            loader.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override public void windowOpened(java.awt.event.WindowEvent evt) {
                    new Thread() { @Override public void run() {
                        selectImage = SelectPic.getSelectedFile();
                        SV.setImage(selectImage.getAbsolutePath());
                        lblAvatar.setText("Online: " + SV.getAvatar().substring(SV.getAvatar().lastIndexOf("/")+1));
                        loader.dispose();
                    }}.start();
                }});
            loader.setVisible(true);
        }
    }//GEN-LAST:event_icoImageMousePressed

    private void lblAvatarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAvatarMousePressed
        if(SV.getAvatar() != null && !SV.getAvatar().equals("")){
            BigLoader loader = new BigLoader(ParentFrame, true);
            loader.setInfor("/UI/Image/Cloud.gif", Lang.getString("TaSV"));
            loader.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override public void windowOpened(java.awt.event.WindowEvent evt) {
                    new Thread() { @Override public void run() {
                        try {
                            panImage pan = new panImage(new Frame(), true);
                            pan.Image.setPicFromURL(new URL(SV.getAvatar()));
                            try {   pan.setIconImage(ImageIO.read(getClass().getResource("/UI/Image/Logo.png")));   } 
                            catch (IOException ex) {    Log.add("!!! Error try to set Icon for frame. !!!");        }
                            pan.setTitle(SV.getIDSinhVien() + " - " + SV.getName());
                            loader.dispose();
                            pan.setVisible(true);
                        } catch (MalformedURLException ex) {    Log.add("!!! Error try to open Student Image from: " + SV.getAvatar()); }
                    }}.start();
                }});
            loader.setVisible(true);
        }
    }//GEN-LAST:event_lblAvatarMousePressed

    private void icoRemoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoRemoveMousePressed
        BigLoader loader = new BigLoader(ParentFrame, true);
        loader.setInfor("/UI/Image/Bin.gif", Lang.getString("ReSV"));
        loader.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override public void windowOpened(java.awt.event.WindowEvent evt) {
                new Thread() { @Override public void run() {
                    SV.setImage("");
                    loader.dispose();
                }}.start();
            }});
        loader.setVisible(true);
    }//GEN-LAST:event_icoRemoveMousePressed

    private SinhVien SV;
    private File selectImage;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KGradientPanel Background;
    public com.AnLa.UI.ImagePanel icoImage;
    public com.AnLa.UI.ImagePanel icoRemove;
    private javax.swing.JLabel lblAvatar;
    public javax.swing.JLabel lblSTT;
    public javax.swing.JTextField txtIDSV;
    public javax.swing.JTextField txtNameSV;
    // End of variables declaration//GEN-END:variables

    public void setPlaceholder(){
        txtIDSV.requestFocusInWindow();
        txtNameSV.requestFocusInWindow();
        Background.requestFocusInWindow();
    }
    public void setSinhVien(SinhVien sv){
        SV = sv;
        txtIDSV.setText(SV.getIDSinhVien());
        txtNameSV.setText(SV.getName());
        String Avatar = SV.getAvatar();
        lblAvatar.setText(Avatar == null ? 
                            Lang.getString("SelectImageSV") : 
                            (Avatar.startsWith("http") ? 
                                "Online: " + Avatar.substring(Avatar.lastIndexOf("/")+1) : 
                                "Local: " + new File(Avatar).getName()));
    }
    public SinhVien getSinhVien(){
        SV.setIDSinhVien(txtIDSV.getText().trim());
        SV.setName(txtNameSV.getText().trim());
        return SV;
    }
}