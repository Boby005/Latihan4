import java.util.Scanner;

public class persegi {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        /* Keliling & Luas */

        int panjang;
        int lebar;
        int keliling;
        int luas;

        System.out.print("Masukan Panjang : ");
        panjang = input.nextInt();

        System.out.print("Masukan lebar : ");
        lebar = input.nextInt();

        keliling = 2 * (panjang + lebar);
        luas = panjang * lebar;

        System.out.println("Keliling : " + keliling);
        System.out.println("Luas : " + luas);

        input.close();
        
    }
}