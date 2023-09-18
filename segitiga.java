import java.util.Scanner;

public class segitiga {
    public static void main(String [] args) {
        Scanner input =new Scanner(System.in);

       // PSEUDOCODE //
       







        // Keliling & Luas //

        int sisi;
        int keliling;
        int luas;
        int alas;
        int tinggi;
        
        System.out.print("Masukan sisi : ");
        sisi = input.nextInt();

        System.out.print("Masukan alas : ");
        alas = input.nextInt();

        System.out.print("Masukan tinggi : ");
        tinggi = input.nextInt();


        keliling = sisi + sisi + sisi;
        luas = alas * tinggi /2;

        System.out.println("Keliling : " + keliling);
        System.out.println("Luas : " + luas);

        input.close();



    }
    
}
