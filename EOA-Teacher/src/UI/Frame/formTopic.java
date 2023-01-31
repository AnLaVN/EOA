package UI.Frame;
// Make By Bình An || AnLaVN || KatoVN

import static Controller.DatabaseData.CHDAO;
import static Controller.DatabaseData.DTDAO;
import static Controller.LocalData.*;
import com.AnLa.UI.Mode;
import javax.swing.table.DefaultTableModel;
import CustomComponent.TableCustom;
import ObjectClass.CauHoi;
import ObjectClass.DeThi;
import com.AnLa.FILE.Log;
import static com.AnLa.UI.Mode.WConfirm;
import static com.AnLa.UI.Mode.WMessage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.KeyboardFocusManager;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;
import static javax.swing.JOptionPane.OK_OPTION;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;

public class formTopic extends javax.swing.JDialog {

    public formTopic(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        ParentComponent = this;
        initComponents();
        try { setIconImage(ImageIO.read(getClass().getResource("/UI/Image/Logo.png"))); } 
        catch (IOException ex) {Log.add("!!! Error try to set Icon for frame. !!!");}
        Mode.setModeComponent(Background);
        Mode.setModeComponent(icoReturn);       Mode.setModeComponent(lblTotalCH);
        Mode.setModeComponent(scrPanTable.getVerticalScrollBar());
        Mode.setModeComponent(icoDelete);       Mode.setModeComponent(icoSave);
        Mode.setModeComponent(panTopic);        Mode.setModeComponent(lblTopic);        Mode.setModeComponent(txtTopic);
        Mode.setModeComponent(panSearch);       Mode.setModeComponent(icoSearch);       Mode.setModeComponent(txtSearch);
        
        Mode.setModeComponent(panSentence);     Mode.setModeComponent(scrPanSentence);
        Mode.setModeComponent(lblIDSen);        Mode.setModeComponent(panChild);
        scrPanSentence.getVerticalScrollBar().setBackground(SenColor);
        txtSentence.setBackground(SenColor);    txtSentence.setForeground(TextColor);   txtSentence.setText(Lang.getString("ESen"));
        txtA.setBackground(SenColor);           txtA.setForeground(TextColor);          txtA.setText(Lang.getString("EAns"));
        txtB.setBackground(SenColor);           txtB.setForeground(TextColor);          txtB.setText(Lang.getString("EAns"));
        txtC.setBackground(SenColor);           txtC.setForeground(TextColor);          txtC.setText(Lang.getString("EAns"));
        txtD.setBackground(SenColor);           txtD.setForeground(TextColor);          txtD.setText(Lang.getString("EAns"));
        Mode.setModeComponent(icoSaveAdd);      Mode.setModeComponent(icoRemove);       Mode.setModeComponent(icoArrow);
        Mode.setModeComponent(icoNew);          Mode.setModeComponent(icoBack);         Mode.setModeComponent(icoNext);         
        Mode.setModeComponent(panMark);
        Mode.setModeComponent(lblKnow);         Mode.setModeComponent(lblUnde);
        Mode.setModeComponent(lblMani);         Mode.setModeComponent(lblHigh);
        Mode.setModeComponent(lblNum);          Mode.setModeComponent(icoArrow2);
        Mode.setModeComponent(lblNumKnow);      Mode.setModeComponent(lblNumUnde);
        Mode.setModeComponent(lblNumMani);      Mode.setModeComponent(lblNumHigh);
        
        TableCustom.apply(scrPanTable, TableCustom.TableType.MULTI_LINE);
        panChild.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        icoReturn = new com.AnLa.UI.ImagePanel();
        panTopic = new javax.swing.JPanel();
        txtTopic = new javax.swing.JTextField();
        lblTopic = new javax.swing.JLabel();
        panSearch = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        icoSearch = new com.AnLa.UI.ImagePanel();
        lblTotalCH = new javax.swing.JLabel();
        icoDelete = new com.AnLa.UI.ImagePanel();
        icoSave = new com.AnLa.UI.ImagePanel();
        panSentence = new com.k33ptoo.components.KGradientPanel();
        lblIDSen = new javax.swing.JLabel();
        panChild = new javax.swing.JPanel();
        scrPanSentence = new javax.swing.JScrollPane();
        txtSentence = new javax.swing.JTextArea();
        panA = new com.k33ptoo.components.KGradientPanel();
        txtA = new javax.swing.JTextField();
        chkA = new javax.swing.JCheckBox();
        panB = new com.k33ptoo.components.KGradientPanel();
        txtB = new javax.swing.JTextField();
        chkB = new javax.swing.JCheckBox();
        panC = new com.k33ptoo.components.KGradientPanel();
        txtC = new javax.swing.JTextField();
        chkC = new javax.swing.JCheckBox();
        panD = new com.k33ptoo.components.KGradientPanel();
        txtD = new javax.swing.JTextField();
        chkD = new javax.swing.JCheckBox();
        panMark = new com.k33ptoo.components.KGradientPanel();
        lblKnow = new javax.swing.JLabel();
        cboKnow = new CustomComponent.ComboBoxSuggestion();
        lblUnde = new javax.swing.JLabel();
        cboUnde = new CustomComponent.ComboBoxSuggestion();
        lblMani = new javax.swing.JLabel();
        cboMani = new CustomComponent.ComboBoxSuggestion();
        lblHigh = new javax.swing.JLabel();
        cboHigh = new CustomComponent.ComboBoxSuggestion();
        sldNum = new CustomComponent.JsliderCustom();
        lblNum = new javax.swing.JLabel();
        lblNumKnow = new javax.swing.JLabel();
        lblNumUnde = new javax.swing.JLabel();
        lblNumMani = new javax.swing.JLabel();
        lblNumHigh = new javax.swing.JLabel();
        icoArrow2 = new com.AnLa.UI.ImagePanel();
        icoNew = new com.AnLa.UI.ImagePanel();
        icoSaveAdd = new com.AnLa.UI.ImagePanel();
        icoBack = new com.AnLa.UI.ImagePanel();
        icoNext = new com.AnLa.UI.ImagePanel();
        icoRemove = new com.AnLa.UI.ImagePanel();
        cboLevel = new CustomComponent.ComboBoxSuggestion();
        icoArrow = new com.AnLa.UI.ImagePanel();
        scrButtonTable = new CustomComponent.TableScrollButton();
        scrPanTable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Background.setVerifyInputWhenFocusTarget(false);

        icoReturn.setBackground(new java.awt.Color(153, 255, 255));
        icoReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icoReturnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icoReturnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoReturnMousePressed(evt);
            }
        });

        icoReturn.setPic("src/UI/Image/Return.png");

        javax.swing.GroupLayout icoReturnLayout = new javax.swing.GroupLayout(icoReturn);
        icoReturn.setLayout(icoReturnLayout);
        icoReturnLayout.setHorizontalGroup(
            icoReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        icoReturnLayout.setVerticalGroup(
            icoReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        panTopic.setBackground(new java.awt.Color(153, 255, 153));
        panTopic.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, U_TEXT));

        txtTopic.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        txtTopic.setBorder(null);
        txtTopic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                onChange = false;
                setSaveIcon();
            }
        });

        lblTopic.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        lblTopic.setText(Lang.getString("Topic") + ":");

        javax.swing.GroupLayout panTopicLayout = new javax.swing.GroupLayout(panTopic);
        panTopic.setLayout(panTopicLayout);
        panTopicLayout.setHorizontalGroup(
            panTopicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTopicLayout.createSequentialGroup()
                .addComponent(lblTopic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTopic, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))
        );
        panTopicLayout.setVerticalGroup(
            panTopicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTopic, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
            .addComponent(lblTopic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panSearch.setBackground(new java.awt.Color(153, 255, 153));
        panSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, U_TEXT));

        txtSearch.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        txtSearch.setBorder(null);
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        icoSearch.setBackground(new java.awt.Color(153, 255, 255));

        icoSearch.setPic("src/UI/Image/Search.png");

        javax.swing.GroupLayout icoSearchLayout = new javax.swing.GroupLayout(icoSearch);
        icoSearch.setLayout(icoSearchLayout);
        icoSearchLayout.setHorizontalGroup(
            icoSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );
        icoSearchLayout.setVerticalGroup(
            icoSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panSearchLayout = new javax.swing.GroupLayout(panSearch);
        panSearch.setLayout(panSearchLayout);
        panSearchLayout.setHorizontalGroup(
            panSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panSearchLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(icoSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        panSearchLayout.setVerticalGroup(
            panSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSearch)
            .addGroup(panSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icoSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTotalCH.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        lblTotalCH.setText("Total: n Sentences");

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

        panSentence.setkBorderRadius(30);
        panSentence.setkEndColor(c1.getEndColor());
        panSentence.setkFillBackground(false);
        panSentence.setkStartColor(c1.getStartColor());

        lblIDSen.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        lblIDSen.setText("ID");

        scrPanSentence.setBackground(BLIND);
        scrPanSentence.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, U_TEXT));
        scrPanSentence.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrPanSentence.setVerticalScrollBar(new com.AnLa.UI.ScrollBar());

        txtSentence.setColumns(20);
        txtSentence.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtSentence.setLineWrap(true);
        txtSentence.setRows(5);
        txtSentence.setWrapStyleWord(true);
        scrPanSentence.setViewportView(txtSentence);
        txtSentence.setNextFocusableComponent(txtA);

        txtSentence.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_TAB) {
                    evt.consume();
                    KeyboardFocusManager.getCurrentKeyboardFocusManager().focusNextComponent();
                    txtA.selectAll();
                }
            }
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblIDSen.setText(readDetail().getIDCauHoi());
                onChange = false;
                setSaveIcon();
            }
        });

        txtSentence.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (txtSentence.getText().equals(Lang.getString("ESen"))) {
                    txtSentence.setText("");
                }
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (txtSentence.getText().isEmpty()) {
                    txtSentence.setText(Lang.getString("ESen"));
                }
            }
        });

        panA.setBackground(BLIND);
        panA.setkBorderRadius(20);
        panA.setkEndColor(SenColor);
        panA.setkStartColor(SenColor);

        txtA.setFont(AnswerFont);
        txtA.setBorder(null);
        txtA.setNextFocusableComponent(txtB);

        txtA.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_TAB) {
                    evt.consume();
                    KeyboardFocusManager.getCurrentKeyboardFocusManager().focusNextComponent();
                    txtB.selectAll();
                }
            }
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblIDSen.setText(readDetail().getIDCauHoi());
                onChange = false;
                setSaveIcon();
            }
        });
        txtA.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (txtA.getText().equals(Lang.getString("EAns"))) {
                    txtA.setText("");
                }
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (txtA.getText().isEmpty()) {
                    txtA.setText(Lang.getString("EAns"));
                }
            }
        });

        chkA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkA.setFocusPainted(false);
        chkA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/CheckBoxNull.png"))); // NOI18N
        chkA.setRolloverEnabled(false);
        chkA.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/CheckBox.png"))); // NOI18N
        chkA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblIDSen.setText(readDetail().getIDCauHoi());
                onChange = false;
                setSaveIcon();
            }
        });

        javax.swing.GroupLayout panALayout = new javax.swing.GroupLayout(panA);
        panA.setLayout(panALayout);
        panALayout.setHorizontalGroup(
            panALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        panALayout.setVerticalGroup(
            panALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panALayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addComponent(chkA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panB.setBackground(BLIND);
        panB.setkBorderRadius(20);
        panB.setkEndColor(SenColor);
        panB.setkStartColor(SenColor);

        txtB.setFont(AnswerFont);
        txtB.setBorder(null);
        txtB.setNextFocusableComponent(txtC);

        txtB.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_TAB) {
                    evt.consume();
                    KeyboardFocusManager.getCurrentKeyboardFocusManager().focusNextComponent();
                    txtC.selectAll();
                }
            }
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblIDSen.setText(readDetail().getIDCauHoi());
                onChange = false;
                setSaveIcon();
            }
        });
        txtB.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (txtB.getText().equals(Lang.getString("EAns"))) {
                    txtB.setText("");
                }
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (txtB.getText().isEmpty()) {
                    txtB.setText(Lang.getString("EAns"));
                }
            }
        });

        chkB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkB.setFocusPainted(false);
        chkB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/CheckBoxNull.png"))); // NOI18N
        chkB.setRolloverEnabled(false);
        chkB.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/CheckBox.png"))); // NOI18N
        chkB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblIDSen.setText(readDetail().getIDCauHoi());
                onChange = false;
                setSaveIcon();
            }
        });

        javax.swing.GroupLayout panBLayout = new javax.swing.GroupLayout(panB);
        panB.setLayout(panBLayout);
        panBLayout.setHorizontalGroup(
            panBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        panBLayout.setVerticalGroup(
            panBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addComponent(chkB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panC.setBackground(BLIND);
        panC.setkBorderRadius(20);
        panC.setkEndColor(SenColor);
        panC.setkStartColor(SenColor);

        txtC.setFont(AnswerFont);
        txtC.setBorder(null);
        txtC.setNextFocusableComponent(txtD);

        txtC.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_TAB) {
                    evt.consume();
                    KeyboardFocusManager.getCurrentKeyboardFocusManager().focusNextComponent();
                    txtD.selectAll();
                }
            }
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblIDSen.setText(readDetail().getIDCauHoi());
                onChange = false;
                setSaveIcon();
            }
        });
        txtC.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (txtC.getText().equals(Lang.getString("EAns"))) {
                    txtC.setText("");
                }
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (txtC.getText().isEmpty()) {
                    txtC.setText(Lang.getString("EAns"));
                }
            }
        });

        chkC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkC.setFocusPainted(false);
        chkC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/CheckBoxNull.png"))); // NOI18N
        chkC.setRolloverEnabled(false);
        chkC.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/CheckBox.png"))); // NOI18N
        chkC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblIDSen.setText(readDetail().getIDCauHoi());
                onChange = false;
                setSaveIcon();
            }
        });

        javax.swing.GroupLayout panCLayout = new javax.swing.GroupLayout(panC);
        panC.setLayout(panCLayout);
        panCLayout.setHorizontalGroup(
            panCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        panCLayout.setVerticalGroup(
            panCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addComponent(chkC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panD.setBackground(BLIND);
        panD.setkBorderRadius(20);
        panD.setkEndColor(SenColor);
        panD.setkStartColor(SenColor);

        txtD.setFont(AnswerFont);
        txtD.setBorder(null);
        txtD.setNextFocusableComponent(cboLevel);

        txtD.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_TAB) {
                    evt.consume();
                    KeyboardFocusManager.getCurrentKeyboardFocusManager().focusNextComponent();
                }
            }
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblIDSen.setText(readDetail().getIDCauHoi());
                onChange = false;
                setSaveIcon();
            }
        });
        txtD.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (txtD.getText().equals(Lang.getString("EAns"))) {
                    txtD.setText("");
                }
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (txtD.getText().isEmpty()) {
                    txtD.setText(Lang.getString("EAns"));
                }
            }
        });

        chkD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkD.setFocusPainted(false);
        chkD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/CheckBoxNull.png"))); // NOI18N
        chkD.setRolloverEnabled(false);
        chkD.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/CheckBox.png"))); // NOI18N
        chkD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblIDSen.setText(readDetail().getIDCauHoi());
                onChange = false;
                setSaveIcon();
            }
        });

        javax.swing.GroupLayout panDLayout = new javax.swing.GroupLayout(panD);
        panD.setLayout(panDLayout);
        panDLayout.setHorizontalGroup(
            panDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtD, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        panDLayout.setVerticalGroup(
            panDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtD, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addComponent(chkD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panMark.setkBorderRadius(25);
        panMark.setkEndColor(c1.getEndColor());
        panMark.setkFillBackground(false);
        panMark.setkStartColor(c1.getStartColor());
        panMark.setPreferredSize(new java.awt.Dimension(480, 505));

        lblKnow.setFont(TextFont);
        lblKnow.setText("Nhận Biết: X câu");

        cboKnow.setFont(TextFont);
        cboKnow.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboKnowItemStateChanged(evt);
            }
        });
        cboKnow.setNextFocusableComponent(cboUnde);

        cboKnow.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_TAB) {
                    evt.consume();
                    KeyboardFocusManager.getCurrentKeyboardFocusManager().focusNextComponent();
                }
            }
        });

        lblUnde.setFont(TextFont);
        lblUnde.setText("Thông Hiểu: X câu");

        cboUnde.setFont(TextFont);
        cboUnde.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboUndeItemStateChanged(evt);
            }
        });
        cboUnde.setNextFocusableComponent(cboMani);

        cboUnde.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_TAB) {
                    evt.consume();
                    KeyboardFocusManager.getCurrentKeyboardFocusManager().focusNextComponent();
                }
            }
        });

        lblMani.setFont(TextFont);
        lblMani.setText("Vận Dụng: X câu");

        cboMani.setFont(TextFont);
        cboMani.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboManiItemStateChanged(evt);
            }
        });
        cboMani.setNextFocusableComponent(cboHigh);

        cboMani.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_TAB) {
                    evt.consume();
                    KeyboardFocusManager.getCurrentKeyboardFocusManager().focusNextComponent();
                }
            }
        });

        lblHigh.setFont(TextFont);
        lblHigh.setText("Vận Dụng Cao: X câu");

        cboHigh.setFont(TextFont);
        cboHigh.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboHighItemStateChanged(evt);
            }
        });
        cboHigh.setNextFocusableComponent(cboKnow);

        cboHigh.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_TAB) {
                    evt.consume();
                    KeyboardFocusManager.getCurrentKeyboardFocusManager().focusNextComponent();

                }
            }
        });

        sldNum.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldNumStateChanged(evt);
            }
        });

        lblNum.setFont(TextFont);
        lblNum.setText("Số câu thi: X câu");

        lblNumKnow.setFont(TextFont);
        lblNumKnow.setText("Nhận Biết: X câu");

        lblNumUnde.setFont(TextFont);
        lblNumUnde.setText("Thông Hiểu: X câu");

        lblNumMani.setFont(TextFont);
        lblNumMani.setText("Vận Dụng: X câu");

        lblNumHigh.setFont(TextFont);
        lblNumHigh.setText("Vận Dụng Cao: X câu");

        javax.swing.GroupLayout panMarkLayout = new javax.swing.GroupLayout(panMark);
        panMark.setLayout(panMarkLayout);
        panMarkLayout.setHorizontalGroup(
            panMarkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMarkLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panMarkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNum, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panMarkLayout.createSequentialGroup()
                        .addGroup(panMarkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHigh, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(lblUnde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblKnow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(panMarkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboKnow, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboUnde, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboMani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboHigh, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(sldNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNumKnow, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumUnde, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumMani, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumHigh, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        panMarkLayout.setVerticalGroup(
            panMarkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMarkLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panMarkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKnow, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboKnow, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panMarkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUnde, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboUnde, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panMarkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMani, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboMani, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panMarkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHigh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboHigh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(sldNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblNum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblNumKnow, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblNumUnde, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblNumMani, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblNumHigh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        icoArrow2.setBackground(new java.awt.Color(153, 255, 255));
        icoArrow2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoArrow2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoArrow2MousePressed(evt);
            }
        });

        icoArrow2.setPic("src/UI/Image/Right.png");

        javax.swing.GroupLayout icoArrow2Layout = new javax.swing.GroupLayout(icoArrow2);
        icoArrow2.setLayout(icoArrow2Layout);
        icoArrow2Layout.setHorizontalGroup(
            icoArrow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoArrow2Layout.setVerticalGroup(
            icoArrow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        icoNew.setBackground(new java.awt.Color(153, 255, 255));
        icoNew.setToolTipText(Lang.getString("AddSen"));
        icoNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icoNewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icoNewMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoNewMousePressed(evt);
            }
        });

        icoNew.setPic("src/UI/Image/Plus2.png");

        javax.swing.GroupLayout icoNewLayout = new javax.swing.GroupLayout(icoNew);
        icoNew.setLayout(icoNewLayout);
        icoNewLayout.setHorizontalGroup(
            icoNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoNewLayout.setVerticalGroup(
            icoNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        icoSaveAdd.setBackground(new java.awt.Color(153, 255, 255));
        icoSaveAdd.setToolTipText(Lang.getString("SaveSen"));
        icoSaveAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoSaveAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icoSaveAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icoSaveAddMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoSaveAddMousePressed(evt);
            }
        });

        icoSaveAdd.setPic("src/UI/Image/Check.png");

        javax.swing.GroupLayout icoSaveAddLayout = new javax.swing.GroupLayout(icoSaveAdd);
        icoSaveAdd.setLayout(icoSaveAddLayout);
        icoSaveAddLayout.setHorizontalGroup(
            icoSaveAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoSaveAddLayout.setVerticalGroup(
            icoSaveAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        icoBack.setBackground(new java.awt.Color(153, 255, 255));
        icoBack.setToolTipText(Lang.getString("BackSen"));
        icoBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icoBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icoBackMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoBackMousePressed(evt);
            }
        });

        icoBack.setPic("src/UI/Image/Back2.png");

        javax.swing.GroupLayout icoBackLayout = new javax.swing.GroupLayout(icoBack);
        icoBack.setLayout(icoBackLayout);
        icoBackLayout.setHorizontalGroup(
            icoBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoBackLayout.setVerticalGroup(
            icoBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        icoNext.setBackground(new java.awt.Color(153, 255, 255));
        icoNext.setToolTipText(Lang.getString("NextSen"));
        icoNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icoNextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icoNextMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoNextMousePressed(evt);
            }
        });

        icoNext.setPic("src/UI/Image/Next2.png");

        javax.swing.GroupLayout icoNextLayout = new javax.swing.GroupLayout(icoNext);
        icoNext.setLayout(icoNextLayout);
        icoNextLayout.setHorizontalGroup(
            icoNextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoNextLayout.setVerticalGroup(
            icoNextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        icoRemove.setBackground(new java.awt.Color(153, 255, 255));
        icoRemove.setToolTipText(Lang.getString("DeleteSen"));
        icoRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icoRemoveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icoRemoveMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoRemoveMousePressed(evt);
            }
        });

        icoRemove.setPic("src/UI/Image/Remove.png");

        javax.swing.GroupLayout icoRemoveLayout = new javax.swing.GroupLayout(icoRemove);
        icoRemove.setLayout(icoRemoveLayout);
        icoRemoveLayout.setHorizontalGroup(
            icoRemoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoRemoveLayout.setVerticalGroup(
            icoRemoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panChildLayout = new javax.swing.GroupLayout(panChild);
        panChild.setLayout(panChildLayout);
        panChildLayout.setHorizontalGroup(
            panChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panChildLayout.createSequentialGroup()
                .addGroup(panChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrPanSentence)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panChildLayout.createSequentialGroup()
                        .addGroup(panChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(panChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(15, 15, 15)
                .addGroup(panChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icoArrow2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(icoNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(icoSaveAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(icoBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(icoNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(icoRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(panMark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panChildLayout.setVerticalGroup(
            panChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panChildLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panChildLayout.createSequentialGroup()
                        .addComponent(icoArrow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(icoNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(icoSaveAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(icoBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(icoNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(icoRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panMark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panChildLayout.createSequentialGroup()
                        .addComponent(scrPanSentence, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(panChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(panChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        cboLevel.setModel(new javax.swing.DefaultComboBoxModel(new String[] {Know, Unde, Mani, High}));
        cboLevel.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        cboLevel.setNextFocusableComponent(txtSentence);

        cboLevel.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_TAB) {
                    evt.consume();
                    KeyboardFocusManager.getCurrentKeyboardFocusManager().focusNextComponent();
                }
            }
        });
        cboLevel.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblIDSen.setText(readDetail().getIDCauHoi());
                setNumberOfSen();
                onChange = false;
                setSaveIcon();
            }
        });

        icoArrow.setBackground(new java.awt.Color(153, 255, 255));
        icoArrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoArrowMousePressed(evt);
            }
        });

        icoArrow.setPic("src/UI/Image/Down.png");

        javax.swing.GroupLayout icoArrowLayout = new javax.swing.GroupLayout(icoArrow);
        icoArrow.setLayout(icoArrowLayout);
        icoArrowLayout.setHorizontalGroup(
            icoArrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        icoArrowLayout.setVerticalGroup(
            icoArrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panSentenceLayout = new javax.swing.GroupLayout(panSentence);
        panSentence.setLayout(panSentenceLayout);
        panSentenceLayout.setHorizontalGroup(
            panSentenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panSentenceLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panSentenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panChild, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panSentenceLayout.createSequentialGroup()
                        .addComponent(lblIDSen, javax.swing.GroupLayout.PREFERRED_SIZE, 955, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(cboLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(495, 495, 495)
                        .addComponent(icoArrow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGap(15, 15, 15))
        );
        panSentenceLayout.setVerticalGroup(
            panSentenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSentenceLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panSentenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icoArrow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panSentenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblIDSen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(panChild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        scrPanTable.setBorder(null);

        table.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                Lang.getString("IDSen"), Lang.getString("Question"), "A", "B", "C", "D", Lang.getString("Answer"), Lang.getString("Level")
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableMousePressed(evt);
            }
        });
        scrPanTable.setViewportView(table);

        scrButtonTable.add(scrPanTable, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrButtonTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(icoReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(panTopic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(panSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icoSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(icoDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panSentence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotalCH, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icoReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panTopic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icoDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icoSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(lblTotalCH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panSentence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(scrButtonTable, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void icoReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoReturnMouseEntered
        icoReturn.setPic("src/UI/Image/Return2.png");
    }//GEN-LAST:event_icoReturnMouseEntered

    private void icoReturnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoReturnMouseExited
        icoReturn.setPic("src/UI/Image/Return.png");
    }//GEN-LAST:event_icoReturnMouseExited

    private void icoReturnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoReturnMousePressed
        if(!onChange){  WMessage(ParentComponent, Lang.getString("NotifiBackup").replaceAll("\\.", ".\n"), Lang.getString("Notifi"), WARNING_MESSAGE);    }
        else if(arrCH.isEmpty()){
            if(WConfirm(ParentComponent, Lang.getString("EmptySen").replaceFirst("\\.", ".\n"), Lang.getString("Notifi"), YES_NO_OPTION) == OK_OPTION){
                
                BigLoader loader = new BigLoader(ParentFrame, true);
                loader.setInfor("/UI/Image/Bin.gif", Lang.getString("Deleting"));
                loader.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override public void windowOpened(java.awt.event.WindowEvent evt) {
                        new Thread() { @Override public void run() {
                            deleteOld();
                            DTDAO.Delete(dethi.getIDDeThi());
                            onChange = true;
                            arrDeThi = DTDAO.selectAllByGV(CurrentID);
                            loader.dispose();
                            dispose();
                        }}.start();
                    }});
                loader.setVisible(true);
                
            }}
        else{dispose();}
    }//GEN-LAST:event_icoReturnMousePressed

    private void icoSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSaveMouseEntered
        icoSave.setPic("src/UI/Image/Save2.png");
    }//GEN-LAST:event_icoSaveMouseEntered

    private void icoSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSaveMouseExited
        setSaveIcon();
    }//GEN-LAST:event_icoSaveMouseExited

    private void icoSaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSaveMousePressed
        Perror = "";
//Set he so ve 0 neu khong co cau nao
        if(numKnow == 0) cboKnow.setSelectedIndex(0);
        if(numUnde == 0) cboUnde.setSelectedIndex(0);
        if(numMani == 0) cboMani.setSelectedIndex(0);
        if(numHigh == 0) cboHigh.setSelectedIndex(0);
        
//validate he so và tong he so
        if(numHigh > 0 && PercentD == 0) Perror = Lang.getString("InPercent").replaceFirst("lxx", Lang.getString("LHigh")).replaceFirst("X", String.valueOf(numHigh));
        if(numMani > 0 && PercentC == 0) Perror = Lang.getString("InPercent").replaceFirst("lxx", Lang.getString("LMani")).replaceFirst("X", String.valueOf(numMani));
        if(numUnde > 0 && PercentB == 0) Perror = Lang.getString("InPercent").replaceFirst("lxx", Lang.getString("LUnde")).replaceFirst("X", String.valueOf(numUnde));
        if(numKnow > 0 && PercentA == 0) Perror = Lang.getString("InPercent").replaceFirst("lxx", Lang.getString("LKnow")).replaceFirst("X", String.valueOf(numKnow));
        if(!Perror.equals("")) {  WMessage(ParentComponent, Perror.replaceFirst("!", "!\n"), Lang.getString("Notifi"), WARNING_MESSAGE);  return; }
        if(PercentA + PercentB + PercentC + PercentD != 100){
            WMessage(ParentComponent, Lang.getString("SumLevel"), Lang.getString("Notifi"), WARNING_MESSAGE);
            return;
        }
//validate so cau thi du kien
        if(!numD.equals(Math.rint(numD)))Perror = Lang.getString("InNum").replaceFirst("!", "!\n"+lblNumHigh.getText()+"\n");
        if(!numC.equals(Math.rint(numC)))Perror = Lang.getString("InNum").replaceFirst("!", "!\n"+lblNumMani.getText()+"\n");
        if(!numB.equals(Math.rint(numB)))Perror = Lang.getString("InNum").replaceFirst("!", "!\n"+lblNumUnde.getText()+"\n");
        if(!numA.equals(Math.rint(numA)))Perror = Lang.getString("InNum").replaceFirst("!", "!\n"+lblNumKnow.getText()+"\n");
        if(PercentT == 0.0 || !num.equals(Math.rint(num))) Perror = Lang.getString("InNum").replaceFirst("!", "!\n"+lblNum.getText()+"\n");
        if(!Perror.equals("")) {  WMessage(ParentComponent, Perror, Lang.getString("Notifi"), WARNING_MESSAGE);  return; }
//update
        BigLoader loader = new BigLoader(ParentFrame, true);
        loader.setInfor("/UI/Image/Circle.gif", Lang.getString("Uploading"));
        loader.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override public void windowOpened(java.awt.event.WindowEvent evt) {
                new Thread() { @Override public void run() {
                    
                    dethi.setName(txtTopic.getText().trim());
                    dethi.setTotal(arrCH.size());
                    dethi.setPercentA(PercentA);
                    dethi.setPercentB(PercentB);
                    dethi.setPercentC(PercentC);
                    dethi.setPercentD(PercentD);
                    dethi.setPercentT(PercentT);
                    DTDAO.Update(dethi);
                    deleteOld();
                    for(int i = 0 ; i < arrCH.size() ; i++){
                        CauHoi ch = arrCH.get(i);
                        Index = i;
                        if(ch.getQuestion().length()>256){
                            txtSentence.requestFocusInWindow();
                            showDetail();
                            WMessage(ParentComponent, Lang.getString("LongQue"), Lang.getString("Notifi"), WARNING_MESSAGE);
                            loader.dispose();
                            return;
                        }
                        if(ch.getAnswerD().length() > 64){  txtD.requestFocusInWindow();   Perror = Lang.getString("LongAns").replaceFirst("X", "D");}
                        if(ch.getAnswerC().length() > 64){  txtC.requestFocusInWindow();   Perror = Lang.getString("LongAns").replaceFirst("X", "C");}
                        if(ch.getAnswerB().length() > 64){  txtB.requestFocusInWindow();   Perror = Lang.getString("LongAns").replaceFirst("X", "B");}
                        if(ch.getAnswerA().length() > 64){  txtA.requestFocusInWindow();   Perror = Lang.getString("LongAns").replaceFirst("X", "A");}
                        if(!Perror.equals("")){
                            showDetail();
                            WMessage(ParentComponent, Perror, Lang.getString("Notifi"), WARNING_MESSAGE);
                            loader.dispose();
                            return;
                        }
                        CHDAO.InsertCHDT(arrCH.get(i), dethi.getIDDeThi());
                    }
                    onChange = true;
                    setSaveIcon();
                    arrDeThi = DTDAO.selectAllByGV(CurrentID);
                    
                    loader.dispose();
                }}.start();
            }});
        loader.setVisible(true);
    }//GEN-LAST:event_icoSaveMousePressed

    private void icoSaveAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSaveAddMouseEntered
        icoSaveAdd.setPic("src/UI/Image/Check2.png");
    }//GEN-LAST:event_icoSaveAddMouseEntered

    private void icoSaveAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSaveAddMouseExited
        icoSaveAdd.setPic("src/UI/Image/Check.png");
    }//GEN-LAST:event_icoSaveAddMouseExited

    private void icoSaveAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSaveAddMousePressed
        CauHoi current = readDetail();
        String ID = current.getIDCauHoi();
        if(ID == null){
            WMessage(ParentComponent, Lang.getString("NullID").replaceAll("\\.", ".\n"), Lang.getString("Notifi"), WARNING_MESSAGE);
            return;
        }
        else if(Index <= -1){
            for(CauHoi ch : arrCH){
                if(ch.getIDCauHoi().equals(ID)){
                    WMessage(ParentComponent, Lang.getString("EqualID").replaceAll("\\.", ".\n"), Lang.getString("Notifi"), WARNING_MESSAGE);
                    return;
                }
            }
            arrCH.add(current);
            arrTemp.add(ID);
        }
        else{
            if(arrFind.isEmpty()) arrCH.remove(Index);
            else arrCH.remove(arrFind.get(Index));
            arrCH.add(current);
            arrTemp.add(ID);
        }
        onChange = false;
        setSaveIcon();
        arrFind.clear();
        fillListCH();
        clearDetail();
    }//GEN-LAST:event_icoSaveAddMousePressed

    private void icoRemoveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoRemoveMouseEntered
        icoRemove.setPic("src/UI/Image/Remove2.png");
    }//GEN-LAST:event_icoRemoveMouseEntered

    private void icoRemoveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoRemoveMouseExited
        icoRemove.setPic("src/UI/Image/Remove.png");
    }//GEN-LAST:event_icoRemoveMouseExited

    private void icoRemoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoRemoveMousePressed
        if(Index > -1){
            if(arrFind.isEmpty()) arrCH.remove(Index);
            else arrCH.remove(arrFind.get(Index));
            arrFind.clear();
            fillListCH();
            clearDetail();
            Index = -1;
        }
    }//GEN-LAST:event_icoRemoveMousePressed

    private void icoArrowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoArrowMousePressed
        showSentence = !showSentence;
        panChild.setVisible(showSentence);
        icoArrow.setPic("src/UI/Image/" + (showSentence ? "Up" : "Down") + ".png");
    }//GEN-LAST:event_icoArrowMousePressed

    private void icoBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoBackMouseEntered
        icoBack.setPic("src/UI/Image/Back.png");
    }//GEN-LAST:event_icoBackMouseEntered

    private void icoBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoBackMouseExited
        icoBack.setPic("src/UI/Image/Back2.png");
    }//GEN-LAST:event_icoBackMouseExited

    private void icoBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoBackMousePressed
        Index--;
        if(Index <= -1 || Index >= arrCH.size())   {  Index = arrCH.size()-1;  }
        showDetail();
        rowFocus();
    }//GEN-LAST:event_icoBackMousePressed

    private void icoNextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoNextMouseEntered
        icoNext.setPic("src/UI/Image/Next.png");
    }//GEN-LAST:event_icoNextMouseEntered

    private void icoNextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoNextMouseExited
        icoNext.setPic("src/UI/Image/Next2.png");
    }//GEN-LAST:event_icoNextMouseExited

    private void icoNextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoNextMousePressed
        Index++;
        if(Index <= -1 || Index >= arrCH.size())   {  Index = 0;  }
        showDetail();
        rowFocus();
    }//GEN-LAST:event_icoNextMousePressed

    private void tableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMousePressed
        Index = table.getSelectedRow();
        showDetail();
    }//GEN-LAST:event_tableMousePressed

    private void icoNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoNewMouseEntered
        icoNew.setPic("src/UI/Image/Plus.png");
    }//GEN-LAST:event_icoNewMouseEntered

    private void icoNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoNewMouseExited
        icoNew.setPic("src/UI/Image/Plus2.png");
    }//GEN-LAST:event_icoNewMouseExited

    private void icoNewMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoNewMousePressed
        clearDetail();
    }//GEN-LAST:event_icoNewMousePressed

    private void icoDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoDeleteMouseEntered
        icoDelete.setPic("src/UI/Image/Remove2.png");
    }//GEN-LAST:event_icoDeleteMouseEntered

    private void icoDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoDeleteMouseExited
        icoDelete.setPic("src/UI/Image/Remove.png");
    }//GEN-LAST:event_icoDeleteMouseExited

    private void icoDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoDeleteMousePressed
        if(WConfirm(this, Lang.getString("ReTopic"), Lang.getString("Notifi"), OK_CANCEL_OPTION, WARNING_MESSAGE) == YES_NO_OPTION){
            BigLoader loader = new BigLoader(ParentFrame, true);
            loader.setInfor("/UI/Image/Bin.gif", Lang.getString("Deleting"));
            loader.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override public void windowOpened(java.awt.event.WindowEvent evt) {
                    new Thread() { @Override public void run() {
                        
                        try{
                            deleteOld();
                            DTDAO.Delete(dethi.getIDDeThi());
                            dispose();
                        }catch(Exception e){ WMessage(ParentFrame, Lang.getString("ErrTopic"), Lang.getString("Notifi"), WARNING_MESSAGE); }
                        arrDeThi = DTDAO.selectAllByGV(CurrentID);
                        
                        loader.dispose();
                    }}.start();
                }});
            loader.setVisible(true);
        }
    }//GEN-LAST:event_icoDeleteMousePressed

    private void sldNumStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldNumStateChanged
        setNumberOfSen();
        onChange = Open;
        setSaveIcon();
        Open = false;
    }//GEN-LAST:event_sldNumStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        sldNum.setValue(PercentT);
    }//GEN-LAST:event_formWindowOpened

    private void cboKnowItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboKnowItemStateChanged
        PercentA = Integer.parseInt(cboKnow.getSelectedItem().toString().replaceAll("%", ""));
        setNumberOfSen();
        onChange = false;
        setSaveIcon();
    }//GEN-LAST:event_cboKnowItemStateChanged

    private void cboUndeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboUndeItemStateChanged
        PercentB = Integer.parseInt(cboUnde.getSelectedItem().toString().replaceAll("%", ""));
        setNumberOfSen();
        onChange = false;
        setSaveIcon();
    }//GEN-LAST:event_cboUndeItemStateChanged

    private void cboManiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboManiItemStateChanged
        PercentC = Integer.parseInt(cboMani.getSelectedItem().toString().replaceAll("%", ""));
        setNumberOfSen();
        onChange = false;
        setSaveIcon();
    }//GEN-LAST:event_cboManiItemStateChanged

    private void cboHighItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboHighItemStateChanged
        PercentD = Integer.parseInt(cboHigh.getSelectedItem().toString().replaceAll("%", ""));
        setNumberOfSen();
        onChange = false;
        setSaveIcon();
    }//GEN-LAST:event_cboHighItemStateChanged

    private void icoArrow2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoArrow2MousePressed
        showMark = !showMark;
        panMark.setVisible(showMark);
        panA.setPreferredSize(showMark ? smallPan : bigPan);
        panB.setPreferredSize(showMark ? smallPan : bigPan);
        panC.setPreferredSize(showMark ? smallPan : bigPan);
        panD.setPreferredSize(showMark ? smallPan : bigPan);
        icoArrow2.setPic("src/UI/Image/" + (showMark ? "Right" : "Left") + ".png");
    }//GEN-LAST:event_icoArrow2MousePressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        Find = txtSearch.getText().trim().toLowerCase();
        if(Find == null || Find.equals("")){
            fillListCH();
            showSentence = true;
            panChild.setVisible(showSentence);
            icoArrow.setPic("src/UI/Image/" + (showSentence ? "Up" : "Down") + ".png");
        }
        else{
            if(arrFind != null)  arrFind.clear();
            if(panChild.isVisible()) {
                showSentence = false;
                panChild.setVisible(showSentence);
                icoArrow.setPic("src/UI/Image/" + (showSentence ? "Up" : "Down") + ".png");
            }
            for(CauHoi ch : arrCH){
                if(ch != null){ 
                    FindQuestion = ch.getQuestion().toLowerCase(); 
                    FindA = ch.getAnswerA().toLowerCase();
                    FindB = ch.getAnswerB().toLowerCase();
                    FindC = ch.getAnswerC().toLowerCase();
                    FindD = ch.getAnswerD().toLowerCase();
                }
                if(ch != null && (FindQuestion.contains(Find) || FindA.contains(Find) || FindB.contains(Find) || FindC.contains(Find) || FindD.contains(Find))){
                    arrFind.add(ch);
                }
            }
            fillListFind();
        }
        txtSearch.requestFocusInWindow();
    }//GEN-LAST:event_txtSearchKeyReleased

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
            java.util.logging.Logger.getLogger(formTopic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                formTopic dialog = new formTopic(new javax.swing.JFrame(), true);
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
    
    private DeThi dethi;
    private ArrayList<CauHoi> arrCH, arrFind = new ArrayList<>();
    private final ArrayList<String> arrTemp = new ArrayList<>();
    private final Color SenColor = Mode.getMode() ? PAN_SEN_DARK : PAN_SEN_LIGHT,
                        TextColor = Mode.getTextColor();
    private final Font TextFont = new java.awt.Font("Tahoma", 0, 24),
                     AnswerFont = new java.awt.Font("Tahoma", 0, 25);
    private boolean showSentence = false, showMark = true, Open = true;
    private final String Know = Lang.getString("LKnow"),
                         Unde = Lang.getString("LUnde"),
                         Mani = Lang.getString("LMani"),
                         High = Lang.getString("LHigh"),
                         Sen  = Lang.getString("Sen"),
                         Mark = Lang.getString("Mark");
    private final char s = Sen.toLowerCase().charAt(0);
    private int Index = -1, PercentA = 0 , PercentB = 0, PercentC = 0, PercentD = 0, PercentT = 0,
                numKnow = 0, numUnde = 0, numMani = 0, numHigh = 0;
    private final Dimension smallPan = new Dimension(630, 100),
                            bigPan = new Dimension(870, 100);
    private DefaultTableModel model;
    private String Level = null, Perror = "",
            Find = null, FindQuestion = null, FindA = null, FindB = null, FindC = null, FindD = null;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private CustomComponent.ComboBoxSuggestion cboHigh;
    private CustomComponent.ComboBoxSuggestion cboKnow;
    private CustomComponent.ComboBoxSuggestion cboLevel;
    private CustomComponent.ComboBoxSuggestion cboMani;
    private CustomComponent.ComboBoxSuggestion cboUnde;
    private javax.swing.JCheckBox chkA;
    private javax.swing.JCheckBox chkB;
    private javax.swing.JCheckBox chkC;
    private javax.swing.JCheckBox chkD;
    private com.AnLa.UI.ImagePanel icoArrow;
    private com.AnLa.UI.ImagePanel icoArrow2;
    private com.AnLa.UI.ImagePanel icoBack;
    private com.AnLa.UI.ImagePanel icoDelete;
    private com.AnLa.UI.ImagePanel icoNew;
    private com.AnLa.UI.ImagePanel icoNext;
    private com.AnLa.UI.ImagePanel icoRemove;
    private com.AnLa.UI.ImagePanel icoReturn;
    private com.AnLa.UI.ImagePanel icoSave;
    private com.AnLa.UI.ImagePanel icoSaveAdd;
    private com.AnLa.UI.ImagePanel icoSearch;
    private javax.swing.JLabel lblHigh;
    private javax.swing.JLabel lblIDSen;
    private javax.swing.JLabel lblKnow;
    private javax.swing.JLabel lblMani;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblNumHigh;
    private javax.swing.JLabel lblNumKnow;
    private javax.swing.JLabel lblNumMani;
    private javax.swing.JLabel lblNumUnde;
    private javax.swing.JLabel lblTopic;
    private javax.swing.JLabel lblTotalCH;
    private javax.swing.JLabel lblUnde;
    private com.k33ptoo.components.KGradientPanel panA;
    private com.k33ptoo.components.KGradientPanel panB;
    private com.k33ptoo.components.KGradientPanel panC;
    private javax.swing.JPanel panChild;
    private com.k33ptoo.components.KGradientPanel panD;
    private com.k33ptoo.components.KGradientPanel panMark;
    private javax.swing.JPanel panSearch;
    private com.k33ptoo.components.KGradientPanel panSentence;
    private javax.swing.JPanel panTopic;
    private CustomComponent.TableScrollButton scrButtonTable;
    private javax.swing.JScrollPane scrPanSentence;
    private javax.swing.JScrollPane scrPanTable;
    private CustomComponent.JsliderCustom sldNum;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtD;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextArea txtSentence;
    private javax.swing.JTextField txtTopic;
    // End of variables declaration//GEN-END:variables

    public void setDeThi(DeThi dethi){
        this.dethi = dethi;
        BigLoader loader = new BigLoader(ParentFrame, true);
        loader.setInfor("/UI/Image/Circle.gif", Lang.getString("Loading"));
        loader.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override public void windowOpened(java.awt.event.WindowEvent evt) {
                new Thread() { @Override public void run() {
                    
                    arrCH = CHDAO.selectAllByDeThi(dethi.getIDDeThi());
                    for(CauHoi ch : arrCH){ arrTemp.add(ch.getIDCauHoi());  }
                    Index = arrCH.isEmpty() ? -1 : 0;
                    showDetail();
                    fillListCH();
                    icoReturn.requestFocusInWindow();
                    for(int i = 0 ; i <= 100; i++){
                        String itemcbo = i + "%";
                        cboKnow.addItem(itemcbo);
                        cboUnde.addItem(itemcbo);
                        cboMani.addItem(itemcbo);
                        cboHigh.addItem(itemcbo);
                    }
                    cboKnow.setSelectedItem(dethi.getPercentA()+"%");
                    cboUnde.setSelectedItem(dethi.getPercentB()+"%");
                    cboMani.setSelectedItem(dethi.getPercentC()+"%");
                    cboHigh.setSelectedItem(dethi.getPercentD()+"%");
                    PercentT = dethi.getPercentT();
                    onChange = true;
                    setSaveIcon();
                    
                    loader.dispose();
                }}.start();
            }});
        loader.setVisible(true);
    }
    private Double num = 0.0, percent = 0.0, numA = 0.0, numB = 0.0, numC = 0.0, numD = 0.0, markA = 0.0, markB = 0.0, markC = 0.0, markD = 0.0; 
    private void setNumberOfSen(){
        PercentT = sldNum.getValue();
        //tinh phan tram so cau hoi se thi
        percent = PercentT/100.0;
        //tinh tong cau hoi se thi dua theo phan tram chon
        num = arrCH == null ? 0.0 : percent*arrCH.size();
        //tinh so luong cac cau cua cac level theo tong so cau se thi
        numA = numKnow == 0 ? 0.0 : percent*numKnow;
        numB = numUnde == 0 ? 0.0 : percent*numUnde;
        numC = numMani == 0 ? 0.0 : percent*numMani;
        numD = numHigh == 0 ? 0.0 : percent*numHigh;
        //Tinh diem du kien tung cau lam tron den 2 chu so thap phan
        markA = numA < 1 ? 0.0 : ((PercentA/100.0)*10) / numA;
        markB = numB < 1 ? 0.0 : ((PercentB/100.0)*10) / numB;
        markC = numC < 1 ? 0.0 : ((PercentC/100.0)*10) / numC;
        markD = numD < 1 ? 0.0 : ((PercentD/100.0)*10) / numD;
        //settext cho label
        lblNum.setText(Lang.getString("LNum") + ": " + num + " " + Sen);
        lblNumKnow.setText(Know+": "+numA+" "+s+" ~ "+markA+" "+Mark+"/"+s);
        lblNumUnde.setText(Unde+": "+numB+" "+s+" ~ "+markB+" "+Mark+"/"+s);
        lblNumMani.setText(Mani+": "+numC+" "+s+" ~ "+markC+" "+Mark+"/"+s);
        lblNumHigh.setText(High+": "+numD+" "+s+" ~ "+markD+" "+Mark+"/"+s);
    }
    private void showDetail(){
        txtTopic.setText(dethi.getName());
        lblTotalCH.setText(Lang.getString("TotalSen").replaceFirst("X", String.valueOf(arrCH.size())));
        if(!arrCH.isEmpty()){
            CauHoi cauhoi = arrFind.isEmpty() ? arrCH.get(Index) : arrFind.get(Index);
            lblIDSen.setText(cauhoi.getIDCauHoi());
            txtSentence.setText(cauhoi.getQuestion());
            txtA.setText(cauhoi.getAnswerA());  txtB.setText(cauhoi.getAnswerB());
            txtC.setText(cauhoi.getAnswerC());  txtD.setText(cauhoi.getAnswerD());
            String answer = cauhoi.getCorrectAnswer();
            chkA.setSelected(false);
            chkB.setSelected(false);
            chkC.setSelected(false);
            chkD.setSelected(false);
            if(answer.contains("A")) chkA.setSelected(true);
            if(answer.contains("B")) chkB.setSelected(true);
            if(answer.contains("C")) chkC.setSelected(true);
            if(answer.contains("D")) chkD.setSelected(true);
            cboLevel.setSelectedIndex(cauhoi.getLevel());
        }
    }
    private void clearDetail(){
        Index = -1;
        lblIDSen.setText("");
        txtSentence.setText("");
        txtA.setText("");  txtB.setText("");
        txtC.setText("");  txtD.setText("");
        cboLevel.setSelectedIndex(0);
        chkA.setSelected(false);
        chkB.setSelected(false);
        chkC.setSelected(false);
        chkD.setSelected(false);
        txtSentence.setText(Lang.getString("ESen"));
        txtA.setText(Lang.getString("EAns"));
        txtB.setText(Lang.getString("EAns"));
        txtC.setText(Lang.getString("EAns"));
        txtD.setText(Lang.getString("EAns"));
    }
    private CauHoi readDetail(){
        //khai bao va lay du lieu
        String Senten = txtSentence.getText();
        String ansA = txtA.getText().trim(), ansB = txtB.getText().trim(), ansC = txtC.getText().trim(), ansD = txtD.getText().trim(), answer = "", ans = Lang.getString("EAns");
        if(chkA.isSelected()) answer += "A";
        if(chkB.isSelected()) answer += "B";
        if(chkC.isSelected()) answer += "C";
        if(chkD.isSelected()) answer += "D";
        int level = cboLevel.getSelectedIndex();
        //validate
        CauHoi wrong = new CauHoi();
        if(Senten.equals(Lang.getString("ESen")) || Senten.equals("")) return wrong;
        if(ansA.endsWith(ans) || ansA.equals("")) return wrong;
        if(ansB.endsWith(ans) || ansB.equals("")) return wrong;
        if(ansC.endsWith(ans) || ansC.equals("")) return wrong;
        if(ansD.endsWith(ans) || ansD.equals("")) return wrong;
        if(answer.equals(""))  return wrong;
        //If success
        String ID = com.AnLa.HASH.SHA256.Encrypt(Senten+ansA+ansB+ansC+ansD+answer+level);
        return new CauHoi(ID, Senten, ansA, ansB, ansC, ansD, answer, level);
    }
    private void rowFocus()       {
        table.requestFocusInWindow();
        table.changeSelection(Index,0,false, false);
    }
    public void setSaveIcon(){
        icoSave.setPic(onChange ? "src/UI/Image/Save3.png" : "src/UI/Image/Save.png");
    }
    public void fillListCH(){
        model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        numKnow = 0; numUnde = 0; numMani = 0; numHigh = 0;
        for(CauHoi ch : arrCH){
            switch(ch.getLevel()){
                case 0 -> { numKnow++; Level = Know; }
                case 1 -> { numUnde++; Level = Unde; }
                case 2 -> { numMani++; Level = Mani; }
                case 3 -> { numHigh++; Level = High; }
            }
            Object[] row = {ch.getIDCauHoi(), ch.getQuestion(), ch.getAnswerA(), ch.getAnswerB(), ch.getAnswerC(), ch.getAnswerD(), ch.getCorrectAnswer(), Level};
            model.addRow(row);
        }
        lblTotalCH.setText(Lang.getString("TotalSen").replaceFirst("X", String.valueOf(arrCH.size())));
        lblKnow.setText(Know + ": " + numKnow + " " + Sen);
        lblUnde.setText(Unde + ": " + numUnde + " " + Sen);
        lblMani.setText(Mani + ": " + numMani + " " + Sen);
        lblHigh.setText(High + ": " + numHigh + " " + Sen);
    }
    public void fillListFind(){
        model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for(CauHoi ch : arrFind){
            switch(ch.getLevel()){
                case 0 -> { Level = Know; }
                case 1 -> { Level = Unde; }
                case 2 -> { Level = Mani; }
                case 3 -> { Level = High; }
            }
            Object[] row = {ch.getIDCauHoi(), ch.getQuestion(), ch.getAnswerA(), ch.getAnswerB(), ch.getAnswerC(), ch.getAnswerD(), ch.getCorrectAnswer(), Level};
            model.addRow(row);
        }
    }
    private void deleteOld(){
        for(String ID : arrTemp){
            CHDAO.Delete(ID);
        }
    }
}