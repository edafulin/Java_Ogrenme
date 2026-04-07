package hafta4;

import java.util.Scanner;

public class carpimtablosu {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("çarpılacak sayıyı giriniz=");
        int carpim= giris.nextInt();

        System.out.println("kaç kere çarpılsın:");
        int kez= giris.nextInt();

        for(int a=1; a<=kez; a++){
            System.out.println(a + "x" + carpim + "=" + (a*carpim) );
        }

        giris.close();
    }
}
