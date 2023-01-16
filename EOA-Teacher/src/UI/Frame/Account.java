package UI.Frame;
// Make By Bình An || AnLaVN || KatoVN

import static Controller.DatabaseData.GVDAO;
import static Controller.LocalData.*;
import com.AnLa.FILE.Log;
import com.AnLa.FILE.ObjectData;
import com.AnLa.HASH.SHA256;
import com.AnLa.UI.Mode;
import static com.AnLa.UI.Mode.WInput;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class Account extends javax.swing.JDialog {

    public Account(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try { setIconImage(ImageIO.read(getClass().getResource("/UI/Image/Logo.png"))); } 
        catch (IOException ex) {Log.add("!!! Error try to set Icon for frame. !!!");}
        Account.parent = parent;
        Mode.setModeComponent(Background);      Mode.setModeComponent(imgAvatar);
        Mode.setModeComponent(panContent);      Mode.setModeComponent(scrPan.getVerticalScrollBar());
        panOTPParent.setVisible(false);
        
        lblOTP.setText(Lang.getString("EOTP"));
        lblNoneOTP.setText(Lang.getString("NOTP"));
        lblResetOTP.setText(Lang.getString("ROTP"));
        btnUpdate.setText(Lang.getString("Update"));
        lblInfo.setText(Lang.getString("AccInfor"));
        lblMana.setText(Lang.getString("AccMana"));
        lblSignOut.setText(Lang.getString("SignOut"));
        lblRemove.setText(Lang.getString("RemoveAcc"));
        
        txtName.setText(CurrentGV.getName());
        txtEmail.setText(CurrentGV.getEmail());
        icoEditAvatar.setPic("src/UI/Image/Camera.png");
        
        if (txtPass0.getText().isEmpty()) {
            txtPass0.setForeground(Color.GRAY);
            txtPass0.setText(Lang.getString("OPass"));
            txtPass0.setEchoChar((char) 0);
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
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        imgAvatar = new com.AnLa.UI.AvatarPanel();
        icoEditAvatar = new com.AnLa.UI.ImagePanel();
        scrPan = new javax.swing.JScrollPane();
        panContent = new javax.swing.JPanel();
        panInfo = new com.k33ptoo.components.KGradientPanel();
        lblInfo = new javax.swing.JLabel();
        icoArrowInfo = new com.AnLa.UI.ImagePanel();
        panChildInfo = new javax.swing.JPanel();
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
        panPass0 = new javax.swing.JPanel();
        icoPass0 = new com.AnLa.UI.ImagePanel();
        txtPass0 = new javax.swing.JPasswordField();
        icoSeePass0 = new com.AnLa.UI.ImagePanel();
        panPass1 = new javax.swing.JPanel();
        icoPass1 = new com.AnLa.UI.ImagePanel();
        txtPass1 = new javax.swing.JPasswordField();
        icoSeePass1 = new com.AnLa.UI.ImagePanel();
        panPass2 = new javax.swing.JPanel();
        icoPass2 = new com.AnLa.UI.ImagePanel();
        txtPass2 = new javax.swing.JPasswordField();
        icoSeePass2 = new com.AnLa.UI.ImagePanel();
        btnUpdate = new com.k33ptoo.components.KButton();
        panMana = new com.k33ptoo.components.KGradientPanel();
        lblMana = new javax.swing.JLabel();
        icoArrowMana = new com.AnLa.UI.ImagePanel();
        panChildMana = new javax.swing.JPanel();
        lblSignOut = new javax.swing.JLabel();
        icoSignOut = new com.AnLa.UI.ImagePanel();
        lblRemove = new javax.swing.JLabel();
        icoRemove = new com.AnLa.UI.ImagePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(Lang.getString("AccMana"));
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        imgAvatar.setBackground(new java.awt.Color(153, 255, 153));

        icoEditAvatar.setBackground(BLIND);
        icoEditAvatar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoEditAvatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icoEditAvatarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icoEditAvatarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoEditAvatarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout icoEditAvatarLayout = new javax.swing.GroupLayout(icoEditAvatar);
        icoEditAvatar.setLayout(icoEditAvatarLayout);
        icoEditAvatarLayout.setHorizontalGroup(
            icoEditAvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        icoEditAvatarLayout.setVerticalGroup(
            icoEditAvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        imgAvatar.setPic(AVATAR);

        javax.swing.GroupLayout imgAvatarLayout = new javax.swing.GroupLayout(imgAvatar);
        imgAvatar.setLayout(imgAvatarLayout);
        imgAvatarLayout.setHorizontalGroup(
            imgAvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imgAvatarLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(icoEditAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        imgAvatarLayout.setVerticalGroup(
            imgAvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imgAvatarLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(icoEditAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        scrPan.setBorder(null);
        scrPan.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrPan.setVerticalScrollBar(new com.AnLa.UI.ScrollBar());

        panInfo.setBackground(BLIND);
        panInfo.setkBorderRadius(30);
        panInfo.setkEndColor(panColor);
        panInfo.setkStartColor(panColor);

        lblInfo.setFont(TittleFont);
        lblInfo.setForeground(TextColor);
        lblInfo.setText("Thong tin tai khoan");

        icoArrowInfo.setBackground(panColor);
        icoArrowInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoArrowInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoArrowInfoMousePressed(evt);
            }
        });

        icoArrowInfo.setPic("src/UI/Image/Down.png");

        javax.swing.GroupLayout icoArrowInfoLayout = new javax.swing.GroupLayout(icoArrowInfo);
        icoArrowInfo.setLayout(icoArrowInfoLayout);
        icoArrowInfoLayout.setHorizontalGroup(
            icoArrowInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        icoArrowInfoLayout.setVerticalGroup(
            icoArrowInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panChildInfo.setBackground(panColor);

        panOTPParent.setBackground(panColor);

        lblOTP.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        lblOTP.setForeground(TextColor);
        lblOTP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOTP.setText("Enter Code Bellow");

        panOTP.setBackground(panColor);
        panOTP.setToolTipText("");
        panOTP.setPreferredSize(new java.awt.Dimension(500, 61));

        txtCode1.setBackground(panColor);
        txtCode1.setFont(OTPFont);
        txtCode1.setForeground(TextColor);
        txtCode1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCode1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 102, 255)));
        txtCode1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCode1.addKeyListener( new KeyAdapter() {public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (((c < '0') || (c > '9') || txtCode1.getText().length() >= 1)) {e.consume();}
            if((c >= '0') && (c <= '9')){txtCode2.requestFocusInWindow();}
        }});

        txtCode2.setBackground(panColor);
        txtCode2.setFont(OTPFont);
        txtCode2.setForeground(TextColor);
        txtCode2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCode2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 102, 255)));
        txtCode2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCode2.addKeyListener( new KeyAdapter() {public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (((c < '0') || (c > '9') || txtCode2.getText().length() >= 1)) {e.consume();}
            if(c == KeyEvent.VK_BACK_SPACE){txtCode1.requestFocusInWindow();}
            if((c >= '0') && (c <= '9')){txtCode3.requestFocusInWindow();}
        }});

        txtCode3.setBackground(panColor);
        txtCode3.setFont(OTPFont);
        txtCode3.setForeground(TextColor);
        txtCode3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCode3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 102, 255)));
        txtCode3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCode3.addKeyListener( new KeyAdapter() {public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (((c < '0') || (c > '9') || txtCode3.getText().length() >= 1)) {e.consume();}
            if(c == KeyEvent.VK_BACK_SPACE){txtCode2.requestFocusInWindow();}
            if((c >= '0') && (c <= '9')){txtCode4.requestFocusInWindow();}
        }});

        txtCode4.setBackground(panColor);
        txtCode4.setFont(OTPFont);
        txtCode4.setForeground(TextColor);
        txtCode4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCode4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 102, 255)));
        txtCode4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCode4.addKeyListener( new KeyAdapter() {public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (((c < '0') || (c > '9') || txtCode4.getText().length() >= 1)) {e.consume();}
            if(c == KeyEvent.VK_BACK_SPACE){txtCode3.requestFocusInWindow();}
            if((c >= '0') && (c <= '9')){txtCode5.requestFocusInWindow();}
        }});

        txtCode5.setBackground(panColor);
        txtCode5.setFont(OTPFont);
        txtCode5.setForeground(TextColor);
        txtCode5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCode5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 102, 255)));
        txtCode5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCode5.addKeyListener( new KeyAdapter() {public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (((c < '0') || (c > '9') || txtCode5.getText().length() >= 1)) {e.consume();}
            if(c == KeyEvent.VK_BACK_SPACE){txtCode4.requestFocusInWindow();}
            if((c >= '0') && (c <= '9')){txtCode6.requestFocusInWindow();}
        }});

        txtCode6.setBackground(panColor);
        txtCode6.setFont(OTPFont);
        txtCode6.setForeground(TextColor);
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
        lblNoneOTP.setForeground(TextColor);
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

        panName.setBackground(panColor);
        panName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, U_TEXT));
        panName.setPreferredSize(new java.awt.Dimension(500, 81));

        txtName.setBackground(panColor);
        txtName.setFont(TextFont);
        txtName.setForeground(TextColor);
        txtName.setBorder(null);
        txtName.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (txtName.getText().equals(Lang.getString("Name"))) {
                    txtName.setText("");
                    txtName.setForeground(TextColor);
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

        icoName.setBackground(panColor);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panNameLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icoName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panEmail.setBackground(panColor);
        panEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, U_TEXT));
        panEmail.setPreferredSize(new java.awt.Dimension(500, 131));

        txtEmail.setBackground(panColor);
        txtEmail.setFont(TextFont);
        txtEmail.setForeground(TextColor);
        txtEmail.setBorder(null);
        txtEmail.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (txtEmail.getText().equals(Lang.getString("CEmail"))) {
                    txtEmail.setText("");
                    txtEmail.setForeground(TextColor);
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

        icoEmail.setBackground(panColor);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEmailLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(panEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panPass0.setBackground(panColor);
        panPass0.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, U_TEXT));
        panPass0.setPreferredSize(new java.awt.Dimension(500, 131));

        icoPass0.setBackground(panColor);

        icoPass0.setPic("src/UI/Image/Password.png");

        javax.swing.GroupLayout icoPass0Layout = new javax.swing.GroupLayout(icoPass0);
        icoPass0.setLayout(icoPass0Layout);
        icoPass0Layout.setHorizontalGroup(
            icoPass0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoPass0Layout.setVerticalGroup(
            icoPass0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        txtPass0.setBackground(panColor);
        txtPass0.setFont(TextFont);
        txtPass0.setForeground(TextColor);
        txtPass0.setBorder(null);
        txtPass0.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (txtPass0.getText().equals(Lang.getString("OPass"))) {
                    seePass0 = false;
                    txtPass0.setEchoChar('*');
                    txtPass0.setText("");
                    txtPass0.setForeground(TextColor);
                }
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (txtPass0.getText().isEmpty()) {
                    seePass0 = true;
                    txtPass0.setEchoChar((char) 0);
                    txtPass0.setForeground(Color.GRAY);
                    txtPass0.setText(Lang.getString("OPass"));
                }
            }
        });
        txtPass0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPass0KeyReleased(evt);
            }
        });

        icoSeePass0.setBackground(panColor);
        icoSeePass0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoSeePass0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoSeePass0MousePressed(evt);
            }
        });

        icoSeePass0.setPic("src/UI/Image/Eyen't.png");

        javax.swing.GroupLayout icoSeePass0Layout = new javax.swing.GroupLayout(icoSeePass0);
        icoSeePass0.setLayout(icoSeePass0Layout);
        icoSeePass0Layout.setHorizontalGroup(
            icoSeePass0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoSeePass0Layout.setVerticalGroup(
            icoSeePass0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panPass0Layout = new javax.swing.GroupLayout(panPass0);
        panPass0.setLayout(panPass0Layout);
        panPass0Layout.setHorizontalGroup(
            panPass0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPass0Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(icoPass0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(txtPass0, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(icoSeePass0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panPass0Layout.setVerticalGroup(
            panPass0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPass0Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(panPass0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icoPass0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icoSeePass0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panPass1.setBackground(panColor);
        panPass1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, U_TEXT));
        panPass1.setPreferredSize(new java.awt.Dimension(500, 131));

        icoPass1.setBackground(panColor);

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

        txtPass1.setBackground(panColor);
        txtPass1.setFont(TextFont);
        txtPass1.setForeground(TextColor);
        txtPass1.setBorder(null);
        txtPass1.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (txtPass1.getText().equals(Lang.getString("NPass"))) {
                    seePass1 = false;
                    txtPass1.setEchoChar('*');
                    txtPass1.setText("");
                    txtPass1.setForeground(TextColor);
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

        icoSeePass1.setBackground(panColor);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPass1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(panPass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icoPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icoSeePass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panPass2.setBackground(panColor);
        panPass2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, U_TEXT));
        panPass2.setPreferredSize(new java.awt.Dimension(500, 131));

        icoPass2.setBackground(panColor);

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

        txtPass2.setBackground(panColor);
        txtPass2.setFont(TextFont);
        txtPass2.setForeground(TextColor);
        txtPass2.setBorder(null);
        txtPass2.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (txtPass2.getText().equals(Lang.getString("CPass"))) {
                    seePass2 = false;
                    txtPass2.setEchoChar('*');
                    txtPass2.setText("");
                    txtPass2.setForeground(TextColor);
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

        icoSeePass2.setBackground(panColor);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPass2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(panPass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icoPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icoSeePass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnUpdate.setText("Update");
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdate.setkBorderRadius(20);
        btnUpdate.setkEndColor(new java.awt.Color(0, 188, 212));
        btnUpdate.setkHoverEndColor(new Color(0, 188, 212, 155));
        btnUpdate.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnUpdate.setkHoverStartColor(new Color(224, 64, 251, 155));
        btnUpdate.setkSelectedColor(new java.awt.Color(255, 0, 0));
        btnUpdate.setkStartColor(new java.awt.Color(224, 64, 251));
        btnUpdate.setPreferredSize(new java.awt.Dimension(300, 80));
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panChildInfoLayout = new javax.swing.GroupLayout(panChildInfo);
        panChildInfo.setLayout(panChildInfoLayout);
        panChildInfoLayout.setHorizontalGroup(
            panChildInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panChildInfoLayout.createSequentialGroup()
                .addGroup(panChildInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panOTPParent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panPass0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panChildInfoLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        panChildInfoLayout.setVerticalGroup(
            panChildInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panChildInfoLayout.createSequentialGroup()
                .addComponent(panOTPParent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panPass0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        panChildInfo.setVisible(false);

        javax.swing.GroupLayout panInfoLayout = new javax.swing.GroupLayout(panInfo);
        panInfo.setLayout(panInfoLayout);
        panInfoLayout.setHorizontalGroup(
            panInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panInfoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panChildInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panInfoLayout.createSequentialGroup()
                        .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(icoArrowInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        panInfoLayout.setVerticalGroup(
            panInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panInfoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icoArrowInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(panChildInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panMana.setBackground(BLIND);
        panMana.setkBorderRadius(30);
        panMana.setkEndColor(panColor);
        panMana.setkStartColor(panColor);

        lblMana.setFont(TittleFont);
        lblMana.setForeground(TextColor);
        lblMana.setText("Quan li tai khoan");

        icoArrowMana.setBackground(panColor);
        icoArrowMana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoArrowMana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoArrowManaMousePressed(evt);
            }
        });

        icoArrowMana.setPic("src/UI/Image/Down.png");

        javax.swing.GroupLayout icoArrowManaLayout = new javax.swing.GroupLayout(icoArrowMana);
        icoArrowMana.setLayout(icoArrowManaLayout);
        icoArrowManaLayout.setHorizontalGroup(
            icoArrowManaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        icoArrowManaLayout.setVerticalGroup(
            icoArrowManaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panChildMana.setBackground(panColor);

        lblSignOut.setFont(TittleFont);
        lblSignOut.setForeground(TextColor);
        lblSignOut.setText("Dang xuat");
        lblSignOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSignOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSignOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSignOutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSignOutMousePressed(evt);
            }
        });

        icoSignOut.setBackground(panColor);
        icoSignOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        icoSignOut.setPic("src/UI/Image/SignOut.png");

        javax.swing.GroupLayout icoSignOutLayout = new javax.swing.GroupLayout(icoSignOut);
        icoSignOut.setLayout(icoSignOutLayout);
        icoSignOutLayout.setHorizontalGroup(
            icoSignOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        icoSignOutLayout.setVerticalGroup(
            icoSignOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        icoSignOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSignOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSignOutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSignOutMousePressed(evt);
            }
        });

        lblRemove.setFont(TittleFont);
        lblRemove.setForeground(TextColor);
        lblRemove.setText("Xoa tai khoan");
        lblRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRemoveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRemoveMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRemoveMousePressed(evt);
            }
        });

        icoRemove.setBackground(panColor);
        icoRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        icoRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRemoveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRemoveMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRemoveMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panChildManaLayout = new javax.swing.GroupLayout(panChildMana);
        panChildMana.setLayout(panChildManaLayout);
        panChildManaLayout.setHorizontalGroup(
            panChildManaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panChildManaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panChildManaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRemove, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                    .addComponent(lblSignOut, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(panChildManaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icoSignOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icoRemove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        panChildManaLayout.setVerticalGroup(
            panChildManaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panChildManaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panChildManaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSignOut, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(icoSignOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(panChildManaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icoRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRemove, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        panChildMana.setVisible(false);

        javax.swing.GroupLayout panManaLayout = new javax.swing.GroupLayout(panMana);
        panMana.setLayout(panManaLayout);
        panManaLayout.setHorizontalGroup(
            panManaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panManaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panManaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panChildMana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panManaLayout.createSequentialGroup()
                        .addComponent(lblMana, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(icoArrowMana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        panManaLayout.setVerticalGroup(
            panManaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panManaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panManaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMana, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(icoArrowMana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(panChildMana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panContentLayout = new javax.swing.GroupLayout(panContent);
        panContent.setLayout(panContentLayout);
        panContentLayout.setHorizontalGroup(
            panContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panContentLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panMana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        panContentLayout.setVerticalGroup(
            panContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panContentLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(panInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(panMana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        scrPan.setViewportView(panContent);

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(imgAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(scrPan, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(imgAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(scrPan, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void lblResetOTPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResetOTPMousePressed
        sendOTP();
    }//GEN-LAST:event_lblResetOTPMousePressed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        icoName.setPic("src/UI/Image/Name" + (VName() ? "2" : "0") +".png");
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        icoEmail.setPic("src/UI/Image/Email" + (VEmail() ? "2" : "0") +".png");
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtPass0KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPass0KeyReleased
        icoPass0.setPic("src/UI/Image/Password" + (VPass0() ? "2" : "0") +".png");
    }//GEN-LAST:event_txtPass0KeyReleased

    private void icoSeePass0MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSeePass0MousePressed
        seePass0 = !seePass0;
        if(!new String(txtPass0.getPassword()).equals(Lang.getString("OPass"))){
            if(seePass0){   txtPass0.setEchoChar((char) 0);  icoSeePass0.setPic("src/UI/Image/Eye.png");}
            else        {   txtPass0.setEchoChar('*');       icoSeePass0.setPic("src/UI/Image/Eyen't.png");}
        }
    }//GEN-LAST:event_icoSeePass0MousePressed

    private void txtPass1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPass1KeyReleased
        icoPass1.setPic("src/UI/Image/Password" + (VPass1() ? "2" : "0") +".png");
    }//GEN-LAST:event_txtPass1KeyReleased

    private void icoSeePass1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSeePass1MousePressed
        seePass1 = !seePass1;
        if(!new String(txtPass1.getPassword()).equals(Lang.getString("NPass"))){
            if(seePass1){   txtPass1.setEchoChar((char) 0);  icoSeePass1.setPic("src/UI/Image/Eye.png");}
            else        {   txtPass1.setEchoChar('*');       icoSeePass1.setPic("src/UI/Image/Eyen't.png");}
        }
    }//GEN-LAST:event_icoSeePass1MousePressed

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

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(!checkInfo){
            if(Validate()){
                panOTPParent.setVisible(true);
                for(int i = 5 ; i > 0; i--){    panChildInfo.remove(i);   }
                sendOTP();
                txtCode1.requestFocusInWindow();
                checkInfo = true;
                btnUpdate.setText(Lang.getString("VOTP"));
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
                CurrentGV.setName(Name);
                CurrentGV.setEmail(Email);
                CurrentGV.setPassword(Pass2);
                loader = new Loader(parent, true);
                loader.Case = 5;
                loader.setInfor("/UI/Image/Server.gif", Lang.getString("UpdateAccount"));
                loader.setVisible(true);
                Log.add("Account update successfully.");
                Mode.WMessage(this, Lang.getString("UpdateSuccess").replaceFirst("!", "!\n"), Lang.getString("AccInfor"), JOptionPane.INFORMATION_MESSAGE);
                ParentWindow.dispose();
                new SignIn().setVisible(true);
            }else{
                Mode.WMessage(this, Lang.getString("WOTP").replaceFirst("\\.", ".\n"), Lang.getString("AccInfor"), JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void icoArrowInfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoArrowInfoMousePressed
        showInfo = !showInfo;
        icoArrowInfo.setPic("src/UI/Image/" + (showInfo ? "Up" : "Down") + ".png");
        panChildInfo.setVisible(showInfo);
        repaint();
    }//GEN-LAST:event_icoArrowInfoMousePressed

    private void icoArrowManaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoArrowManaMousePressed
        showMana = !showMana;
        icoArrowMana.setPic("src/UI/Image/" + (showMana ? "Up" : "Down") + ".png");
        panChildMana.setVisible(showMana);
        repaint();
    }//GEN-LAST:event_icoArrowManaMousePressed

    private void lblSignOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignOutMouseEntered
        lblSignOut.setForeground(Color.RED);
    }//GEN-LAST:event_lblSignOutMouseEntered

    private void lblSignOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignOutMouseExited
        lblSignOut.setForeground(TextColor);
    }//GEN-LAST:event_lblSignOutMouseExited

    private void lblSignOutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignOutMousePressed
        if(Mode.WConfirm(this, Lang.getString("SignOutMess"), Lang.getString("AccMana"), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            SignOut();
        }
    }//GEN-LAST:event_lblSignOutMousePressed

    private void lblRemoveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRemoveMouseEntered
        lblRemove.setForeground(Color.RED);
        icoRemove.setPic("src/UI/Image/Remove2.png");
    }//GEN-LAST:event_lblRemoveMouseEntered

    private void lblRemoveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRemoveMouseExited
        lblRemove.setForeground(TextColor);
        icoRemove.setPic("src/UI/Image/Remove.png");
    }//GEN-LAST:event_lblRemoveMouseExited

    private void lblRemoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRemoveMousePressed
        if(Mode.WConfirm(this, Lang.getString("AskDelete").replaceAll("!", "!\n").replaceFirst("\\?", "?\n"), Lang.getString("AccMana"), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            if(CurrentGV.getPassword().equals( SHA256.Encrypt(WInput(this, Lang.getString("ConDelete"), Lang.getString("AccMana"), JOptionPane.WARNING_MESSAGE)).trim())){
                loader = new Loader(parent, true);
                loader.Case = 8;
                loader.setInfor("/UI/Image/Server.gif", Lang.getString("RemoveAcc"));
                loader.setVisible(true);
            }else{
                Mode.WMessage(this, Lang.getString("WrongPass").replaceAll("\\.", ".\n"), Lang.getString("AccMana"), JOptionPane.WARNING_MESSAGE);
            }
            SignOut();
        }
    }//GEN-LAST:event_lblRemoveMousePressed

    private void icoEditAvatarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoEditAvatarMouseEntered
        icoEditAvatar.setPic("src/UI/Image/Camera1.png");
        repaint();
    }//GEN-LAST:event_icoEditAvatarMouseEntered

    private void icoEditAvatarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoEditAvatarMouseExited
        icoEditAvatar.setPic("src/UI/Image/Camera.png");
        repaint();
    }//GEN-LAST:event_icoEditAvatarMouseExited

    private void icoEditAvatarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoEditAvatarMousePressed
        new SelectAvatar(parent, true).setVisible(true);
    }//GEN-LAST:event_icoEditAvatarMousePressed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        imgAvatar.setPic(AVATAR);
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Account dialog = new Account(new javax.swing.JFrame(), true);
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
    private final java.awt.Font TittleFont = new java.awt.Font("Courier New", 1, 30),
                                OTPFont = new java.awt.Font("Courier New", 1, 48),
                                TextFont = new java.awt.Font("Tahoma", 0, 30);
    private final Color panColor = Mode.getMode() ? PAN_SEN_DARK : PAN_SEN_LIGHT,
                        TextColor = Mode.getTextColor();
    private final Rectangle rec = new Rectangle();
    private static Frame parent;
    private Loader loader;
    private boolean showInfo = false, showMana = false, seePass0 = false, seePass1 = false, seePass2 = false, checkInfo= false;
    private String OTP = null, OTPMail = "", currentOTP = "", Name = "", Email = "", Pass0 = "", Pass1 = "", Pass2 = "";
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private com.k33ptoo.components.KButton btnUpdate;
    private com.AnLa.UI.ImagePanel icoArrowInfo;
    private com.AnLa.UI.ImagePanel icoArrowMana;
    private com.AnLa.UI.ImagePanel icoEditAvatar;
    private com.AnLa.UI.ImagePanel icoEmail;
    private com.AnLa.UI.ImagePanel icoName;
    private com.AnLa.UI.ImagePanel icoPass0;
    private com.AnLa.UI.ImagePanel icoPass1;
    private com.AnLa.UI.ImagePanel icoPass2;
    private com.AnLa.UI.ImagePanel icoRemove;
    private com.AnLa.UI.ImagePanel icoSeePass0;
    private com.AnLa.UI.ImagePanel icoSeePass1;
    private com.AnLa.UI.ImagePanel icoSeePass2;
    private com.AnLa.UI.ImagePanel icoSignOut;
    private com.AnLa.UI.AvatarPanel imgAvatar;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblMana;
    private javax.swing.JLabel lblNoneOTP;
    private javax.swing.JLabel lblOTP;
    private javax.swing.JLabel lblRemove;
    private javax.swing.JLabel lblResetOTP;
    private javax.swing.JLabel lblSignOut;
    private javax.swing.JPanel panChildInfo;
    private javax.swing.JPanel panChildMana;
    private javax.swing.JPanel panContent;
    private javax.swing.JPanel panEmail;
    private com.k33ptoo.components.KGradientPanel panInfo;
    private com.k33ptoo.components.KGradientPanel panMana;
    private javax.swing.JPanel panName;
    private javax.swing.JPanel panOTP;
    private javax.swing.JPanel panOTPParent;
    private javax.swing.JPanel panPass0;
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
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass0;
    private javax.swing.JPasswordField txtPass1;
    private javax.swing.JPasswordField txtPass2;
    // End of variables declaration//GEN-END:variables

    private void SignOut(){
        WriteLocalUser(null);
        ParentWindow.dispose();
        new SignIn().setVisible(true);
    }
    private void sendOTP() {
        OTP = makeOTP();
        if (OTP != null) {
            OTPMail = (String) ObjectData.readData("src/AppData/OTPCodeTemplate_" + LocalSetting.getLang() + ".dat");
            OTPMail = OTPMail.replaceFirst("USERNAME", StrToUnicodeDecimal(Name));
            OTPMail = OTPMail.replaceFirst("CONTENT", Lang.getString("OTPUpdate"));
            OTPMail = OTPMail.replaceFirst("123456", OTP);
            SMTP.setEmail(Lang.getString("OTP"), OTPMail);
            SENDMAIL = Email;
            loader = new Loader(parent, true);
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
        Pass0 = String.valueOf(txtPass0.getPassword()).trim();
        Pass1 = String.valueOf(txtPass1.getPassword()).trim();
        Pass2 = String.valueOf(txtPass2.getPassword()).trim();
        
        //validate infor
        Name  = Name.equals(Lang.getString("Name")) ? "" : Name;
        Email = Email.equals(Lang.getString("CEmail")) ? "" : Email;
        Pass0 = Pass0.equals(Lang.getString("OPass")) ? "" : Pass0;
        Pass1 = Pass1.equals(Lang.getString("NPass")) ? "" : Pass1;
        Pass2 = Pass2.equals(Lang.getString("CPass")) ? "" : Pass2;

        //Validate name
        rec.y = txtName.getY() - 100;
        panChildInfo.scrollRectToVisible(rec);
        txtName.requestFocusInWindow();
        panName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.RED));
        if(Name.isBlank())          {showMess("XName");     return false;}
        if(Name.length() > 30)      {showMess("LongName");  return false;}
        if(Name.matches(NAME))      {showMess("SpeName");   return false;}
        panName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, U_TEXT));
        
        //Validate email
        rec.y = txtEmail.getY() - 100;
        panChildInfo.scrollRectToVisible(rec);
        txtEmail.requestFocusInWindow();
        panEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.RED));
        if(Email.isBlank())         {showMess("XEmail");    return false;}
        if(!Email.matches(EMAIL))   {showMess("InEmail");   return false;}
        if(GVDAO.selectByEmail(Email) != null && !CurrentGV.getEmail().equals(Email)){
            showMess("UEmail");return false;}
        panEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, U_TEXT));
        
        //Validate old password
        rec.y = txtPass0.getY() - 100;
        panChildInfo.scrollRectToVisible(rec);
        txtPass0.requestFocusInWindow();
        panPass0.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.RED));
        if(Pass0.isBlank())         {showMess("XOPass");    return false;}
        if(!Pass0.matches(PASSWORD)){showMess("InPass");    return false;}
        Pass0 = SHA256.Encrypt(Pass0);
        if(!Pass0.equals(CurrentGV.getPassword()))  {showMess("OMPass");return false;}
        panPass0.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, U_TEXT));
        
        //Validate new password
        if(Pass1.isBlank())         {
            if(Mode.WConfirm(this, Lang.getString("ENPass"), Lang.getString("Notifi"), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                Pass2 = CurrentGV.getPassword();
                return true;
            }return false;
        }
        rec.y = txtPass1.getY() - 100;
        panChildInfo.scrollRectToVisible(rec);
        txtPass1.requestFocusInWindow();
        panPass1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.RED));
        if(!Pass1.matches(PASSWORD)){showMess("InPass");    return false;}
        Pass1 = SHA256.Encrypt(Pass1);
        if(Pass1.equals(CurrentGV.getPassword()))   {showMess("SamePass");return false;}
        panPass1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, U_TEXT));
        
        //Validate confirm password
        rec.y = txtPass2.getY() - 100;
        panChildInfo.scrollRectToVisible(rec);
        txtPass2.requestFocusInWindow();
        panPass2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.RED));
        if(Pass2.isBlank())         {showMess("XCPass");    return false;}
        if(!Pass2.matches(PASSWORD)){showMess("InPass");    return false;}
        Pass2 = SHA256.Encrypt(Pass2);
        if(!Pass2.equals(Pass1))    {showMess("MPass");     return false;}
        panPass2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, U_TEXT));
        
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
    private boolean VPass0(){
        Pass0 = String.valueOf(txtPass0.getPassword()).trim();
        if(Pass0.isBlank()){return false;}
        return Pass0.matches(PASSWORD);
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