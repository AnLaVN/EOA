package UI.Frame;
// Make By Bình An || AnLaVN || KatoVN

import static Controller.DatabaseData.BCDAO;
import static Controller.DatabaseData.DTDAO;
import static Controller.DatabaseData.SVDAO;
import static Controller.DatabaseData.arrA;
import static Controller.DatabaseData.arrB;
import static Controller.DatabaseData.arrC;
import static Controller.DatabaseData.arrD;
import static Controller.DatabaseData.getSentences;
import static Controller.DatabaseData.numA;
import static Controller.DatabaseData.numB;
import static Controller.DatabaseData.numC;
import static Controller.DatabaseData.numD;
import static Controller.LocalData.*;
import CustomComponent.Notification;
import ObjectClass.BaoCao;
import ObjectClass.BuoiThi;
import ObjectClass.CauHoi;
import ObjectClass.DeThi;
import ObjectClass.GradientColor;
import com.AnLa.FILE.Log;
import com.AnLa.UI.Mode;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.imageio.ImageIO;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import org.opencv.highgui.VideoCapture;

public class Dashboard extends javax.swing.JFrame {
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]
    //[This content has been censored, contact the owner if you want access]

    public Dashboard() {
        ParentComponent = this;
        initComponents();
        try { setIconImage(ImageIO.read(getClass().getResource("/UI/Image/Logo.png"))); } 
        catch (IOException ex) {Log.add("!!! Error try to set Icon for frame. !!!");}
        GradientColor c1 = new GradientColor(new Color(131,153,162), new Color(238,242,243)),
                c2 = new GradientColor(new Color(114,122,154), new Color(216,219,233)),
                c3 = new GradientColor(new Color(89,92,255), new Color(198,248,255)),
                c4 = new GradientColor(new Color(105,110,255), new Color(248,172,255)),
                c5 = new GradientColor(new Color(181,151,246), new Color(150,198,234));
        arr.add(c1);arr.add(c2);arr.add(c3);arr.add(c4);arr.add(c5);
        
        panSVColor = getRandomColor();
        panChild.setkEndColor(panSVColor.getStartColor());
        panChild.setkStartColor(panSVColor.getEndColor());
        panSV.setkEndColor(panSVColor.getStartColor());
        panSV.setkStartColor(panSVColor.getEndColor());
        
        lblIDSV.setText(CurrentSV.getIDSinhVien());
        lblNameSV.setText(CurrentSV.getName());
        imgSV.setPic("FaceRecognition/Image/original.png");
        chkSubmit.setVisible(false);
        btnSubmit.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panBackground = new javax.swing.JPanel();
        panSV = new com.k33ptoo.components.KGradientPanel();
        panChild = new com.k33ptoo.components.KGradientPanel();
        icoSettings = new com.AnLa.UI.ImagePanel();
        imgSV = new com.AnLa.UI.AvatarPanel();
        lblIDSV = new javax.swing.JLabel();
        lblNameSV = new javax.swing.JLabel();
        lblClass = new javax.swing.JLabel();
        lblNumExam = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblDay = new javax.swing.JLabel();
        lblTimeLeft = new javax.swing.JLabel();
        lblLostFocus = new javax.swing.JLabel();
        icoClose = new com.AnLa.UI.ImagePanel();
        lblEOA = new javax.swing.JLabel();
        lblVersion = new javax.swing.JLabel();
        scrPan = new javax.swing.JScrollPane();
        temp = new javax.swing.JPanel();
        panCam = new javax.swing.JPanel();
        icoFaceReg = new com.AnLa.UI.ImagePanel();
        btnReg = new com.k33ptoo.components.KButton();
        scrText = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        chkFaceDet = new javax.swing.JCheckBox();
        lblTittle = new javax.swing.JLabel();
        chkSubmit = new javax.swing.JCheckBox();
        btnSubmit = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
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

        panBackground.setPreferredSize(new java.awt.Dimension(1920, 1080));

        panSV.setBackground(BLIND);
        panSV.setkBorderRadius(110);
        panSV.setPreferredSize(new java.awt.Dimension(450, 1080));

        panChild.setkBorderRadius(0);
        panChild.setPreferredSize(new java.awt.Dimension(350, 1080));

        icoSettings.setBackground(BLIND);
        icoSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoSettings.setPreferredSize(new java.awt.Dimension(60, 60));
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
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoSettingsLayout.setVerticalGroup(
            icoSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panChildLayout = new javax.swing.GroupLayout(panChild);
        panChild.setLayout(panChildLayout);
        panChildLayout.setHorizontalGroup(
            panChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icoSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panChildLayout.setVerticalGroup(
            panChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panChildLayout.createSequentialGroup()
                .addComponent(icoSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        imgSV.setBackground(BLIND);

        javax.swing.GroupLayout imgSVLayout = new javax.swing.GroupLayout(imgSV);
        imgSV.setLayout(imgSVLayout);
        imgSVLayout.setHorizontalGroup(
            imgSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        imgSVLayout.setVerticalGroup(
            imgSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        lblIDSV.setBackground(BLIND);
        lblIDSV.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblIDSV.setForeground(new java.awt.Color(51, 51, 51));
        lblIDSV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIDSV.setText("PS21776");

        lblNameSV.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        lblNameSV.setForeground(new java.awt.Color(51, 51, 51));
        lblNameSV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameSV.setText("La Đặng Bình An");

        lblClass.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        lblClass.setForeground(new java.awt.Color(51, 51, 51));
        lblClass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClass.setPreferredSize(new java.awt.Dimension(330, 40));

        lblNumExam.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        lblNumExam.setForeground(new java.awt.Color(51, 51, 51));
        lblNumExam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblTime.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        lblTime.setForeground(new java.awt.Color(51, 51, 51));
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDay.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        lblDay.setForeground(new java.awt.Color(51, 51, 51));
        lblDay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblTimeLeft.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        lblTimeLeft.setForeground(new java.awt.Color(51, 51, 51));
        lblTimeLeft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblLostFocus.setFont(new java.awt.Font("Courier New", 1, 30)); // NOI18N
        lblLostFocus.setForeground(new java.awt.Color(255, 0, 51));
        lblLostFocus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLostFocus.setText("Mất tập trung: 1");

        javax.swing.GroupLayout panSVLayout = new javax.swing.GroupLayout(panSV);
        panSV.setLayout(panSVLayout);
        panSVLayout.setHorizontalGroup(
            panSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSVLayout.createSequentialGroup()
                .addComponent(panChild, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblLostFocus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblIDSV, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNameSV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblClass, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumExam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTimeLeft, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panSVLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(imgSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        panSVLayout.setVerticalGroup(
            panSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panChild, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panSVLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(imgSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lblIDSV, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblNameSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblLostFocus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(lblClass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblNumExam, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblDay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(lblTimeLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

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

        lblEOA.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        lblEOA.setForeground(BLUR);

        lblVersion.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lblVersion.setForeground(BLUR);
        lblVersion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblVersion.setText(CURRENTVERSION);

        scrPan.setBorder(null);
        scrPan.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrPan.setVerticalScrollBar(new com.AnLa.UI.ScrollBar());

        temp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panCam.setBackground(new java.awt.Color(153, 153, 255));

        icoFaceReg.setBackground(BLIND);
        icoFaceReg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoFaceReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icoFaceRegMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icoFaceRegMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoFaceRegMousePressed(evt);
            }
        });

        icoFaceReg.setPic("src/UI/Image/FaceRecognition1.png");

        javax.swing.GroupLayout icoFaceRegLayout = new javax.swing.GroupLayout(icoFaceReg);
        icoFaceReg.setLayout(icoFaceRegLayout);
        icoFaceRegLayout.setHorizontalGroup(
            icoFaceRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        icoFaceRegLayout.setVerticalGroup(
            icoFaceRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panCamLayout = new javax.swing.GroupLayout(panCam);
        panCam.setLayout(panCamLayout);
        panCamLayout.setHorizontalGroup(
            panCamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCamLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(icoFaceReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 250, Short.MAX_VALUE))
        );
        panCamLayout.setVerticalGroup(
            panCamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCamLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(icoFaceReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        temp.add(panCam, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 50, -1, -1));

        btnReg.setText("Recognize");
        btnReg.setFont(new java.awt.Font("Tahoma", 1, 45)); // NOI18N
        btnReg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReg.setkBorderRadius(20);
        btnReg.setkEndColor(new java.awt.Color(0, 188, 212));
        btnReg.setkHoverEndColor(new Color(0, 188, 212, 155));
        btnReg.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnReg.setkHoverStartColor(new Color(224, 64, 251, 155));
        btnReg.setkStartColor(new java.awt.Color(224, 64, 251));
        btnReg.setPreferredSize(new java.awt.Dimension(300, 80));
        btnReg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });
        temp.add(btnReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 850, 500, -1));

        scrText.setBorder(null);
        scrText.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrText.setVerticalScrollBar(new com.AnLa.UI.ScrollBar());

        txtResult.setEditable(false);
        txtResult.setBackground(new java.awt.Color(153, 255, 204));
        txtResult.setColumns(20);
        txtResult.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtResult.setLineWrap(true);
        txtResult.setRows(5);
        txtResult.setTabSize(2);
        txtResult.setWrapStyleWord(true);
        txtResult.setBorder(null);
        txtResult.setFocusable(false);
        scrText.setViewportView(txtResult);

        temp.add(scrText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 50, 400, 895));

        chkFaceDet.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        chkFaceDet.setText("Face detected");
        chkFaceDet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkFaceDet.setFocusPainted(false);
        chkFaceDet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/CheckBoxNull.png"))); // NOI18N
        chkFaceDet.setRolloverEnabled(false);
        chkFaceDet.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/CheckBox.png"))); // NOI18N
        temp.add(chkFaceDet, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 780, 600, 40));

        scrPan.setViewportView(temp);

        lblTittle.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        lblTittle.setText("Dashboard");

        chkSubmit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        chkSubmit.setText(Lang.getString("WantSub"));
        chkSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkSubmit.setFocusPainted(false);
        chkSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/CheckBoxNull.png"))); // NOI18N
        chkSubmit.setPreferredSize(new java.awt.Dimension(180, 35));
        chkSubmit.setRolloverEnabled(false);
        chkSubmit.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/CheckBox.png"))); // NOI18N
        chkSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSubmitActionPerformed(evt);
            }
        });

        btnSubmit.setText(Lang.getString("Sub"));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSubmit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSubmit.setkBorderRadius(20);
        btnSubmit.setkEndColor(new java.awt.Color(0, 188, 212));
        btnSubmit.setkHoverEndColor(new Color(0, 188, 212, 155));
        btnSubmit.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSubmit.setkHoverStartColor(new Color(224, 64, 251, 155));
        btnSubmit.setkSelectedColor(new java.awt.Color(255, 0, 0));
        btnSubmit.setkStartColor(new java.awt.Color(224, 64, 251));
        btnSubmit.setPreferredSize(new java.awt.Dimension(300, 80));
        btnSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBackgroundLayout = new javax.swing.GroupLayout(panBackground);
        panBackground.setLayout(panBackgroundLayout);
        panBackgroundLayout.setHorizontalGroup(
            panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBackgroundLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblEOA, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addComponent(scrPan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1470, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBackgroundLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200)
                        .addComponent(chkSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(icoClose, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panBackgroundLayout.setVerticalGroup(
            panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panBackgroundLayout.createSequentialGroup()
                        .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icoClose, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(chkSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBackgroundLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addComponent(scrPan, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEOA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVersion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1081, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        LostFocus++;
    }//GEN-LAST:event_formWindowLostFocus

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        setMode();
        lblTittle.setText(StartExam ? ExamName : Lang.getString("Dashboard"));
        lblEOA.setText("EOA - " + Lang.getString("SV"));
        lblClass.setText(Lang.getString("Class") + " : " + CurrentL.getName());
        lblNumExam.setText(Lang.getString("NofExam") + " : " + arrBT.size());
        lblLostFocus.setText(Lang.getString("LostFocus") + ": " + LostFocus);
        btnReg.setText(Lang.getString("Rec"));
        chkFaceDet.setText(Lang.getString("FaceDet"));
        addGuide();
    }//GEN-LAST:event_formWindowGainedFocus

    private void icoCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoCloseMouseEntered
        icoClose.setPic("src/UI/Image/Close2.png");
        repaint();
    }//GEN-LAST:event_icoCloseMouseEntered

    private void icoCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoCloseMouseExited
        icoClose.setPic("src/UI/Image/Close.png");
        repaint();
    }//GEN-LAST:event_icoCloseMouseExited

    private void icoCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoCloseMousePressed
        System.exit(0);
    }//GEN-LAST:event_icoCloseMousePressed

    private void icoSettingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSettingsMouseEntered
        icoSettings.setPic("src/UI/Image/Settings2.png");                               //repaint new icon
        repaint();
    }//GEN-LAST:event_icoSettingsMouseEntered

    private void icoSettingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSettingsMouseExited
        icoSettings.setPic("src/UI/Image/Settings.png");                                //repaint new icon
        repaint();
    }//GEN-LAST:event_icoSettingsMouseExited

    private void icoSettingsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSettingsMousePressed
        new Settings(this, true).setVisible(true);                                      //open setting dialog
    }//GEN-LAST:event_icoSettingsMousePressed

    private void icoFaceRegMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoFaceRegMouseEntered
        panCam.setBackground(hoverFace);
        //icoFaceReg.setBackground(BLIND);
        repaint();
 //       icoFaceReg.setPic("src/UI/Image/FaceID2.png");
    }//GEN-LAST:event_icoFaceRegMouseEntered

    private void icoFaceRegMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoFaceRegMouseExited
        panCam.setBackground(BLIND);
        //icoFaceReg.setBackground(BLIND);
        repaint();
   //     icoFaceReg.setPic("src/UI/Image/FaceID1.png");
    }//GEN-LAST:event_icoFaceRegMouseExited

    private void icoFaceRegMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoFaceRegMousePressed
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
    }//GEN-LAST:event_icoFaceRegMousePressed

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
    }//GEN-LAST:event_btnRegActionPerformed

    private void chkSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSubmitActionPerformed
        if(!isFinished()){
            noti.showNotification();
            chkSubmit.setSelected(false);
            btnSubmit.setVisible(false);
        }
        btnSubmit.setVisible(chkSubmit.isSelected());
    }//GEN-LAST:event_chkSubmitActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        Submit();
    }//GEN-LAST:event_btnSubmitActionPerformed
    
    public static void main(String args[]) {
        System.setProperty("sun.java2d.uiScale", "1.0");                                //Turn off UI Scale
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException  ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }
    private Notification noti = new Notification(this, Notification.Type.WARNING, Notification.Location.TOP_CENTER, Lang.getString("InSub"));
    private int LostFocus = 0;
    private final ArrayList<GradientColor> arr = new ArrayList<>();
    private final GradientColor panSVColor;
    private boolean StartExam = false;
    private String ExamName, textResult = "";
    private final Color hoverFace = new Color(107, 120, 136, 50);
    private final SimpleDateFormat TimeFomater = new SimpleDateFormat("HH:mm:ss"),
                                   DateFomater = new SimpleDateFormat("dd/MM/YYYY");

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnReg;
    private com.k33ptoo.components.KButton btnSubmit;
    private javax.swing.JCheckBox chkFaceDet;
    private javax.swing.JCheckBox chkSubmit;
    private com.AnLa.UI.ImagePanel icoClose;
    private com.AnLa.UI.ImagePanel icoFaceReg;
    private com.AnLa.UI.ImagePanel icoSettings;
    private com.AnLa.UI.AvatarPanel imgSV;
    private javax.swing.JLabel lblClass;
    private javax.swing.JLabel lblDay;
    private javax.swing.JLabel lblEOA;
    private javax.swing.JLabel lblIDSV;
    private javax.swing.JLabel lblLostFocus;
    private javax.swing.JLabel lblNameSV;
    private javax.swing.JLabel lblNumExam;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTimeLeft;
    private javax.swing.JLabel lblTittle;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JPanel panBackground;
    private javax.swing.JPanel panCam;
    private com.k33ptoo.components.KGradientPanel panChild;
    private com.k33ptoo.components.KGradientPanel panSV;
    private javax.swing.JScrollPane scrPan;
    private javax.swing.JScrollPane scrText;
    private javax.swing.JPanel temp;
    private javax.swing.JTextArea txtResult;
    // End of variables declaration//GEN-END:variables

    private void setMode(){
        Mode.setModeComponent(panBackground);   Mode.setModeComponent(icoClose);
        Mode.setModeComponent(lblTittle);
        Mode.setModeComponent(scrPan.getVerticalScrollBar());
        Mode.setModeComponent(scrPan.getViewport().getView());
        Mode.setModeComponent(panCam);
        Mode.setModeComponent(txtResult);
        Mode.setModeComponent(chkFaceDet);
        Mode.setModeComponent(scrText.getVerticalScrollBar());
        Mode.setModeComponent(chkSubmit);
        if(temp.getComponent(0) instanceof panExam){    fillListExam();  }
    }
    
    private GradientColor getRandomColor() {
        int i = new Random().nextInt(arr.size());
        return arr.get(i);
    }
    
    private void startTimeThread(Date NgayThi, int timeDelay){
        fillListExam();
        setMode();
        repaint();
        new Thread(){ @Override public void run() {
                Date now, submit = new Date(CurrentBT.getStart().getTime() + CurrentBT.getTime()*60000);
                long milileft = 0, sec = 0;
                String timeleft = null, datatime = null, 
                        TimeLeft = Lang.getString("TimeLeft"),
                        Past = Lang.getString("Past"),
                        Left = Lang.getString("Left");
                while(true){
                    now = new Date();
                    lblTime.setText(TimeFomater.format(now));
                    lblDay.setText(DateFomater.format(now));
                    milileft = NgayThi.getTime() - now.getTime();
                    sec = milileft/1000;
                    if(now.equals(submit)){Submit();}
                    if(!StartExam && (milileft < 0 && milileft >= -(timeDelay*60*1000))){StartExam = true; startExam();}
                    if(sec < 0)                         {sec = -sec;}
                    if(sec < 60)                        {timeleft = String.valueOf(sec);            datatime = "Sec";}
                    else if(sec < 3600 || milileft < 0) {timeleft = String.valueOf(sec/60);         datatime = "Min";}
                    else if(sec < 216000)               {timeleft = String.valueOf(sec/60/60);      datatime = "Hou";}
                    else if(sec < 5184000)              {timeleft = String.valueOf(sec/60/60/24);   datatime = "Day";}
                    lblTimeLeft.setText(TimeLeft.
                            replaceFirst("X", String.valueOf(timeleft)).
                            replaceFirst("Time", Lang.getString(datatime)).
                            replaceFirst("ABC", (milileft < 1000 ? Past : Left))
                    );
                }
        }}.start();
    }
    
    private void fillListExam(){
        temp.removeAll();
        temp.setLayout(new javax.swing.BoxLayout(temp, javax.swing.BoxLayout.Y_AXIS));
        for(BuoiThi bt : arrBT){
            panExam pan = new panExam();
            DeThi dt = DTDAO.selectById(bt.getIDDeThi());
            pan.panBackground.setkStartColor(panSVColor.getEndColor());
            pan.panBackground.setkEndColor(panSVColor.getStartColor());
            pan.lblName.setText(bt.getName());
            pan.lblSentences.setText(dt.getTotal() + " " + Lang.getString("Sen"));
            pan.lblExamTime.setText(bt.getTime()+ " " + Lang.getString("Min"));
            pan.lblTime.setText(TimeFomater.format(bt.getStart()));
            pan.lblDay.setText((DateFomater.format(bt.getStart())));
            Mode.setModeComponent(pan.lblName);
            Mode.setModeComponent(pan.lblTime);
            Mode.setModeComponent(pan.lblDay);
            pan.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override public void mouseEntered(java.awt.event.MouseEvent evt) {
                    pan.panBackground.setkFillBackground(true);
                    repaint();
                }
                @Override public void mouseExited(java.awt.event.MouseEvent evt) {
                    pan.panBackground.setkFillBackground(false);
                    repaint();
                }
            });
            temp.add(pan);
        }
        repaint();
    }
    public static Integer Index = 1;
    private void fillSentences(){
        lblTittle.setText(CurrentBT.getName());
        temp.removeAll();
        temp.setLayout(new javax.swing.BoxLayout(temp, javax.swing.BoxLayout.Y_AXIS));
        for(CauHoi ch : arrCH){
            panSentences pan = new panSentences();
            pan.setSentences(ch);
            temp.add(pan);
        }
        temp.scrollRectToVisible(new Rectangle(0,0,0,0));
        repaint();
    }
    private boolean isFinished(){
        for(Component com : temp.getComponents()){
            if(com instanceof panSentences pan) if(!pan.isChoose()) return false;
        }
        return true;
    }
    
    private void startExam(){
        BigLoader loader = new BigLoader(this, true);
        loader.setInfor("/UI/Image/Circle.gif", Lang.getString("Loading"));
        loader.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override public void windowOpened(java.awt.event.WindowEvent evt) {
                new Thread() { @Override public void run() {
                    
                    getSentences();
                    CurrentSV.setStatus(true);
                    SVDAO.Update(CurrentSV);
                    LostFocus = 0;
                    lblLostFocus.setText(Lang.getString("LostFocus") + ": " + LostFocus);
                    icoSettings.setVisible(false);  icoClose.setVisible(false);
                    chkSubmit.setVisible(true);
                    fillSentences();
        
                    loader.dispose();
                }}.start();
            }});
        loader.setVisible(true);
    }
    
    private final Rectangle rec = new Rectangle();
    private void setResult(String text){
        textResult += "\n" + text + "\n";
        txtResult.setText(textResult);
        rec.y = txtResult.getPreferredSize().height + 100;
        txtResult.scrollRectToVisible(rec);
    }
    
    private void FaceRecognition(){
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]                
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
        //[This content has been censored, contact the owner if you want access]
    }
    
    private void addGuide(){
        textResult = Lang.getString("FaceRec") + "\n\n";
        for(int i = 0 ; i < 6 ; i++){
            String guide = Lang.getString("Tip") + " " + String.valueOf(i+1) + ": " +Lang.getString("Guide" + String.valueOf(i));
            setResult(guide);
        }
    }
    
    private void Submit(){
        BigLoader loader = new BigLoader(this, true);
        loader.setInfor("/UI/Image/Circle.gif", Lang.getString("Loading"));
        loader.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override public void windowOpened(java.awt.event.WindowEvent evt) {
                new Thread() { @Override public void run() {
                    Log.add("Scoring...");
                    Double  markA = arrA.size() < 1 ? 0.0 : ((CurrentDT.getPercentA()/100.0)*10) / numA,
                            markB = arrB.size() < 1 ? 0.0 : ((CurrentDT.getPercentB()/100.0)*10) / numB,
                            markC = arrC.size() < 1 ? 0.0 : ((CurrentDT.getPercentC()/100.0)*10) / numC,
                            markD = arrD.size() < 1 ? 0.0 : ((CurrentDT.getPercentD()/100.0)*10) / numD,
                            TotalMark = 0.0;
                            
                    DecimalFormat df = new DecimalFormat();
                    df.setMaximumFractionDigits(6);
                    for(Component com : temp.getComponents()){
                        if(com instanceof panSentences pan){
                            CauHoi ch = pan.cauhoi;
                            if(ch.getLevel()==0 && pan.getDapAn()) TotalMark+=markA;
                            if(ch.getLevel()==1 && pan.getDapAn()) TotalMark+=markB;
                            if(ch.getLevel()==2 && pan.getDapAn()) TotalMark+=markC;
                            if(ch.getLevel()==3 && pan.getDapAn()) TotalMark+=markD;
                        }
                    }
                    try{
                        Log.add("Submit exam.");
                        BCDAO.Update(new BaoCao(CurrentBT.getIDBuoiThi(), CurrentL.getIDLop(), CurrentSV.getIDSinhVien(), TotalMark, LostFocus-1));
                        CurrentSV.setStatus(false);
                        SVDAO.Update(CurrentSV);
                        dispose();
                        Finished dialog = new Finished();
                        dialog.setMark(df.format(TotalMark));
                        dialog.setVisible(true);
                    }catch(Exception ex){
                        Mode.WMessage(ParentComponent, Lang.getString("ErrSub"), Lang.getString("Notifi"), ERROR_MESSAGE);
                    }
                    
                    loader.dispose();
                }}.start();
            }});
        loader.setVisible(true);
        
    }
}