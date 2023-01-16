package UI.Frame;
// Make By Bình An || AnLaVN || KatoVN

import static Controller.LocalData.BLIND;
import static Controller.LocalData.PANICO;
import com.AnLa.UI.Mode;

public class panTopic extends javax.swing.JPanel {

    public panTopic() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new com.k33ptoo.components.KGradientPanel();
        lblName = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        setBackground(BLIND);

        Background.setBackground(BLIND);
        Background.setkBorderRadius(30);
        Background.setkEndColor(PANICO);
        Background.setkStartColor(PANICO);
        Background.setPreferredSize(new java.awt.Dimension(200, 200));

        lblName.setFont(new java.awt.Font("Courier New", 1, 35)); // NOI18N
        lblName.setForeground(Mode.getTextColor());
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("De THPT");
        lblName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblTotal.setForeground(Mode.getTextColor());
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("40 câu");
        lblTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Background.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    public javax.swing.JLabel lblName;
    public javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables
}