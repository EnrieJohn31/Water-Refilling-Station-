/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package water_refilling_station;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Enrie John B. Edem
 */
public class CashPickup extends javax.swing.JInternalFrame {
    public Connection con = null;
    public Statement st = null;
    String s;
    /**
     * Creates new form CashPickup
     */
    public CashPickup() {
        initComponents();
        viewdata();
    }
    public void viewdata() {
        try {
            DefaultTableModel mod = (DefaultTableModel) table.getModel();
            con = XConnect.Connect();
            String sql = "select *from pickup";
            st = con.createStatement();
            ResultSet rss = st.executeQuery(sql);
            mod.setRowCount(0);
            while (rss.next()) {
                mod.addRow(new Object[]{rss.getInt("ID"),rss.getString("Name"), rss.getString("Contact"), rss.getInt("Bottles"), rss.getDouble("Total")});
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addimage = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        epic = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        num = new javax.swing.JTextField();
        bot = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        setClosable(true);
        setTitle("Pickup");
        setMinimumSize(new java.awt.Dimension(50, 50));
        setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("NAME:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(128, 370, 50, 16);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("NUMBER:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(123, 420, 60, 16);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("HOW MANY BOTTLES:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(38, 480, 140, 16);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("IMAGE:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(210, 50, 80, 20);

        addimage.setBackground(new java.awt.Color(255, 255, 255));
        addimage.setText("Add Image");
        addimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addimageActionPerformed(evt);
            }
        });
        getContentPane().add(addimage);
        addimage.setBounds(190, 290, 90, 32);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adblack.png"))); // NOI18N
        jButton1.setText("ADD COSTUMER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(420, 560, 190, 50);

        epic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(epic);
        epic.setBounds(140, 80, 200, 200);

        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });
        getContentPane().add(name);
        name.setBounds(190, 360, 148, 30);

        num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numKeyTyped(evt);
            }
        });
        getContentPane().add(num);
        num.setBounds(190, 410, 148, 30);

        bot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                botKeyTyped(evt);
            }
        });
        getContentPane().add(bot);
        bot.setBounds(190, 470, 148, 30);

        Update.setBackground(new java.awt.Color(255, 255, 255));
        Update.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Updateblack.png"))); // NOI18N
        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update);
        Update.setBounds(180, 560, 150, 50);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Number", "Bottles", "Total"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(450, 120, 490, 366);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1030, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            con = XConnect.Connect();
            String sql = "insert into pickup values(null, ?, ?, ?, ?, ?)";
            PreparedStatement pss = con.prepareStatement(sql);
            st = con.createStatement();
            InputStream is = new FileInputStream(new File(s));
            String a =bot.getText();
            double b =Double.parseDouble(a);
            
            pss.setBlob(1,is);
            pss.setString(2, name.getText());
            pss.setString(3, num.getText());
            pss.setString(4, bot.getText());
            pss.setDouble(5, b*20);
            pss.executeUpdate();
            viewdata();
            
            epic.setIcon(null);
            name.setText(null);
            num.setText(null);
            bot.setText(null);
            JOptionPane.showMessageDialog(null, "Added");
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CashDeliver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addimageActionPerformed
        JFileChooser jfc = new JFileChooser();
        jfc.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        FileNameExtensionFilter filter= new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        jfc.addChoosableFileFilter(filter);
        int res = jfc.showOpenDialog(null);
        
        if(res == JFileChooser.APPROVE_OPTION){
            File select = jfc.getSelectedFile();
            String Path = select.getAbsolutePath();
            
            ImageIcon i = new ImageIcon(Path);
            
            Image image = i.getImage().getScaledInstance(epic.getWidth(), epic.getHeight(), Image.SCALE_SMOOTH);
            epic.setIcon(new ImageIcon(image));
            s = Path;
        }else{
            JOptionPane.showMessageDialog(null, "No Data");
        }
    }//GEN-LAST:event_addimageActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        DefaultTableModel mod = (DefaultTableModel) table.getModel();
        int row = table.getSelectedRow();
        con = XConnect.Connect();
        try {
            String dataClicked = mod.getValueAt(row, 0).toString();
            st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from pickup where ID='" + dataClicked + "'");
            if (rs.next()) {
                byte[] img = rs.getBytes("Image");
                String a = rs.getString("Name");
                String b = rs.getString("Contact");
                int c = rs.getInt("Bottles");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(epic.getWidth(), epic.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                epic.setIcon(newImage);
                name.setText(a);
                num.setText(b);
                bot.setText("" + c);

            }

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tableMouseClicked

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        int yn = JOptionPane.showConfirmDialog(this, "Are you sure you want to Update?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (yn == 0) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            try {
                con = XConnect.Connect();

                int row = table.getSelectedRow();
                String dataClicked = model.getValueAt(row, 0).toString();

                String a = bot.getText();
                double b = Double.parseDouble(a);

                String query = "update pickup set Name= '" + name.getText() + "',Contact='" + num.getText() + "', Bottles='" + a + "', Total='" + b * 20
                        + "'where ID = '" + dataClicked + "'";
                PreparedStatement ps = con.prepareStatement(query);

                epic.setIcon(null);
                name.setText(null);
                num.setText(null);
                bot.setText(null);
                ps.executeUpdate(query);
                viewdata();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {

        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
         char c = evt.getKeyChar();
        String e = name.getText();
        if (!((c >= 'A') && (c <= 'Z') || (c >= 'a') && (c <= 'z') || c == '_' || c == '.' || c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_nameKeyTyped

    private void numKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numKeyTyped
        char c = evt.getKeyChar();
        String n = num.getText();
        if (c != java.awt.event.KeyEvent.VK_BACK_SPACE && c != java.awt.event.KeyEvent.VK_DELETE) {
            if (!(c == '_' || c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') || n.length() > 11) {
                if ((c == '.')) {
                    if (!n.contains(".")) {

                    } else {
                        getToolkit().beep();
                        evt.consume();
                    }
                } else {
                    getToolkit().beep();
                    evt.consume();
                }
            }
        }
    }//GEN-LAST:event_numKeyTyped

    private void botKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botKeyTyped
        char c = evt.getKeyChar();
        String n = bot.getText();
        if (c != java.awt.event.KeyEvent.VK_BACK_SPACE && c != java.awt.event.KeyEvent.VK_DELETE) {
            if (!(c == '_' || c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') || n.length() > 7) {
                if ((c == '.')) {
                    if (!n.contains(".")) {

                    } else {
                        getToolkit().beep();
                        evt.consume();
                    }
                } else {
                    getToolkit().beep();
                    evt.consume();
                }
            }
        }
    }//GEN-LAST:event_botKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Update;
    private javax.swing.JButton addimage;
    private javax.swing.JTextField bot;
    private javax.swing.JLabel epic;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField num;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}