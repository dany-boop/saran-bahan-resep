/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangann;

import java.util.Scanner;

/**
 *
 * @author dany
 */
public class Percabangann {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String identitas = "Moh.Dhany asmoro / XR6 / 17";
        System.out.println("Identitas : "+identitas);
        
        System.out.println("\nSaran Resep dari Bahan Milik Anda\n");
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Bahan Pertama: ");
        System.out.println("1. Pisang");
        System.out.println("2. Telur");
        System.out.println("Masukkan no pilihan Anda:");
        int bahan1 = scanner.nextInt();
        
        
        if(bahan1 == 1 || bahan1== 2)
        {
            System.out.println("Bahan Kedua:   ");
            if(bahan1 == 1) {
                System.out.println("1. Susu");
                System.out.println("2. Minyak Goreng");
                System.out.println("3. Tidak Ada");
            }else{
                System.out.println("1. Minyak Goreng");
                System.out.println("2. Roti");
                System.out.println("3. Tidak Ada");
            }
            System.out.println("Masukkan no pilihan Anda");
            int bahan2 = scanner.nextInt();
            main
            
        }else
            System.out.println("Mohon Maaf, Pilihan tidak ditemukan, "
            +"tidak dapat memberikan saran resep");
        
        if (bahan2 >= 1 && bahan2 <= 3)
        {
            if(bahan1==1)
                switch(bahan2)
                {
                    
                
            }
        }
        
        
        
        
        
    }
    
}
