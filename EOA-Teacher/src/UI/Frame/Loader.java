package UI.Frame;
// Make By Bình An || AnLaVN || KatoVN

import static Controller.CloudData.deleteAvatar;
import static Controller.CloudData.setAvatar;
import static Controller.CloudData.uploadAvatar;
import static Controller.DatabaseData.BTDAO;
import static Controller.DatabaseData.CHDAO;
import static Controller.DatabaseData.DB_Connect;
import static Controller.DatabaseData.DTDAO;
import static Controller.DatabaseData.GVDAO;
import static Controller.DatabaseData.LDAO;
import static Controller.DatabaseData.SVDAO;
import static Controller.LocalData.*;
import ObjectClass.BuoiThi;
import ObjectClass.CauHoi;
import ObjectClass.DeThi;
import ObjectClass.Lop;
import ObjectClass.SinhVien;
import com.AnLa.FILE.Log;
import com.AnLa.UI.Mode;
import javax.mail.MessagingException;

public class Loader extends javax.swing.JDialog {

    public Loader(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        super.setLocationRelativeTo(parent);
        Mode.setModeComponent(Background);
        Mode.setModeComponent(lblText);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.5F);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/Loading.gif"))); // NOI18N

        lblText.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        lblText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblText.setText("Text");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addComponent(lblText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                .addComponent(lblText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        new Thread() { @Override public void run() {
            switch (Case) {
                case 0 -> checkVersion();
                case 1 -> DB_Connect();
                case 2 -> readAvatar();
                case 3 -> GVDAO.Insert(CurrentGV);
                case 4 -> {try{SMTP.sendEmailTo(SENDMAIL);}catch(MessagingException e){Log.add("!!! Error try to send email. !!!");}}
                case 5 -> GVDAO.Update(CurrentGV);
                case 6 -> uploadAvatar();
                case 7 -> setAvatar();
                case 8 -> {
                    //Delete buoithi
                    for(BuoiThi buoithi : arrBuoiThi){
                        BTDAO.Delete(buoithi.getIDBuoiThi());
                    }
                    //Delete lop va sinh vien
                    for(Lop lop : arrLop){
                        for(SinhVien sv : SVDAO.selectAllByLop(lop.getIDLop())){
                            sv.setImage("");
                        }
                        LDAO.Delete(lop.getIDLop());
                    }
                    //Delete de va cau hoi
                    for(DeThi dethi : arrDeThi){
                        for(CauHoi ch : CHDAO.selectAllByDeThi(dethi.getIDDeThi())){
                            CHDAO.Delete(ch.getIDCauHoi());
                        }
                        DTDAO.Delete(dethi.getIDDeThi());
                    }
                    deleteAvatar(); 
                    GVDAO.Delete(CurrentID);
                }
            }
            dispose();
        }}.start();
    }//GEN-LAST:event_formWindowOpened
    
    public static void main(String args[]) {
        System.setProperty("sun.java2d.uiScale", "1.0");                                //Turn off UI Scale
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Loader dialog = new Loader(new javax.swing.JFrame(), true);
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
    public int Case = 0;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel lblText;
    // End of variables declaration//GEN-END:variables
    
    public void setInfor(String filePath, String text){
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource(filePath)));
        lblText.setText(text);
    }
}