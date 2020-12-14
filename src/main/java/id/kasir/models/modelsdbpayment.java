/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baros
 */
public class modelsdbpayment {
  int harga_barang;
  String nama_barang;
  
  
  //SETTER
 
  public void setharga_barang(int hargaBarang) {
    this.harga_barang = hargaBarang;
  }
  
  public void setnama_barang(String namaBarang) {
    this.nama_barang = namaBarang;
  }
  
  //GETTER
     public int getharga_barang(){
    return harga_barang; 
  }
   
    public String getnama_barang() {
    return nama_barang;
  }
}


