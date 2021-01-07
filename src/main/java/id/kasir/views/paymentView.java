package id.payment.app.view;

import id.payment.app.services.paymentService;
import id.payment.app.models.productModel;
import id.payment.app.models.Payment;
import java.sql.*;
import java.util.List;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
   
public class paymentView extends JFrame implements ActionListener {

    private static void PaymentInterface(JPanel panel) {
        
        panel.setLayout(null);
        JLabel titleLabel = new JLabel("Menu Pembayaran"); 
        titleLabel.setOpaque(true);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBackground(Color.darkGray);
        titleLabel.setFont(new Font("Comic Sans Ms", Font.ITALIC, 26));
        titleLabel.setBounds(0,0, 800,55);
        panel.add(titleLabel);
        
       //SUMMON DATABASE
        paymentService paymentService = new paymentService();
        List<productModel> products = paymentService.getAll();
       
       //TABLE
        JTable jt = new JTable();  
        DefaultTableModel model = new DefaultTableModel();
        Object[] columns = new Object[4];
        columns[0] = "Id Barang";
        columns[1] = "Nama Barang";
        columns[2] = "Harga";
        columns[3] = "Stock";
        
        model.setColumnIdentifiers(columns);

        for (productModel product : products) {
            Object[] data = new Object[4];
            data[0]=product.getCode();
            data[1]=product.getName();
            data[2]=product.getPrice();
            data[3]=product.getStock();
            
            model.addRow(data);
        }
        
        jt.setModel(model);
        JScrollPane sp=new JScrollPane(jt);
        panel.add(sp, BorderLayout.CENTER);
        sp.setBounds(28,60,735,240);
         
        //=====================================================
        JSeparator sep = new JSeparator();
        sep.setBounds(28,310,735,1);
        panel.add(sep);
        //=====================================================
        
        // COMPONENT
        // LABEL DAN TEXTFIELD KODE BARANG
        JLabel codeLabel = new JLabel("Kode Barang");
        codeLabel.setFont(new Font("Constantina", Font.PLAIN, 17));
        codeLabel.setBounds(50,330, 100,30);
        panel.add(codeLabel);
        
        JTextField codeText = new JTextField(20);
        codeText.setBounds(155,330, 175,30);
        panel.add(codeText);

         // LABEL DAN TEXTFIELD JUMLAH BARANG
        JLabel amountLabel = new JLabel("Jumlah");
        amountLabel.setFont(new Font("Constantina", Font.PLAIN, 17));
        amountLabel.setBounds(50,380, 100,30);
        panel.add(amountLabel);
        
        JTextField amountText = new JTextField(20);
        amountText.setBounds(155,380, 175,30);
        panel.add(amountText);

       // LABEL DAN TEXTFIELD NAMA BARANG
        JLabel nameLabel = new JLabel("Nama Barang");
        nameLabel.setFont(new Font("Constantina", Font.PLAIN, 17));
        nameLabel.setBounds(425,330, 100,30);
        panel.add(nameLabel);
        
        JTextField nameText = new JTextField(20);
        nameText.setBounds(545,330, 175,30);
        panel.add(nameText);
        
         // LABEL DAN TEXTFIELD TAGIHAN
        JLabel billLabel = new JLabel("Tagihan");
        billLabel.setFont(new Font("Constantina", Font.PLAIN, 17));
        billLabel.setBounds(200,550, 100,30);
        panel.add(billLabel);
        
        JTextField billText = new JTextField(20);
        billText.setBounds(305,550, 175,30);
        panel.add(billText);
         
        // LABEL DAN TEXTFIELD PEMBAYARAN
        JLabel payLabel = new JLabel("Pembayaran");
        payLabel.setFont(new Font("Constantina", Font.PLAIN, 17));
        payLabel.setBounds(200,600, 100,30);
        panel.add(payLabel);
        
        JTextField payText = new JTextField(20);
        payText.setBounds(305,600, 175,30);
        panel.add(payText);
        
        //BUTTON 
        JButton payButton = new JButton("Bayar");
        payButton.setBounds(420,690,100,30);
        panel.add(payButton);
        
        JButton confButton = new JButton("Konfirmasi");
        confButton.setBounds(260,690,100,30);
        panel.add(confButton);
   
    } 
      
    public static void main (String []args) {
        //membuat frame
        JFrame f = new JFrame("KASIR");
        //program akan berhenti jika keluar
        f.setDefaultCloseOperation (EXIT_ON_CLOSE);
        //ukuran frame
        f.setSize (800,800);
        
        //summon panel
        JPanel panel = new JPanel(); 
        f.add(panel);
        PaymentInterface(panel);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setVisible (true); 

}
    
    @Override
    public void actionPerformed(ActionEvent ae) {
  
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}








