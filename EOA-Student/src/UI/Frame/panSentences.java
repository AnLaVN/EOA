package UI.Frame;
// Make By Bình An || AnLaVN || KatoVN

import static Controller.LocalData.*;
import ObjectClass.CauHoi;
import com.AnLa.UI.Mode;

public class panSentences extends javax.swing.JPanel {

    public panSentences() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panBackground = new com.k33ptoo.components.KGradientPanel();
        txtSentences = new javax.swing.JTextArea();
        panA = new com.k33ptoo.components.KGradientPanel();
        lblA = new javax.swing.JLabel();
        panB = new com.k33ptoo.components.KGradientPanel();
        lblB = new javax.swing.JLabel();
        panC = new com.k33ptoo.components.KGradientPanel();
        lblC = new javax.swing.JLabel();
        panD = new com.k33ptoo.components.KGradientPanel();
        lblD = new javax.swing.JLabel();

        setBackground(BLIND);

        panBackground.setBackground(BLIND);
        panBackground.setkBorderRadius(50);
        panBackground.setkEndColor(SEN);
        panBackground.setkStartColor(SEN);
        panBackground.setPreferredSize(new java.awt.Dimension(1360, 400));

        txtSentences.setEditable(false);
        txtSentences.setBackground(BLIND);
        txtSentences.setColumns(20);
        txtSentences.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtSentences.setForeground(Mode.getTextColor());
        txtSentences.setLineWrap(true);
        txtSentences.setRows(5);
        txtSentences.setTabSize(2);
        txtSentences.setWrapStyleWord(true);
        txtSentences.setBorder(null);
        txtSentences.setFocusable(false);

        panA.setBackground(BLIND);
        panA.setkBorderRadius(25);
        panA.setkEndColor(PANANSWER);
        panA.setkStartColor(PANANSWER);

        lblA.setFont(CUSTOMFONT);
        lblA.setForeground(Mode.getTextColor());
        lblA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAMousePressed(evt);
            }
        });

        panA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panALayout = new javax.swing.GroupLayout(panA);
        panA.setLayout(panALayout);
        panALayout.setHorizontalGroup(
            panALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panALayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblA, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        panALayout.setVerticalGroup(
            panALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblA, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        panB.setBackground(BLIND);
        panB.setkBorderRadius(25);
        panB.setkEndColor(PANANSWER);
        panB.setkStartColor(PANANSWER);

        lblB.setFont(CUSTOMFONT);
        lblB.setForeground(Mode.getTextColor());
        lblB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBMousePressed(evt);
            }
        });

        panB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panBLayout = new javax.swing.GroupLayout(panB);
        panB.setLayout(panBLayout);
        panBLayout.setHorizontalGroup(
            panBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblB, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        panBLayout.setVerticalGroup(
            panBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblB, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        panC.setBackground(BLIND);
        panC.setkBorderRadius(25);
        panC.setkEndColor(PANANSWER);
        panC.setkStartColor(PANANSWER);

        lblC.setFont(CUSTOMFONT);
        lblC.setForeground(Mode.getTextColor());
        lblC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCMousePressed(evt);
            }
        });

        panC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panCLayout = new javax.swing.GroupLayout(panC);
        panC.setLayout(panCLayout);
        panCLayout.setHorizontalGroup(
            panCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblC, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        panCLayout.setVerticalGroup(
            panCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblC, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        panD.setBackground(BLIND);
        panD.setkBorderRadius(25);
        panD.setkEndColor(PANANSWER);
        panD.setkStartColor(PANANSWER);

        lblD.setFont(CUSTOMFONT);
        lblD.setForeground(Mode.getTextColor());
        lblD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblDMousePressed(evt);
            }
        });

        panD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panDLayout = new javax.swing.GroupLayout(panD);
        panD.setLayout(panDLayout);
        panDLayout.setHorizontalGroup(
            panDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblD, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        panDLayout.setVerticalGroup(
            panDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panBackgroundLayout = new javax.swing.GroupLayout(panBackground);
        panBackground.setLayout(panBackgroundLayout);
        panBackgroundLayout.setHorizontalGroup(
            panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSentences, javax.swing.GroupLayout.PREFERRED_SIZE, 1380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panBackgroundLayout.createSequentialGroup()
                        .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        panBackgroundLayout.setVerticalGroup(
            panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtSentences, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panD, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(panBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 1420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAMouseEntered
        MouseEnter(panA, AnswerA);
    }//GEN-LAST:event_lblAMouseEntered

    private void lblAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAMouseExited
        MouseExit(panA, AnswerA);
    }//GEN-LAST:event_lblAMouseExited

    private void lblAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAMousePressed
        AnswerA = !AnswerA;
        MouseClick(panA, AnswerA);
    }//GEN-LAST:event_lblAMousePressed

    private void lblBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBMouseEntered
        MouseEnter(panB, AnswerB);
    }//GEN-LAST:event_lblBMouseEntered

    private void lblBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBMouseExited
        MouseExit(panB, AnswerB);
    }//GEN-LAST:event_lblBMouseExited

    private void lblBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBMousePressed
        AnswerB = !AnswerB;
        MouseClick(panB, AnswerB);
    }//GEN-LAST:event_lblBMousePressed

    private void lblCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCMouseEntered
        MouseEnter(panC, AnswerC);
    }//GEN-LAST:event_lblCMouseEntered

    private void lblCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCMouseExited
        MouseExit(panC, AnswerC);
    }//GEN-LAST:event_lblCMouseExited

    private void lblCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCMousePressed
        AnswerC = !AnswerC;
        MouseClick(panC, AnswerC);
    }//GEN-LAST:event_lblCMousePressed

    private void lblDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDMouseEntered
        MouseEnter(panD, AnswerD);
    }//GEN-LAST:event_lblDMouseEntered

    private void lblDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDMouseExited
        MouseExit(panD, AnswerD);
    }//GEN-LAST:event_lblDMouseExited

    private void lblDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDMousePressed
        AnswerD = !AnswerD;
        MouseClick(panD, AnswerD);
    }//GEN-LAST:event_lblDMousePressed
    
    public CauHoi cauhoi;
    private boolean AnswerA = false, AnswerB = false, AnswerC = false, AnswerD = false;
    private final String Sen = Lang.getString("Sen");
    private String DapAn;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblD;
    private com.k33ptoo.components.KGradientPanel panA;
    private com.k33ptoo.components.KGradientPanel panB;
    private com.k33ptoo.components.KGradientPanel panBackground;
    private com.k33ptoo.components.KGradientPanel panC;
    private com.k33ptoo.components.KGradientPanel panD;
    public javax.swing.JTextArea txtSentences;
    // End of variables declaration//GEN-END:variables
    
    public void setSentences(CauHoi ch){
        this.cauhoi = ch;
        txtSentences.setText(   (cauhoi.getCorrectAnswer().length()>1 ? Lang.getString("Muti_Ans")+"\n" : "")+
                                Sen+" "+Dashboard.Index+": "+cauhoi.getQuestion());
        lblA.setText(cauhoi.getAnswerA());
        lblB.setText(cauhoi.getAnswerB());
        lblC.setText(cauhoi.getAnswerC());
        lblD.setText(cauhoi.getAnswerD());
        Dashboard.Index++;
    }
    public boolean getDapAn(){ 
        DapAn = "";
        if(AnswerA) DapAn += "A";
        if(AnswerB) DapAn += "B";
        if(AnswerC) DapAn += "C";
        if(AnswerD) DapAn += "D";
        return DapAn.equals("") ? false : cauhoi.getCorrectAnswer().contains(DapAn); 
    }
    
    public boolean isChoose(){  return AnswerA || AnswerB || AnswerC || AnswerD;    }
    
    private void MouseEnter(com.k33ptoo.components.KGradientPanel pan, boolean choose){
        if(!choose){
            pan.setkStartColor(HOVERANSWER);
            pan.setkEndColor(HOVERANSWER);
        }
        ParentComponent.repaint();
    }
    private void MouseExit(com.k33ptoo.components.KGradientPanel pan, boolean choose){
        if(!choose){
            pan.setkStartColor(PANANSWER);
            pan.setkEndColor(PANANSWER);
        }
        ParentComponent.repaint();
    }
    private void MouseClick(com.k33ptoo.components.KGradientPanel pan, boolean choose){
        pan.setkStartColor(choose ? CLICKANSWER : PANANSWER);
        pan.setkEndColor(choose ? CLICKANSWER : PANANSWER);
        ParentComponent.repaint();
    }

}