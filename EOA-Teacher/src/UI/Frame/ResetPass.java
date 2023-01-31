package UI.Frame;
// Make By Bình An || AnLaVN || KatoVN

import static Controller.DatabaseData.GVDAO;
import com.AnLa.UI.Mode;
import static Controller.LocalData.*;
import com.AnLa.FILE.Log;
import com.AnLa.FILE.ObjectData;
import com.AnLa.HASH.SHA256;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class ResetPass extends javax.swing.JFrame {

    public ResetPass() {
        ParentComponent = this;                                                                  //Set this component is parent component
        initComponents();
        try { setIconImage(ImageIO.read(getClass().getResource("/UI/Image/Logo.png"))); } 
        catch (IOException ex) {Log.add("!!! Error try to set Icon for frame. !!!");}
        btnAction.requestFocusInWindow();
        panOTPParent.setVisible(false);
        panPassword.setVisible(false);
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panBackground = new javax.swing.JPanel();
        icoClose = new com.AnLa.UI.ImagePanel();
        lblFYP = new javax.swing.JLabel();
        icoSettings = new com.AnLa.UI.ImagePanel();
        lblEOA = new javax.swing.JLabel();
        lblVersion = new javax.swing.JLabel();
        btnAction = new com.k33ptoo.components.KButton();
        lblRMYP = new javax.swing.JLabel();
        lblSignIn = new javax.swing.JLabel();
        scrPan = new javax.swing.JScrollPane();
        panContent = new javax.swing.JPanel();
        panEmail = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        icoEmail = new com.AnLa.UI.ImagePanel();
        panOTPParent = new javax.swing.JPanel();
        lblOTP = new javax.swing.JLabel();
        panOTP = new javax.swing.JPanel();
        txtCode1 = new javax.swing.JTextField();
        txtCode2 = new javax.swing.JTextField();
        txtCode3 = new javax.swing.JTextField();
        txtCode4 = new javax.swing.JTextField();
        txtCode5 = new javax.swing.JTextField();
        txtCode6 = new javax.swing.JTextField();
        lblNoneOTP = new javax.swing.JLabel();
        lblResetOTP = new javax.swing.JLabel();
        panPassword = new javax.swing.JPanel();
        panPass1 = new javax.swing.JPanel();
        icoPass1 = new com.AnLa.UI.ImagePanel();
        txtPass1 = new javax.swing.JPasswordField();
        icoSeePass1 = new com.AnLa.UI.ImagePanel();
        panPass2 = new javax.swing.JPanel();
        txtPass2 = new javax.swing.JPasswordField();
        icoPass2 = new com.AnLa.UI.ImagePanel();
        icoSeePass2 = new com.AnLa.UI.ImagePanel();

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

        lblFYP.setFont(new java.awt.Font("Courier New", 1, 44)); // NOI18N
        lblFYP.setForeground(TTCOLOR);
        lblFYP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFYP.setText("Forgot Your Password ?");

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

        btnAction.setText("Reset Pass");
        btnAction.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnAction.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAction.setkBorderRadius(20);
        btnAction.setkEndColor(new java.awt.Color(0, 188, 212));
        btnAction.setkHoverEndColor(new Color(0, 188, 212, 155));
        btnAction.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnAction.setkHoverStartColor(new Color(224, 64, 251, 155));
        btnAction.setkSelectedColor(new java.awt.Color(255, 0, 0));
        btnAction.setkStartColor(new java.awt.Color(224, 64, 251));
        btnAction.setPreferredSize(new java.awt.Dimension(300, 80));
        btnAction.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionActionPerformed(evt);
            }
        });

        lblRMYP.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblRMYP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRMYP.setText("Remembered your Password ?");

        lblSignIn.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblSignIn.setForeground(TTCOLOR);
        lblSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignIn.setText("Sign In");
        lblSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSignInMousePressed(evt);
            }
        });

        scrPan.setBorder(null);
        scrPan.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrPan.setVerticalScrollBar(new com.AnLa.UI.ScrollBar());

        panEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, U_TEXT));
        panEmail.setPreferredSize(new java.awt.Dimension(500, 61));

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        txtEmail.setBorder(null);
        txtEmail.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (txtEmail.getText().equals(Lang.getString("EYEmail"))) {
                    txtEmail.setText("");
                    Mode.setModeComponent(txtEmail);
                }
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (txtEmail.getText().isEmpty()) {
                    txtEmail.setForeground(Color.GRAY);
                    txtEmail.setText(Lang.getString("EYEmail"));
                }
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        icoEmail.setBackground(new java.awt.Color(153, 255, 255));

        icoEmail.setPic("src/UI/Image/Email.png");

        javax.swing.GroupLayout icoEmailLayout = new javax.swing.GroupLayout(icoEmail);
        icoEmail.setLayout(icoEmailLayout);
        icoEmailLayout.setHorizontalGroup(
            icoEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoEmailLayout.setVerticalGroup(
            icoEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panEmailLayout = new javax.swing.GroupLayout(panEmail);
        panEmail.setLayout(panEmailLayout);
        panEmailLayout.setHorizontalGroup(
            panEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEmailLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(icoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panEmailLayout.setVerticalGroup(
            panEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEmailLayout.createSequentialGroup()
                .addGroup(panEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        lblOTP.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        lblOTP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOTP.setText("Enter Code Bellow");

        panOTP.setBackground(new java.awt.Color(0, 0, 255));
        panOTP.setToolTipText("");
        panOTP.setPreferredSize(new java.awt.Dimension(500, 61));

        txtCode1.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        txtCode1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCode1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 102, 255)));
        txtCode1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCode1.addKeyListener( new KeyAdapter() {public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (((c < '0') || (c > '9') || txtCode1.getText().length() >= 1)) {e.consume();}
            if((c >= '0') && (c <= '9')){txtCode2.requestFocusInWindow();}
        }});

        txtCode2.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        txtCode2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCode2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 102, 255)));
        txtCode2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCode2.addKeyListener( new KeyAdapter() {public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (((c < '0') || (c > '9') || txtCode2.getText().length() >= 1)) {e.consume();}
            if(c == KeyEvent.VK_BACK_SPACE){txtCode1.requestFocusInWindow();}
            if((c >= '0') && (c <= '9')){txtCode3.requestFocusInWindow();}
        }});

        txtCode3.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        txtCode3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCode3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 102, 255)));
        txtCode3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCode3.addKeyListener( new KeyAdapter() {public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (((c < '0') || (c > '9') || txtCode3.getText().length() >= 1)) {e.consume();}
            if(c == KeyEvent.VK_BACK_SPACE){txtCode2.requestFocusInWindow();}
            if((c >= '0') && (c <= '9')){txtCode4.requestFocusInWindow();}
        }});

        txtCode4.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        txtCode4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCode4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 102, 255)));
        txtCode4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCode4.addKeyListener( new KeyAdapter() {public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (((c < '0') || (c > '9') || txtCode4.getText().length() >= 1)) {e.consume();}
            if(c == KeyEvent.VK_BACK_SPACE){txtCode3.requestFocusInWindow();}
            if((c >= '0') && (c <= '9')){txtCode5.requestFocusInWindow();}
        }});

        txtCode5.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        txtCode5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCode5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 102, 255)));
        txtCode5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCode5.addKeyListener( new KeyAdapter() {public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (((c < '0') || (c > '9') || txtCode5.getText().length() >= 1)) {e.consume();}
            if(c == KeyEvent.VK_BACK_SPACE){txtCode4.requestFocusInWindow();}
            if((c >= '0') && (c <= '9')){txtCode6.requestFocusInWindow();}
        }});

        txtCode6.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        txtCode6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCode6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 102, 255)));
        txtCode6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCode6.addKeyListener( new KeyAdapter() {public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (((c < '0') || (c > '9') || txtCode6.getText().length() >= 1)) {e.consume();}
            if(c == KeyEvent.VK_BACK_SPACE){txtCode5.requestFocusInWindow();}
        }});

        javax.swing.GroupLayout panOTPLayout = new javax.swing.GroupLayout(panOTP);
        panOTP.setLayout(panOTPLayout);
        panOTPLayout.setHorizontalGroup(
            panOTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOTPLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtCode2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtCode3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtCode4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtCode5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtCode6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        panOTPLayout.setVerticalGroup(
            panOTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOTPLayout.createSequentialGroup()
                .addGroup(panOTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCode2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCode3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCode4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCode5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCode6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        lblNoneOTP.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblNoneOTP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNoneOTP.setText("Khong nhan duoc OTP ?");

        lblResetOTP.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        lblResetOTP.setForeground(new java.awt.Color(51, 102, 255));
        lblResetOTP.setText("Gui lai OTP");
        lblResetOTP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblResetOTP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblResetOTPMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panOTPParentLayout = new javax.swing.GroupLayout(panOTPParent);
        panOTPParent.setLayout(panOTPParentLayout);
        panOTPParentLayout.setHorizontalGroup(
            panOTPParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOTPParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(panOTP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panOTPParentLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lblNoneOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResetOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panOTPParentLayout.setVerticalGroup(
            panOTPParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOTPParentLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panOTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(panOTPParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoneOTP)
                    .addComponent(lblResetOTP))
                .addGap(20, 20, 20))
        );

        panPass1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, U_TEXT));
        panPass1.setPreferredSize(new java.awt.Dimension(500, 61));

        icoPass1.setBackground(new java.awt.Color(153, 255, 255));

        icoPass1.setPic("src/UI/Image/Password.png");

        javax.swing.GroupLayout icoPass1Layout = new javax.swing.GroupLayout(icoPass1);
        icoPass1.setLayout(icoPass1Layout);
        icoPass1Layout.setHorizontalGroup(
            icoPass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoPass1Layout.setVerticalGroup(
            icoPass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        txtPass1.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        txtPass1.setBorder(null);
        txtPass1.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (txtPass1.getText().equals(Lang.getString("NPass"))) {
                    seePass1 = false;
                    txtPass1.setEchoChar('*');
                    txtPass1.setText("");
                    Mode.setModeComponent(txtPass1);
                }
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (txtPass1.getText().isEmpty()) {
                    seePass1 = true;
                    txtPass1.setEchoChar((char) 0);
                    txtPass1.setForeground(Color.GRAY);
                    txtPass1.setText(Lang.getString("NPass"));
                }
            }
        });
        txtPass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPass1KeyReleased(evt);
            }
        });

        icoSeePass1.setBackground(new java.awt.Color(153, 255, 255));
        icoSeePass1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoSeePass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoSeePass1MousePressed(evt);
            }
        });

        icoSeePass1.setPic("src/UI/Image/Eyen't.png");

        javax.swing.GroupLayout icoSeePass1Layout = new javax.swing.GroupLayout(icoSeePass1);
        icoSeePass1.setLayout(icoSeePass1Layout);
        icoSeePass1Layout.setHorizontalGroup(
            icoSeePass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoSeePass1Layout.setVerticalGroup(
            icoSeePass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panPass1Layout = new javax.swing.GroupLayout(panPass1);
        panPass1.setLayout(panPass1Layout);
        panPass1Layout.setHorizontalGroup(
            panPass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPass1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(icoPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(txtPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(icoSeePass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panPass1Layout.setVerticalGroup(
            panPass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPass1Layout.createSequentialGroup()
                .addGroup(panPass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icoPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icoSeePass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panPass2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, U_TEXT));
        panPass2.setPreferredSize(new java.awt.Dimension(500, 61));

        txtPass2.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        txtPass2.setBorder(null);
        txtPass2.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (txtPass2.getText().equals(Lang.getString("CPass"))) {
                    seePass2 = false;
                    txtPass2.setEchoChar('*');
                    txtPass2.setText("");
                    Mode.setModeComponent(txtPass2);
                }
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (txtPass2.getText().isEmpty()) {
                    seePass2 = true;
                    txtPass2.setEchoChar((char) 0);
                    txtPass2.setForeground(Color.GRAY);
                    txtPass2.setText(Lang.getString("CPass"));
                }
            }
        });
        txtPass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPass2KeyReleased(evt);
            }
        });

        icoPass2.setBackground(new java.awt.Color(153, 255, 255));

        icoPass2.setPic("src/UI/Image/Password.png");

        javax.swing.GroupLayout icoPass2Layout = new javax.swing.GroupLayout(icoPass2);
        icoPass2.setLayout(icoPass2Layout);
        icoPass2Layout.setHorizontalGroup(
            icoPass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoPass2Layout.setVerticalGroup(
            icoPass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        icoSeePass2.setBackground(new java.awt.Color(153, 255, 255));
        icoSeePass2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoSeePass2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoSeePass2MousePressed(evt);
            }
        });

        icoSeePass2.setPic("src/UI/Image/Eyen't.png");

        javax.swing.GroupLayout icoSeePass2Layout = new javax.swing.GroupLayout(icoSeePass2);
        icoSeePass2.setLayout(icoSeePass2Layout);
        icoSeePass2Layout.setHorizontalGroup(
            icoSeePass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoSeePass2Layout.setVerticalGroup(
            icoSeePass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panPass2Layout = new javax.swing.GroupLayout(panPass2);
        panPass2.setLayout(panPass2Layout);
        panPass2Layout.setHorizontalGroup(
            panPass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPass2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(icoPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(txtPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(icoSeePass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panPass2Layout.setVerticalGroup(
            panPass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPass2Layout.createSequentialGroup()
                .addGroup(panPass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icoPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icoSeePass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panPasswordLayout = new javax.swing.GroupLayout(panPassword);
        panPassword.setLayout(panPasswordLayout);
        panPasswordLayout.setHorizontalGroup(
            panPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPasswordLayout.createSequentialGroup()
                .addGroup(panPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panPasswordLayout.setVerticalGroup(
            panPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPasswordLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(panPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout panContentLayout = new javax.swing.GroupLayout(panContent);
        panContent.setLayout(panContentLayout);
        panContentLayout.setHorizontalGroup(
            panContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panContentLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                    .addComponent(panOTPParent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panContentLayout.setVerticalGroup(
            panContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panContentLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(panEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panOTPParent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        scrPan.setViewportView(panContent);

        javax.swing.GroupLayout panBackgroundLayout = new javax.swing.GroupLayout(panBackground);
        panBackground.setLayout(panBackgroundLayout);
        panBackgroundLayout.setHorizontalGroup(
            panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(icoSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icoClose, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblFYP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBackgroundLayout.createSequentialGroup()
                        .addComponent(lblRMYP, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBackgroundLayout.createSequentialGroup()
                        .addComponent(btnAction, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))))
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblEOA, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(scrPan)
        );
        panBackgroundLayout.setVerticalGroup(
            panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBackgroundLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(icoSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(icoClose, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(lblFYP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrPan, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRMYP)
                    .addComponent(lblSignIn))
                .addGap(60, 60, 60)
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
            .addComponent(panBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
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
        setMode();                                                                      //repaint UI mode when focus from setting dialog                                              //set string sign in for label
        lblFYP.setText(Lang.getString("ForgotYPW"));                                    //set string forgot pass for label
        lblEOA.setText("EOA - " + Lang.getString("GV"));                                //set name app in new Languages
        lblRMYP.setText(Lang.getString("RMYP"));
        lblSignIn.setText(Lang.getString("SignIn"));
        lblOTP.setText(Lang.getString("EOTP"));
        lblNoneOTP.setText(Lang.getString("NOTP"));
        lblResetOTP.setText(Lang.getString("ROTP"));
        
        if (txtEmail.getText().isEmpty()) {
            txtEmail.setForeground(Color.GRAY);
            txtEmail.setText(Lang.getString("EYEmail"));
        }
        if (txtPass1.getText().isEmpty()) {
            txtPass1.setForeground(Color.GRAY);
            txtPass1.setText(Lang.getString("NPass"));
            txtPass1.setEchoChar((char) 0);
        }
        if (txtPass2.getText().isEmpty()) {
            txtPass2.setForeground(Color.GRAY);
            txtPass2.setText(Lang.getString("CPass"));
            txtPass2.setEchoChar((char) 0);
        }
        switch(State){
            case "Email" -> btnAction.setText(Lang.getString("VEmail"));
            case "OTP"   -> btnAction.setText(Lang.getString("VOTP"));
            case "Pass"  -> btnAction.setText(Lang.getString("ResetPass"));
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        if (txtEmail.getText().equals(Lang.getString("EYEmail")))    txtEmail.setText("");
        if (txtPass1.getText().equals(Lang.getString("NPass")))      txtPass1.setText("");
        if (txtPass2.getText().equals(Lang.getString("CPass")))      txtPass2.setText("");
    }//GEN-LAST:event_formWindowLostFocus

    private void lblSignInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignInMousePressed
        new SignIn().setVisible(true);  dispose();
    }//GEN-LAST:event_lblSignInMousePressed

    private void btnActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionActionPerformed
        switch(State){
            case "Email" -> {
                if(VEmail()){
                    if (GVDAO.selectByEmail(Email) != null) {
                        panEmail.setVisible(false);
                        panOTPParent.setVisible(true);
                        sendOTP();
                        State = "OTP"; btnAction.setText(Lang.getString("VOTP"));
                        txtCode1.requestFocusInWindow();
                    }else{ Mode.WMessage(this, Lang.getString("WEmail"),Lang.getString("Notifi"), JOptionPane.WARNING_MESSAGE); }
                }else{ Mode.WMessage(this, Lang.getString("InEmail"), Lang.getString("Notifi"), JOptionPane.WARNING_MESSAGE); }
            }
            case "OTP" ->{
                currentOTP = "";
                currentOTP+=txtCode1.getText();
                currentOTP+=txtCode2.getText();
                currentOTP+=txtCode3.getText();
                currentOTP+=txtCode4.getText();
                currentOTP+=txtCode5.getText();
                currentOTP+=txtCode6.getText();
                if(currentOTP.equals(OTP)){
                    panOTPParent.setVisible(false); panPassword.setVisible(true);
                    State = "Pass"; btnAction.setText(Lang.getString("ResetPass"));
                    btnAction.requestFocusInWindow();
                }else{
                    Mode.WMessage(this, Lang.getString("WOTP").replaceFirst("\\.", ".\n"), Lang.getString("Notifi"),  JOptionPane.WARNING_MESSAGE);
                }
            }
            case "Pass" -> {
                if(VPass1() && VPass2()){
                    if(Pass1.equals(Pass2)){
                        Pass2 = SHA256.Encrypt(Pass2);
                        CurrentGV = GVDAO.selectByEmail(Email);
                        if(!CurrentGV.getPassword().equals(Pass2)){
                            CurrentGV.setPassword(Pass2); CurrentID = CurrentGV.getIDGiangVien(); AVATAR = "src/User/"+CurrentID+".png";
                            
                            loader = new Loader(this, true);
                            loader.Case = 5;
                            loader.setInfor("/UI/Image/Circle.gif", Lang.getString("UpdateAcc"));
                            loader.setVisible(true);
                            Log.add("Reset Password successfully.");
                            
                            loader = new Loader(this, true);
                            loader.Case = 2;
                            loader.setInfor("/UI/Image/Cloud.gif", Lang.getString("DYA"));
                            loader.setVisible(true);
                            
                            new Dashboard().setVisible(true);   dispose();
                        }else{Mode.WMessage(this, Lang.getString("SPass"), Lang.getString("Notifi"), JOptionPane.WARNING_MESSAGE);}
                    }else{Mode.WMessage(this, Lang.getString("MPass"), Lang.getString("Notifi"), JOptionPane.WARNING_MESSAGE);}
                }else{Mode.WMessage(this, Lang.getString("InPass").replaceFirst("!", "!\n").replaceFirst(":", ":\n     "), Lang.getString("Notifi"), JOptionPane.WARNING_MESSAGE);}
            }
        }
    }//GEN-LAST:event_btnActionActionPerformed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        icoEmail.setPic("src/UI/Image/Email" + (VEmail() ? "2" : "0") +".png");
    }//GEN-LAST:event_txtEmailKeyReleased

    private void lblResetOTPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResetOTPMousePressed
        sendOTP();
    }//GEN-LAST:event_lblResetOTPMousePressed

    private void txtPass2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPass2KeyReleased
        icoPass2.setPic("src/UI/Image/Password" + (VPass2() ? "2" : "0") +".png");
    }//GEN-LAST:event_txtPass2KeyReleased

    private void icoSeePass2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSeePass2MousePressed
        seePass2 = !seePass2;
        if(!new String(txtPass2.getPassword()).equals(Lang.getString("CPass"))){
            if(seePass2){   txtPass2.setEchoChar((char) 0);  icoSeePass2.setPic("src/UI/Image/Eye.png");}
            else        {   txtPass2.setEchoChar('*');       icoSeePass2.setPic("src/UI/Image/Eyen't.png");}
        }
    }//GEN-LAST:event_icoSeePass2MousePressed

    private void txtPass1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPass1KeyReleased
        icoPass1.setPic("src/UI/Image/Password" + (VPass1() ? "2" : "0") +".png");
    }//GEN-LAST:event_txtPass1KeyReleased

    private void icoSeePass1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSeePass1MousePressed
        seePass1 = !seePass1;
        if(!new String(txtPass1.getPassword()).equals(Lang.getString("Pass"))){
            if(seePass1){   txtPass1.setEchoChar((char) 0);  icoSeePass1.setPic("src/UI/Image/Eye.png");}
            else        {   txtPass1.setEchoChar('*');       icoSeePass1.setPic("src/UI/Image/Eyen't.png");}
        }
    }//GEN-LAST:event_icoSeePass1MousePressed

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
            java.util.logging.Logger.getLogger(ResetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResetPass().setVisible(true);
            }
        });
    }
    
    private boolean seePass1 = false, seePass2 = false;
    private Loader loader;
    private String OTP = "", currentOTP = "", OTPMail = "", State = "Email";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnAction;
    private com.AnLa.UI.ImagePanel icoClose;
    private com.AnLa.UI.ImagePanel icoEmail;
    private com.AnLa.UI.ImagePanel icoPass1;
    private com.AnLa.UI.ImagePanel icoPass2;
    private com.AnLa.UI.ImagePanel icoSeePass1;
    private com.AnLa.UI.ImagePanel icoSeePass2;
    private com.AnLa.UI.ImagePanel icoSettings;
    private javax.swing.JLabel lblEOA;
    private javax.swing.JLabel lblFYP;
    private javax.swing.JLabel lblNoneOTP;
    private javax.swing.JLabel lblOTP;
    private javax.swing.JLabel lblRMYP;
    private javax.swing.JLabel lblResetOTP;
    private javax.swing.JLabel lblSignIn;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JPanel panBackground;
    private javax.swing.JPanel panContent;
    private javax.swing.JPanel panEmail;
    private javax.swing.JPanel panOTP;
    private javax.swing.JPanel panOTPParent;
    private javax.swing.JPanel panPass1;
    private javax.swing.JPanel panPass2;
    private javax.swing.JPanel panPassword;
    private javax.swing.JScrollPane scrPan;
    private javax.swing.JTextField txtCode1;
    private javax.swing.JTextField txtCode2;
    private javax.swing.JTextField txtCode3;
    private javax.swing.JTextField txtCode4;
    private javax.swing.JTextField txtCode5;
    private javax.swing.JTextField txtCode6;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPass1;
    private javax.swing.JPasswordField txtPass2;
    // End of variables declaration//GEN-END:variables

    private void setMode(){                                                     //set mode for component
        Mode.setModeComponent(icoSettings);     Mode.setModeComponent(icoClose);
        Mode.setModeComponent(panBackground);   Mode.setModeComponent(lblRMYP);         Mode.setModeComponent(lblNoneOTP);
        Mode.setModeComponent(scrPan);          Mode.setModeComponent(panContent);      Mode.setModeComponent(scrPan.getVerticalScrollBar());
        Mode.setModeComponent(panEmail);        Mode.setModeComponent(icoEmail);        Mode.setModeComponent(txtEmail);
        Mode.setModeComponent(panOTPParent);    Mode.setModeComponent(panOTP);          Mode.setModeComponent(lblOTP);      Mode.setModeComponent(panPassword);
        Mode.setModeComponent(panPass1);        Mode.setModeComponent(icoPass1);        Mode.setModeComponent(txtPass1);    Mode.setModeComponent(icoSeePass1);
        Mode.setModeComponent(panPass2);        Mode.setModeComponent(icoPass2);        Mode.setModeComponent(txtPass2);    Mode.setModeComponent(icoSeePass2);
        for(int i = 0 ; i < 6 ; i++){   Mode.setModeComponent(panOTP.getComponent(i));   }repaint();
    }
    private void sendOTP() {
        OTP = makeOTP();
        if (OTP != null) {
            OTPMail = (String) ObjectData.readData("src/AppData/OTPCodeTemplate_" + LocalSetting.getLang() + ".dat");
            OTPMail = OTPMail.replaceFirst("USERNAME", StrToUnicodeDecimal(GVDAO.selectByEmail(Email).getName()));
            OTPMail = OTPMail.replaceFirst("CONTENT", Lang.getString("OTPReset"));
            OTPMail = OTPMail.replaceFirst("123456", OTP);
            SMTP.setEmail(Lang.getString("OTP"), OTPMail);
            SENDMAIL = Email;

            loader = new Loader(this, true);
            loader.Case = 4;
            loader.setInfor("/UI/Image/Email.gif", Lang.getString("SenOTP"));
            loader.setVisible(true);
            Mode.WMessage(this, Lang.getString("SOTP").replaceFirst("\\.", ".\n"), Lang.getString("Notifi"), JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private String Email = "", Pass1 = "", Pass2 = "";
    private boolean VEmail(){
        Email = txtEmail.getText().trim();
        if(Email.isBlank()){return false;}
        return Email.matches(EMAIL);
    }
    private boolean VPass1(){
        Pass1 = String.valueOf(txtPass1.getPassword()).trim();
        if(Pass1.isBlank()){return false;}
        return Pass1.matches(PASSWORD);
    }
    private boolean VPass2(){
        Pass2 = String.valueOf(txtPass2.getPassword()).trim();
        if(Pass2.isBlank()){return false;}
        return Pass2.matches(PASSWORD);
    }
}