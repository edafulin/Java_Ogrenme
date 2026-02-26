package Odev1.alistirma2;
import java.util.Scanner;
public class artikyilbul {
    public static void main(String[] args) {
         Scanner giris = new Scanner(System.in);

         System.out.println("Artık yıl olup olmadığını öğrenin \n Bir yıl giriniz: ");
         int yil = giris.nextInt();

         if (yil %4 != 0){
            System.out.println("Artık yıl değildir.(365 gün vardır.)");
         }else {
            if (yil %100 == 0){
                if(yil %400 == 0 ){
                    System.out.println("Artık yıldır.(366 gün vardır.)");
                }else{
                    System.out.println("Artık yıl değildir.(365 gün vardır.)");
                }
            }else{
                System.out.println("Artık yıldır. (366 gün vardır.)");
            }
         }
         giris.close();


    }
}
