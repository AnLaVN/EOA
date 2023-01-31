package UI.Frame;
// Make By Bình An || AnLaVN || KatoVN

import static Controller.LocalData.BLIND;
import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class panExam extends javax.swing.JPanel {

    public panExam() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panBackground = new com.k33ptoo.components.KGradientPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                int w = getWidth();
                int h = getHeight();
                Dimension arcs = new Dimension(kBorderRadius, kBorderRadius);

                GradientPaint gp = new GradientPaint(0, 0, kStartColor, kGradientFocus, h, kEndColor);
                g2d.setStroke(new BasicStroke(4));
                g2d.setPaint(gp);
                if (kFillBackground == true) {
                    g2d.fillRoundRect(0, 0, w - 1, h - 1, arcs.width, arcs.height);
                }

                g2d.drawRoundRect(0, 0, w - 1, h - 1, arcs.width, arcs.height);

                int shade = 0;
                int topOpacity = 80;
                for (int i = 0; i < pixels; i++) {
                    g.setColor(new java.awt.Color(shade, shade, shade, ((topOpacity / pixels) * i)));
                    g.drawRect(i, i, this.getWidth() - ((i * 2) + 1), this.getHeight() - ((i * 2) + 1));
                }
            }
        };
        lblName = new javax.swing.JLabel();
        lblSentences = new javax.swing.JLabel();
        lblExamTime = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblDay = new javax.swing.JLabel();

        setBackground(BLIND);

        panBackground.setBackground(BLIND);
        panBackground.setkBorderRadius(30);
        panBackground.setkEndColor(new java.awt.Color(101, 121, 155));
        panBackground.setkFillBackground(false);
        panBackground.setkGradientFocus(900);
        panBackground.setkStartColor(new java.awt.Color(85, 82, 115));

        lblName.setFont(new java.awt.Font("Courier New", 1, 40)); // NOI18N
        lblName.setText("THI THPT QUOC GIA");

        lblSentences.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblSentences.setForeground(new java.awt.Color(75, 142, 221));
        lblSentences.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSentences.setText("60 câu");

        lblExamTime.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblExamTime.setForeground(new java.awt.Color(239, 113, 100));
        lblExamTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExamTime.setText("120 phút");

        lblTime.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime.setText("15:30");

        lblDay.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        lblDay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDay.setText("30/02/2022");

        javax.swing.GroupLayout panBackgroundLayout = new javax.swing.GroupLayout(panBackground);
        panBackground.setLayout(panBackgroundLayout);
        panBackgroundLayout.setHorizontalGroup(
            panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblExamTime, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSentences, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDay, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panBackgroundLayout.setVerticalGroup(
            panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addComponent(lblSentences, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblExamTime, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblDay, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(panBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(panBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel lblDay;
    public javax.swing.JLabel lblExamTime;
    public javax.swing.JLabel lblName;
    public javax.swing.JLabel lblSentences;
    public javax.swing.JLabel lblTime;
    public com.k33ptoo.components.KGradientPanel panBackground;
    // End of variables declaration//GEN-END:variables
}