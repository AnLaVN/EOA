package UI.Frame;
// Make By Bình An || AnLaVN || KatoVN

import static Controller.DatabaseData.*;
import Controller.LocalData;
import static Controller.LocalData.*;
import ObjectClass.Lop;
import ObjectClass.SinhVien;
import com.AnLa.FILE.Log;
import com.AnLa.UI.Mode;
import static com.AnLa.UI.Mode.WConfirm;
import static com.AnLa.UI.Mode.WMessage;
import java.awt.Color;
import java.awt.Component;
import java.awt.Rectangle;
import java.io.IOException;
import javax.imageio.ImageIO;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;
import static javax.swing.JOptionPane.OK_OPTION;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import jnafilechooser.api.JnaFileChooser;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class formClass extends javax.swing.JDialog {

    public formClass(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try { setIconImage(ImageIO.read(getClass().getResource("/UI/Image/Logo.png"))); } 
        catch (IOException ex) {Log.add("!!! Error try to set Icon for frame. !!!");}
        Mode.setModeComponent(Background);
        Mode.setModeComponent(icoReturn);
        Mode.setModeComponent(panel);
        Mode.setModeComponent(scrPan.getVerticalScrollBar());
        
        Mode.setModeComponent(panClass);    Mode.setModeComponent(lblClass);    Mode.setModeComponent(txtClass);
        Mode.setModeComponent(panIDClass);  Mode.setModeComponent(lblIDClass);  Mode.setModeComponent(txtIDClass);
        Mode.setModeComponent(panSearch);   Mode.setModeComponent(icoSearch);   Mode.setModeComponent(txtSearch);
        Mode.setModeComponent(lblTotalSV);
        
        Mode.setModeComponent(icoDelete);
        Mode.setModeComponent(icoSave);
        Mode.setModeComponent(icoExcel);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        icoReturn = new com.AnLa.UI.ImagePanel();
        scrPan = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        lblTotalSV = new javax.swing.JLabel();
        panClass = new javax.swing.JPanel();
        txtClass = new javax.swing.JTextField();
        lblClass = new javax.swing.JLabel();
        panIDClass = new javax.swing.JPanel();
        txtIDClass = new javax.swing.JTextField();
        lblIDClass = new javax.swing.JLabel();
        panSearch = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        icoSearch = new com.AnLa.UI.ImagePanel();
        icoDelete = new com.AnLa.UI.ImagePanel();
        icoSave = new com.AnLa.UI.ImagePanel();
        icoExcel = new com.AnLa.UI.ImagePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

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

        scrPan.setBorder(null);
        scrPan.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrPan.setVerticalScrollBar(new com.AnLa.UI.ScrollBar());

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1943, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 908, Short.MAX_VALUE)
        );

        scrPan.setViewportView(panel);

        lblTotalSV.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        lblTotalSV.setText("Total: n Students");

        panClass.setBackground(new java.awt.Color(153, 255, 153));
        panClass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, U_TEXT));

        txtClass.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        txtClass.setBorder(null);
        txtClass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClassKeyReleased(evt);
            }
        });

        lblClass.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        lblClass.setText(Lang.getString("Class") + ":");

        javax.swing.GroupLayout panClassLayout = new javax.swing.GroupLayout(panClass);
        panClass.setLayout(panClassLayout);
        panClassLayout.setHorizontalGroup(
            panClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panClassLayout.createSequentialGroup()
                .addComponent(lblClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panClassLayout.setVerticalGroup(
            panClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panIDClass.setBackground(new java.awt.Color(153, 255, 153));
        panIDClass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, U_TEXT));

        txtIDClass.setEditable(false);
        txtIDClass.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        txtIDClass.setBorder(null);

        lblIDClass.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        lblIDClass.setText(Lang.getString("IDClass") + ":");

        javax.swing.GroupLayout panIDClassLayout = new javax.swing.GroupLayout(panIDClass);
        panIDClass.setLayout(panIDClassLayout);
        panIDClassLayout.setHorizontalGroup(
            panIDClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panIDClassLayout.createSequentialGroup()
                .addComponent(lblIDClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(txtIDClass, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panIDClassLayout.setVerticalGroup(
            panIDClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtIDClass, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblIDClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
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

        setSaveIcon();

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

        icoExcel.setBackground(new java.awt.Color(153, 255, 255));
        icoExcel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoExcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icoExcelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icoExcelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoExcelMousePressed(evt);
            }
        });

        icoExcel.setPic("src/UI/Image/Excel.png");

        javax.swing.GroupLayout icoExcelLayout = new javax.swing.GroupLayout(icoExcel);
        icoExcel.setLayout(icoExcelLayout);
        icoExcelLayout.setHorizontalGroup(
            icoExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );
        icoExcelLayout.setVerticalGroup(
            icoExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrPan, javax.swing.GroupLayout.PREFERRED_SIZE, 1920, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addComponent(icoReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(panIDClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTotalSV, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(panClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(panSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(icoExcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(icoSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(icoDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icoReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(panSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(panClass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(icoDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icoSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icoExcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblTotalSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panIDClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrPan, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void icoReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoReturnMouseEntered
        icoReturn.setPic("src/UI/Image/Return2.png");
    }//GEN-LAST:event_icoReturnMouseEntered

    private void icoReturnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoReturnMouseExited
        icoReturn.setPic("src/UI/Image/Return.png");
    }//GEN-LAST:event_icoReturnMouseExited

    private void icoReturnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoReturnMousePressed
        if(!onChange){  WMessage(parent, Lang.getString("NotifiBackup").replaceAll("\\.", ".\n"), Lang.getString("Notifi"), WARNING_MESSAGE);    }
        else if(arrSV.isEmpty()){//lop.getSoLuongSV() == 0
            if(WConfirm(parent, Lang.getString("EmptyClass").replaceFirst("\\.", ".\n"), Lang.getString("Notifi"), YES_NO_OPTION) == OK_OPTION){
                BigLoader loader = new BigLoader(ParentFrame, true);
                loader.setInfor("/UI/Image/Bin.gif", Lang.getString("Deleting"));
                loader.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override public void windowOpened(java.awt.event.WindowEvent evt) {
                    new Thread() { @Override public void run() {
                        for(SinhVien sv : arrSV){sv.setImage("");}
                        LDAO.Delete(lop.getIDLop());
                        arrLop = LDAO.selectAllByGV(CurrentID);
                        onChange = true;
                        loader.dispose();
                        dispose();
                    }}.start();
                }});
                loader.setVisible(true);
            }
        }else{dispose();}
    }//GEN-LAST:event_icoReturnMousePressed

    private void icoSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSaveMouseEntered
        icoSave.setPic("src/UI/Image/Save2.png");
    }//GEN-LAST:event_icoSaveMouseEntered

    private void icoSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSaveMouseExited
        setSaveIcon();
    }//GEN-LAST:event_icoSaveMouseExited

    private void icoSaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSaveMousePressed
        BigLoader loader = new BigLoader(ParentFrame, true);
        loader.setInfor("/UI/Image/Server.gif", Lang.getString("UpSV"));
        loader.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override public void windowOpened(java.awt.event.WindowEvent evt) {
                new Thread() { @Override public void run() {
                    try {SVDAO.DeleteAllLop(lop.getIDLop());    }
                    catch(Exception e){
                        WMessage(ParentComponent, Lang.getString("ErrClass"), Lang.getString("Notifi"), WARNING_MESSAGE);
                        loader.dispose();
                        return;
                    }
                    lop.setName(txtClass.getText().trim());
                    lop.setSoLuongSV(arrSV.size());
                    LDAO.Update(lop);
                    for(int i = 0 ; i < arrSV.size() ; i++){
                        panStudent pansv = (panStudent) panel.getComponent(i);
                        pansv.lblSTT.setForeground(TextColor);
                        SinhVien sv = new SinhVien(pansv.txtIDSV.getText().trim(), pansv.txtNameSV.getText().trim(), arrSV.get(i).getAvatar(), false, lop.getIDLop());
                        try{    SVDAO.Insert(sv);   }
                        catch(Exception e){
                            pansv.txtIDSV.requestFocusInWindow();
                            pansv.lblSTT.setForeground(Color.RED);
                            WMessage(ParentComponent, Lang.getString("DupIDSV"), Lang.getString("Notifi"), WARNING_MESSAGE);
                        }
                    }
                    arrSV = SVDAO.selectAllByLop(lop.getIDLop());
                    arrLop = LDAO.selectAllByGV(CurrentID);
                    onChange = true;
                    setSaveIcon();
                    loader.dispose();
                }}.start();
            }});
        loader.setVisible(true);
    }//GEN-LAST:event_icoSaveMousePressed

    private void txtClassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClassKeyReleased
        onChange = false;
        setSaveIcon();
    }//GEN-LAST:event_txtClassKeyReleased

    private void icoExcelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoExcelMouseEntered
        //icoAddFile.setPic("src/UI/Image/Add1.png");
    }//GEN-LAST:event_icoExcelMouseEntered

    private void icoExcelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoExcelMouseExited
        //icoAddFile.setPic("src/UI/Image/Add.png");
    }//GEN-LAST:event_icoExcelMouseExited

    private void icoExcelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoExcelMousePressed
        addListFromExcel();
        fillListSV();
        repaint();
    }//GEN-LAST:event_icoExcelMousePressed

    private void icoDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoDeleteMouseEntered
        icoDelete.setPic("src/UI/Image/Remove2.png");
    }//GEN-LAST:event_icoDeleteMouseEntered

    private void icoDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoDeleteMouseExited
        icoDelete.setPic("src/UI/Image/Remove.png");
    }//GEN-LAST:event_icoDeleteMouseExited

    private void icoDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoDeleteMousePressed
        if(WConfirm(this, Lang.getString("ReClass"), Lang.getString("Notifi"), OK_CANCEL_OPTION, WARNING_MESSAGE) == YES_NO_OPTION){
            try{
                BigLoader loader = new BigLoader(ParentFrame, true);
                loader.setInfor("/UI/Image/Bin.gif", Lang.getString("ReSV"));
                loader.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override public void windowOpened(java.awt.event.WindowEvent evt) {
                        new Thread() { @Override public void run() {
                            for(SinhVien sv : arrSV){sv.setImage("");}
                            LDAO.Delete(lop.getIDLop());
                            arrLop = LDAO.selectAllByGV(CurrentID);
                            loader.dispose();
                            dispose();
                        }}.start();
                    }});
                loader.setVisible(true);
            }catch(Exception e){ WMessage(this, Lang.getString("ErrClass"), Lang.getString("Notifi"), INFORMATION_MESSAGE); }
        }
    }//GEN-LAST:event_icoDeleteMousePressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        Find = txtSearch.getText().trim().toLowerCase();
        scrPan.setViewportView(panel);
        if(Find == null || Find.equals("")) fillListSV();
        else{
            if(arrFind != null)  arrFind.clear();
            for(SinhVien sv : arrSV){
                if(sv != null){ FindID = sv.getIDSinhVien().toLowerCase(); FindName = sv.getName().toLowerCase();}
                if(sv != null && (FindID.contains(Find) || FindName.contains(Find))){
                    arrFind.add(sv);
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
            java.util.logging.Logger.getLogger(formClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                formClass dialog = new formClass(new javax.swing.JFrame(), true);
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

    private Lop lop;
    private ArrayList<SinhVien> arrSV, arrFind = new ArrayList<>();
    private final Rectangle rec = new Rectangle();
    private final Component parent = this;
    private final Color TextColor = Mode.getTextColor();
    private String Find = null, FindID = null, FindName = null;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private com.AnLa.UI.ImagePanel icoDelete;
    private com.AnLa.UI.ImagePanel icoExcel;
    private com.AnLa.UI.ImagePanel icoReturn;
    private com.AnLa.UI.ImagePanel icoSave;
    private com.AnLa.UI.ImagePanel icoSearch;
    private javax.swing.JLabel lblClass;
    private javax.swing.JLabel lblIDClass;
    private javax.swing.JLabel lblTotalSV;
    private javax.swing.JPanel panClass;
    private javax.swing.JPanel panIDClass;
    private javax.swing.JPanel panSearch;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane scrPan;
    private javax.swing.JTextField txtClass;
    private javax.swing.JTextField txtIDClass;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    public void setLop(Lop lop){
        this.lop = lop;
        BigLoader loader = new BigLoader(ParentFrame, true);
        loader.setInfor("/UI/Image/Circle.gif", Lang.getString("Loading"));
        loader.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override public void windowOpened(java.awt.event.WindowEvent evt) {
                new Thread() { @Override public void run() {
                    arrSV = SVDAO.selectAllByLop(lop.getIDLop());
                    txtClass.setText(lop.getName());
                    txtIDClass.setText(Long.toString(lop.getIDLop()));
                    setTotal();
                    fillListSV();
                    icoReturn.requestFocusInWindow();
                    arrLop = LDAO.selectAllByGV(CurrentID);
                    loader.dispose();
                }}.start();
            }});
        loader.setVisible(true);
    }
    private void setTotal(){
        lblTotalSV.setText(Lang.getString("TotalSV").replaceFirst("X", String.valueOf(arrSV.size())));
    }
    private void setSaveIcon(){
        icoSave.setPic(onChange ? "src/UI/Image/Save3.png" : "src/UI/Image/Save.png");
    }
    public void fillListSV(){
        panel.removeAll();
        panel.setLayout(new javax.swing.BoxLayout(panel, javax.swing.BoxLayout.Y_AXIS));
        //them tung sv vao pan
        for(int i = 0 ; i < arrSV.size() ; i++){
            panStudent pansv = new panStudent();
            pansv.lblSTT.setText(String.valueOf(i+1));
            pansv.setSinhVien(arrSV.get(i));
            int index = i;
            pansv.icoRemove.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override public void mousePressed(java.awt.event.MouseEvent evt) {
                    onChange = false;
                    arrSV.remove(index);
                    fillListSV();
                }
            });
            pansv.txtIDSV.addKeyListener(new java.awt.event.KeyAdapter() {
                @Override public void keyReleased(java.awt.event.KeyEvent evt) {
                    onChange = false;
                    setSaveIcon();
                }
            });
            pansv.txtNameSV.addKeyListener(new java.awt.event.KeyAdapter() {
                @Override public void keyReleased(java.awt.event.KeyEvent evt) {
                    onChange = false;
                    setSaveIcon();
                }
            });
            pansv.icoImage.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override public void mousePressed(java.awt.event.MouseEvent evt) {
                    icoSaveMousePressed(evt);
                }
            });
            panel.add(pansv);
            pansv.setPlaceholder();
        }
        //them nut them moi
        panPlus panplus = new panPlus();
        panplus.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override public void mousePressed(java.awt.event.MouseEvent evt) {
                int countPan = panel.getComponentCount();
                if(countPan == 1){      arrSV.add(new SinhVien());      } 
                else if(panel.getComponent(countPan - 2) instanceof panStudent prevousPan){
                    SinhVien sv = prevousPan.getSinhVien();
                    String id = sv.getIDSinhVien(),   name = sv.getName();
                    if(sv.getAvatar() == null || sv.getAvatar().equals("")){WMessage(parent, Lang.getString("SelectImageSV"), Lang.getString("Notifi"), WARNING_MESSAGE);}
                    else if((!id.isEmpty() && !name.isEmpty()) && (!id.equals(Lang.getString("EIDSV")) && !name.equals(Lang.getString("ENameSV")))){ arrSV.add(new SinhVien());  }
                    else{  WMessage(parent, Lang.getString("IDNameNotBlank"), Lang.getString("Notifi"), WARNING_MESSAGE);  }
                }
                fillListSV();
                rec.y = panel.getPreferredSize().height + 300;
                panel.scrollRectToVisible(rec);
            }});
        panel.add(panplus);
        setTotal();
        setSaveIcon();
        repaint();
    }
    public void fillListFind(){
        panel.removeAll();
        panel.setLayout(new javax.swing.BoxLayout(panel, javax.swing.BoxLayout.Y_AXIS));
        for(int i = 0 ; i < arrFind.size() ; i++){
            panStudent pansv = new panStudent();
            SinhVien sv = arrFind.get(i);
            pansv.lblSTT.setText(String.valueOf(i+1));
            pansv.setSinhVien(sv);
            pansv.icoRemove.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override public void mousePressed(java.awt.event.MouseEvent evt) {
                    onChange = false;
                    arrSV.remove(sv);
                    fillListFind();
                }
            });
            pansv.txtIDSV.addKeyListener(new java.awt.event.KeyAdapter() {
                @Override public void keyReleased(java.awt.event.KeyEvent evt) {
                    onChange = false;
                    setSaveIcon();
                }
            });
            pansv.txtNameSV.addKeyListener(new java.awt.event.KeyAdapter() {
                @Override public void keyReleased(java.awt.event.KeyEvent evt) {
                    onChange = false;
                    setSaveIcon();
                }
            });
            pansv.icoImage.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override public void mousePressed(java.awt.event.MouseEvent evt) {
                    icoSaveMousePressed(evt);
                }
            });
            panel.add(pansv);
        }
        repaint();
    }
    JnaFileChooser SelectFile = new JnaFileChooser();
    private void addListFromExcel() {
        SelectFile.addFilter("Excel File", "xlsx");
        if(SelectFile.showOpenDialog(LocalData.ParentWindow)) {
            File inputFile = SelectFile.getSelectedFile();
            try ( FileInputStream fis = new FileInputStream(inputFile);) {
                XSSFWorkbook importFile = new XSSFWorkbook(fis);
                XSSFSheet sheet = importFile.getSheetAt(0);
                Iterator<Row> rowIter = sheet.iterator();
                // duyệt hàng
                while (rowIter.hasNext()) {
                    SinhVien sv = new SinhVien();
                    Row row = rowIter.next();
                    Iterator<Cell> cellIter = row.cellIterator();
                    // duyệt cột
                    while (cellIter.hasNext()) {
                        Cell cell = cellIter.next();
                        if (row.getRowNum() != 0) {
                            switch(cell.getColumnIndex()){
                                case 0 -> sv.setIDSinhVien(cell.getStringCellValue());
                                case 1 -> {sv.setName(cell.getStringCellValue());arrSV.add(sv);}
                            }
                        }
                    }
                }
                fis.close();
            } catch (Exception e) {WMessage(parent, Lang.getString("ErrExcel"), Lang.getString("Notifi"), WARNING_MESSAGE);}
        }
    }
}