package hafta5;

import java.util.Scanner;

public class tambolenhesap {
    public static void main(String[] args) {
    
        Scanner giris = new Scanner(System.in);
        double sayi = giris.nextDouble();

        for ( int a = 1; a<= sayi; ++a){
            if (sayi%a == 0) System.out.println( "saynın çarpanı : " + a);
        }
        giris.close();
    }
}
