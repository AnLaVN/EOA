package UI.Frame;
// Make By Bình An || AnLaVN || KatoVN

import static Controller.LocalData.*;
import com.AnLa.FILE.Log;
import com.AnLa.FILE.ObjectData;
import com.AnLa.UI.Mode;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Settings extends javax.swing.JDialog {

    public Settings(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try { setIconImage(ImageIO.read(getClass().getResource("/UI/Image/Logo.png"))); } 
        catch (IOException ex) {Log.add("!!! Error try to set Icon for frame. !!!");}
        panLang.setVisible(showLanguage);                                       //set visible for panel contain languages flag
        setIcon();                                                              //set icon for toggle and arrow,
        SaveChange();                                                           //save change setting to file
        setMode();                                                              //repaint UI mode
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panBackground = new javax.swing.JPanel();
        lblSettings = new javax.swing.JLabel();
        ChooseMode = new com.k33ptoo.components.KGradientPanel();
        lblMode = new javax.swing.JLabel();
        icoMode = new com.AnLa.UI.ImagePanel();
        icoToggle = new com.AnLa.UI.ImagePanel();
        ChooseLang = new com.k33ptoo.components.KGradientPanel();
        lblLang = new javax.swing.JLabel();
        panLang = new javax.swing.JPanel();
        icoVN = new com.AnLa.UI.ImagePanel();
        icoEN = new com.AnLa.UI.ImagePanel();
        icoLang = new com.AnLa.UI.ImagePanel();
        icoArrow = new com.AnLa.UI.ImagePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(Lang.getString("Settings"));
        setResizable(false);

        lblSettings.setFont(new java.awt.Font("Courier New", 1, 50)); // NOI18N
        lblSettings.setForeground(new java.awt.Color(51, 153, 255));
        lblSettings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSettings.setText(Lang.getString("Settings"));

        ChooseMode.setBackground(BLIND);
        ChooseMode.setkBorderRadius(30);
        ChooseMode.setkEndColor(c2.getEndColor());
        ChooseMode.setkGradientFocus(250);
        ChooseMode.setkStartColor(c2.getStartColor());
        ChooseMode.setPreferredSize(new java.awt.Dimension(560, 60));

        lblMode.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblMode.setForeground(new java.awt.Color(255, 255, 255));
        lblMode.setText(Lang.getString("Darkmode"));
        lblMode.setPreferredSize(new java.awt.Dimension(120, 50));

        icoMode.setBackground(BLIND);
        icoMode.setPreferredSize(new java.awt.Dimension(50, 50));

        icoMode.setPic("src/UI/Image/Contrast.png");

        javax.swing.GroupLayout icoModeLayout = new javax.swing.GroupLayout(icoMode);
        icoMode.setLayout(icoModeLayout);
        icoModeLayout.setHorizontalGroup(
            icoModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        icoModeLayout.setVerticalGroup(
            icoModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        icoToggle.setBackground(BLIND);
        icoToggle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoToggle.setPreferredSize(new java.awt.Dimension(50, 50));
        icoToggle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoToggleMousePressed(evt);
            }
        });

        javax.swing.GroupLayout icoToggleLayout = new javax.swing.GroupLayout(icoToggle);
        icoToggle.setLayout(icoToggleLayout);
        icoToggleLayout.setHorizontalGroup(
            icoToggleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        icoToggleLayout.setVerticalGroup(
            icoToggleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ChooseModeLayout = new javax.swing.GroupLayout(ChooseMode);
        ChooseMode.setLayout(ChooseModeLayout);
        ChooseModeLayout.setHorizontalGroup(
            ChooseModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChooseModeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(icoMode, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblMode, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(icoToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        ChooseModeLayout.setVerticalGroup(
            ChooseModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChooseModeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(ChooseModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icoToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ChooseModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblMode, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addComponent(icoMode, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );

        ChooseLang.setBackground(BLIND);
        ChooseLang.setkBorderRadius(30);
        ChooseLang.setkEndColor(c2.getEndColor());
        ChooseLang.setkGradientFocus(250);
        ChooseLang.setkStartColor(c2.getStartColor());

        lblLang.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblLang.setForeground(new java.awt.Color(255, 255, 255));
        lblLang.setText(Lang.getString("Languages"));
        lblLang.setPreferredSize(new java.awt.Dimension(120, 50));

        panLang.setBackground(BLIND);
        panLang.setPreferredSize(new java.awt.Dimension(410, 100));

        icoVN.setBackground(BLIND);
        icoVN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoVN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icoVNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icoVNMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoVNMousePressed(evt);
            }
        });

        javax.swing.GroupLayout icoVNLayout = new javax.swing.GroupLayout(icoVN);
        icoVN.setLayout(icoVNLayout);
        icoVNLayout.setHorizontalGroup(
            icoVNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        icoVNLayout.setVerticalGroup(
            icoVNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        icoEN.setBackground(BLIND);
        icoEN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoEN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icoENMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icoENMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoENMousePressed(evt);
            }
        });

        javax.swing.GroupLayout icoENLayout = new javax.swing.GroupLayout(icoEN);
        icoEN.setLayout(icoENLayout);
        icoENLayout.setHorizontalGroup(
            icoENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        icoENLayout.setVerticalGroup(
            icoENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panLangLayout = new javax.swing.GroupLayout(panLang);
        panLang.setLayout(panLangLayout);
        panLangLayout.setHorizontalGroup(
            panLangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLangLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(icoVN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(icoEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panLangLayout.setVerticalGroup(
            panLangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLangLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panLangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icoVN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icoEN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        icoLang.setBackground(BLIND);
        icoLang.setPreferredSize(new java.awt.Dimension(50, 50));

        icoLang.setPic("src/UI/Image/Lang.png");

        javax.swing.GroupLayout icoLangLayout = new javax.swing.GroupLayout(icoLang);
        icoLang.setLayout(icoLangLayout);
        icoLangLayout.setHorizontalGroup(
            icoLangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        icoLangLayout.setVerticalGroup(
            icoLangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        icoArrow.setBackground(BLIND);
        icoArrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoArrow.setPreferredSize(new java.awt.Dimension(50, 50));
        icoArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoArrowMousePressed(evt);
            }
        });

        javax.swing.GroupLayout icoArrowLayout = new javax.swing.GroupLayout(icoArrow);
        icoArrow.setLayout(icoArrowLayout);
        icoArrowLayout.setHorizontalGroup(
            icoArrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        icoArrowLayout.setVerticalGroup(
            icoArrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ChooseLangLayout = new javax.swing.GroupLayout(ChooseLang);
        ChooseLang.setLayout(ChooseLangLayout);
        ChooseLangLayout.setHorizontalGroup(
            ChooseLangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChooseLangLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(ChooseLangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panLang, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                    .addGroup(ChooseLangLayout.createSequentialGroup()
                        .addComponent(icoLang, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lblLang, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(icoArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        ChooseLangLayout.setVerticalGroup(
            ChooseLangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChooseLangLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(ChooseLangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChooseLangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(icoLang, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addComponent(lblLang, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                    .addComponent(icoArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(panLang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panBackgroundLayout = new javax.swing.GroupLayout(panBackground);
        panBackground.setLayout(panBackgroundLayout);
        panBackgroundLayout.setHorizontalGroup(
            panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panBackgroundLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lblSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ChooseMode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ChooseLang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        panBackgroundLayout.setVerticalGroup(
            panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(ChooseMode, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(ChooseLang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void icoToggleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoToggleMousePressed
        UIMode = !UIMode;                                                       //change new mode
        SaveChange();                                                           //save it
        setIcon();                                                              //set picture for icon toggle
        Mode.setMode(UIMode);                                                   //set ui mode
        setMode();                                                              //repanit ui mode
    }//GEN-LAST:event_icoToggleMousePressed

    private void icoArrowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoArrowMousePressed
        showLanguage = !showLanguage;                                           //set open or close pannel contain languages flag
        panLang.setVisible(showLanguage);                                       //set visible for pannel
        setIcon();                                                              //set picture for icon arrow
    }//GEN-LAST:event_icoArrowMousePressed

    private void icoVNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoVNMousePressed
        LocalSetting.setLang("vi_VN");                                          //set Languages to "vi_VN" when click to VN Flag
        SaveChange();                                                           //save it
    }//GEN-LAST:event_icoVNMousePressed

    private void icoVNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoVNMouseEntered
        icoVN.setPic("src/UI/Image/VN.png");                                    //change icon when mouse hover
        repaint();                                                              //repaint it
    }//GEN-LAST:event_icoVNMouseEntered

    private void icoVNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoVNMouseExited
        SaveChange();                                                           //set to default when lost focus
    }//GEN-LAST:event_icoVNMouseExited

    private void icoENMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoENMousePressed
        LocalSetting.setLang("en_US");                                          //set Languages to "en_US" when click to EN Flag
        SaveChange();                                                           //save it
    }//GEN-LAST:event_icoENMousePressed

    private void icoENMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoENMouseEntered
        icoEN.setPic("src/UI/Image/EN.png");                                    //change icon when mouse hover
        repaint();                                                              //repaint it
    }//GEN-LAST:event_icoENMouseEntered

    private void icoENMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoENMouseExited
        SaveChange();                                                           //set to default when lost focus
    }//GEN-LAST:event_icoENMouseExited

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
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Settings dialog = new Settings(new javax.swing.JFrame(), true);
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
    private boolean showLanguage;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KGradientPanel ChooseLang;
    private com.k33ptoo.components.KGradientPanel ChooseMode;
    private com.AnLa.UI.ImagePanel icoArrow;
    private com.AnLa.UI.ImagePanel icoEN;
    private com.AnLa.UI.ImagePanel icoLang;
    private com.AnLa.UI.ImagePanel icoMode;
    private com.AnLa.UI.ImagePanel icoToggle;
    private com.AnLa.UI.ImagePanel icoVN;
    private javax.swing.JLabel lblLang;
    private javax.swing.JLabel lblMode;
    private javax.swing.JLabel lblSettings;
    private javax.swing.JPanel panBackground;
    private javax.swing.JPanel panLang;
    // End of variables declaration//GEN-END:variables
    
    private void setMode(){
        Mode.setModeComponent(panBackground);
        repaint();
    }
    private void SaveChange(){
        LocalSetting.setMode(UIMode);
        ObjectData.writeData("src/AppData/Setting.dat", LocalSetting);
        String lang = LocalSetting.getLang();
        setLang(lang);
        lblSettings.setText(Lang.getString("Settings"));
        lblMode.setText(Lang.getString("Darkmode"));
        lblLang.setText(Lang.getString("Languages"));
        this.setTitle(Lang.getString("Settings"));
        icoVN.setPic("src/UI/Image/VN" + (lang.equals("vi_VN") ? "" : "2") + ".png");
        icoEN.setPic("src/UI/Image/EN" + (lang.equals("en_US") ? "" : "2") + ".png");
        repaint();
    }
    private void setIcon(){
        icoToggle.setPic("src/UI/Image/Toggle" + (UIMode ? "On" : "Off") + ".png");
        icoArrow.setPic("src/UI/Image/" + (showLanguage ? "Up" : "Down") + ".png");
        repaint();
    }
}