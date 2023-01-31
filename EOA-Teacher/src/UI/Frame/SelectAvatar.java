package UI.Frame;
// Make By Bình An || AnLaVN || KatoVN

import static Controller.LocalData.*;
import com.AnLa.FILE.Log;
import com.AnLa.UI.Mode;
import static com.AnLa.UI.Mode.WInput;
import java.awt.Color;
import java.awt.Frame;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import jnafilechooser.api.JnaFileChooser;


public class SelectAvatar extends javax.swing.JDialog {

    public SelectAvatar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        SelectAvatar.parent = parent;
        initComponents();
        try { setIconImage(ImageIO.read(getClass().getResource("/UI/Image/Logo.png"))); } 
        catch (IOException ex) {Log.add("!!! Error try to set Icon for frame. !!!");}
        Mode.setModeComponent(Background);  
        Mode.setModeComponent(panUpload);   Mode.setModeComponent(icoUpload);
        Mode.setModeComponent(panLink);     Mode.setModeComponent(icoLink);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        panUpload = new javax.swing.JPanel();
        icoUpload = new com.AnLa.UI.ImagePanel();
        panLink = new javax.swing.JPanel();
        icoLink = new com.AnLa.UI.ImagePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(Lang.getString("EAva"));

        panUpload.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, BLUR), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), BLUR), Lang.getString("Upload"), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, TittleFont, TextColor)); // NOI18N

        icoUpload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoUpload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icoUploadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icoUploadMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoUploadMousePressed(evt);
            }
        });

        icoUpload.setPic("src/UI/Image/Upload.png");

        javax.swing.GroupLayout icoUploadLayout = new javax.swing.GroupLayout(icoUpload);
        icoUpload.setLayout(icoUploadLayout);
        icoUploadLayout.setHorizontalGroup(
            icoUploadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );
        icoUploadLayout.setVerticalGroup(
            icoUploadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panUploadLayout = new javax.swing.GroupLayout(panUpload);
        panUpload.setLayout(panUploadLayout);
        panUploadLayout.setHorizontalGroup(
            panUploadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUploadLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(icoUpload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        panUploadLayout.setVerticalGroup(
            panUploadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUploadLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(icoUpload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        panLink.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, BLUR), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), BLUR), Lang.getString("Link"), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, TittleFont, TextColor)); // NOI18N

        icoLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icoLinkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icoLinkMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoLinkMousePressed(evt);
            }
        });

        icoLink.setPic("src/UI/Image/Link.png");

        javax.swing.GroupLayout icoLinkLayout = new javax.swing.GroupLayout(icoLink);
        icoLink.setLayout(icoLinkLayout);
        icoLinkLayout.setHorizontalGroup(
            icoLinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );
        icoLinkLayout.setVerticalGroup(
            icoLinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panLinkLayout = new javax.swing.GroupLayout(panLink);
        panLink.setLayout(panLinkLayout);
        panLinkLayout.setHorizontalGroup(
            panLinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLinkLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(icoLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        panLinkLayout.setVerticalGroup(
            panLinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLinkLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(icoLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(panUpload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(panLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panUpload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void icoUploadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoUploadMouseEntered
        icoUpload.setPic("src/UI/Image/Upload1.png");
    }//GEN-LAST:event_icoUploadMouseEntered

    private void icoUploadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoUploadMouseExited
        icoUpload.setPic("src/UI/Image/Upload.png");
    }//GEN-LAST:event_icoUploadMouseExited

    private void icoUploadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoUploadMousePressed
        JnaFileChooser fc = new JnaFileChooser();
        fc.addFilter(Lang.getString("Pic"), "jpg", "jpeg", "png");
        if(fc.showOpenDialog(ParentWindow)) {
            AVATAR = fc.getSelectedFile().getAbsolutePath();
            loader = new Loader(parent, true);
            loader.Case = 6;
            loader.setInfor("/UI/Image/Cloud.gif", Lang.getString("UpdateAva"));
            loader.setVisible(true);
            dispose();
        }   
    }//GEN-LAST:event_icoUploadMousePressed

    private void icoLinkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoLinkMouseEntered
        icoLink.setPic("src/UI/Image/Link1.png");
    }//GEN-LAST:event_icoLinkMouseEntered

    private void icoLinkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoLinkMouseExited
        icoLink.setPic("src/UI/Image/Link.png");
    }//GEN-LAST:event_icoLinkMouseExited

    private void icoLinkMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoLinkMousePressed
        Link = WInput(this, Lang.getString("LinkMess"), Lang.getString("Link"), JOptionPane.INFORMATION_MESSAGE);
        if(Link != null && !Link.equals("")){
            if(Link.startsWith("http") && (Link.endsWith(".jpg") || Link.endsWith(".jpeg") || Link.endsWith(".png"))){
                try {
                    url = new URL(Link);
                    con = url.openConnection();
                    con.connect();

                    AVATAR = Link;
                    loader = new Loader(parent, true);
                    loader.Case = 7;
                    loader.setInfor("/UI/Image/Cloud.gif", Lang.getString("UpdateAva"));
                    loader.setVisible(true);
                    dispose();
                } catch (MalformedURLException e) {
                    System.out.println("er");
                    Mode.WMessage(this, Lang.getString("InLink").replaceFirst("!", "!\n").replaceFirst(":", ":\n\t"), Lang.getString("Notifi"), JOptionPane.WARNING_MESSAGE);
                } catch (IOException e) {
                    Mode.WMessage(this, Lang.getString("DeLink").replaceFirst("!", "!\n"), Lang.getString("Notifi"), JOptionPane.ERROR_MESSAGE);
                }
            }else{
                Mode.WMessage(this, Lang.getString("InLink").replaceFirst("!", "!\n").replaceFirst(":", ":\n\t"), Lang.getString("Notifi"), JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_icoLinkMousePressed

    public static void main(String args[]) {
        System.setProperty("sun.java2d.uiScale", "1.0");
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectAvatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SelectAvatar dialog = new SelectAvatar(new javax.swing.JFrame(), true);
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
    
    private String Link = "";
    private URL url;
    private URLConnection con;
    private static Frame parent;
    private Loader loader;
    private final Color TextColor = Mode.getTextColor();
    private final java.awt.Font TittleFont = new java.awt.Font("Courier New", 1, 25);

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private com.AnLa.UI.ImagePanel icoLink;
    private com.AnLa.UI.ImagePanel icoUpload;
    private javax.swing.JPanel panLink;
    private javax.swing.JPanel panUpload;
    // End of variables declaration//GEN-END:variables
}