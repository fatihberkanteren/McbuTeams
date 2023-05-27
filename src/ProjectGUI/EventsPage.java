package ProjectGUI;

import java.awt.Color;
import java.awt.Font;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fatih Berkant EREN
 */
public class EventsPage extends javax.swing.JFrame {

    /**
     * Creates new form EventsPage
     */
    ImageIcon icon = new ImageIcon("src\\icons\\favicon-32x32.png");
    CreateEvent createEvent = new CreateEvent();
    DefaultTableModel defaultTableModel;
    ArrayList<String> arrayList;

    public EventsPage() {
        initComponents();
        setEvents();
        this.setTitle("Etkinliklerim");
        this.setIconImage(icon.getImage());
        tbl_events.setBackground(Color.WHITE);
        tbl_events.setForeground(Color.BLACK);
        tbl_events.setSelectionBackground(Color.BLUE);
        tbl_events.setSelectionForeground(Color.WHITE);
        tbl_events.setFont(new Font("Verdana", Font.PLAIN, 15));
        txt_baslik.setEditable(false);
        txt_baslamaZamani.setEditable(false);
        txt_islemZamani.setEditable(false);
        txt_olayTanimlamasi.setEditable(false);
        txt_olayTipi.setEditable(false);
        txtarea_olayAciklama.setEditable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_ekilnlikolustur = new javax.swing.JButton();
        btn_duzenle = new javax.swing.JButton();
        btn_duzenle1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_baslik = new javax.swing.JTextField();
        txt_islemZamani = new javax.swing.JTextField();
        txt_baslamaZamani = new javax.swing.JTextField();
        txt_olayTanimlamasi = new javax.swing.JTextField();
        txt_olayTipi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea_olayAciklama = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_events = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 810));
        setPreferredSize(new java.awt.Dimension(1310, 810));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("McbuTeams");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hoşgeldiniz");

        btn_ekilnlikolustur.setBackground(new java.awt.Color(255, 255, 255));
        btn_ekilnlikolustur.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btn_ekilnlikolustur.setForeground(new java.awt.Color(0, 0, 0));
        btn_ekilnlikolustur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add-circular-interface-button.png"))); // NOI18N
        btn_ekilnlikolustur.setText("Etkinlik Oluştur");
        btn_ekilnlikolustur.setBorder(null);
        btn_ekilnlikolustur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ekilnlikolusturActionPerformed(evt);
            }
        });

        btn_duzenle.setBackground(new java.awt.Color(255, 255, 255));
        btn_duzenle.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btn_duzenle.setForeground(new java.awt.Color(0, 0, 0));
        btn_duzenle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pencil-on-a-square-outline.png"))); // NOI18N
        btn_duzenle.setText("Düzenle");
        btn_duzenle.setBorder(null);
        btn_duzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_duzenleActionPerformed(evt);
            }
        });

        btn_duzenle1.setBackground(new java.awt.Color(255, 255, 255));
        btn_duzenle1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btn_duzenle1.setForeground(new java.awt.Color(0, 0, 0));
        btn_duzenle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/garbage.png"))); // NOI18N
        btn_duzenle1.setText("Kaldır");
        btn_duzenle1.setBorder(null);
        btn_duzenle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_duzenle1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_duzenle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_ekilnlikolustur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_duzenle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(87, 87, 87)
                .addComponent(btn_ekilnlikolustur, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_duzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_duzenle1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(348, Short.MAX_VALUE))
        );

        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 820));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Etkinlikler");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 227, 157, 42));

        txt_baslik.setBackground(new java.awt.Color(255, 255, 255));
        txt_baslik.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_baslik.setForeground(new java.awt.Color(0, 0, 0));
        txt_baslik.setOpaque(false);
        jPanel1.add(txt_baslik, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 216, 31));

        txt_islemZamani.setBackground(new java.awt.Color(255, 255, 255));
        txt_islemZamani.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_islemZamani.setForeground(new java.awt.Color(0, 0, 0));
        txt_islemZamani.setOpaque(false);
        jPanel1.add(txt_islemZamani, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 12, 216, 31));

        txt_baslamaZamani.setBackground(new java.awt.Color(255, 255, 255));
        txt_baslamaZamani.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_baslamaZamani.setForeground(new java.awt.Color(0, 0, 0));
        txt_baslamaZamani.setOpaque(false);
        jPanel1.add(txt_baslamaZamani, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 12, 216, 31));

        txt_olayTanimlamasi.setBackground(new java.awt.Color(255, 255, 255));
        txt_olayTanimlamasi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_olayTanimlamasi.setForeground(new java.awt.Color(0, 0, 0));
        txt_olayTanimlamasi.setOpaque(false);
        jPanel1.add(txt_olayTanimlamasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 12, 216, 31));

        txt_olayTipi.setBackground(new java.awt.Color(255, 255, 255));
        txt_olayTipi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_olayTipi.setForeground(new java.awt.Color(0, 0, 0));
        txt_olayTipi.setOpaque(false);
        jPanel1.add(txt_olayTipi, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 61, 216, 31));

        txtarea_olayAciklama.setBackground(new java.awt.Color(255, 255, 255));
        txtarea_olayAciklama.setColumns(20);
        txtarea_olayAciklama.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtarea_olayAciklama.setForeground(new java.awt.Color(0, 0, 0));
        txtarea_olayAciklama.setRows(5);
        txtarea_olayAciklama.setOpaque(false);
        jScrollPane1.setViewportView(txtarea_olayAciklama);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 110, 972, 99));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 227, 625, 35));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Yenile");
        jButton1.setBorder(null);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(825, 227, 159, 35));

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 147, 233));
        kGradientPanel1.setkStartColor(new java.awt.Color(128, 208, 199));

        tbl_events.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Başlık", "İşlem Zamanı", "Başlama Zamanı", "Olay Tanımlaması", "Olay Tipi", "Olay Açıklaması"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_events.setRowHeight(40);
        tbl_events.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_eventsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_events);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 980, 570));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 1110, 810));

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @return ArrayLiist
     * @throws SQLException
     */
    @SuppressWarnings("null")
    public ArrayList<Events> getEvents() throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultset;
        ArrayList<Events> events = null;
        try {
            connection = DbHelper.dbEvents();
            statement = connection.createStatement();
            resultset = statement.executeQuery("SELECT * FROM Events");
            events = new ArrayList<>();
            while (resultset.next()) {
                events.add(new Events(resultset.getString("baslik"),
                        resultset.getString("islemZamani"),
                        resultset.getString("baslamaZamani"),
                        resultset.getString("olayTanimlamasi"),
                        resultset.getString("olayTipi"),
                        resultset.getString("olayAciklamasi")));
            }
        } catch (SQLException e) {
            System.out.println("Hata Kodu : " + e.getErrorCode());
            System.out.println("Hata Mesajı : " + e.getMessage());
        } finally {
            statement.close();
            connection.close();
        }
        return events;
    }

    /**
     *
     */
    public void setEvents() {
        defaultTableModel = (DefaultTableModel) tbl_events.getModel();
        defaultTableModel.setRowCount(0);
        try {
            ArrayList<Events> events = getEvents();
            for (Events event : events) {
                Object row[] = {event.getBaslik(), event.getIslemZamani(), event.getBaslamaZamani(), event.getOlayTanimlamasi(),
                    event.getOlayTipi(), event.getOlayAciklamasi()};
                defaultTableModel.addRow(row);
            }
        } catch (SQLException e) {
        }
    }

    private void btn_ekilnlikolusturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ekilnlikolusturActionPerformed
        createEvent.setVisible(true);
    }//GEN-LAST:event_btn_ekilnlikolusturActionPerformed

    private void btn_duzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_duzenleActionPerformed
        int selectedRow = tbl_events.getSelectedRow();
        arrayList = new ArrayList<>();
        if (selectedRow != -1) {
            int columnCount = tbl_events.getColumnCount();
            for (int i = 0; i < columnCount; i++) {
                Object value = tbl_events.getValueAt(selectedRow, i);
                arrayList.add(String.valueOf(value));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Düzenlemek istediğiniz etkinliği seçiniz!");
        }


    }//GEN-LAST:event_btn_duzenleActionPerformed

    private void btn_duzenle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_duzenle1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_duzenle1ActionPerformed

    private void tbl_eventsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_eventsMouseClicked
        int selectedRow = tbl_events.getSelectedRow();
        arrayList = new ArrayList<>();
        if (selectedRow != -1) {
            int columnCount = tbl_events.getColumnCount();
            for (int i = 0; i < columnCount; i++) {
                Object value = tbl_events.getValueAt(selectedRow, i);
                arrayList.add(String.valueOf(value));
            }
        } else {

        }
        txt_baslik.setText(arrayList.get(0));
        txt_islemZamani.setText(arrayList.get(1));
        txt_baslamaZamani.setText(arrayList.get(2));
        txt_olayTanimlamasi.setText(arrayList.get(3));
        txt_olayTipi.setText(arrayList.get(4));
        txtarea_olayAciklama.setText(arrayList.get(5));
    }//GEN-LAST:event_tbl_eventsMouseClicked

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
            java.util.logging.Logger.getLogger(EventsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_duzenle;
    private javax.swing.JButton btn_duzenle1;
    private javax.swing.JButton btn_ekilnlikolustur;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JTable tbl_events;
    private javax.swing.JTextField txt_baslamaZamani;
    private javax.swing.JTextField txt_baslik;
    private javax.swing.JTextField txt_islemZamani;
    private javax.swing.JTextField txt_olayTanimlamasi;
    private javax.swing.JTextField txt_olayTipi;
    private javax.swing.JTextArea txtarea_olayAciklama;
    // End of variables declaration//GEN-END:variables
}
