package UI.Frame;
// Make By Bình An || AnLaVN || KatoVN

import static Controller.LocalData.BLIND;
import static Controller.LocalData.Lang;
import static Controller.LocalData.PANICO;
import ObjectClass.BaoCao;
import com.AnLa.UI.Mode;

public class panStudentAnalytics extends javax.swing.JPanel {

    public panStudentAnalytics() {
        initComponents();
        Mode.setModeComponent(this);
        Mode.setModeComponent(Background);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new com.k33ptoo.components.KGradientPanel();
        lblSTT = new javax.swing.JLabel();
        icoOnline = new com.AnLa.UI.ImagePanel();
        lblIDSV = new javax.swing.JLabel();
        lblNameSV = new javax.swing.JLabel();
        lblMark = new javax.swing.JLabel();
        lblLostFocus = new javax.swing.JLabel();

        Background.setkBorderRadius(25);
        Background.setkEndColor(PANICO);
        Background.setkStartColor(PANICO);

        lblSTT.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        lblSTT.setForeground(Mode.getTextColor());
        lblSTT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSTT.setText("0");

        icoOnline.setBackground(BLIND);
        icoOnline.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout icoOnlineLayout = new javax.swing.GroupLayout(icoOnline);
        icoOnline.setLayout(icoOnlineLayout);
        icoOnlineLayout.setHorizontalGroup(
            icoOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        icoOnlineLayout.setVerticalGroup(
            icoOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblIDSV.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblIDSV.setForeground(Mode.getTextColor());
        lblIDSV.setText("ID Sinh viên");

        lblNameSV.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblNameSV.setForeground(Mode.getTextColor());
        lblNameSV.setText("Tên sinh viên");

        lblMark.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMark.setForeground(Mode.getTextColor());
        lblMark.setText("Ðiem: 10");

        lblLostFocus.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblLostFocus.setForeground(Mode.getTextColor());
        lblLostFocus.setText("Lost Focus: ");
        lblLostFocus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblSTT, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(icoOnline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblIDSV, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblNameSV, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lblMark, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lblLostFocus, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icoOnline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIDSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLostFocus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMark, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNameSV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private BaoCao BC;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KGradientPanel Background;
    public com.AnLa.UI.ImagePanel icoOnline;
    private javax.swing.JLabel lblIDSV;
    private javax.swing.JLabel lblLostFocus;
    private javax.swing.JLabel lblMark;
    private javax.swing.JLabel lblNameSV;
    public javax.swing.JLabel lblSTT;
    // End of variables declaration//GEN-END:variables

    public void setAnalytics(BaoCao bc){
        this.BC = bc;
        lblIDSV.setText(BC.getIDSinhVien());
        lblNameSV.setText(BC.getName());
        lblMark.setText(Lang.getString("Mark") + ": " + BC.getMark());
        lblLostFocus.setText(Lang.getString("LostFocus") + ": " + BC.getLostFocus());
        icoOnline.setPic("src/UI/Image/" + (BC.getStatus() ? "On" : "Off") + "line.png");
    }
}