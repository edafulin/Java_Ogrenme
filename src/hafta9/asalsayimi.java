package hafta9;

import java.util.Scanner;

public class asalsayimi {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("sayı giriniz:");
        int sayi = giris.nextInt();

        System.out.println("sayınız asal mı :" + asalSayiMi(sayi));

        giris.close();
    }
    public static boolean asalSayiMi (int sayi){
        int bolen=0;
        boolean asalmi = true;
        for (int i=1; i <=sayi ; i++){
            if((sayi%i) == 0){
                bolen++;
            }
        }
        if (bolen==2){
            asalmi=false;
        }
        return asalmi;
    }
}
