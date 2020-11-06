/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;

/**
 *
 * @author baros
 */
public class kategoriLaptop {
      int kodeLaptop, hargaLaptop;
      String namaLaptop;

            public Kasir(int kodeLaptop, String namaLaptop, int hargaLaptop){
                this.kodeLaptop = kodeLaptop;
                this.namaLaptop = namaLaptop;
                this.hargaLaptop = hargaLaptop;
            }
            //method 1
            public int getkodeLaptop(){
                return kodeLaptop;
            }
            //method 2
            public String getnamaLaptop(){
                return namaLaptop;
            }
            //method 3
            public int gethargaLaptop(){
                return hargaLaptop;
            }
            @Override
            public String toString(){
                return(this.getkodeLaptop() + this.getnamaLaptop() + this.gethargaLaptop());
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /* int kodeLaptop;
        int hargaLaptop;
        String namaLaptop;

            public kategoriLaptop(int kodeLaptop, String namaLaptop, int hargaLaptop){
                this.kodeLaptop = kodeLaptop;
                this.namaLaptop = namaLaptop;
                this.hargaLaptop= hargaLaptop;
            }
    }
            //method 1
            public int getkodeLaptop(){
                return kodeLaptop;
            }
            //method 2
            public String getnamaLaptop(){
                return namaLaptop;
            }
            //method 3
            public int gethargaLaptop(){
                return hargaLaptop;
            }
            @Override
            public String toString(){
                return(this.getkodeLaptop() + this.getnamaLaptop() + this.gethargaLaptop());
    }
}
