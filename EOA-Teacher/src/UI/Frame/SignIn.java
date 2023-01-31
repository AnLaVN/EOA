package UI.Frame;
// Make By Bình An || AnLaVN || KatoVN

import static Controller.DatabaseData.EOA_DB;
import com.AnLa.UI.Mode;
import static Controller.LocalData.*;
import ObjectClass.GiangVien;
import DataAccessObject.GiangVienDAO;
import com.AnLa.FILE.Log;
import com.AnLa.HASH.SHA256;
import java.awt.Color;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class SignIn extends javax.swing.JFrame {

    public SignIn() {
        ParentComponent = this;                                                 //Set this component is parent component
        UIManager.put("OptionPane.messageFont", CUSTOMFONT);                    //set font size for meesage in optionpane after scale
        UIManager.put("TextField.font", new java.awt.Font("Tahoma", 0, 22));    //set font size for textfield in optionpane after scale
        UIManager.put("OptionPane.buttonFont", CUSTOMFONT);                     //set font size for buuton in optionpane after scale
        UIManager.put("ToolTip.font", CUSTOMFONT);
        Mode.setMode(UIMode);                                                   //Set mode before create component
        Log.add("Language: " + LocalSetting.getLang());                         //Log out current languages
        Log.add("Mode: " + (UIMode ? "Dark" : "Light") + "\n");                 //Log out current mode
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
        lblSignUp = new javax.swing.JLabel();
        lblDHAA = new javax.swing.JLabel();
        panID = new javax.swing.JPanel();
        txtIDGV = new javax.swing.JTextField();
        icoUser = new com.AnLa.UI.ImagePanel();
        panPass = new javax.swing.JPanel();
        icoPass = new com.AnLa.UI.ImagePanel();
        txtPassword = new javax.swing.JPasswordField();
        icoEye = new com.AnLa.UI.ImagePanel();
        lblForgotPass = new javax.swing.JLabel();
        chkRememberMe = new javax.swing.JCheckBox();

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
        lblSignIn.setForeground(TTCOLOR);
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

        lblSignUp.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblSignUp.setForeground(TTCOLOR);
        lblSignUp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSignUp.setText("Sign Up");
        lblSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSignUpMousePressed(evt);
            }
        });

        lblDHAA.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblDHAA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDHAA.setText("Don't have an account ?");

        panID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        txtIDGV.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        txtIDGV.setBorder(null);
        txtIDGV.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (txtIDGV.getText().equals(Lang.getString("ID"))) {
                    txtIDGV.setText("");
                    Mode.setModeComponent(txtIDGV);
                }
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (txtIDGV.getText().isEmpty()) {
                    txtIDGV.setForeground(Color.GRAY);
                    txtIDGV.setText(Lang.getString("ID"));
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
                .addComponent(txtIDGV, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panIDLayout.setVerticalGroup(
            panIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panIDLayout.createSequentialGroup()
                .addGroup(panIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIDGV, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        panPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        icoPass.setBackground(new java.awt.Color(153, 255, 255));

        icoPass.setPic("src/UI/Image/Password.png");

        javax.swing.GroupLayout icoPassLayout = new javax.swing.GroupLayout(icoPass);
        icoPass.setLayout(icoPassLayout);
        icoPassLayout.setHorizontalGroup(
            icoPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoPassLayout.setVerticalGroup(
            icoPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        txtPassword.setBorder(null);
        txtPassword.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (txtPassword.getText().equals(Lang.getString("Pass"))) {
                    txtPassword.setText("");
                    Mode.setModeComponent(txtPassword);
                    txtPassword.setEchoChar('*');
                }
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (txtPassword.getText().isEmpty()) {
                    txtPassword.setForeground(Color.GRAY);
                    txtPassword.setText(Lang.getString("Pass"));
                    txtPassword.setEchoChar((char) 0);
                }
            }
        });

        icoEye.setBackground(new java.awt.Color(153, 255, 255));
        icoEye.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoEyeMousePressed(evt);
            }
        });

        icoEye.setPic("src/UI/Image/Eyen't.png");

        javax.swing.GroupLayout icoEyeLayout = new javax.swing.GroupLayout(icoEye);
        icoEye.setLayout(icoEyeLayout);
        icoEyeLayout.setHorizontalGroup(
            icoEyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoEyeLayout.setVerticalGroup(
            icoEyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panPassLayout = new javax.swing.GroupLayout(panPass);
        panPass.setLayout(panPassLayout);
        panPassLayout.setHorizontalGroup(
            panPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPassLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(icoPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(icoEye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panPassLayout.setVerticalGroup(
            panPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(icoPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(icoEye, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        lblForgotPass.setBackground(new Color(0,0,0,0));
        lblForgotPass.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblForgotPass.setForeground(TTCOLOR);
        lblForgotPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblForgotPass.setText("Forgot password");
        lblForgotPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblForgotPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblForgotPassMousePressed(evt);
            }
        });

        chkRememberMe.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        chkRememberMe.setText("Remember me?");
        chkRememberMe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkRememberMe.setFocusPainted(false);
        chkRememberMe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/CheckBoxNull.png"))); // NOI18N
        chkRememberMe.setPreferredSize(new java.awt.Dimension(180, 35));
        chkRememberMe.setRolloverEnabled(false);
        chkRememberMe.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/CheckBox.png"))); // NOI18N

        javax.swing.GroupLayout panBackgroundLayout = new javax.swing.GroupLayout(panBackground);
        panBackground.setLayout(panBackgroundLayout);
        panBackgroundLayout.setHorizontalGroup(
            panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBackgroundLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblEOA, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panBackgroundLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(lblDHAA, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panBackgroundLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panBackgroundLayout.createSequentialGroup()
                                .addComponent(chkRememberMe, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblForgotPass, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panBackgroundLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBackgroundLayout.createSequentialGroup()
                        .addComponent(icoSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(icoClose, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        panBackgroundLayout.setVerticalGroup(
            panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBackgroundLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(icoSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(icoClose, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(lblSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(panID, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(panPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkRememberMe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblForgotPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDHAA)
                    .addComponent(lblSignUp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEOA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVersion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void icoEyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoEyeMousePressed
        seePass = !seePass;
        if(!new String(txtPassword.getPassword()).equals(Lang.getString("Pass"))){
            if(seePass) {   txtPassword.setEchoChar((char) 0);  icoEye.setPic("src/UI/Image/Eye.png");}
            else        {   txtPassword.setEchoChar('*');       icoEye.setPic("src/UI/Image/Eyen't.png");}
        }
    }//GEN-LAST:event_icoEyeMousePressed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        setMode();                                                                      //repaint UI mode when focus from setting dialog
        String signin = Lang.getString("SignIn");                                       //reset string sign in from new Languages
        lblSignIn.setText(signin);                                                      //set string sign in for label
        btnSignIn.setText(signin);                                                      //set string sign in for button
        lblEOA.setText("EOA - " + Lang.getString("GV"));                                //set name app in new Languages
        lblDHAA.setText(Lang.getString("DHAA"));
        lblSignUp.setText(Lang.getString("SignUp"));
        lblForgotPass.setText(Lang.getString("ForgotPW"));
        chkRememberMe.setText(Lang.getString("RM"));
        
        if (txtIDGV.getText().isEmpty()) {
            txtIDGV.setForeground(Color.GRAY);
            txtIDGV.setText(Lang.getString("ID"));
        }
        if (new String(txtPassword.getPassword()).isEmpty()) {
            txtPassword.setForeground(Color.GRAY);
            txtPassword.setText(Lang.getString("Pass"));
            txtPassword.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        if (txtIDGV.getText().equals(Lang.getString("ID"))) txtIDGV.setText("");
        if (new String(txtPassword.getPassword()).equals(Lang.getString("Pass"))) txtPassword.setText("");
    }//GEN-LAST:event_formWindowLostFocus

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
        try{
            GiangVien gv = ReadLocalUser();    //Read value of Local user
            String localUsername = gv.getIDGiangVien();
            if (localUsername != null && gv.getName().equals(CurrentPCName)) {
                if (SignIn(localUsername, gv.getPassword())) { 
                    Log.add("Auto SignIn with 'src/User/LocalUser.dat' successfully.");
                    new Dashboard().setVisible(true);   
                    dispose();
                }else {  Log.add("! Auto SignIn Failed. !\n\tUser doesn't matches."); }
            }else {  Log.add("! Auto SignIn Failed. !\n\tDoesn't have any Users."); }
        }catch(Exception e){Log.add("! Can't read Local User. !\n\tMaybe 'src/User/LocalUser.dat' doesn't exists or contains wrong value.\n\tAuto SignIn Failed. Please SignIn manually.");}
    }//GEN-LAST:event_formWindowOpened

    private void lblSignUpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignUpMousePressed
        new SignUp().setVisible(true);      dispose();
    }//GEN-LAST:event_lblSignUpMousePressed

    private void lblForgotPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotPassMousePressed
        new ResetPass().setVisible(true);   dispose();
    }//GEN-LAST:event_lblForgotPassMousePressed

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        String encryptUsername = SHA256.Encrypt(txtIDGV.getText().trim()),
               encryptPassword = SHA256.Encrypt(String.valueOf(txtPassword.getPassword()).trim());
        if(SignIn(encryptUsername, encryptPassword)){   new Dashboard().setVisible(true);   dispose();  }
        else{
            Mode.WMessage(ParentComponent, Lang.getString("InUser"), Lang.getString("Notifi"), JOptionPane.WARNING_MESSAGE);
            Log.add("Sign In Failed.");
        }
    }//GEN-LAST:event_btnSignInActionPerformed

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }
    private boolean seePass = false;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnSignIn;
    private javax.swing.JCheckBox chkRememberMe;
    private com.AnLa.UI.ImagePanel icoClose;
    private com.AnLa.UI.ImagePanel icoEye;
    private com.AnLa.UI.ImagePanel icoPass;
    private com.AnLa.UI.ImagePanel icoSettings;
    private com.AnLa.UI.ImagePanel icoUser;
    private javax.swing.JLabel lblDHAA;
    private javax.swing.JLabel lblEOA;
    private javax.swing.JLabel lblForgotPass;
    private javax.swing.JLabel lblSignIn;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JPanel panBackground;
    private javax.swing.JPanel panID;
    private javax.swing.JPanel panPass;
    private javax.swing.JTextField txtIDGV;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

    private void setMode(){                                                     //set mode for component
        Mode.setModeComponent(icoSettings); Mode.setModeComponent(icoClose);
        Mode.setModeComponent(lblDHAA);     Mode.setModeComponent(chkRememberMe);
        Mode.setModeComponent(panID);       Mode.setModeComponent(icoUser); Mode.setModeComponent(txtIDGV);
        Mode.setModeComponent(panPass);     Mode.setModeComponent(icoPass); Mode.setModeComponent(txtPassword); Mode.setModeComponent(icoEye);
        Mode.setModeComponent(panBackground);
        repaint();
    }
    private final GiangVienDAO GVDAO = new GiangVienDAO();
    private boolean SignIn(String Username, String Password){
        Log.add("Sign In with: \n\tUsername: " + Username + "\n\tPassword: " + Password);
        
        try{
            GiangVien gv = GVDAO.selectById(Username);
            if(gv != null && gv.getIDGiangVien().equals(Username) && gv.getPassword().equals(Password)){
                if(chkRememberMe.isSelected()){
                    WriteLocalUser(new GiangVien(Username, CurrentPCName, "", "", Password));
                    Log.add("Save User as 'src/User/LocalUser.dat'.");
                }
                CurrentGV = gv; CurrentID = Username; AVATAR = "src/User/"+CurrentID+".png";
                Loader loader = new Loader(this, true);
                loader.Case = 2;
                loader.setInfor("/UI/Image/Cloud.gif", Lang.getString("DYA"));
                loader.setVisible(true);
                return true;
            }
        }catch(Exception ex){   Mode.WMessage(this, Lang.getString("EmUser"), Lang.getString("Notifi"), JOptionPane.ERROR_MESSAGE); }
        return false;
    }
}