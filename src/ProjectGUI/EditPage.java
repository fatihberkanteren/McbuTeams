package ProjectGUI;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Fatih Berkant EREN
 */
public class EditPage extends javax.swing.JFrame {

    ImageIcon icon = new ImageIcon("src\\icons\\favicon-32x32.png");
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    Color color = new Color(0, 0, 0, 0);

    /**
     * Creates new form EditPage
     */
    public EditPage() {
        initComponents();
        btn_geri.setBackground(color);
        this.setTitle("Düzenle");
        this.setIconImage(icon.getImage());
    }

    public void setİnfo(String baslik, String olayTipi, String sure, String aciklama) {
        txt_baslik.setText(baslik);
        txt_olayAciklamasi.setText(aciklama);
        txt_olayTipi.setText(olayTipi);
        txt_sure.setText(sure);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_onayla = new javax.swing.JButton();
        txt_olayAciklamasi = new javax.swing.JTextField();
        date_calendar = new com.toedter.calendar.JDateChooser();
        cmb_time = new javax.swing.JComboBox<>();
        txt_olayTipi = new javax.swing.JTextField();
        txt_baslik = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_sure = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_geri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(116, 235, 213));
        kGradientPanel1.setkStartColor(new java.awt.Color(159, 172, 230));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_onayla.setBackground(new java.awt.Color(255, 255, 255));
        btn_onayla.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn_onayla.setForeground(new java.awt.Color(0, 0, 0));
        btn_onayla.setText("Onayla");
        btn_onayla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_onaylaActionPerformed(evt);
            }
        });

        txt_olayAciklamasi.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_olayAciklamasi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt_olayAciklamasi.setOpaque(false);
        txt_olayAciklamasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_olayAciklamasiActionPerformed(evt);
            }
        });

        date_calendar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        date_calendar.setForeground(new java.awt.Color(0, 0, 0));
        date_calendar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        date_calendar.setOpaque(false);

        cmb_time.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cmb_time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lütfen saat seçiniz.", "00:00", "00:15", "00:30", "00:45", "01:00", "01:15", "01:30", "01:45", "02:00", "02:15", "02:30", "02:45", "03:00", "03:15", "03:30", "03:45", "04:00", "04:15", "04:30", "04:45", "05:00", "05:15", "05:30", "05:45", "06:00", "06:15", "06:30", "06:45", "07:00", "07:15", "07:30", "07:45", "08:00", "08:15", "08:30", "08:45", "09:00", "09:15", "09:30", "09:45", "10:00", "10:15", "10:30", "10:45", "11:00", "11:15", "11:30", "11:45", "12:00", "12:15", "12:30", "12:45", "13:00", "13:15", "13:30", "13:45", "14:00", "14:15", "14:30", "14:45", "15:00", "15:15", "15:30", "15:45", "16:00", "16:15", "16:30", "16:45", "17:00", "17:15", "17:30", "17:45", "18:00", "18:15", "18:30", "18:45", "19:00", "19:15", "19:30", "19:45", "20:00", "20:15", "20:30", "20:45", "21:00", "21:15", "21:30", "21:45", "22:00", "22:15", "22:30", "22:45", "23:00", "23:15", "23:30", "23:45" }));

        txt_olayTipi.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_olayTipi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt_olayTipi.setOpaque(false);

        txt_baslik.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_baslik.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt_baslik.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Başlık");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Olay Tipi");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tarih");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Saat");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Açıklama");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Süre");

        txt_sure.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_sure.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt_sure.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_baslik)
                    .addComponent(txt_olayAciklamasi, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_onayla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date_calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txt_olayTipi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(cmb_time, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txt_sure, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_baslik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(date_calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_olayTipi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_time))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_olayAciklamasi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_onayla, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("McbuTeams");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3573382.jpg"))); // NOI18N

        btn_geri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/geributonu.png"))); // NOI18N
        btn_geri.setBorder(null);
        btn_geri.setOpaque(false);
        btn_geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_geriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btn_geri)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel6))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_geri)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @return Olayın gerçekleşme tarihinin bilgisi döner.
     */
    public String currentDate() {
        Date currentDate = new Date();
        SimpleDateFormat currentDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String dateString = currentDateFormat.format(currentDate);
        return dateString;
    }

    /**
     * @return Framede yer alan jcalendar dan seçilen tarih bilgisini dönderir.
     */
    public String getDateChooser() {
        Date selectedDate = date_calendar.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String selectedDateString = dateFormat.format(selectedDate);
        return selectedDateString;
    }

    /**
     * @return Seçilen zamanı dönderir.
     */
    public String getSelectedTime() {
        String selectedTime = cmb_time.getSelectedItem().toString();
        return selectedTime;
    }

    /**
     * @return İlgili alanların dolu olup olmadığını true ya da false olarak
     * dönderir.
     */
    public boolean isOkey() {
        boolean isOkey = true;
        if (txt_baslik.getText().equals("") || txt_olayAciklamasi.getText().equals("") || txt_olayTipi.getText().equals("")
                || currentDate().equals("") || getSelectedTime().equals("") || getDateChooser().equals("") || txt_sure.getText().equals("")) {
            isOkey = false;
        }
        return isOkey;
    }

    private void btn_onaylaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_onaylaActionPerformed
        if (isOkey() == true) {
            try {
                connection = DbHelper.dbEvents();
                String sql = "UPDATE Events SET baslik = ?,islemZamani=?,baslamaZamani=?,olayTanimlamasi=?,olayTipi=?,olayAciklamasi=?,sure =? WHERE baslik = ? AND olayAciklamasi = ?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, txt_baslik.getText());
                preparedStatement.setString(2, currentDate());
                preparedStatement.setString(3, getSelectedTime());
                preparedStatement.setString(4, getDateChooser());
                preparedStatement.setString(5, txt_olayTipi.getText());
                preparedStatement.setString(6, txt_olayAciklamasi.getText());
                preparedStatement.setString(7, txt_sure.getText());
                preparedStatement.setString(8, txt_baslik.getText());
                preparedStatement.setString(9, txt_olayAciklamasi.getText());
                preparedStatement.execute();
            } catch (SQLException e) {
                System.out.println("Hata mesajı : " + e.getMessage());
                System.out.println("Hata kodu : " + e.getErrorCode());
            } finally {
                try {
                    connection.close();
                    int choice = JOptionPane.showOptionDialog(null, "İşlem Başarılı.", "Bilgilendirme", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
                    if (choice == JOptionPane.OK_OPTION) {
                        this.setVisible(false);
                    }
                } catch (HeadlessException | SQLException e) {
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lütfen alanların tamamını doldurunuz.");
        }

    }//GEN-LAST:event_btn_onaylaActionPerformed

    private void btn_geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_geriActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btn_geriActionPerformed

    private void txt_olayAciklamasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_olayAciklamasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_olayAciklamasiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_geri;
    private javax.swing.JButton btn_onayla;
    private javax.swing.JComboBox<String> cmb_time;
    private com.toedter.calendar.JDateChooser date_calendar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField txt_baslik;
    private javax.swing.JTextField txt_olayAciklamasi;
    private javax.swing.JTextField txt_olayTipi;
    private javax.swing.JTextField txt_sure;
    // End of variables declaration//GEN-END:variables
}
