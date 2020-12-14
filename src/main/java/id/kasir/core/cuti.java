/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
    class cuti extends absen {

        @Override
        public void setNama(String nama) {
            super.setNama(nama);
        }

        @Override
        public void setPin(int pin) {
            super.setPin(pin);
        }

        void isCuti(){
            Scanner input = new Scanner (System.in);
            String nama = input.next();
            setNama(nama);
            int pin = input.nextInt();
            setPin(pin);
            System.out.println("Hari : ");
            int hari = input.nextInt();
            if (hari<=5){
                System.out.println("Accept");
            }else {
                System.out.println("Fail");
            }
        }
    }