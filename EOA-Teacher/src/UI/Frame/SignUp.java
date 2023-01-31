package UI.Frame;
// Make By Bình An || AnLaVN || KatoVN

import static Controller.DatabaseData.GVDAO;
import com.AnLa.UI.Mode;
import static Controller.LocalData.*;
import ObjectClass.GiangVien;
import com.AnLa.FILE.Log;
import com.AnLa.FILE.ObjectData;
import com.AnLa.HASH.SHA256;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        ParentComponent = this;                                                                  //Set this component is parent component
        initComponents();
        try { setIconImage(ImageIO.read(getClass().getResource("/UI/Image/Logo.png"))); } 
        catch (IOException ex) {Log.add("!!! Error try to set Icon for frame. !!!");}
        btnSignUp.requestFocusInWindow();
        panOTPParent.setVisible(false);
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panBackground = new javax.swing.JPanel();
        icoClose = new com.AnLa.UI.ImagePanel();
        lblSignUp = new javax.swing.JLabel();
        icoSettings = new com.AnLa.UI.ImagePanel();
        lblEOA = new javax.swing.JLabel();
        lblVersion = new javax.swing.JLabel();
        btnSignUp = new com.k33ptoo.components.KButton();
        lblHAA = new javax.swing.JLabel();
        lblSignIn = new javax.swing.JLabel();
        scrPan = new javax.swing.JScrollPane();
        panContent = new javax.swing.JPanel();
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
        panName = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        icoName = new com.AnLa.UI.ImagePanel();
        panEmail = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        icoEmail = new com.AnLa.UI.ImagePanel();
        panIDGV = new javax.swing.JPanel();
        txtIDGV = new javax.swing.JTextField();
        icoIDGV = new com.AnLa.UI.ImagePanel();
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

        lblSignUp.setFont(new java.awt.Font("Courier New", 1, 70)); // NOI18N
        lblSignUp.setForeground(TTCOLOR);
        lblSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignUp.setText("Sign Up");

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

        btnSignUp.setText("Sign Up");
        btnSignUp.setFont(new java.awt.Font("Tahoma", 1, 45)); // NOI18N
        btnSignUp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSignUp.setkBorderRadius(20);
        btnSignUp.setkEndColor(new java.awt.Color(0, 188, 212));
        btnSignUp.setkHoverEndColor(new Color(0, 188, 212, 155));
        btnSignUp.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSignUp.setkHoverStartColor(new Color(224, 64, 251, 155));
        btnSignUp.setkSelectedColor(new java.awt.Color(255, 0, 0));
        btnSignUp.setkStartColor(new java.awt.Color(224, 64, 251));
        btnSignUp.setPreferredSize(new java.awt.Dimension(300, 80));
        btnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        lblHAA.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblHAA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHAA.setText("Have an account ?");

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

        panName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, U_TEXT));
        panName.setPreferredSize(new java.awt.Dimension(500, 61));

        txtName.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        txtName.setBorder(null);
        txtName.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (txtName.getText().equals(Lang.getString("Name"))) {
                    txtName.setText("");
                    Mode.setModeComponent(txtName);
                }
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (txtName.getText().isEmpty()) {
                    txtName.setForeground(Color.GRAY);
                    txtName.setText(Lang.getString("Name"));
                }
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        icoName.setBackground(new java.awt.Color(153, 255, 255));

        icoName.setPic("src/UI/Image/Name1.png");

        javax.swing.GroupLayout icoNameLayout = new javax.swing.GroupLayout(icoName);
        icoName.setLayout(icoNameLayout);
        icoNameLayout.setHorizontalGroup(
            icoNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoNameLayout.setVerticalGroup(
            icoNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panNameLayout = new javax.swing.GroupLayout(panName);
        panName.setLayout(panNameLayout);
        panNameLayout.setHorizontalGroup(
            panNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panNameLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(icoName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panNameLayout.setVerticalGroup(
            panNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNameLayout.createSequentialGroup()
                .addGroup(panNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icoName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        panEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, U_TEXT));
        panEmail.setPreferredSize(new java.awt.Dimension(500, 61));

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        txtEmail.setBorder(null);
        txtEmail.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (txtEmail.getText().equals(Lang.getString("CEmail"))) {
                    txtEmail.setText("");
                    Mode.setModeComponent(txtEmail);
                }
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (txtEmail.getText().isEmpty()) {
                    txtEmail.setForeground(Color.GRAY);
                    txtEmail.setText(Lang.getString("CEmail"));
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

        panIDGV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, U_TEXT));
        panIDGV.setPreferredSize(new java.awt.Dimension(500, 61));

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
        txtIDGV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDGVKeyReleased(evt);
            }
        });

        icoIDGV.setBackground(new java.awt.Color(153, 255, 255));

        icoIDGV.setPic("src/UI/Image/User2.png");

        javax.swing.GroupLayout icoIDGVLayout = new javax.swing.GroupLayout(icoIDGV);
        icoIDGV.setLayout(icoIDGVLayout);
        icoIDGVLayout.setHorizontalGroup(
            icoIDGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoIDGVLayout.setVerticalGroup(
            icoIDGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panIDGVLayout = new javax.swing.GroupLayout(panIDGV);
        panIDGV.setLayout(panIDGVLayout);
        panIDGVLayout.setHorizontalGroup(
            panIDGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panIDGVLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(icoIDGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(txtIDGV, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panIDGVLayout.setVerticalGroup(
            panIDGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panIDGVLayout.createSequentialGroup()
                .addGroup(panIDGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIDGV, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icoIDGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
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
                if (txtPass1.getText().equals(Lang.getString("Pass"))) {
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
                    txtPass1.setText(Lang.getString("Pass"));
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

        javax.swing.GroupLayout panContentLayout = new javax.swing.GroupLayout(panContent);
        panContent.setLayout(panContentLayout);
        panContentLayout.setHorizontalGroup(
            panContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panContentLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panOTPParent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panIDGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        panContentLayout.setVerticalGroup(
            panContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panContentLayout.createSequentialGroup()
                .addComponent(panOTPParent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(panName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(panEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(panIDGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(panPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(panPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        scrPan.setViewportView(panContent);

        javax.swing.GroupLayout panBackgroundLayout = new javax.swing.GroupLayout(panBackground);
        panBackground.setLayout(panBackgroundLayout);
        panBackgroundLayout.setHorizontalGroup(
            panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBackgroundLayout.createSequentialGroup()
                        .addComponent(icoSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(icoClose, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBackgroundLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBackgroundLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblEOA, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panBackgroundLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(lblHAA, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(scrPan, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
                .addComponent(lblSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrPan, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHAA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(panBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
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
        setMode();                                                                      //repaint UI mode when focus from setting dialog
        String signup = Lang.getString("SignUp");                                       //reset string sign in from new Languages
        lblSignUp.setText(signup);                                                      //set string sign up for label
        btnSignUp.setText(signup);                                                      //set string sign up for button
        lblEOA.setText("EOA - " + Lang.getString("GV"));                                //set name app in new Languages
        lblHAA.setText(Lang.getString("HAA"));
        lblSignIn.setText(Lang.getString("SignIn"));
        lblOTP.setText(Lang.getString("EOTP"));
        lblNoneOTP.setText(Lang.getString("NOTP"));
        lblResetOTP.setText(Lang.getString("ROTP"));
        
        if (txtName.getText().isEmpty()) {
            txtName.setForeground(Color.GRAY);
            txtName.setText(Lang.getString("Name"));
        }
        if (txtEmail.getText().isEmpty()) {
            txtEmail.setForeground(Color.GRAY);
            txtEmail.setText(Lang.getString("CEmail"));
        }
        if (txtIDGV.getText().isEmpty()) {
            txtIDGV.setForeground(Color.GRAY);
            txtIDGV.setText(Lang.getString("ID"));
        }
        if (txtPass1.getText().isEmpty()) {
            txtPass1.setForeground(Color.GRAY);
            txtPass1.setText(Lang.getString("Pass"));
            txtPass1.setEchoChar((char) 0);
        }
        if (txtPass2.getText().isEmpty()) {
            txtPass2.setForeground(Color.GRAY);
            txtPass2.setText(Lang.getString("CPass"));
            txtPass2.setEchoChar((char) 0);
        }   
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        if (txtName.getText().equals(Lang.getString("Name")))       txtName.setText("");
        if (txtEmail.getText().equals(Lang.getString("CEmail")))    txtEmail.setText("");
        if (txtIDGV.getText().equals(Lang.getString("ID")))         txtIDGV.setText("");
        if (txtPass1.getText().equals(Lang.getString("Pass")))      txtPass1.setText("");
        if (txtPass2.getText().equals(Lang.getString("CPass")))     txtPass2.setText("");
    }//GEN-LAST:event_formWindowLostFocus

    private void lblSignInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignInMousePressed
        new SignIn().setVisible(true);  dispose();
    }//GEN-LAST:event_lblSignInMousePressed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        if(!checkInfo){
            if(Validate()){
                panOTPParent.setVisible(true);
                for(int i = 5 ; i > 0; i--){    panContent.remove(i);   }
                panContent.setPreferredSize(new Dimension(600, 480));
                sendOTP();
                txtCode1.requestFocusInWindow();
            }
        }else{
            currentOTP = "";
            currentOTP+=txtCode1.getText();
            currentOTP+=txtCode2.getText();
            currentOTP+=txtCode3.getText();
            currentOTP+=txtCode4.getText();
            currentOTP+=txtCode5.getText();
            currentOTP+=txtCode6.getText();
            if(currentOTP.equals(OTP)){
                CurrentGV = new GiangVien(ID, Name, Email, "", Pass2);
                CurrentID = ID; AVATAR = "src/User/"+CurrentID+".png";
                loader = new Loader(this, true);
                loader.Case = 3;
                loader.setInfor("/UI/Image/Success.gif", Lang.getString("SuccessAccount"));
                loader.setVisible(true);
                
                loader = new Loader(this, true);
                loader.Case = 2;
                loader.setInfor("/UI/Image/Cloud.gif", Lang.getString("DYA"));
                loader.setVisible(true);
                
                Log.add("Sign Up successfully.");
                new Dashboard().setVisible(true);   
                dispose();
            }else{
                Mode.WMessage(this, Lang.getString("WOTP").replaceFirst("\\.", ".\n"), Lang.getString("Notifi"),  JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void icoSeePass1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSeePass1MousePressed
        seePass1 = !seePass1;
        if(!new String(txtPass1.getPassword()).equals(Lang.getString("Pass"))){
            if(seePass1){   txtPass1.setEchoChar((char) 0);  icoSeePass1.setPic("src/UI/Image/Eye.png");}
            else        {   txtPass1.setEchoChar('*');       icoSeePass1.setPic("src/UI/Image/Eyen't.png");}
        }
    }//GEN-LAST:event_icoSeePass1MousePressed

    private void icoSeePass2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSeePass2MousePressed
        seePass2 = !seePass2;
        if(!new String(txtPass2.getPassword()).equals(Lang.getString("CPass"))){
            if(seePass2){   txtPass2.setEchoChar((char) 0);  icoSeePass2.setPic("src/UI/Image/Eye.png");}
            else        {   txtPass2.setEchoChar('*');       icoSeePass2.setPic("src/UI/Image/Eyen't.png");}
        }
    }//GEN-LAST:event_icoSeePass2MousePressed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        icoName.setPic("src/UI/Image/Name" + (VName() ? "2" : "0") +".png");
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        icoEmail.setPic("src/UI/Image/Email" + (VEmail() ? "2" : "0") +".png");
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtIDGVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDGVKeyReleased
        icoIDGV.setPic("src/UI/Image/User" + (VID() ? "" : "2") +".png");
    }//GEN-LAST:event_txtIDGVKeyReleased

    private void txtPass1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPass1KeyReleased
        icoPass1.setPic("src/UI/Image/Password" + (VPass1() ? "2" : "0") +".png");
    }//GEN-LAST:event_txtPass1KeyReleased

    private void txtPass2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPass2KeyReleased
        icoPass2.setPic("src/UI/Image/Password" + (VPass2() ? "2" : "0") +".png");
    }//GEN-LAST:event_txtPass2KeyReleased

    private void lblResetOTPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResetOTPMousePressed
        sendOTP();
    }//GEN-LAST:event_lblResetOTPMousePressed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }
    
    private Loader loader;
    private boolean seePass1 = false, seePass2 = false, checkInfo = false;
    private String OTP = null, OTPMail = "", currentOTP = "", Name = "", Email = "", ID = "", Pass1 = "", Pass2 = "";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnSignUp;
    private com.AnLa.UI.ImagePanel icoClose;
    private com.AnLa.UI.ImagePanel icoEmail;
    private com.AnLa.UI.ImagePanel icoIDGV;
    private com.AnLa.UI.ImagePanel icoName;
    private com.AnLa.UI.ImagePanel icoPass1;
    private com.AnLa.UI.ImagePanel icoPass2;
    private com.AnLa.UI.ImagePanel icoSeePass1;
    private com.AnLa.UI.ImagePanel icoSeePass2;
    private com.AnLa.UI.ImagePanel icoSettings;
    private javax.swing.JLabel lblEOA;
    private javax.swing.JLabel lblHAA;
    private javax.swing.JLabel lblNoneOTP;
    private javax.swing.JLabel lblOTP;
    private javax.swing.JLabel lblResetOTP;
    private javax.swing.JLabel lblSignIn;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JPanel panBackground;
    private javax.swing.JPanel panContent;
    private javax.swing.JPanel panEmail;
    private javax.swing.JPanel panIDGV;
    private javax.swing.JPanel panName;
    private javax.swing.JPanel panOTP;
    private javax.swing.JPanel panOTPParent;
    private javax.swing.JPanel panPass1;
    private javax.swing.JPanel panPass2;
    private javax.swing.JScrollPane scrPan;
    private javax.swing.JTextField txtCode1;
    private javax.swing.JTextField txtCode2;
    private javax.swing.JTextField txtCode3;
    private javax.swing.JTextField txtCode4;
    private javax.swing.JTextField txtCode5;
    private javax.swing.JTextField txtCode6;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIDGV;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass1;
    private javax.swing.JPasswordField txtPass2;
    // End of variables declaration//GEN-END:variables

    private void setMode(){                                                     //set mode for component
        Mode.setModeComponent(icoSettings);     Mode.setModeComponent(icoClose);
        Mode.setModeComponent(panBackground);   Mode.setModeComponent(lblHAA);
        Mode.setModeComponent(panName);         Mode.setModeComponent(icoName);     Mode.setModeComponent(txtName);
        Mode.setModeComponent(panEmail);        Mode.setModeComponent(icoEmail);    Mode.setModeComponent(txtEmail);
        Mode.setModeComponent(panIDGV);         Mode.setModeComponent(icoIDGV);     Mode.setModeComponent(txtIDGV);
        Mode.setModeComponent(panPass1);        Mode.setModeComponent(icoPass1);    Mode.setModeComponent(txtPass1);  Mode.setModeComponent(icoSeePass1);
        Mode.setModeComponent(panPass2);        Mode.setModeComponent(icoPass2);    Mode.setModeComponent(txtPass2);  Mode.setModeComponent(icoSeePass2);
        Mode.setModeComponent(panContent);      Mode.setModeComponent(scrPan.getVerticalScrollBar());
        Mode.setModeComponent(panOTPParent);    Mode.setModeComponent(panOTP);      Mode.setModeComponent(lblOTP);    Mode.setModeComponent(lblNoneOTP);
        for(int i = 0 ; i < 6 ; i++){   Mode.setModeComponent(panOTP.getComponent(i));   }
        repaint();
    }
    //private final GiangVienDAO GVDAO = new GiangVienDAO();
    private void sendOTP() {
        OTP = makeOTP();
        if (OTP != null) {
            checkInfo = true;
            OTPMail = (String) ObjectData.readData("src/AppData/OTPCodeTemplate_" + LocalSetting.getLang() + ".dat");
            OTPMail = OTPMail.replaceFirst("USERNAME", StrToUnicodeDecimal(Name));
            OTPMail = OTPMail.replaceFirst("CONTENT", Lang.getString("OTPSignUp"));
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
    private boolean Validate(){
        //Get infor
        Name  = txtName.getText().trim();
        Email = txtEmail.getText().trim();
        ID    = txtIDGV.getText().trim();
        Pass1 = String.valueOf(txtPass1.getPassword()).trim();
        Pass2 = String.valueOf(txtPass2.getPassword()).trim();
        
        //validate infor
        Name  = Name.equals(Lang.getString("Name")) ? "" : Name;
        Email = Email.equals(Lang.getString("CEmail")) ? "" : Email;
        ID    = ID.equals(Lang.getString("ID")) ? "" : ID;
        Pass1 = Pass1.equals(Lang.getString("Pass")) ? "" : Pass1;
        Pass2 = Pass2.equals(Lang.getString("CPass")) ? "" : Pass2;

        //Validate name
        txtName.requestFocusInWindow();
        panName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.RED));
        if(Name.isBlank())          {showMess("XName");     return false;}
        if(Name.length() > 30)      {showMess("LongName");  return false;}
        if(Name.matches(NAME))      {showMess("SpeName");   return false;}
        panName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, U_TEXT));
        
        //Validate email
        txtEmail.requestFocusInWindow();
        panEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.RED));
        if(Email.isBlank())         {showMess("XEmail");    return false;}
        if(!Email.matches(EMAIL))   {showMess("InEmail");   return false;}
        if(GVDAO.selectByEmail(Email) != null)          {showMess("UEmail");return false;}
        panEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, U_TEXT));
        
        //Validate id || username
        txtIDGV.requestFocusInWindow();
        panIDGV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.RED));
        if(ID.isBlank())            {showMess("XID");       return false;}
        if(ID.length() <= 4)        {showMess("SID");       return false;}
        ID = SHA256.Encrypt(ID);
        if(GVDAO.selectById(ID) != null){showMess("UID");   return false;}
        panIDGV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, U_TEXT));
        
        
        //Validate password
        txtPass1.requestFocusInWindow();
        panPass1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.RED));
        if(Pass1.isBlank())         {showMess("XPass");     return false;}
        if(!Pass1.matches(PASSWORD)){showMess("InPass");    return false;}
        panPass1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, U_TEXT));
        
        //Validate confirm password
        txtPass2.requestFocusInWindow();
        panPass2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.RED));
        if(Pass2.isBlank())         {showMess("XCPass");    return false;}
        if(!Pass2.matches(PASSWORD)){showMess("InPass");    return false;}
        if(!Pass2.equals(Pass1))    {showMess("MPass");     return false;}
        panPass2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, U_TEXT));
        Pass2 = SHA256.Encrypt(Pass2);
        return true;
    }
    private void showMess(String mess){
        Mode.WMessage(this, 
                mess.equals("InPass") ? 
                        Lang.getString("InPass").replaceFirst("!", "!\n").replaceFirst(":", ":\n     ") :
                        ( mess.startsWith("X") ? 
                                Lang.getString("Empty").replaceFirst("X", Lang.getString(mess.replaceFirst("X", ""))) : 
                                Lang.getString(mess) ),
                Lang.getString("Notifi"), 
                JOptionPane.WARNING_MESSAGE);
    }
    private boolean VName(){
        Name  = txtName.getText().trim();
        if(Name.isBlank()){return false;}
        return !Name.matches(NAME);
    }
    private boolean VEmail(){
        Email = txtEmail.getText().trim();
        if(Email.isBlank()){return false;}
        return Email.matches(EMAIL);
    }
    private boolean VID(){
        ID = txtIDGV.getText().trim();
        if(ID.isBlank()){return false;}
        return ID.length() > 4;
    }
    private boolean VPass1(){
        Pass1 = String.valueOf(txtPass1.getPassword()).trim();
        if(Pass1.isBlank()){return false;}
        return Pass1.matches(PASSWORD);
    }
    private boolean VPass2(){
        Pass2 = String.valueOf(txtPass2.getPassword()).trim();
        if(Pass2.isBlank()){return false;}
        if(!Pass2.matches(PASSWORD)){return false;}
        return Pass2.equals(Pass1);
    }
}