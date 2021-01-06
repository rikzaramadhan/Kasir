package id.kasir.app.view;

import id.kasir.app.core.ConfigDb;
import id.kasir.app.core.MySQL;
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ProductView {
//mendeklarasikan objek frame atau tampilan, button, label, textfield

    static JFrame frame = new JFrame();
    static JLabel lbJudul = new JLabel("Produk");
    static JLabel lbidBarang = new JLabel("Id Barang");
    static JLabel lbname = new JLabel("Name");
    static JLabel lbprice = new JLabel("Price");
    static JLabel lbStock = new JLabel("Stock");
    static JTable tabelbarang = new JTable();
    static JButton btnUpdate = new JButton("Update");
    static JButton btnDelete = new JButton("Delete");
    static JButton btnTambah = new JButton("Tambah");
   

    //membuat dan memanggil jLabel baru dengan objek
    static JTextField txtidBarang = new JTextField();
    static JTextField txtname = new JTextField();
    static JTextField txtprice = new JTextField();
    static JTextField txtStock = new JTextField();

    public static void main(String[] args) {

        Frame();

        Table();

        Update();

        Delete();  
        
        Tambah();

        clear();

        enabled();

        desabled();

    }

    static void Frame() {
        frame.setTitle("Produk");
        frame.setSize(700, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);

        frame.add(lbJudul);
        frame.add(lbidBarang);
        frame.add(lbname);
        frame.add(lbprice);
        frame.add(lbStock);
        frame.add(tabelbarang);
        frame.add(btnUpdate);
        frame.add(btnDelete);
        frame.add(btnTambah);

        frame.add(txtidBarang);
        frame.add(txtname);
        frame.add(txtprice);
        frame.add(txtStock);

        lbJudul.setBounds(330, 25, 100, 40);
        lbJudul.setFont(new java.awt.Font("Tohama", 1, 20));
        lbidBarang.setBounds(60, 80, 160, 30);
        lbname.setBounds(60, 120, 160, 30);
        lbprice.setBounds(60, 160, 160, 30);
        lbStock.setBounds(60, 200, 160, 30);
        tabelbarang.setBounds(120, 280, 450, 230);
        btnUpdate.setBounds(100, 550, 100, 20);
        btnDelete.setBounds(300, 550, 100, 20);
        btnTambah.setBounds(500, 550, 100, 20);
        

        txtidBarang.setBounds(240, 80, 160, 30);
        txtname.setBounds(240, 120, 160, 30);
        txtprice.setBounds(240, 160, 160, 30);
        txtStock.setBounds(240, 200, 160, 30);

    }

    static void Table() {

        DefaultTableModel model = new DefaultTableModel();
        tabelbarang.setModel(model);
        model.addColumn("idBarang");
        model.addColumn("name");
        model.addColumn("price");
        model.addColumn("Stock");

        try {
            String sql = "SELECT * FROM barang";
            java.sql.Connection conn = new MySQL().getConnection();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {
                Object[] obj = new Object[4];
                obj[0] = res.getString("idBarang");
                obj[1] = res.getString("name");
                obj[2] = res.getString("price");
                obj[3] = res.getString("Stock");
                model.addRow(obj);
            }
            tabelbarang.setModel(model);
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    static void clear() {
        txtidBarang.setText("");
        txtname.setText("");
        txtprice.setText("");
        txtStock.setText("");
    }

    static void enabled() {
        txtidBarang.enable(true);
        txtname.enable(true);
        txtprice.enable(true);
        txtStock.enable(true);
        txtidBarang.requestFocus();
    }

    static void desabled() {
        txtidBarang.enable(false);
        txtname.enable(false);
        txtprice.enable(false);
        txtStock.enable(false);

    }

    static void Update() {
        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

                int selectedRow = tabelbarang.getSelectedRow();
                String idBarang = (String) tabelbarang.getValueAt(selectedRow, 0);
                String name = (String) tabelbarang.getValueAt(selectedRow, 1);
                String price = (String) tabelbarang.getValueAt(selectedRow, 2);
                String stock = (String) tabelbarang.getValueAt(selectedRow, 3);

                try {
                    String sql = ("UPDATE barang " + "SET " + "name = '" + name + "',"
                            + "price = '" + price + "'," + "Stock = '" + stock + "'"
                            + "WHERE " + "idBarang = '" + idBarang + "'");
                    java.sql.Connection conn = new MySQL().getConnection();
                    java.sql.Statement stm = conn.createStatement();
                    stm.executeUpdate(sql);
                    txtidBarang.setText("");
                    txtname.setText("");
                    txtprice.setText("");
                    txtStock.setText("");
                    Table();
                } catch (SQLException e) {
                    System.out.println("Error : " + e.getMessage());
                }
//                }

            }
        });
    }
    static void Delete() {
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                int selectedRow = tabelbarang.getSelectedRow();
                String idBarang = (String) tabelbarang.getValueAt(selectedRow, 0);

                try {
                    String sql = "DELETE FROM barang WHERE idBarang = '" + idBarang + "'";
                    java.sql.Connection conn = new MySQL().getConnection();
                    java.sql.Statement stm = conn.createStatement();
                    stm.execute(sql);
                    txtidBarang.setText("");
                    txtname.setText("");
                    txtprice.setText("");
                    txtStock.setText("");
                    Table();
                    clear();
                    desabled();
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                    JOptionPane.showMessageDialog(null, "Data gagal dihapus");
                 }
                }
       
        });
    }
    static void Tambah() {
        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            String idbarang = txtidBarang.getText();
                try {
                    String sql = ("INSERT INTO barang  "+ txtidBarang.getText()+" + ");
                    java.sql.Connection conn = new MySQL().getConnection();
                    java.sql.Statement stm = conn.createStatement();
                    stm.executeUpdate(sql);
                    txtidBarang.setText("");
                    txtname.setText("");
                    txtprice.setText("");
                    txtStock.setText("");
                    Table();
                    clear();
                    desabled();
                    JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                    JOptionPane.showMessageDialog(null, "Data gagal disimpan");                }

            }
        });
    }

}
       