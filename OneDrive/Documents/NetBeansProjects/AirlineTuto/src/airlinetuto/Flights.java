package airlinetuto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

 
public class Flights extends javax.swing.JFrame {
    
  
    public Flights() {
        initComponents();
        DisplayFlight();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtFCode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSeats = new javax.swing.JTextField();
        cboSource = new javax.swing.JComboBox<>();
        cboDest = new javax.swing.JComboBox<>();
        FDate = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        FlightTable = new javax.swing.JTable();

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("Take Of Date");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.setText(" ");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Manage Flights");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Icarus Airline");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Flight Code");

        txtFCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFCode.setText(" ");
        txtFCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFCodeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Source");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Destination");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("Take Of Date");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("Number Of Seats");

        txtSeats.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSeats.setText(" ");
        txtSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatsActionPerformed(evt);
            }
        });

        cboSource.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboSource.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yangon", "Mandalay", "Lashio", "Heiho", "Bangkok", "Delhi", "Calcutta", "Singapore", " " }));

        cboDest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboDest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yangon", "Mandalay", "Lashio", "Heiho", "Bangkok", "Delhi", "Calcutta", "Singapore", " " }));

        FDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("Flight Lists");

        btnCreate.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(153, 0, 51));
        btnCreate.setText("Create");
        btnCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreateMouseClicked(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(153, 0, 51));
        btnEdit.setText("Edit");
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(153, 0, 51));
        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(153, 0, 51));
        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        FlightTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        FlightTable.setRowHeight(25);
        FlightTable.setRowMargin(2);
        FlightTable.setSelectionBackground(new java.awt.Color(153, 0, 0));
        FlightTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FlightTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(FlightTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(53, 53, 53))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(txtFCode, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(cboSource, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(cboDest, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FDate, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)))
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(68, 68, 68)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboSource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboDest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FDate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEdit)
                        .addComponent(btnDelete)
                        .addComponent(btnBack)))
                .addGap(17, 17, 17)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null, rs1 = null;
    Statement st = null, st1 = null;
    
    private void DisplayFlight()
    {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
            st = con.createStatement();
            rs = st.executeQuery("select * from flighttbl");
            FlightTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }
        
   private void Clear()
    {
        txtFCode.setText("");
        txtSeats.setText("");
        FDate.setDate(null);
    }
    
    private void txtFCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFCodeActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void txtSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatsActionPerformed

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        new MainForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateMouseClicked
            String fCode = txtFCode.getText().trim();  
            String seatsText = txtSeats.getText().trim();  
            if(fCode.isEmpty() || seatsText.isEmpty() || cboSource.getSelectedIndex() == -1 || cboDest.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(this, "All fields required");
            } else {
                try {
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
                    PreparedStatement add = con.prepareStatement("insert into FlightTbl values(?,?,?,?,?)");
                    add.setString(1, fCode);  
                    add.setString(2, cboSource.getSelectedItem().toString());
                    add.setString(3, cboDest.getSelectedItem().toString());
                    add.setString(4, FDate.getDate().toString());
                    
                    if (!seatsText.matches("\\d+")) {
                        JOptionPane.showMessageDialog(this, "Please enter a valid number for seats");
                        return;  
                    }
                        
                    int seats = Integer.parseInt(seatsText);
                    add.setInt(5, seats); 

                    int row = add.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Flight Added");
                    con.close();
                    DisplayFlight();
                    Clear();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e);
                }
            }
    }//GEN-LAST:event_btnCreateMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
         if(Key == ""){
           JOptionPane.showMessageDialog(this, "Please select a flight");
       }else{
           try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
                String query = "Delete from FlightTbl where FlCode='"+Key+"'";
                Statement del = con.createStatement();
                del.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Flight Deleted");
                DisplayFlight();
           } catch (Exception e) {
               JOptionPane.showMessageDialog(this, e);
           }
       }
    }//GEN-LAST:event_btnDeleteMouseClicked

    String Key = "";
    private void FlightTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlightTableMouseClicked
            DefaultTableModel model = (DefaultTableModel)FlightTable.getModel();
            int MyIndex = FlightTable.getSelectedRow();
            if (MyIndex != -1) {  
                Key = model.getValueAt(MyIndex, 0).toString();
                cboSource.setSelectedItem(model.getValueAt(MyIndex, 1).toString());
                cboDest.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
                String dateString = model.getValueAt(MyIndex, 3).toString();  
                if (dateString != null && !dateString.isEmpty()) {
                    try {
                        Date date = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy").parse(dateString); // Parse the date string
                        FDate.setDate(date); // Set the parsed date to the JDateChooser
                    } catch (ParseException ex) {   
                        ex.printStackTrace(); // Handle the parse exception appropriately
                        JOptionPane.showMessageDialog(this, "Error parsing date: " + dateString);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Date is empty or null");
                }
                txtSeats.setText(model.getValueAt(MyIndex, 4).toString());
            }
    }//GEN-LAST:event_FlightTableMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        if(Key == "")
        {
            JOptionPane.showMessageDialog(this, "Select a flight");
        }
        else{
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
                String query = "Update FlightTbl set FlSource=?,FlDest=?,FlDate=?,FlSeats=? where FlCode=?";
                PreparedStatement add = con.prepareStatement(query);
                add.setString(5, Key);
                add.setString(1, cboSource.getSelectedItem().toString());
                add.setString(2, cboDest.getSelectedItem().toString());
                add.setString(3, FDate.getDate().toString()); 
                add.setString(4, txtSeats.getText());
                    
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Flight Updated");
                con.close();
                DisplayFlight();
                Clear();    
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_btnEditMouseClicked

     
    public static void main(String args[]) {
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Flights().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FDate;
    private javax.swing.JTable FlightTable;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox<String> cboDest;
    private javax.swing.JComboBox<String> cboSource;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txtFCode;
    private javax.swing.JTextField txtSeats;
    // End of variables declaration//GEN-END:variables
}
