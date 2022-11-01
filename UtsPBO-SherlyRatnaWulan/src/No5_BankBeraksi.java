
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class No5_BankBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int ambil = 0, simpan = 0, get = 0;
      Scanner pilih = new Scanner(System.in);
      No5_Bank bk = new No5_Bank(100000);
      
      System.out.println("Selamat Datang di Bank ABC");
      for(int i = 1; i >= 1 ; i++){
          System.out.println("Menu Bank");
          System.out.println("1. Cek Saldo " + "2. Simpan Uang " + " 3. Ambil Uang");
          System.out.println("Pilih Menu Bank : ");
          int menu = pilih.nextInt();
            if(menu == 1){
                bk.getSaldo();
            } else if (menu == 2){
                System.out.println("Masukan Uang disimpan Rp. ");
                bk.simpanUang(simpan);
            } else if (menu == 3){
                System.out.println("Masukan Uang diambil Rp. ");
                bk.ambilUang(ambil);
            } else if (menu > 3){
                System.out.println("Menu Tidak Ada ");
                System.out.println("Ulangi Pilih Menu Bank : ");
            } else break;
      }
    }    
}
    
    

