

import java.util.Scanner;
public class lingkaran {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

         // PSEUDOCODE //
         


         /* Keliling & Luas */
        double phi = 3.14;
        double jariJari;
        double keliling;
        double luas;
        
        System.out.print("Masukan jari - jari : ");
        jariJari = input.nextDouble();

        keliling = 2 * phi * jariJari;
        luas = phi * jariJari * jariJari;
        
        System.out.println("Keliling : " + keliling);
        System.out.println("Luas : " + luas);

        input.close();
        
    }

}