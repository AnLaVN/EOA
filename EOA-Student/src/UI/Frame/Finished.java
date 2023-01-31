package UI.Frame;

import static Controller.LocalData.Lang;
import com.AnLa.FILE.Log;
import com.AnLa.UI.Mode;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Finished extends javax.swing.JFrame {

    public Finished() {
        initComponents();
        try { setIconImage(ImageIO.read(getClass().getResource("/UI/Image/Logo.png"))); } 
        catch (IOException ex) {Log.add("!!! Error try to set Icon for frame. !!!");}
        Mode.setModeComponent(Background);
        Mode.setModeComponent(icon);
        Mode.setModeComponent(lblMark);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        lblSuccess = new javax.swing.JLabel();
        lblMark = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(Lang.getString("Result"));
        setResizable(false);

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/Success.gif"))); // NOI18N

        lblSuccess.setFont(new java.awt.Font("Courier New", 1, 45)); // NOI18N
        lblSuccess.setForeground(new java.awt.Color(51, 153, 255));
        lblSuccess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSuccess.setText(Lang.getString("Fini"));

        lblMark.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        lblMark.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMark.setText("Point");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(256, 256, 256))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMark, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSuccess, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblSuccess, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lblMark, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
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
            java.util.logging.Logger.getLogger(Finished.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Finished().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel lblMark;
    private javax.swing.JLabel lblSuccess;
    // End of variables declaration//GEN-END:variables

    public void setMark(Object mark){
        lblMark.setText(Lang.getString("Mark").replaceFirst("X", mark.toString()));
    }
}