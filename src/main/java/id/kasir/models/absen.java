/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;
import java.util.Scanner;
import java.util.Date;
    /**
     *
     * @author Asus
     */
    class absen {
        public String nama;
        public int pin;

        public void isAbsen() {
            // TODO code application logic here
            Date date = new Date ();
            System.out.println(date.toString());
            Scanner input = new Scanner (System.in);
            String nama = input.next();
            setNama(nama);
            int pin = input.nextInt();
            setPin(pin);
            System.out.println("Jam");
            int jam = input.nextInt();
            if (jam<=8){
                System.out.println("Tepat Waktu");
            }else {
                System.out.println("Telat");
            }
            System.out.println(this.nama+"\n"+jam);
        }

        public void setNama(String nama) {
            this.nama = nama;
            System.out.println("Masukan Nama :"+nama);
        }
        public void setPin(int pin){
            this.pin = pin;
            System.out.println("Masukan Pin :"+pin);
        }
    }

