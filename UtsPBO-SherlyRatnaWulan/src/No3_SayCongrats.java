/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class No3_SayCongrats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] values = {80, 50, 50, 50, 80};
        SayCongrats("Eko", values);
        SayCongrats("Budi", 80, 90, 76, 80);
    }
    static void SayCongrats(String name, int... values){
        int total = 0;
        for (int value : values){
            total += value;
        }
        int finalValue = total / values.length;
        
        if(finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
           System.out.println("Maaf " + name + ", Anda Tidak Lulus"); 
        }
    }
    
}


    
    

