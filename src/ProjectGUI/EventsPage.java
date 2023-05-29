package ProjectGUI;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.HeadlessException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
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
    EditPage editPage;
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    Color color = new Color(0, 0, 0, 0);
    EventsPage eventsPage;
    boolean isThere = false;

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
        txt_aciklama.setEditable(false);
        txt_sure.setEditable(false);
        btn_instagram.setBackground(color);
        btn_linkedin.setBackground(color);
        btn_github.setBackground(color);
    }

    public void bildir() throws IOException {
        checkEvents(getPlusDay());
    }
    
    public String getPlusDay() {
        String localDate = String.valueOf(LocalDate.now());
        String[] date;
        date = localDate.split("-");
        String localDatePlus = "";
        for (int i = date.length - 1; i >= 0; i--) {
            if (i == 2 || i == 1) {
                localDatePlus += date[i] + ".";
            } else {
                localDatePlus += date[i];
            }
        }
        return localDatePlus;
    }

    private void checkEvents(String plusDay) {
        int sayac = 0;
        try {
            connection = DbHelper.dbEvents();
            String sql = "SELECT * FROM Events Where olayTanimlamasi = ? OR olayTanimlamasi = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, String.valueOf(plusDay));
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                isThere = true;
                sayac++;
            }
        } catch (HeadlessException | SQLException e) {
        } finally {
            try {
                connection.close();
                if (isThere == true) {
                    java.awt.Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(eventsPage, "Yaklaşan "+sayac+" Adet Etkinliğiniz Bulunmaktadır. Lütfen Kontrol Ediniz.","Bilgilendirme",JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException e) {
            }
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_ekilnlikolustur = new javax.swing.JButton();
        btn_duzenle = new javax.swing.JButton();
        btn_kaldir = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btn_instagram = new javax.swing.JButton();
        btn_linkedin = new javax.swing.JButton();
        btn_github = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_events = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_aramaCubugu = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_olayTipi = new javax.swing.JTextField();
        txt_baslik = new javax.swing.JTextField();
        txt_islemZamani = new javax.swing.JTextField();
        txt_baslamaZamani = new javax.swing.JTextField();
        txt_olayTanimlamasi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_aciklama = new javax.swing.JTextArea();
        txt_sure = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setMinimumSize(new java.awt.Dimension(1350, 850));
        setPreferredSize(new java.awt.Dimension(1350, 850));
        setResizable(false);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
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

        btn_kaldir.setBackground(new java.awt.Color(255, 255, 255));
        btn_kaldir.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btn_kaldir.setForeground(new java.awt.Color(0, 0, 0));
        btn_kaldir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/garbage.png"))); // NOI18N
        btn_kaldir.setText("Kaldır");
        btn_kaldir.setBorder(null);
        btn_kaldir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kaldirActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4933947.jpg"))); // NOI18N

        btn_instagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/instagram.png"))); // NOI18N
        btn_instagram.setOpaque(false);
        btn_instagram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_instagramActionPerformed(evt);
            }
        });

        btn_linkedin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/linkedin.png"))); // NOI18N
        btn_linkedin.setOpaque(false);
        btn_linkedin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_linkedinActionPerformed(evt);
            }
        });

        btn_github.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/github.png"))); // NOI18N
        btn_github.setOpaque(false);
        btn_github.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_githubActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html>\nSosyal Medya İkonlarına Tıkladıktan Sonra <br> \nBir Süre Bekleyiniz.");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_duzenle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_ekilnlikolustur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_kaldir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel2Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(btn_instagram, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(btn_linkedin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(btn_github, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_ekilnlikolustur, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_duzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_kaldir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_instagram)
                    .addComponent(btn_linkedin)
                    .addComponent(btn_github))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1010, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(159, 172, 230));
        kGradientPanel1.setkStartColor(new java.awt.Color(128, 208, 199));

        tbl_events.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Başlık", "İşlem Zamanı", "Başlama Zamanı", "Olay Tanımlaması", "Olay Tipi", "Süre", "Olay Açıklaması"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Etkinlikler");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N

        txt_aramaCubugu.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_aramaCubugu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt_aramaCubugu.setOpaque(false);
        txt_aramaCubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_aramaCubuguKeyReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Yenile");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_aramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(txt_aramaCubugu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1040, 560));

        kGradientPanel3.setkEndColor(new java.awt.Color(116, 235, 213));
        kGradientPanel3.setkStartColor(new java.awt.Color(159, 172, 230));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Etkinlik Detayları");

        txt_olayTipi.setBackground(new java.awt.Color(255, 255, 255));
        txt_olayTipi.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txt_olayTipi.setForeground(new java.awt.Color(0, 0, 0));
        txt_olayTipi.setOpaque(false);

        txt_baslik.setBackground(new java.awt.Color(255, 255, 255));
        txt_baslik.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txt_baslik.setForeground(new java.awt.Color(0, 0, 0));
        txt_baslik.setOpaque(false);

        txt_islemZamani.setBackground(new java.awt.Color(255, 255, 255));
        txt_islemZamani.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txt_islemZamani.setForeground(new java.awt.Color(0, 0, 0));
        txt_islemZamani.setOpaque(false);

        txt_baslamaZamani.setBackground(new java.awt.Color(255, 255, 255));
        txt_baslamaZamani.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txt_baslamaZamani.setForeground(new java.awt.Color(0, 0, 0));
        txt_baslamaZamani.setOpaque(false);

        txt_olayTanimlamasi.setBackground(new java.awt.Color(255, 255, 255));
        txt_olayTanimlamasi.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txt_olayTanimlamasi.setForeground(new java.awt.Color(0, 0, 0));
        txt_olayTanimlamasi.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Başlık");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("İşlem Zamanı");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Başlama Zamanı");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Olay Tanımlaması");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Olay Tipi");

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Açıklama");

        txt_aciklama.setColumns(10);
        txt_aciklama.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txt_aciklama.setRows(3);
        txt_aciklama.setTabSize(5);
        txt_aciklama.setOpaque(false);
        jScrollPane2.setViewportView(txt_aciklama);

        txt_sure.setBackground(new java.awt.Color(255, 255, 255));
        txt_sure.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txt_sure.setForeground(new java.awt.Color(0, 0, 0));
        txt_sure.setOpaque(false);

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Süresi");

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_baslik, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_islemZamani, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel11)))
                            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                                .addComponent(txt_olayTanimlamasi, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_olayTipi, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                                        .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_baslamaZamani, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(txt_sure, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 104, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)))
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel3Layout.createSequentialGroup()
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel9)
                                .addGap(2, 2, 2)))
                        .addGroup(kGradientPanel3Layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(jLabel8)
                            .addGap(2, 2, 2)))
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(2, 2, 2)))
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_baslik, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_islemZamani, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addComponent(txt_baslamaZamani)
                        .addComponent(txt_sure)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(8, 8, 8)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_olayTipi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_olayTanimlamasi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel1.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1040, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );

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
                        resultset.getString("olayAciklamasi"),
                        resultset.getString("sure")));
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
                    event.getOlayTipi(), event.getSure(), event.getOlayAciklamasi()};
                defaultTableModel.addRow(row);
            }
        } catch (SQLException e) {
        }
    }

    private void btn_ekilnlikolusturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ekilnlikolusturActionPerformed
        createEvent.setVisible(true);
        setEvents();
    }//GEN-LAST:event_btn_ekilnlikolusturActionPerformed

    private void btn_duzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_duzenleActionPerformed
        editPage = new EditPage();
        int selectedRow = tbl_events.getSelectedRow();
        arrayList = new ArrayList<>();
        if (selectedRow != -1) {
            editPage.setVisible(true);
            int columnCount = tbl_events.getColumnCount();
            for (int i = 0; i < columnCount; i++) {
                Object value = tbl_events.getValueAt(selectedRow, i);
                arrayList.add(String.valueOf(value));
            }
            editPage.setİnfo(arrayList.get(0), arrayList.get(4), arrayList.get(5), arrayList.get(6));
            setEvents();
        } else {
            JOptionPane.showMessageDialog(null, "Düzenlemek istediğiniz etkinliği seçiniz!");
        }


    }//GEN-LAST:event_btn_duzenleActionPerformed

    private void btn_kaldirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kaldirActionPerformed
        int selectedRow = tbl_events.getSelectedRow();
        arrayList = new ArrayList<>();
        if (selectedRow != -1) {
            int columnCount = tbl_events.getColumnCount();
            for (int i = 0; i < columnCount; i++) {
                Object value = tbl_events.getValueAt(selectedRow, i);
                arrayList.add(String.valueOf(value));
            }
            try {
                connection = DbHelper.dbEvents();
                String sql = "DELETE FROM Events WHERE baslik = ? AND islemZamani = ? AND baslamaZamani = ? "
                        + "AND olayTanimlamasi = ? AND olayTipi = ? AND sure = ? AND olayAciklamasi = ?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, arrayList.get(0));
                preparedStatement.setString(2, arrayList.get(1));
                preparedStatement.setString(3, arrayList.get(2));
                preparedStatement.setString(4, arrayList.get(3));
                preparedStatement.setString(5, arrayList.get(4));
                preparedStatement.setString(6, arrayList.get(5));
                preparedStatement.setString(7, arrayList.get(6));
                preparedStatement.execute();

            } catch (SQLException e) {
                System.out.println("Hata Kodu : " + e.getErrorCode());
                System.out.println("Hata Mesajı : " + e.getMessage());
            } finally {
                try {
                    connection.close();
                    JOptionPane.showMessageDialog(eventsPage, "Kaldırma İşlemi Başarılı","Bilgilendirme",JOptionPane.INFORMATION_MESSAGE);
                    setEvents();
                } catch (SQLException e) {
                    System.out.println("Hata Kodu : " + e.getErrorCode());
                    System.out.println("Hata Mesajı : " + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Kaldırmak istediğiniz etkinliği seçiniz!");
        }
    }//GEN-LAST:event_btn_kaldirActionPerformed

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
        txt_sure.setText(arrayList.get(5));
        txt_aciklama.setText(arrayList.get(6));

    }//GEN-LAST:event_tbl_eventsMouseClicked

    private void txt_aramaCubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_aramaCubuguKeyReleased
        String aranan = txt_aramaCubugu.getText();
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<>(defaultTableModel);
        tbl_events.setRowSorter(rowSorter);
        rowSorter.setRowFilter(RowFilter.regexFilter(aranan));
    }//GEN-LAST:event_txt_aramaCubuguKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            getEvents();
            setEvents();
        } catch (SQLException ex) {
            Logger.getLogger(EventsPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_instagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_instagramActionPerformed
        String instagramProfileUrl = "https://www.instagram.com/fatihberkant/";
        try {
            Desktop.getDesktop().browse(new URI(instagramProfileUrl));
        } catch (IOException | URISyntaxException e) {
        }
    }//GEN-LAST:event_btn_instagramActionPerformed

    private void btn_githubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_githubActionPerformed
        String githubProfileUrl = "https://github.com/fatihberkanteren/";
        try {
            Desktop.getDesktop().browse(new URI(githubProfileUrl));
        } catch (IOException | URISyntaxException e) {
        }
    }//GEN-LAST:event_btn_githubActionPerformed

    private void btn_linkedinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_linkedinActionPerformed
        String linkedinProfileUrl = "https://www.linkedin.com/in/fatihberkanteren/";
        try {
            Desktop.getDesktop().browse(new URI(linkedinProfileUrl));
        } catch (IOException | URISyntaxException e) {
        }
    }//GEN-LAST:event_btn_linkedinActionPerformed

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
    private javax.swing.JButton btn_ekilnlikolustur;
    private javax.swing.JButton btn_github;
    private javax.swing.JButton btn_instagram;
    private javax.swing.JButton btn_kaldir;
    private javax.swing.JButton btn_linkedin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private javax.swing.JTable tbl_events;
    private javax.swing.JTextArea txt_aciklama;
    private javax.swing.JTextField txt_aramaCubugu;
    private javax.swing.JTextField txt_baslamaZamani;
    private javax.swing.JTextField txt_baslik;
    private javax.swing.JTextField txt_islemZamani;
    private javax.swing.JTextField txt_olayTanimlamasi;
    private javax.swing.JTextField txt_olayTipi;
    private javax.swing.JTextField txt_sure;
    // End of variables declaration//GEN-END:variables
}
