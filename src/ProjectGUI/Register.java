package ProjectGUI;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Fatih Berkant EREN
 * @version 1.0.0
 *
 */
public class Register extends javax.swing.JFrame {

    ImageIcon icon = new ImageIcon("src\\icons\\favicon-32x32.png");
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    LoginPage loginPage = new LoginPage();
    Color transparentColor = new Color(0, 0, 0, 0);

    public Register() {
        initComponents();
        this.setIconImage(icon.getImage());
        cmb_kullaniciTipi.setBackground(transparentColor);
        btn_geri.setBackground(transparentColor);
        this.setTitle("Kayıt Ol");
    }

    private boolean checkTC() {
        boolean isOkey;
        String tcNo = txt_tcNo.getText();
        if (tcNo.length() != 11) {
            isOkey = false;
        } else {
            int toplam = 0;
            for (int i = 0; i < tcNo.length() - 1; i++) {
                toplam += Integer.parseInt(String.valueOf(tcNo.charAt(i)));
            }

            isOkey = toplam % 10 == Integer.parseInt(String.valueOf(tcNo.charAt(10)));
        }
        return isOkey;
    }

    /**
     * @param comboBox
     */
    public void veritabanınaEkle(javax.swing.JComboBox<String> comboBox) {
        try {
            connection = DbHelper.dbAdmin();
            String sql = "INSERT INTO Admin (name,lastName,userName,password,tcNo,telNumber,eMail,adress,userType)"
                    + "VALUES(?,?,?,?,?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, txt_ad.getText());
            preparedStatement.setString(2, txt_soyad.getText());
            preparedStatement.setString(3, txt_kullaniciAdi.getText());
            preparedStatement.setString(4, pswrd_sifre.getText());
            preparedStatement.setString(5, txt_tcNo.getText());
            preparedStatement.setString(6, txt_telefon.getText());
            preparedStatement.setString(7, txt_email.getText());
            preparedStatement.setString(8, txt_adres.getText());
            if (comboBox.getSelectedIndex() == 1) {
                preparedStatement.setString(9, "Admin");
            } else if (comboBox.getSelectedIndex() == 2) {
                preparedStatement.setString(9, "Kullanici");
            } else {
                JOptionPane.showMessageDialog(null, "Kullanıcı Tipi Seçiniz.");
            }
            preparedStatement.execute();

        } catch (SQLException e) {
            System.out.println("Hata Kodu : " + e.getErrorCode());
            System.out.println("Hata Mesajı : " + e.getMessage());
        }

        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("Hata Kodu : " + e.getErrorCode());
            System.out.println("Hata Mesajı : " + e.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_ad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pswrd_sifre = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        btn_kayıtOl = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_tcNo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_telefon = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_adres = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_soyad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmb_kullaniciTipi = new javax.swing.JComboBox<>();
        chck_göster = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        txt_kullaniciAdi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_geri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        kGradientPanel2.setAutoscrolls(true);
        kGradientPanel2.setEnabled(false);
        kGradientPanel2.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel2.setkGradientFocus(600);
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(1410, 816));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ad");

        txt_ad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_ad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt_ad.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Şifre");

        pswrd_sifre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pswrd_sifre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        pswrd_sifre.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("E-mail");

        txt_email.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt_email.setOpaque(false);

        btn_kayıtOl.setBackground(new java.awt.Color(0, 204, 204));
        btn_kayıtOl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_kayıtOl.setForeground(new java.awt.Color(0, 0, 0));
        btn_kayıtOl.setText("Kayıt Ol");
        btn_kayıtOl.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        btn_kayıtOl.setOpaque(false);
        btn_kayıtOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kayıtOlActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("T.C. Kimlik Numarası");

        txt_tcNo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_tcNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt_tcNo.setOpaque(false);

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Telefon Numarası");

        txt_telefon.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_telefon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt_telefon.setOpaque(false);

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Adres");

        txt_adres.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_adres.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt_adres.setOpaque(false);

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Kullanıcı Rolü");

        txt_soyad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_soyad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt_soyad.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Soyad");

        cmb_kullaniciTipi.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cmb_kullaniciTipi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Yönetici", "Normal Kullanıcı" }));
        cmb_kullaniciTipi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        cmb_kullaniciTipi.setOpaque(false);

        chck_göster.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        chck_göster.setForeground(new java.awt.Color(0, 0, 0));
        chck_göster.setText("Göster");
        chck_göster.setOpaque(false);
        chck_göster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chck_gösterActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Kullanıcı Adı");

        txt_kullaniciAdi.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_kullaniciAdi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt_kullaniciAdi.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(txt_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_kayıtOl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_telefon)
                                .addComponent(txt_adres)
                                .addComponent(txt_tcNo)
                                .addComponent(cmb_kullaniciTipi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel7)
                                        .addComponent(txt_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(txt_email)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(txt_kullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(pswrd_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chck_göster)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pswrd_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chck_göster)
                    .addComponent(txt_kullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_tcNo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_adres, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(cmb_kullaniciTipi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btn_kayıtOl, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("McbuTeams");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("<html>\n<b>TOGETHER WİTH YOU WİTH İTS NEW GENERATİON DESİGN<b>\n<br>\nYOUR MEETİNG ARE SAFE NOW");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/9907640_4293766.png"))); // NOI18N

        btn_geri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/geributonu.png"))); // NOI18N
        btn_geri.setBorder(null);
        btn_geri.setOpaque(false);
        btn_geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_geriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(jLabel5))))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(btn_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(btn_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel8))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chck_gösterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chck_gösterActionPerformed
        if (chck_göster.isSelected()) {
            pswrd_sifre.setEchoChar((char) 0);
        } else {
            pswrd_sifre.setEchoChar('*');
        }
    }//GEN-LAST:event_chck_gösterActionPerformed
    /**
     * @return true or false
     *
     */
    public boolean isOkey() {
        boolean isFull = true;
        if (txt_ad.getText().equals("") || txt_adres.getText().equals("") || txt_email.getText().equals("")
                || txt_kullaniciAdi.getText().equals("") || txt_soyad.getText().equals("") || txt_tcNo.getText().equals("")
                || txt_telefon.getText().equals("") || String.valueOf(pswrd_sifre.getPassword()).equals("")) {
            isFull = false;
        }
        return isFull;
    }

    /**
     * @return true or false Bu metot kullanıcı tipinin seçilip seçilmediği
     * kontrolünü yapıyor
     */
    public boolean isSelectedType() {
        boolean isTrue;
        isTrue = cmb_kullaniciTipi.getSelectedIndex() == 1 || cmb_kullaniciTipi.getSelectedIndex() == 2;
        return isTrue;
    }

    private void btn_kayıtOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kayıtOlActionPerformed
        if (isSelectedType() == true && isOkey() == true && checkTC() == true) {
            veritabanınaEkle(cmb_kullaniciTipi);
            int choice = JOptionPane.showOptionDialog(null, "Kayıt Başarılı. Giriş Sayfasına Yönlendiriliyorsunuz.", "Bilgilendirme", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if (choice == JOptionPane.OK_OPTION) {
                this.setVisible(false);
                loginPage.setVisible(true);
            }
        } else {
            if (checkTC() == false) {
                JOptionPane.showMessageDialog(null, "Lütfen geçerli bir TC Kimlik Numarası Giriniz!");
            } else {
                JOptionPane.showMessageDialog(null, "Lütfen ilgili alanların tamamını doldurunuz !");
            }

        }
    }//GEN-LAST:event_btn_kayıtOlActionPerformed

    private void btn_geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_geriActionPerformed
        this.setVisible(false);
        loginPage.setVisible(true);
    }//GEN-LAST:event_btn_geriActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_geri;
    private javax.swing.JButton btn_kayıtOl;
    private javax.swing.JCheckBox chck_göster;
    private javax.swing.JComboBox<String> cmb_kullaniciTipi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JPasswordField pswrd_sifre;
    private javax.swing.JTextField txt_ad;
    private javax.swing.JTextField txt_adres;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_kullaniciAdi;
    private javax.swing.JTextField txt_soyad;
    private javax.swing.JTextField txt_tcNo;
    private javax.swing.JTextField txt_telefon;
    // End of variables declaration//GEN-END:variables
}
