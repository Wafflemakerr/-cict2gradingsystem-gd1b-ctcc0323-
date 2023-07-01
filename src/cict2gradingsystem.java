
import java.awt.Component;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class cict2gradingsystem extends javax.swing.JFrame {
     ResultSet rs;
       Connection con;
        PreparedStatement pst;
        
    public cict2gradingsystem() {
        initComponents();
        Connect();
        Fetch();
        
    // Establishes a connection to the database
    }   
        public void Connect(){
            
    // Load the MySQL JDBC driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/studentgrd","root","");
    // Handle any errors that occur during the fetching process
        } catch (ClassNotFoundException | SQLException ex) {
            java.util.logging.Logger.getLogger(cict2gradingsystem.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        }
    // Fetches data from the database and populates the table
        private void Fetch()     {
            // Prepare and execute the SQL query
           try {
               int q;
               pst = con.prepareStatement("SELECT * FROM studentgrade");
               rs = pst.executeQuery();
               
            // Retrieve the metadata of the result set
               ResultSetMetaData rss = rs.getMetaData();
               q = rss.getColumnCount();
               
            // Get the table model and reset the row count  
               DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
               df.setRowCount(0);
               
            // Iterate through the result set and add data to the table model
            
               while(rs.next()){
                   Vector v2 = new Vector();
                   for(int a = 1; a<=q; a++){
                       v2.add(rs.getString("StudentNO"));
                       v2.add(rs.getString("StudentName"));
                       v2.add(rs.getString("StudentCourse"));
                       v2.add(rs.getString("StudentProgram"));
                       v2.add(rs.getString("EMC0323"));
                       v2.add(rs.getString("EMC0223"));
                       v2.add(rs.getString("CTC0323"));
                       v2.add(rs.getString("NGEC0103"));
                       v2.add(rs.getString("NGEC0303"));
                       v2.add(rs.getString("EGEC0303"));
                       v2.add(rs.getString("FOLA0103"));
                       v2.add(rs.getString("PEUD0222"));
                       v2.add(rs.getString("GWA"));
            // Add the vector as a new row to the table model
                   }
                   df.addRow(v2);
               }
            // Handle any errors that occur during the fetching process
           }    catch (SQLException ex) {
                Logger.getLogger(cict2gradingsystem.class.getName()).log(Level.SEVERE, null, ex);
           }
        }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        canvas1 = new java.awt.Canvas();
        jButton14 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        STDnum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        STDname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        STDcourse = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        EMC1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jlabel2 = new javax.swing.JLabel();
        EMC2 = new javax.swing.JTextField();
        EMC3 = new javax.swing.JTextField();
        jlabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        NGEC1 = new javax.swing.JTextField();
        NGEC2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        EGEC = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        FOLA = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        PEUD = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        GRDTXT = new javax.swing.JTextField();
        progralabel = new javax.swing.JLabel();
        STDProgram = new javax.swing.JTextField();
        RESETBTN = new javax.swing.JButton();
        ADDBTN = new javax.swing.JButton();
        EXITTBN = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        RCBTN = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TXTresult = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("ADD");

        jButton14.setBackground(new java.awt.Color(51, 51, 51));
        jButton14.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("EXIT");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14jButton3ActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true), "Grades Compiler", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 18))); // NOI18N

        STDnum.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        STDnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STDnumActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel1.setText("Student No.");

        STDname.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel2.setText("Student Name");

        STDcourse.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        STDcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STDcourseActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel3.setText("Course");

        EMC1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel7.setText("EMC0323");

        jlabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jlabel2.setText("EMC0223");

        EMC2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        EMC3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        jlabel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jlabel.setText("CTC0323");

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel10.setText("NGEC0103");

        NGEC1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        NGEC2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel11.setText("NGEC0303");

        EGEC.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel12.setText("EGEC0303");

        FOLA.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel13.setText("FOLA0103");

        PEUD.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel14.setText("PEUD0222");

        GRDTXT.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        progralabel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        progralabel.setText("Program & Section");

        STDProgram.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        STDProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STDProgramActionPerformed(evt);
            }
        });

        RESETBTN.setBackground(new java.awt.Color(102, 102, 102));
        RESETBTN.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        RESETBTN.setForeground(new java.awt.Color(255, 255, 255));
        RESETBTN.setText("RESET");
        RESETBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETBTNActionPerformed(evt);
            }
        });

        ADDBTN.setBackground(new java.awt.Color(102, 102, 102));
        ADDBTN.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        ADDBTN.setForeground(new java.awt.Color(255, 255, 255));
        ADDBTN.setText("ADD");
        ADDBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDBTNActionPerformed(evt);
            }
        });

        EXITTBN.setBackground(new java.awt.Color(102, 102, 102));
        EXITTBN.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        EXITTBN.setForeground(new java.awt.Color(255, 255, 255));
        EXITTBN.setText("EXIT");
        EXITTBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITTBNActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("CALCULATE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        RCBTN.setBackground(new java.awt.Color(102, 102, 102));
        RCBTN.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        RCBTN.setForeground(new java.awt.Color(255, 255, 255));
        RCBTN.setText("TRANSCRIPT");
        RCBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RCBTNActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(STDnum)
                                    .addComponent(STDname)
                                    .addComponent(STDcourse, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(progralabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(STDProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(EMC3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(EMC1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(EMC2))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(NGEC1)))
                            .addComponent(jlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EGEC, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NGEC2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(PEUD))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(FOLA, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RCBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(RESETBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ADDBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EXITTBN, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GRDTXT)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(STDnum, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EMC1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NGEC2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(STDname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EMC2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EGEC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(STDcourse, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(progralabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(STDProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EMC3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NGEC1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FOLA, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PEUD, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RESETBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ADDBTN)
                            .addComponent(EXITTBN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(RCBTN)))
                    .addComponent(GRDTXT))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Student Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 14))); // NOI18N

        TXTresult.setColumns(20);
        TXTresult.setRows(5);
        jScrollPane3.setViewportView(TXTresult);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student No.", "Student Name", "Course", "Program", "EMC0323", "EMC0223", "CTC0323", "NGEC0103", "NGEC0303", "EGEC0303", "FOLA0103", "PEUD-222", "Grade"
            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton14jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14jButton3ActionPerformed

    }//GEN-LAST:event_jButton14jButton3ActionPerformed

    private void STDcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STDcourseActionPerformed

    }//GEN-LAST:event_STDcourseActionPerformed

    private void RESETBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETBTNActionPerformed

    JTextField temp = null;
        for (Component c : jPanel1.getComponents()) {
            
    // Check if the component is an instance of JTextField
        if (c.getClass().toString().contains("javax.swing.JTextField")) {
            
    // Cast the component to JTextField and assign it to temp variable
        temp = (JTextField) c;
        
    // Clear the text of the JTextField
        temp.setText(null);
    }
}
    // Clear the text of the TXTresult JTextField
        TXTresult.setText("");
    }//GEN-LAST:event_RESETBTNActionPerformed

    private void RCBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RCBTNActionPerformed
    double[] G = new double[8];

    // Parse the text from the respective JTextFields and store the values in the G array
    G[0] = Double.parseDouble(EMC1.getText());
    G[1] = Double.parseDouble(EMC2.getText());
    G[2] = Double.parseDouble(EMC3.getText());
    G[3] = Double.parseDouble(NGEC1.getText());
    G[4] = Double.parseDouble(NGEC2.getText());
    G[5] = Double.parseDouble(EGEC.getText());
    G[6] = Double.parseDouble(FOLA.getText());
    G[7] = Double.parseDouble(PEUD.getText());

    // Append the student records to the TXTresult JTextField
    TXTresult.append("                Student Records\n"
            + "\n---------------------------------------------------------"
            + "\nStudent No. : " + STDnum.getText()
            + "\nStudent Name : " + STDname.getText()
            + "\nCourse : " + STDcourse.getText()
            + "\nProgram & Section : " + STDProgram.getText()
            + "\n---------------------------------------------------------"
            + "\n"
            + "\nEMC : " + G[0]
            + "\nEMC : " + G[1]
            + "\nEMC : " + G[2]
            + "\nNGEC : " + G[3]
            + "\nNGEC : " + G[4]
            + "\nEGEC : " + G[5]
            + "\nFOLA : " + G[6]
            + "\nPEUD : " + G[7]
            + "\nGWA : " + GRDTXT.getText());
    
    }//GEN-LAST:event_RCBTNActionPerformed

    private void EXITTBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITTBNActionPerformed
        JFrame frame;
        frame = new JFrame("EXIT");

        // Show a confirmation dialog with "Yes" and "No" options
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "EXIT",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_EXITTBNActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        double[] G = new double[8];

        try {
            // Parse the text from the respective JTextFields and store the values in the G array
            G[0] = Double.parseDouble(EMC1.getText());
            G[1] = Double.parseDouble(EMC2.getText());
            G[2] = Double.parseDouble(EMC3.getText());
            G[3] = Double.parseDouble(NGEC1.getText());
            G[4] = Double.parseDouble(NGEC2.getText());
            G[5] = Double.parseDouble(EGEC.getText());
            G[6] = Double.parseDouble(FOLA.getText());
            G[7] = Double.parseDouble(PEUD.getText());
        } catch (NumberFormatException e) {
            
            // If an invalid grade is entered (non-numeric), show an error message and return
            JOptionPane.showMessageDialog(jButton5, "Invalid Grades");
            return;
        }

        for (int i = 0; i < G.length; i++) {
            
            // Check if any input value exceeds 100 or is equal to 0
            if (G[i] > 100) {
                JOptionPane.showMessageDialog(jButton5, "Input value exceeds 100");
                return;
            }

            if (G[i] == 0) {
                JOptionPane.showMessageDialog(jButton5, "Invalid Grades");
                return;
            }
        }

        // Calculate the average grade
        double average = (G[0] + G[1] + G[2] + G[3] + G[4] + G[5] + G[6] + G[7]) / 8;
        String aveText = String.format("%.0f", average);
        GRDTXT.setText(aveText);

        // Assign the appropriate grade based on the average
        if (average >= 98) {
            GRDTXT.setText("1.0");
        } else if (average >= 95) {
            GRDTXT.setText("1.25");
        } else if (average >= 92) {
            GRDTXT.setText("1.5");
        } else if (average >= 89) {
            GRDTXT.setText("1.75");
        } else if (average >= 86) {
            GRDTXT.setText("2.0");
        } else if (average >= 83) {
            GRDTXT.setText("2.25");
        } else if (average >= 80) {
            GRDTXT.setText("2.5");
        } else if (average >= 77) {
            GRDTXT.setText("2.75");
        } else if (average >= 75) {
            GRDTXT.setText("3.0");
        } else {
            GRDTXT.setText("5.0");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void STDnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STDnumActionPerformed

    }//GEN-LAST:event_STDnumActionPerformed

    private void ADDBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDBTNActionPerformed
  
    String stdNum = STDnum.getText();
    String stdName = STDname.getText();
    String stdCourse = STDcourse.getText();
    String stdProgram = STDProgram.getText();
    String grdTxt = GRDTXT.getText();
    String emc1 = EMC1.getText();
    String emc2 = EMC2.getText();
    String emc3 = EMC3.getText();
    String ngec1 = NGEC1.getText();
    String ngec2 = NGEC2.getText();
    String egec = EGEC.getText();
    String fola = FOLA.getText();
    String peud = PEUD.getText();

    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

    // Add a new row to the table model with the student's information and grades
    model.addRow(new Object[]{
        stdNum,
        stdName,
        stdCourse,
        stdProgram,
        emc1,
        emc2,
        emc3,
        ngec1,
        ngec2,
        egec,
        fola,
        peud,
        grdTxt   
    });

    try {
    // Prepare the SQL statement to insert the data into the database table
        pst = con.prepareStatement("INSERT INTO studentgrade (`StudentNo`,`StudentName`,`StudentCourse`,`StudentProgram`, `GWA`, `EMC0323`, `EMC0223`, `CTC0323`, `NGEC0103`, `NGEC0303`, `EGEC0303`, `FOLA0103`, `PEUD0222`)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
        pst.setString(1, stdNum);
        pst.setString(2, stdName);
        pst.setString(3, stdCourse);
        pst.setString(4, stdProgram);
        pst.setString(5, grdTxt);
        pst.setString(6, emc1);
        pst.setString(7, emc2);
        pst.setString(8, emc3);
        pst.setString(9, ngec1);
        pst.setString(10, ngec2);
        pst.setString(11, egec);
        pst.setString(12, fola);
        pst.setString(13, peud);

    // Execute the SQL statement to insert the data into the database table
        int k = pst.executeUpdate();

        if (k == 1) {
            JOptionPane.showMessageDialog(this, "Record Added");

            // Clear the input fields after successful insertion
            STDnum.setText("");
            STDname.setText("");
            STDcourse.setText("");
            GRDTXT.setText("");
            STDProgram.setText("");
            EMC1.setText("");
            EMC2.setText("");
            EMC3.setText("");
            NGEC1.setText("");
            NGEC2.setText("");
            EGEC.setText("");
            FOLA.setText("");
            PEUD.setText("");
            TXTresult.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Record Failed to save");
        }
    } catch (SQLException ex) {
        java.util.logging.Logger.getLogger(cict2gradingsystem.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_ADDBTNActionPerformed

    private void STDProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STDProgramActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_STDProgramActionPerformed

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
            java.util.logging.Logger.getLogger(cict2gradingsystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cict2gradingsystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cict2gradingsystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cict2gradingsystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cict2gradingsystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDBTN;
    private javax.swing.JTextField EGEC;
    private javax.swing.JTextField EMC1;
    private javax.swing.JTextField EMC2;
    private javax.swing.JTextField EMC3;
    private javax.swing.JButton EXITTBN;
    private javax.swing.JTextField FOLA;
    private javax.swing.JTextField GRDTXT;
    private javax.swing.JTextField NGEC1;
    private javax.swing.JTextField NGEC2;
    private javax.swing.JTextField PEUD;
    private javax.swing.JButton RCBTN;
    private javax.swing.JButton RESETBTN;
    private javax.swing.JTextField STDProgram;
    private javax.swing.JTextField STDcourse;
    private javax.swing.JTextField STDname;
    private javax.swing.JTextField STDnum;
    private javax.swing.JTextArea TXTresult;
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel progralabel;
    // End of variables declaration//GEN-END:variables
}
