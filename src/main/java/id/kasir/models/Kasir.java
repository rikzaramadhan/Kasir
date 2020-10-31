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
public class Kasir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Masukan Nama :");
        String nama = input.next();
        System.out.println("Masukan Pin :");
        int pin = input.nextInt();
        System.out.println("Jam");
        int jam = input.nextInt();
        if (jam<=8){
            System.out.println("Tepat Waktu");
        }else {
            System.out.println("Telat");
        }
        System.out.println(nama+"\n"+jam);
        
    }
    
}
