package UI.Frame;
// Make By Bình An || AnLaVN || KatoVN

import static Controller.LocalData.BLIND;
import static Controller.LocalData.PANICO;
import com.AnLa.UI.Mode;

public class panAnalytics extends javax.swing.JPanel {

    public panAnalytics() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new com.k33ptoo.components.KGradientPanel();
        lblEXam = new javax.swing.JLabel();
        lblOnline = new javax.swing.JLabel();

        setBackground(BLIND);

        Background.setBackground(BLIND);
        Background.setkBorderRadius(30);
        Background.setkEndColor(PANICO);
        Background.setkStartColor(PANICO);
        Background.setPreferredSize(new java.awt.Dimension(200, 200));

        lblEXam.setFont(new java.awt.Font("Courier New", 1, 35)); // NOI18N
        lblEXam.setForeground(Mode.getTextColor());
        lblEXam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEXam.setText("THI THPT");
        lblEXam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblOnline.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblOnline.setForeground(Mode.getTextColor());
        lblOnline.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOnline.setText("10 Online");
        lblOnline.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Background.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEXam, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblEXam, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(lblOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KGradientPanel Background;
    public javax.swing.JLabel lblEXam;
    public javax.swing.JLabel lblOnline;
    // End of variables declaration//GEN-END:variables
}