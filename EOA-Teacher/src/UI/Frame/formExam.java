package UI.Frame;
// Make By Bình An || AnLaVN || KatoVN

import static Controller.DatabaseData.BTDAO;
import static Controller.LocalData.CurrentID;
import static Controller.LocalData.Lang;
import static Controller.LocalData.ParentFrame;
import static Controller.LocalData.TTCOLOR;
import static Controller.LocalData.U_TEXT;
import static Controller.LocalData.arrBuoiThi;
import static Controller.LocalData.arrDeThi;
import static Controller.LocalData.arrLop;
import static Controller.LocalData.onChange;
import CustomComponent.DateChooser;
import CustomComponent.TimePicker;
import ObjectClass.BuoiThi;
import ObjectClass.DeThi;
import ObjectClass.Lop;
import com.AnLa.FILE.Log;
import com.AnLa.UI.Mode;
import static com.AnLa.UI.Mode.WConfirm;
import static com.AnLa.UI.Mode.WMessage;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.YES_OPTION;

public class formExam extends javax.swing.JDialog {

    public formExam(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try { setIconImage(ImageIO.read(getClass().getResource("/UI/Image/Logo.png"))); } 
        catch (IOException ex) {Log.add("!!! Error try to set Icon for frame. !!!");}
        Mode.setModeComponent(Background);
        Mode.setModeComponent(panExam);     Mode.setModeComponent(lblExam);     Mode.setModeComponent(txtExam);
        Mode.setModeComponent(icoSave);     Mode.setModeComponent(icoDelete);
        Mode.setModeComponent(lblChooseStartTime);
        Mode.setModeComponent(lblChooseDay); 
        
        //set infor for combobox
        for(Lop lop : arrLop) cboClass.addItem(lop.getName());
        for(DeThi dethi : arrDeThi) cboTopic.addItem(dethi.getName());
        cboTime.setModel(new javax.swing.DefaultComboBoxModel(new Object[]{15,45,60,90,120,180}));
        dateChooser.setTextRefernceLabel(lblChooseDay);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        panExam = new javax.swing.JPanel();
        txtExam = new javax.swing.JTextField();
        lblExam = new javax.swing.JLabel();
        icoSave = new com.AnLa.UI.ImagePanel();
        icoDelete = new com.AnLa.UI.ImagePanel();
        lblClass = new javax.swing.JLabel();
        cboClass = new CustomComponent.ComboBoxSuggestion();
        lblTopic = new javax.swing.JLabel();
        cboTopic = new CustomComponent.ComboBoxSuggestion();
        lblTime = new javax.swing.JLabel();
        cboTime = new CustomComponent.ComboBoxSuggestion();
        lblDelay = new javax.swing.JLabel();
        cboDelay = new CustomComponent.ComboBoxSuggestion();
        lblDay = new javax.swing.JLabel();
        lblChooseDay = new javax.swing.JLabel();
        lblStartTime = new javax.swing.JLabel();
        lblChooseStartTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle(Lang.getString("Exam"));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panExam.setBackground(new java.awt.Color(153, 255, 153));
        panExam.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, U_TEXT));
        panExam.setPreferredSize(new java.awt.Dimension(602, 70));

        txtExam.setFont(CustomFont);
        txtExam.setBorder(null);
        txtExam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtExamKeyReleased(evt);
            }
        });

        lblExam.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        lblExam.setText(Lang.getString("Exam") + ":");

        javax.swing.GroupLayout panExamLayout = new javax.swing.GroupLayout(panExam);
        panExam.setLayout(panExamLayout);
        panExamLayout.setHorizontalGroup(
            panExamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panExamLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblExam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtExam, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE))
        );
        panExamLayout.setVerticalGroup(
            panExamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblExam, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
            .addComponent(txtExam)
        );

        icoSave.setBackground(new java.awt.Color(153, 255, 255));
        icoSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icoSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icoSaveMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoSaveMousePressed(evt);
            }
        });

        icoSave.setPic("src/UI/Image/Save.png");

        javax.swing.GroupLayout icoSaveLayout = new javax.swing.GroupLayout(icoSave);
        icoSave.setLayout(icoSaveLayout);
        icoSaveLayout.setHorizontalGroup(
            icoSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );
        icoSaveLayout.setVerticalGroup(
            icoSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        icoDelete.setBackground(new java.awt.Color(153, 255, 255));
        icoDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icoDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icoDeleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoDeleteMousePressed(evt);
            }
        });

        icoDelete.setPic("src/UI/Image/Remove.png");

        javax.swing.GroupLayout icoDeleteLayout = new javax.swing.GroupLayout(icoDelete);
        icoDelete.setLayout(icoDeleteLayout);
        icoDeleteLayout.setHorizontalGroup(
            icoDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );
        icoDeleteLayout.setVerticalGroup(
            icoDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        lblClass.setFont(CustomFont);
        lblClass.setForeground(TTCOLOR);
        lblClass.setText(Lang.getString("Class")+": ");

        cboClass.setFont(CustomFont);

        lblTopic.setFont(CustomFont);
        lblTopic.setForeground(TTCOLOR);
        lblTopic.setText(Lang.getString("Topic"));

        cboTopic.setFont(CustomFont);

        lblTime.setFont(CustomFont);
        lblTime.setForeground(TTCOLOR);
        lblTime.setText(Lang.getString("Time"));

        cboTime.setFont(CustomFont);
        cboTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTimeActionPerformed(evt);
            }
        });

        lblDelay.setFont(CustomFont);
        lblDelay.setForeground(TTCOLOR);
        lblDelay.setText(Lang.getString("Delay"));

        cboDelay.setFont(CustomFont);
        cboDelay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDelayActionPerformed(evt);
            }
        });

        lblDay.setFont(CustomFont);
        lblDay.setForeground(TTCOLOR);
        lblDay.setText(Lang.getString("ExamDay"));

        lblChooseDay.setFont(CustomFont);
        lblChooseDay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChooseDay.setText("19/20/2022");
        lblChooseDay.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, BoderColor));
        lblChooseDay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblChooseDay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblChooseDayMousePressed(evt);
            }
        });

        lblStartTime.setFont(CustomFont);
        lblStartTime.setForeground(TTCOLOR);
        lblStartTime.setText(Lang.getString("ExamStartTime"));

        lblChooseStartTime.setFont(CustomFont);
        lblChooseStartTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChooseStartTime.setText("12:30");
        lblChooseStartTime.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, BoderColor));
        lblChooseStartTime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblChooseStartTime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblChooseStartTimeMousePressed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(panExam, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                        .addGap(50, 50, 50)
                        .addComponent(icoSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(icoDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cboClass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                                    .addComponent(cboTime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblChooseDay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                                    .addComponent(lblClass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(44, 44, 44)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboDelay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboTopic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTopic, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                                    .addComponent(lblDelay, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                                    .addComponent(lblChooseStartTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblStartTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panExam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(icoDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(icoSave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClass, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboClass, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDelay, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTime, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboDelay, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDay, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(lblStartTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChooseStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblChooseDay, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
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

    private void icoSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSaveMouseEntered
        icoSave.setPic("src/UI/Image/Save2.png");
    }//GEN-LAST:event_icoSaveMouseEntered

    private void icoSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSaveMouseExited
        icoSave.setPic("src/UI/Image/Save.png");
    }//GEN-LAST:event_icoSaveMouseExited

    private void icoSaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSaveMousePressed
        Update();
    }//GEN-LAST:event_icoSaveMousePressed

    private void icoDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoDeleteMouseEntered
        icoDelete.setPic("src/UI/Image/Remove2.png");
    }//GEN-LAST:event_icoDeleteMouseEntered

    private void icoDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoDeleteMouseExited
        icoDelete.setPic("src/UI/Image/Remove.png");
    }//GEN-LAST:event_icoDeleteMouseExited

    private void icoDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoDeleteMousePressed
        if(WConfirm(this, Lang.getString("ReExam"), Lang.getString("Notifi"), OK_CANCEL_OPTION, WARNING_MESSAGE) == YES_OPTION){
            BigLoader loader = new BigLoader(ParentFrame, true);
            loader.setInfor("/UI/Image/Bin.gif", Lang.getString("Deleting"));
            loader.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override public void windowOpened(java.awt.event.WindowEvent evt) {
                    new Thread() { @Override public void run() {
                        BTDAO.Delete(buoithi.getIDBuoiThi());
                        arrBuoiThi = BTDAO.selectAllByGV(CurrentID);
                        loader.dispose();
                        dispose();
                    }}.start();
                }});
            loader.setVisible(true);
        }
    }//GEN-LAST:event_icoDeleteMousePressed

    private void lblChooseDayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChooseDayMousePressed
        dateChooser.showPopup();
        onChange = false;
        setSaveIcon();
    }//GEN-LAST:event_lblChooseDayMousePressed

    private void lblChooseStartTimeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChooseStartTimeMousePressed
        timePicker.showPopup(this, 
                896+timePicker.getPreferredSize().width/2,//(getWidth() - timePicker.getPreferredSize().width) / 2, 
                252-timePicker.getPreferredSize().height/2);//(getHeight() - timePicker.getPreferredSize().height) / 2);
        onChange = false;
        setSaveIcon();
    }//GEN-LAST:event_lblChooseStartTimeMousePressed

    private void cboTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTimeActionPerformed
        cboDelay.removeAllItems();
        Double max = Double.valueOf(cboTime.getSelectedItem().toString())*0.2;
        max = max < 1 ? 1 : max;
        for(int i = 1 ; i <= max; i++) cboDelay.addItem(i);
        onChange = false;
        setSaveIcon();
    }//GEN-LAST:event_cboTimeActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(onChange && buoithi.getName() == null){
            BigLoader loader = new BigLoader(ParentFrame, true);
            loader.setInfor("/UI/Image/Bin.gif", Lang.getString("Deleting"));
            loader.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override public void windowOpened(java.awt.event.WindowEvent evt) {
                    new Thread() { @Override public void run() {
                        BTDAO.Delete(buoithi.getIDBuoiThi());
                        arrBuoiThi = BTDAO.selectAllByGV(CurrentID);
                        loader.dispose();
                        dispose();
                    }}.start();
                }});
            loader.setVisible(true);
        }else{ Update(); }
    }//GEN-LAST:event_formWindowClosing

    private void cboDelayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDelayActionPerformed
        onChange = false;
        setSaveIcon();
    }//GEN-LAST:event_cboDelayActionPerformed

    private void txtExamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExamKeyReleased
        onChange = false;
        setSaveIcon();
    }//GEN-LAST:event_txtExamKeyReleased
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                formExam dialog = new formExam(new javax.swing.JFrame(), true);
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
    
    private BuoiThi buoithi;
    private final Font CustomFont = new java.awt.Font("Courier New", 1, 30);
    private final Color BoderColor= new Color(206, 212, 218);//new Color(128, 189, 255);
    private final TimePicker timePicker = new TimePicker();
    private final DateChooser dateChooser = new DateChooser();
    private final SimpleDateFormat DateFomater = new SimpleDateFormat("dd/MM/yyyy kk:mm:ss"),
            DayFormater = new SimpleDateFormat("dd/MM/yyyy");
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private CustomComponent.ComboBoxSuggestion cboClass;
    private CustomComponent.ComboBoxSuggestion cboDelay;
    private CustomComponent.ComboBoxSuggestion cboTime;
    private CustomComponent.ComboBoxSuggestion cboTopic;
    private com.AnLa.UI.ImagePanel icoDelete;
    private com.AnLa.UI.ImagePanel icoSave;
    private javax.swing.JLabel lblChooseDay;
    private javax.swing.JLabel lblChooseStartTime;
    private javax.swing.JLabel lblClass;
    private javax.swing.JLabel lblDay;
    private javax.swing.JLabel lblDelay;
    private javax.swing.JLabel lblExam;
    private javax.swing.JLabel lblStartTime;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTopic;
    private javax.swing.JPanel panExam;
    private javax.swing.JTextField txtExam;
    // End of variables declaration//GEN-END:variables

    public void setBuoiThi(BuoiThi bt){
        this.buoithi = bt;
        txtExam.setText(buoithi.getName());
        if(!arrLop.isEmpty()){
            for(int i = 0 ; i < arrLop.size(); i++){
                if(arrLop.get(i).getIDLop().equals(this.buoithi.getIDLop()))        cboClass.setSelectedIndex(i);
            }
        }
        if(!arrDeThi.isEmpty()){
            for(int i = 0 ; i < arrDeThi.size(); i++){
                if(arrDeThi.get(i).getIDDeThi().equals(this.buoithi.getIDDeThi()))   cboTopic.setSelectedIndex(i);
            }
        }
        cboTime.setSelectedItem(buoithi.getTime());
        cboDelay.setSelectedItem(buoithi.getDelay());
        
        timePicker.setDisplayTextLabel(lblChooseStartTime);
        timePicker.setSelectedTime(buoithi.getStart());
        
        lblChooseDay.setText(DayFormater.format(buoithi.getStart()));
        
        onChange = true;
        setSaveIcon();
    }
    private void setSaveIcon(){
        icoSave.setPic(onChange ? "src/UI/Image/Save3.png" : "src/UI/Image/Save.png");
    }
    private void Update(){
        BigLoader loader = new BigLoader(ParentFrame, true);
        loader.setInfor("/UI/Image/Circle.gif", Lang.getString("Loading"));
        loader.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override public void windowOpened(java.awt.event.WindowEvent evt) {
                new Thread() { @Override public void run() {
                    if(cboClass.getSelectedIndex() <= -1 || cboTopic.getSelectedIndex() <= -1 || cboTime.getSelectedIndex() <= -1) {
                        loader.dispose();
                        WMessage(ParentFrame, Lang.getString("EmExam"), Lang.getString("Notifi"), WARNING_MESSAGE);
                        return;
                    }
                    try {
                        BTDAO.DeleteBTL(buoithi);
                        String time = lblChooseStartTime.getText();
                        int hh = Integer.parseInt(time.substring(0, 2));
                        time = (time.contains("PM") ? String.valueOf(hh+12) : String.valueOf(hh)) + time.substring(2,5) + ":00";
                        buoithi.setName(txtExam.getText().trim());
                        buoithi.setIDLop(arrLop.get(cboClass.getSelectedIndex()).getIDLop());
                        buoithi.setIDDeThi(arrDeThi.get(cboTopic.getSelectedIndex()).getIDDeThi());
                        buoithi.setTime(Integer.parseInt(cboTime.getSelectedItem().toString()));
                        buoithi.setDelay(Integer.parseInt(cboDelay.getSelectedItem().toString()));
                        buoithi.setStart(DateFomater.parse(lblChooseDay.getText().replaceAll("-", "/")+" "+time));
                        BTDAO.Update(buoithi);
                        BTDAO.InsertBTL(buoithi);
                        onChange = true;
                    } catch (ParseException ex) {
                        Mode.WMessage(ParentFrame, Lang.getString("InDay"), Lang.getString("Notifi"), WARNING_MESSAGE);
                    }
                    arrBuoiThi = BTDAO.selectAllByGV(CurrentID);
                    loader.dispose();
                    dispose();
                }}.start();
            }});
        loader.setVisible(true);
    }
}