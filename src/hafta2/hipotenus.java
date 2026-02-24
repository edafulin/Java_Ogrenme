package hafta2;

import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);

        System.out.print("birinci kenarı giriniz:");
        double kenar1 = giris.nextInt() ;

        System.out.print("ikinici kenarı giriniz:");
        double kenar2 = giris.nextInt();

        double hipo = Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));

        System.out.println("hipotenüs:"+ hipo);

        giris.close();
    }
}
