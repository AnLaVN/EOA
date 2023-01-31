package UI.Frame;
// Make By Bình An || AnLaVN || KatoVN

import static Controller.DatabaseData.BCDAO;
import static Controller.DatabaseData.BTDAO;
import static Controller.DatabaseData.DTDAO;
import static Controller.DatabaseData.LDAO;
import static Controller.DatabaseData.SVDAO;
import static Controller.LocalData.*;
import ObjectClass.BaoCao;
import ObjectClass.BuoiThi;
import ObjectClass.DeThi;
import ObjectClass.GradientColor;
import ObjectClass.Lop;
import com.AnLa.FILE.Log;
import com.AnLa.UI.Mode;
import static com.AnLa.UI.Mode.WMessage;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.imageio.ImageIO;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        ParentComponent = this;
        ParentWindow = this;
        ParentFrame = this;
        initComponents();
        try { setIconImage(ImageIO.read(getClass().getResource("/UI/Image/Logo.png"))); } 
        catch (IOException ex) {Log.add("!!! Error try to set Icon for frame. !!!");}
        panChild.setkEndColor(c1.getStartColor());
        panChild.setkStartColor(c1.getEndColor());
        panGV.setkEndColor(c1.getStartColor());
        panGV.setkStartColor(c1.getEndColor());
        ListItemChoose = "Dashboard";
        changePan();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panBackground = new javax.swing.JPanel();
        panGV = new com.k33ptoo.components.KGradientPanel();
        panChild = new com.k33ptoo.components.KGradientPanel();
        icoShowList = new com.AnLa.UI.ImagePanel();
        icoSettings = new com.AnLa.UI.ImagePanel();
        icoAccount = new com.AnLa.UI.ImagePanel();
        icoClass = new com.AnLa.UI.ImagePanel();
        icoTopic = new com.AnLa.UI.ImagePanel();
        icoExam = new com.AnLa.UI.ImagePanel();
        icoAnalytics = new com.AnLa.UI.ImagePanel();
        icoLogo = new com.AnLa.UI.ImagePanel();
        lblNameGV = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblDay = new javax.swing.JLabel();
        panClass = new com.k33ptoo.components.KGradientPanel();
        pan1 = new com.k33ptoo.components.KGradientPanel();
        lblLClass = new javax.swing.JLabel();
        panTopic = new com.k33ptoo.components.KGradientPanel();
        pan2 = new com.k33ptoo.components.KGradientPanel();
        lblLTopic = new javax.swing.JLabel();
        panExam = new com.k33ptoo.components.KGradientPanel();
        pan3 = new com.k33ptoo.components.KGradientPanel();
        lblLExam = new javax.swing.JLabel();
        panAnalytics = new com.k33ptoo.components.KGradientPanel();
        pan4 = new com.k33ptoo.components.KGradientPanel();
        lblAnalytics = new javax.swing.JLabel();
        imgGV = new com.AnLa.UI.AvatarPanel();
        icoClose = new com.AnLa.UI.ImagePanel();
        lblEOA = new javax.swing.JLabel();
        lblVersion = new javax.swing.JLabel();
        scrPan = new javax.swing.JScrollPane();
        temp = new javax.swing.JPanel();
        lblTittle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setUndecorated(true);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panGV.setBackground(BLIND);
        panGV.setkBorderRadius(110);
        panGV.setPreferredSize(new java.awt.Dimension(450, 1080));

        panChild.setBackground(BLIND);
        panChild.setkBorderRadius(0);
        panChild.setPreferredSize(new java.awt.Dimension(350, 1080));

        icoShowList.setBackground(BLIND);
        icoShowList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoShowList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icoShowListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icoShowListMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoShowListMousePressed(evt);
            }
        });

        icoShowList.setPic("src/UI/Image/List.png");

        javax.swing.GroupLayout icoShowListLayout = new javax.swing.GroupLayout(icoShowList);
        icoShowList.setLayout(icoShowListLayout);
        icoShowListLayout.setHorizontalGroup(
            icoShowListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoShowListLayout.setVerticalGroup(
            icoShowListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

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

        icoAccount.setBackground(BLIND);
        icoAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icoAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icoAccountMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoAccountMousePressed(evt);
            }
        });

        icoAccount.setPic("src/UI/Image/User.png");

        javax.swing.GroupLayout icoAccountLayout = new javax.swing.GroupLayout(icoAccount);
        icoAccount.setLayout(icoAccountLayout);
        icoAccountLayout.setHorizontalGroup(
            icoAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoAccountLayout.setVerticalGroup(
            icoAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        icoClass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        icoClass.setPic("src/UI/Image/Class.png");

        javax.swing.GroupLayout icoClassLayout = new javax.swing.GroupLayout(icoClass);
        icoClass.setLayout(icoClassLayout);
        icoClassLayout.setHorizontalGroup(
            icoClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoClassLayout.setVerticalGroup(
            icoClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        icoClass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLClassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLClassMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLClassMousePressed(evt);
            }
        });

        icoTopic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        icoTopic.setPic("src/UI/Image/Topic.png");

        javax.swing.GroupLayout icoTopicLayout = new javax.swing.GroupLayout(icoTopic);
        icoTopic.setLayout(icoTopicLayout);
        icoTopicLayout.setHorizontalGroup(
            icoTopicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoTopicLayout.setVerticalGroup(
            icoTopicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        icoTopic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLTopicMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLTopicMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLTopicMousePressed(evt);
            }
        });

        icoExam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        icoExam.setPic("src/UI/Image/Exam.png");

        javax.swing.GroupLayout icoExamLayout = new javax.swing.GroupLayout(icoExam);
        icoExam.setLayout(icoExamLayout);
        icoExamLayout.setHorizontalGroup(
            icoExamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoExamLayout.setVerticalGroup(
            icoExamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        icoExam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLExamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLExamMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLExamMousePressed(evt);
            }
        });

        icoAnalytics.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        icoAnalytics.setPic("src/UI/Image/Analytics.png");

        javax.swing.GroupLayout icoAnalyticsLayout = new javax.swing.GroupLayout(icoAnalytics);
        icoAnalytics.setLayout(icoAnalyticsLayout);
        icoAnalyticsLayout.setHorizontalGroup(
            icoAnalyticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoAnalyticsLayout.setVerticalGroup(
            icoAnalyticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        icoAnalytics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAnalyticsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAnalyticsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAnalyticsMousePressed(evt);
            }
        });

        icoLogo.setBackground(BLIND);

        icoLogo.setPic("src/UI/Image/Logo.png");

        javax.swing.GroupLayout icoLogoLayout = new javax.swing.GroupLayout(icoLogo);
        icoLogo.setLayout(icoLogoLayout);
        icoLogoLayout.setHorizontalGroup(
            icoLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoLogoLayout.setVerticalGroup(
            icoLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panChildLayout = new javax.swing.GroupLayout(panChild);
        panChild.setLayout(panChildLayout);
        panChildLayout.setHorizontalGroup(
            panChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panChildLayout.createSequentialGroup()
                .addComponent(icoClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panChildLayout.createSequentialGroup()
                .addGroup(panChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panChildLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icoAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(icoSettings, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(icoShowList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panChildLayout.createSequentialGroup()
                        .addGroup(panChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(icoExam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(icoTopic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(icoAnalytics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(icoLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panChildLayout.setVerticalGroup(
            panChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panChildLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(icoShowList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(icoSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(icoAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280)
                .addComponent(icoClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(icoTopic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(icoExam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(icoAnalytics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(icoLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblNameGV.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        lblNameGV.setForeground(new java.awt.Color(51, 51, 51));
        lblNameGV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameGV.setText(CurrentGV.getName());

        lblTime.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        lblTime.setForeground(new java.awt.Color(51, 51, 51));
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime.setText("17:49:53");

        lblDay.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        lblDay.setForeground(new java.awt.Color(51, 51, 51));
        lblDay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDay.setText("06/11/2022");

        panClass.setBackground(BLIND);
        panClass.setkBorderRadius(45);
        panClass.setPreferredSize(new java.awt.Dimension(290, 60));

        pan1.setkBorderRadius(0);
        pan1.setPreferredSize(new java.awt.Dimension(290, 60));

        javax.swing.GroupLayout pan1Layout = new javax.swing.GroupLayout(pan1);
        pan1.setLayout(pan1Layout);
        pan1Layout.setHorizontalGroup(
            pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pan1Layout.setVerticalGroup(
            pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblLClass.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lblLClass.setForeground(new java.awt.Color(250, 250, 250));
        lblLClass.setText("Danh Sách Lớp");
        lblLClass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLClass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLClassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLClassMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLClassMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panClassLayout = new javax.swing.GroupLayout(panClass);
        panClass.setLayout(panClassLayout);
        panClassLayout.setHorizontalGroup(
            panClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panClassLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pan1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblLClass, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panClassLayout.setVerticalGroup(
            panClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panClassLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pan1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(lblLClass, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)))
        );

        panTopic.setBackground(BLIND);
        panTopic.setkBorderRadius(45);
        panTopic.setPreferredSize(new java.awt.Dimension(290, 60));

        pan2.setkBorderRadius(0);
        pan2.setPreferredSize(new java.awt.Dimension(290, 60));

        javax.swing.GroupLayout pan2Layout = new javax.swing.GroupLayout(pan2);
        pan2.setLayout(pan2Layout);
        pan2Layout.setHorizontalGroup(
            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pan2Layout.setVerticalGroup(
            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        lblLTopic.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lblLTopic.setForeground(new java.awt.Color(250, 250, 250));
        lblLTopic.setText("Danh Sách Đề Thi");
        lblLTopic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLTopic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLTopicMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLTopicMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLTopicMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panTopicLayout = new javax.swing.GroupLayout(panTopic);
        panTopic.setLayout(panTopicLayout);
        panTopicLayout.setHorizontalGroup(
            panTopicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTopicLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pan2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblLTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panTopicLayout.setVerticalGroup(
            panTopicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTopicLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panTopicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pan2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(lblLTopic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        panExam.setBackground(BLIND);
        panExam.setkBorderRadius(45);
        panExam.setPreferredSize(new java.awt.Dimension(290, 60));

        pan3.setkBorderRadius(0);
        pan3.setPreferredSize(new java.awt.Dimension(290, 60));

        javax.swing.GroupLayout pan3Layout = new javax.swing.GroupLayout(pan3);
        pan3.setLayout(pan3Layout);
        pan3Layout.setHorizontalGroup(
            pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pan3Layout.setVerticalGroup(
            pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        lblLExam.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lblLExam.setForeground(new java.awt.Color(250, 250, 250));
        lblLExam.setText("Danh Sách Buổi Thi");
        lblLExam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLExam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLExamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLExamMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLExamMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panExamLayout = new javax.swing.GroupLayout(panExam);
        panExam.setLayout(panExamLayout);
        panExamLayout.setHorizontalGroup(
            panExamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panExamLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pan3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblLExam, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panExamLayout.setVerticalGroup(
            panExamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panExamLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panExamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pan3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(lblLExam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        panAnalytics.setBackground(BLIND);
        panAnalytics.setkBorderRadius(45);
        panAnalytics.setPreferredSize(new java.awt.Dimension(290, 60));

        pan4.setkBorderRadius(0);
        pan4.setPreferredSize(new java.awt.Dimension(290, 60));

        javax.swing.GroupLayout pan4Layout = new javax.swing.GroupLayout(pan4);
        pan4.setLayout(pan4Layout);
        pan4Layout.setHorizontalGroup(
            pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pan4Layout.setVerticalGroup(
            pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        lblAnalytics.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lblAnalytics.setForeground(new java.awt.Color(250, 250, 250));
        lblAnalytics.setText("Thống kê");
        lblAnalytics.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAnalytics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAnalyticsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAnalyticsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAnalyticsMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panAnalyticsLayout = new javax.swing.GroupLayout(panAnalytics);
        panAnalytics.setLayout(panAnalyticsLayout);
        panAnalyticsLayout.setHorizontalGroup(
            panAnalyticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAnalyticsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pan4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblAnalytics, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panAnalyticsLayout.setVerticalGroup(
            panAnalyticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAnalyticsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panAnalyticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pan4, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(lblAnalytics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        imgGV.setBackground(BLIND);

        imgGV.setPic(AVATAR);

        javax.swing.GroupLayout imgGVLayout = new javax.swing.GroupLayout(imgGV);
        imgGV.setLayout(imgGVLayout);
        imgGVLayout.setHorizontalGroup(
            imgGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        imgGVLayout.setVerticalGroup(
            imgGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panGVLayout = new javax.swing.GroupLayout(panGV);
        panGV.setLayout(panGVLayout);
        panGVLayout.setHorizontalGroup(
            panGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGVLayout.createSequentialGroup()
                .addGroup(panGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panGVLayout.createSequentialGroup()
                        .addComponent(panChild, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblNameGV, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panClass, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panExam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panAnalytics, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panGVLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(imgGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(40, 40, 40))
        );
        panGVLayout.setVerticalGroup(
            panGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panChild, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panGVLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(imgGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lblNameGV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(panClass, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(panTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(panExam, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(panAnalytics, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblDay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        javax.swing.GroupLayout tempLayout = new javax.swing.GroupLayout(temp);
        temp.setLayout(tempLayout);
        tempLayout.setHorizontalGroup(
            tempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1470, Short.MAX_VALUE)
        );
        tempLayout.setVerticalGroup(
            tempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 943, Short.MAX_VALUE)
        );

        scrPan.setViewportView(temp);

        lblTittle.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        lblTittle.setText("Dashboard");

        javax.swing.GroupLayout panBackgroundLayout = new javax.swing.GroupLayout(panBackground);
        panBackground.setLayout(panBackgroundLayout);
        panBackgroundLayout.setHorizontalGroup(
            panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBackgroundLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblEOA, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addComponent(scrPan, javax.swing.GroupLayout.DEFAULT_SIZE, 1470, Short.MAX_VALUE)
                    .addGroup(panBackgroundLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(icoClose, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panBackgroundLayout.setVerticalGroup(
            panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panBackgroundLayout.createSequentialGroup()
                        .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icoClose, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTittle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(scrPan, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEOA, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        setMode();
        imgGV.setPic(AVATAR);
        lblEOA.setText("EOA - " + Lang.getString("GV"));
        lblLClass.setText(Lang.getString("panClass"));
        lblLTopic.setText(Lang.getString("panTopic"));
        lblLExam.setText(Lang.getString("panExam"));
        lblAnalytics.setText(Lang.getString("panAnalytics"));
        switch (ListItemChoose) {
            case "panClass"     ->  fillPanClass();
            case "panTopic"     ->  fillPanTopic();
            case "panExam"      ->  fillPanExam();
            case "panAnalytics" ->  fillPanAnalytics();
        }
        setTittle();
        repaint();
    }//GEN-LAST:event_formWindowGainedFocus

    private void icoCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoCloseMouseEntered
        icoClose.setPic("src/UI/Image/Close2.png");
    }//GEN-LAST:event_icoCloseMouseEntered

    private void icoCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoCloseMouseExited
        icoClose.setPic("src/UI/Image/Close.png");
    }//GEN-LAST:event_icoCloseMouseExited

    private void icoCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoCloseMousePressed
        System.exit(0);
    }//GEN-LAST:event_icoCloseMousePressed

    private void icoSettingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSettingsMouseEntered
        icoSettings.setPic("src/UI/Image/Settings2.png");
        repaint();
    }//GEN-LAST:event_icoSettingsMouseEntered

    private void icoSettingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSettingsMouseExited
        icoSettings.setPic("src/UI/Image/Settings.png");
        repaint();
    }//GEN-LAST:event_icoSettingsMouseExited

    private void icoSettingsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSettingsMousePressed
        new Settings(this, true).setVisible(true);                                      //open setting dialog
    }//GEN-LAST:event_icoSettingsMousePressed

    private void icoShowListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoShowListMousePressed
        showList = !showList;
        icoShowList.setPic("src/UI/Image/List.png");
        panGV.setPreferredSize(new java.awt.Dimension(showList ? 450 : 60, 1080));
        panChild.setkBorderRadius(showList ? 0 : 50);
        changePan();
        repaint();
    }//GEN-LAST:event_icoShowListMousePressed

    private void icoShowListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoShowListMouseEntered
        icoShowList.setPic("src/UI/Image/List" + (showList ? "Up" : "Down") + ".png");
        repaint();
    }//GEN-LAST:event_icoShowListMouseEntered

    private void icoShowListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoShowListMouseExited
        icoShowList.setPic("src/UI/Image/List.png");
        repaint();
    }//GEN-LAST:event_icoShowListMouseExited

    private void lblLClassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLClassMouseEntered
        lblLClass.setFont(bigFont);
        repaint();
    }//GEN-LAST:event_lblLClassMouseEntered

    private void lblLClassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLClassMouseExited
        lblLClass.setFont(normalFont);
        repaint();
    }//GEN-LAST:event_lblLClassMouseExited

    private void lblLTopicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLTopicMouseEntered
        lblLTopic.setFont(bigFont);
        repaint();
    }//GEN-LAST:event_lblLTopicMouseEntered

    private void lblLTopicMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLTopicMouseExited
        lblLTopic.setFont(normalFont);
        repaint();
    }//GEN-LAST:event_lblLTopicMouseExited

    private void lblLExamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLExamMouseEntered
        lblLExam.setFont(bigFont);
        repaint();
    }//GEN-LAST:event_lblLExamMouseEntered

    private void lblLExamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLExamMouseExited
        lblLExam.setFont(normalFont);
        repaint();
    }//GEN-LAST:event_lblLExamMouseExited

    private void lblAnalyticsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnalyticsMouseEntered
        lblAnalytics.setFont(bigFont);
        repaint();
    }//GEN-LAST:event_lblAnalyticsMouseEntered

    private void lblAnalyticsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnalyticsMouseExited
        lblAnalytics.setFont(normalFont);
        repaint();
    }//GEN-LAST:event_lblAnalyticsMouseExited

    private void lblLClassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLClassMousePressed
        ListItemChoose = "panClass";
        frame = this;
        fillPanClass();
        setTittle();
        changePan();
    }//GEN-LAST:event_lblLClassMousePressed

    private void lblLTopicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLTopicMousePressed
        ListItemChoose = "panTopic";
        frame = this;
        fillPanTopic();
        setTittle();
        changePan();
    }//GEN-LAST:event_lblLTopicMousePressed

    private void lblLExamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLExamMousePressed
        ListItemChoose = "panExam";
        frame = this;
        fillPanExam();
        setTittle();
        changePan();
    }//GEN-LAST:event_lblLExamMousePressed

    private void lblAnalyticsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnalyticsMousePressed
        ListItemChoose = "panAnalytics";
        frame = this;
        fillPanAnalytics();
        setTittle();
        changePan();
    }//GEN-LAST:event_lblAnalyticsMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        timeThread.start();
        BigLoader loader = new BigLoader(ParentFrame, true);
        loader.setInfor("/UI/Image/Circle.gif", Lang.getString("Loading"));
        loader.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override public void windowOpened(java.awt.event.WindowEvent evt) {
                new Thread() { @Override public void run() {
                    arrLop = LDAO.selectAllByGV(CurrentID);
                    arrDeThi = DTDAO.selectAllByGV(CurrentID);
                    arrBuoiThi = BTDAO.selectAllByGV(CurrentID);
                    loader.dispose();
                }}.start();
            }});
        loader.setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    private void icoAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoAccountMouseEntered
        icoAccount.setPic("src/UI/Image/User1.png");
        repaint();
    }//GEN-LAST:event_icoAccountMouseEntered

    private void icoAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoAccountMouseExited
        icoAccount.setPic("src/UI/Image/User.png");
        repaint();
    }//GEN-LAST:event_icoAccountMouseExited

    private void icoAccountMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoAccountMousePressed
        new Account(this, true).setVisible(true);
    }//GEN-LAST:event_icoAccountMousePressed
    
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }
    private boolean showList = true;
    private String ListItemChoose = "Dashboard";
    private final GradientColor c2 = new GradientColor(new Color(72, 69, 84), new Color(173, 169, 187));
            //new GradientColor(new Color(181, 137, 214), new Color(0, 204, 255));   //color of child pan
    private final GradientColor c3 = new GradientColor(new Color(181, 137, 214), new Color(0, 204, 255));
            //new GradientColor(new Color(89,92,255), new Color(198,248,255));       //color of hover child pan
            //new GradientColor(new Color(45, 150, 248), new Color(161, 147, 255));
   
    private final Font normalFont = new Font("Tahoma", 1, 28), bigFont = new Font("Tahoma", 1, 35);
    
    private final Thread timeThread = new Thread() { 
        @Override public void run() {
            while(true){
                Date now = new Date();
                String time = new SimpleDateFormat("HH:mm:ss").format(now);
                String day  = new SimpleDateFormat("dd/MM/yyyy").format(now);
                lblTime.setText(time); lblDay.setText(day);
        }}};
    private Frame frame = this;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.AnLa.UI.ImagePanel icoAccount;
    private com.AnLa.UI.ImagePanel icoAnalytics;
    private com.AnLa.UI.ImagePanel icoClass;
    private com.AnLa.UI.ImagePanel icoClose;
    private com.AnLa.UI.ImagePanel icoExam;
    private com.AnLa.UI.ImagePanel icoLogo;
    private com.AnLa.UI.ImagePanel icoSettings;
    private com.AnLa.UI.ImagePanel icoShowList;
    private com.AnLa.UI.ImagePanel icoTopic;
    private com.AnLa.UI.AvatarPanel imgGV;
    private javax.swing.JLabel lblAnalytics;
    private javax.swing.JLabel lblDay;
    private javax.swing.JLabel lblEOA;
    private javax.swing.JLabel lblLClass;
    private javax.swing.JLabel lblLExam;
    private javax.swing.JLabel lblLTopic;
    private javax.swing.JLabel lblNameGV;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTittle;
    private javax.swing.JLabel lblVersion;
    private com.k33ptoo.components.KGradientPanel pan1;
    private com.k33ptoo.components.KGradientPanel pan2;
    private com.k33ptoo.components.KGradientPanel pan3;
    private com.k33ptoo.components.KGradientPanel pan4;
    private com.k33ptoo.components.KGradientPanel panAnalytics;
    private javax.swing.JPanel panBackground;
    private com.k33ptoo.components.KGradientPanel panChild;
    private com.k33ptoo.components.KGradientPanel panClass;
    private com.k33ptoo.components.KGradientPanel panExam;
    private com.k33ptoo.components.KGradientPanel panGV;
    private com.k33ptoo.components.KGradientPanel panTopic;
    private javax.swing.JScrollPane scrPan;
    private javax.swing.JPanel temp;
    // End of variables declaration//GEN-END:variables

    private void setMode()  {
        Mode.setModeComponent(panBackground);   
        Mode.setModeComponent(icoClose);
        Mode.setModeComponent(lblTittle);
        Mode.setModeComponent(scrPan.getVerticalScrollBar());
    }
    private void setTittle(){
        lblTittle.setText(Lang.getString(ListItemChoose));
        Mode.setModeComponent(scrPan.getViewport().getView());
    }
    private void changePan(){
        GradientColor cClass = c2, cTopic = c2, cExam = c2, cAnalytics = c2;
        switch(ListItemChoose){
            case "panClass" ->      cClass = c3;
            case "panTopic" ->      cTopic = c3;
            case "panExam" ->       cExam = c3;
            case "panAnalytics" ->  cAnalytics = c3;
        }
        
        icoClass.setBackground(showList ? cClass.getStartColor(): BLIND);
        icoTopic.setBackground(showList ? cTopic.getStartColor(): BLIND);
        icoExam.setBackground(showList ? cExam.getStartColor(): BLIND);
        icoAnalytics.setBackground(showList ? cAnalytics.getStartColor(): BLIND);
        
        switch(ListItemChoose){
            case "panClass" ->      icoClass.setBackground(cClass.getStartColor());
            case "panTopic" ->      icoTopic.setBackground(cTopic.getStartColor());
            case "panExam" ->       icoExam.setBackground(cExam.getStartColor());
            case "panAnalytics" ->  icoAnalytics.setBackground(cAnalytics.getStartColor());
        }
        
        pan1.setkStartColor(cClass.getStartColor());                pan1.setkEndColor(cClass.getEndColor());
        pan2.setkStartColor(cTopic.getStartColor());                pan2.setkEndColor(cTopic.getEndColor());
        pan3.setkStartColor(cExam.getStartColor());                 pan3.setkEndColor(cExam.getEndColor());
        pan4.setkStartColor(cAnalytics.getStartColor());            pan4.setkEndColor(cAnalytics.getEndColor());
        
        panClass.setkStartColor(cClass.getStartColor());            panClass.setkEndColor(cClass.getEndColor());
        panTopic.setkStartColor(cTopic.getStartColor());            panTopic.setkEndColor(cTopic.getEndColor());
        panExam.setkStartColor(cExam.getStartColor());              panExam.setkEndColor(cExam.getEndColor());
        panAnalytics.setkStartColor(cAnalytics.getStartColor());    panAnalytics.setkEndColor(cAnalytics.getEndColor());
        repaint();
    }
    
    private void fillPanClass() {
        temp.removeAll();
        scrPan.setViewportView(temp);
        temp.setLayout(new java.awt.GridLayout(-1, temp.getSize().width/240));
        
        for (Lop lop : arrLop) {
            panClass pan = new panClass();
            pan.lblClass.setText(lop.getName());
            pan.lblSV.setText(SVDAO.selectAllByLop(lop.getIDLop()).size() + " " + Lang.getString("SV"));
            pan.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override public void mousePressed(java.awt.event.MouseEvent evt) {
                    for(BuoiThi buoithi : arrBuoiThi){
                        if(buoithi.getIDLop().equals(lop.getIDLop())){
                            WMessage(ParentFrame, Lang.getString("AccessDenied").replaceFirst("X", Lang.getString("Class")), Lang.getString("Notifi"), WARNING_MESSAGE);
                            return;
                        }
                    }
                    formClass from = new formClass(frame, true);
                    from.setLop(lop);
                    from.fillListSV();
                    from.setVisible(true);
                }
            });
            temp.add(pan);
        }
        
        panPlus panplus = new panPlus();
        panplus.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override public void mousePressed(java.awt.event.MouseEvent evt) {
                formClass from = new formClass(frame, true);
                Lop lop = new Lop(System.currentTimeMillis(), "", 0);
                LDAO.InsertGVL(lop, CurrentID);
                from.setLop(lop);
                from.setVisible(true);
            }});
        temp.add(panplus);
    }
    private void fillPanTopic(){
        temp.removeAll();
        scrPan.setViewportView(temp);
        temp.setLayout(new java.awt.GridLayout(-1, temp.getSize().width/240));
        
        for (DeThi dethi : arrDeThi) {
            panTopic pan = new panTopic();
            pan.lblName.setText(dethi.getName());
            pan.lblTotal.setText(dethi.getTotal() + " " + Lang.getString("Sen"));
            pan.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override public void mousePressed(java.awt.event.MouseEvent evt) {
                    for(BuoiThi buoithi : arrBuoiThi){
                        if(buoithi.getIDDeThi().equals(dethi.getIDDeThi())){
                            WMessage(ParentFrame, Lang.getString("AccessDenied").replaceFirst("X", Lang.getString("Topic")), Lang.getString("Notifi"), WARNING_MESSAGE);
                            return;
                        }
                    }
                    formTopic from = new formTopic(frame, true);
                    from.setDeThi(dethi);
                    from.setVisible(true);
                }
            });
            temp.add(pan);
        }
        
        panPlus panplus = new panPlus();
        panplus.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override public void mousePressed(java.awt.event.MouseEvent evt) {
                formTopic from = new formTopic(frame, true);
                DeThi dethi = new DeThi(System.currentTimeMillis(), 0, "", CurrentID);
                DTDAO.Insert(dethi);
                from.setDeThi(dethi);
                from.setVisible(true);
            }});
        
        temp.add(panplus);
    }
    private SimpleDateFormat Formater = new SimpleDateFormat("dd/MM/yyyy");
    private void fillPanExam() {
        temp.removeAll();
        scrPan.setViewportView(temp);
        temp.setLayout(new java.awt.GridLayout(-1, temp.getSize().width/240));
        
        for (BuoiThi buoithi : arrBuoiThi) {
            panExam pan = new panExam();
            pan.lblEXam.setText(buoithi.getName());
            pan.lblStart.setText(Formater.format(buoithi.getStart()));
            pan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            pan.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override public void mousePressed(java.awt.event.MouseEvent evt) {
                    formExam from = new formExam(frame, true);
                    from.setBuoiThi(buoithi);
                    from.setVisible(true);
                }
            });
            temp.add(pan);
        }
        
        panPlus panplus = new panPlus();
        panplus.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override public void mousePressed(java.awt.event.MouseEvent evt) {
                formExam from = new formExam(frame, true);
                BuoiThi buoithi = new BuoiThi();
                buoithi.setIDBuoiThi(System.currentTimeMillis());
                buoithi.setIDGiangVien(CurrentID);
                buoithi.setStart(new Date());
                BTDAO.Insert(buoithi);
                from.setBuoiThi(buoithi);
                from.setVisible(true);
            }});
        
        temp.add(panplus);
    }
    private void fillPanAnalytics() {
        temp.removeAll();
        scrPan.setViewportView(temp);
        temp.setLayout(new java.awt.GridLayout(-1, temp.getSize().width/240));
        
        int NumOnline = 0;
        for(BuoiThi buoithi : arrBuoiThi) {
            final ArrayList<BaoCao> arrBaoCao = BCDAO.selectAllById(buoithi, CurrentID);
            for(BaoCao bc : arrBaoCao) if(bc.getStatus()) NumOnline++;
            panAnalytics pan = new panAnalytics();
            pan.lblEXam.setText(buoithi.getName());
            pan.lblOnline.setText(NumOnline + " " + Lang.getString("Online"));
            pan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            pan.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override public void mousePressed(java.awt.event.MouseEvent evt) {
                    formAnalytics from = new formAnalytics(frame, true);
                    from.setAnalytics(arrBaoCao, buoithi);
                    from.setVisible(true);
                }
            });
            temp.add(pan);
        }
    }
}