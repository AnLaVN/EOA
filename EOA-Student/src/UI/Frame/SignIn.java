package UI.Frame;
// Make By Bình An || AnLaVN || KatoVN

import static Controller.DatabaseData.BTDAO;
import static Controller.DatabaseData.DTDAO;
import static Controller.DatabaseData.EOA_DB;
import static Controller.DatabaseData.LDAO;
import static Controller.DatabaseData.SVDAO;
import com.AnLa.UI.Mode;
import static Controller.LocalData.*;
import ObjectClass.Lop;
import ObjectClass.NativeUtils;
import ObjectClass.SinhVien;
import com.AnLa.FILE.Log;
import java.awt.Color;
import java.io.IOException;
import javax.imageio.ImageIO;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import javax.swing.UIManager;

public class SignIn extends javax.swing.JFrame {

    public SignIn() {
        ParentComponent = this;                                                 //Set this component is parent component
        UIManager.put("OptionPane.messageFont", CUSTOMFONT);                    //set font size for meesage in optionpane after scale
        UIManager.put("TextField.font", new java.awt.Font("Tahoma", 0, 22));    //set font size for textfield in optionpane after scale
        UIManager.put("OptionPane.buttonFont", CUSTOMFONT);                     //set font size for buuton in optionpane after scale
        UIManager.put("ToolTip.font", CUSTOMFONT);                              //Set this component is parent component
        Mode.setMode(UIMode);                                                           //Set mode before create component
        Log.add("Language: " + LocalSetting.getLang());                                 //Log out current languages
        Log.add("Mode: " + (UIMode ? "Dark" : "Light") + "\n");                         //Log out current mode
        initComponents();
        try { setIconImage(ImageIO.read(getClass().getResource("/UI/Image/Logo.png"))); } 
        catch (IOException ex) {Log.add("!!! Error try to set Icon for frame. !!!");}
        btnSignIn.requestFocusInWindow();
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panBackground = new javax.swing.JPanel();
        icoClose = new com.AnLa.UI.ImagePanel();
        lblSignIn = new javax.swing.JLabel();
        icoSettings = new com.AnLa.UI.ImagePanel();
        lblEOA = new javax.swing.JLabel();
        lblVersion = new javax.swing.JLabel();
        btnSignIn = new com.k33ptoo.components.KButton();
        panID = new javax.swing.JPanel();
        txtIDSV = new javax.swing.JTextField();
        icoUser = new com.AnLa.UI.ImagePanel();
        panIDLop = new javax.swing.JPanel();
        txtIDLop = new javax.swing.JTextField();
        icoLop = new com.AnLa.UI.ImagePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign In");
        setUndecorated(true);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panBackground.setPreferredSize(new java.awt.Dimension(480, 800));

        icoClose.setBackground(new java.awt.Color(153, 255, 255));
        icoClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoClose.setPreferredSize(new java.awt.Dimension(50, 50));
        icoClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icoCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icoCloseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoCloseMousePressed(evt);
            }
        });

        icoClose.setPic("src/UI/Image/Close.png");

        javax.swing.GroupLayout icoCloseLayout = new javax.swing.GroupLayout(icoClose);
        icoClose.setLayout(icoCloseLayout);
        icoCloseLayout.setHorizontalGroup(
            icoCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        icoCloseLayout.setVerticalGroup(
            icoCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        lblSignIn.setFont(new java.awt.Font("Courier New", 1, 70)); // NOI18N
        lblSignIn.setForeground(new java.awt.Color(51, 153, 255));
        lblSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignIn.setText("Sign In");

        icoSettings.setBackground(new java.awt.Color(153, 255, 255));
        icoSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoSettings.setPreferredSize(new java.awt.Dimension(50, 50));
        icoSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icoSettingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icoSettingsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoSettingsMousePressed(evt);
            }
        });

        icoSettings.setPic("src/UI/Image/Settings.png");

        javax.swing.GroupLayout icoSettingsLayout = new javax.swing.GroupLayout(icoSettings);
        icoSettings.setLayout(icoSettingsLayout);
        icoSettingsLayout.setHorizontalGroup(
            icoSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        icoSettingsLayout.setVerticalGroup(
            icoSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        lblEOA.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        lblEOA.setForeground(BLUR);

        lblVersion.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lblVersion.setForeground(BLUR);
        lblVersion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblVersion.setText(CURRENTVERSION);

        btnSignIn.setText("Sign In");
        btnSignIn.setFont(new java.awt.Font("Tahoma", 1, 45)); // NOI18N
        btnSignIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSignIn.setkBorderRadius(20);
        btnSignIn.setkEndColor(new java.awt.Color(0, 188, 212));
        btnSignIn.setkHoverEndColor(new Color(0, 188, 212, 155));
        btnSignIn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSignIn.setkHoverStartColor(new Color(224, 64, 251, 155));
        btnSignIn.setkSelectedColor(new java.awt.Color(255, 0, 0));
        btnSignIn.setkStartColor(new java.awt.Color(224, 64, 251));
        btnSignIn.setPreferredSize(new java.awt.Dimension(300, 80));
        btnSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });

        panID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        panID.setPreferredSize(new java.awt.Dimension(500, 71));

        txtIDSV.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        txtIDSV.setBorder(null);
        txtIDSV.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (txtIDSV.getText().equals(Lang.getString("IDSV"))) {
                    txtIDSV.setText("");
                    Mode.setModeComponent(txtIDSV);
                }
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (txtIDSV.getText().isEmpty()) {
                    txtIDSV.setForeground(Color.GRAY);
                    txtIDSV.setText(Lang.getString("IDSV"));
                }
            }
        });

        icoUser.setBackground(new java.awt.Color(153, 255, 255));

        icoUser.setPic("src/UI/Image/User.png");

        javax.swing.GroupLayout icoUserLayout = new javax.swing.GroupLayout(icoUser);
        icoUser.setLayout(icoUserLayout);
        icoUserLayout.setHorizontalGroup(
            icoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoUserLayout.setVerticalGroup(
            icoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panIDLayout = new javax.swing.GroupLayout(panID);
        panID.setLayout(panIDLayout);
        panIDLayout.setHorizontalGroup(
            panIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panIDLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(icoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(txtIDSV, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panIDLayout.setVerticalGroup(
            panIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panIDLayout.createSequentialGroup()
                .addGroup(panIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIDSV, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        panIDLop.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        panIDLop.setPreferredSize(new java.awt.Dimension(500, 71));

        txtIDLop.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        txtIDLop.setBorder(null);
        txtIDLop.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (txtIDLop.getText().equals(Lang.getString("IDClass"))) {
                    txtIDLop.setText("");
                    Mode.setModeComponent(txtIDLop);
                }
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (txtIDLop.getText().isEmpty()) {
                    txtIDLop.setForeground(Color.GRAY);
                    txtIDLop.setText(Lang.getString("IDClass"));
                }
            }
        });

        icoLop.setBackground(new java.awt.Color(153, 255, 255));

        icoLop.setPic("src/UI/Image/Class.png");

        javax.swing.GroupLayout icoLopLayout = new javax.swing.GroupLayout(icoLop);
        icoLop.setLayout(icoLopLayout);
        icoLopLayout.setHorizontalGroup(
            icoLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoLopLayout.setVerticalGroup(
            icoLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panIDLopLayout = new javax.swing.GroupLayout(panIDLop);
        panIDLop.setLayout(panIDLopLayout);
        panIDLopLayout.setHorizontalGroup(
            panIDLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panIDLopLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(icoLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(txtIDLop, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panIDLopLayout.setVerticalGroup(
            panIDLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panIDLopLayout.createSequentialGroup()
                .addGroup(panIDLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIDLop, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icoLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout panBackgroundLayout = new javax.swing.GroupLayout(panBackground);
        panBackground.setLayout(panBackgroundLayout);
        panBackgroundLayout.setHorizontalGroup(
            panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(icoSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icoClose, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEOA, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBackgroundLayout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBackgroundLayout.createSequentialGroup()
                        .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBackgroundLayout.createSequentialGroup()
                        .addComponent(lblSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panIDLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panBackgroundLayout.setVerticalGroup(
            panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBackgroundLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(icoSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(icoClose, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(lblSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(panID, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(panIDLop, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEOA, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void icoSettingsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSettingsMousePressed
        new Settings(this, true).setVisible(true);                                      //open setting dialog
    }//GEN-LAST:event_icoSettingsMousePressed

    private void icoSettingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSettingsMouseEntered
        icoSettings.setPic("src/UI/Image/Settings2.png");                               //repaint new icon
        repaint();
    }//GEN-LAST:event_icoSettingsMouseEntered

    private void icoSettingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSettingsMouseExited
        icoSettings.setPic("src/UI/Image/Settings.png");                                //repaint new icon
        repaint();
    }//GEN-LAST:event_icoSettingsMouseExited

    private void icoCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoCloseMousePressed
        System.exit(0);                                                                 //exit app
    }//GEN-LAST:event_icoCloseMousePressed

    private void icoCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoCloseMouseEntered
        icoClose.setPic("src/UI/Image/Close2.png");                                     //repaint new icon
        repaint();
    }//GEN-LAST:event_icoCloseMouseEntered

    private void icoCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoCloseMouseExited
        icoClose.setPic("src/UI/Image/Close.png");                                      //repaint new icon
        repaint();
    }//GEN-LAST:event_icoCloseMouseExited

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        setMode();                                          //reset string sign in from new Languages
        lblSignIn.setText(Lang.getString("SignIn"));        //set string sign in for label
        btnSignIn.setText(Lang.getString("SignIn"));        //set string sign in for button
        lblEOA.setText("EOA - " + Lang.getString("SV"));    //set name app in new Languages
        
        if (txtIDSV.getText().isEmpty()) {
            txtIDSV.setForeground(Color.GRAY);
            txtIDSV.setText(Lang.getString("IDSV"));
        }
        if (txtIDLop.getText().isEmpty()) {
            txtIDLop.setForeground(Color.GRAY);
            txtIDLop.setText(Lang.getString("IDClass"));
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        String IDSV = txtIDSV.getText().trim(),
               IDLop= txtIDLop.getText().trim();
        IDSV = IDSV.equals(Lang.getString("IDSV")) ? null : IDSV;
        IDLop= IDLop.equals(Lang.getString("IDClass")) ? null : IDLop;
        if(IDSV == null || IDSV.isBlank()){  
            Mode.WMessage(this, Lang.getString("EmIDSV"), Lang.getString("Notifi"), INFORMATION_MESSAGE);
            Log.add("Sign In Failed."); 
        }
        else if(SignIn(IDSV, IDLop)){    new Dashboard().setVisible(true);   dispose();  }
    }//GEN-LAST:event_btnSignInActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Loader loader = new Loader(this, true);                                         //create new loader, containt by this frame
        loader.setInfor("/UI/Image/Loading.gif", Lang.getString("Version"));            //set infor for loader, icon and content
        loader.setVisible(true);
        if(EOA_DB.isConnectNull()){
            loader = new Loader(this, true);
            loader.Case = 1;
            loader.setInfor("/UI/Image/Server.gif", Lang.getString("DB"));
            loader.setVisible(true);
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        if (txtIDSV.getText().equals(Lang.getString("IDSV")))       txtIDSV.setText("");
        if (txtIDLop.getText().equals(Lang.getString("IDClass")))   txtIDLop.setText("");
    }//GEN-LAST:event_formWindowLostFocus

    public static void main(String args[]) throws IOException {
        System.setProperty("sun.java2d.uiScale", "1.0");                                //Turn off UI Scale
        //System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        try {
            NativeUtils.loadLibraryFromJar("/AppData/opencv_java249.dll");
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }
    private SinhVien sinhvien = null;
    private Long IDLOP;
    private Lop lop = null;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnSignIn;
    private com.AnLa.UI.ImagePanel icoClose;
    private com.AnLa.UI.ImagePanel icoLop;
    private com.AnLa.UI.ImagePanel icoSettings;
    private com.AnLa.UI.ImagePanel icoUser;
    private javax.swing.JLabel lblEOA;
    private javax.swing.JLabel lblSignIn;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JPanel panBackground;
    private javax.swing.JPanel panID;
    private javax.swing.JPanel panIDLop;
    private javax.swing.JTextField txtIDLop;
    private javax.swing.JTextField txtIDSV;
    // End of variables declaration//GEN-END:variables

    private void setMode(){                                                     //set mode for component
        Mode.setModeComponent(panBackground);   Mode.setModeComponent(icoSettings); Mode.setModeComponent(icoClose);
        Mode.setModeComponent(panID);           Mode.setModeComponent(icoUser);     Mode.setModeComponent(txtIDSV);
        Mode.setModeComponent(panIDLop);        Mode.setModeComponent(icoLop);      Mode.setModeComponent(txtIDLop);
        repaint();
    }
    private boolean SignIn(String Username, String IDLop){
        Log.add("Sign In with: \n\tUsername: " + Username);
        //if(SVDAO.selectById(Username).isEmpty()) {  Mode.WMessage(this, Lang.getString("EmUser"), Lang.getString("Notifi"), WARNING_MESSAGE); return false; }
        if(IDLop == null)   {  Mode.WMessage(this, Lang.getString("EmClass"),Lang.getString("Notifi"), WARNING_MESSAGE); return false; }
        try{IDLOP = Long.parseLong(IDLop);}catch(NumberFormatException e){
            Mode.WMessage(this, Lang.getString("InClass"), Lang.getString("Notifi"), WARNING_MESSAGE); return false;
        }
        sinhvien = SVDAO.selectByIDandLop(Username, IDLOP);
        lop = LDAO.selectById(IDLOP);
        if(lop != null){
            if(sinhvien == null){
                Mode.WMessage(this, Lang.getString("InSV"), Lang.getString("Notifi"), WARNING_MESSAGE); 
                return false;
            }
            CurrentSV = sinhvien;
            CurrentID = Username;
            CurrentL = lop;         
            arrBT = BTDAO.selectAllByIdLop(IDLOP);
            if(arrBT.isEmpty()){
                Mode.WMessage(this, Lang.getString("EmExam"), Lang.getString("Notifi"), WARNING_MESSAGE);
                return false;
            }
            CurrentBT = arrBT.get(0);
            CurrentDT = DTDAO.selectById(CurrentBT.getIDDeThi());
            Loader loader = new Loader(this, true);
            loader.Case = 2;
            loader.setInfor("/UI/Image/Cloud.gif", Lang.getString("DYA"));
            loader.setVisible(true);
            return true;
        }else {    Mode.WMessage(this, Lang.getString("EClass"), Lang.getString("Notifi"), WARNING_MESSAGE);   }
        return false;
    }    
}