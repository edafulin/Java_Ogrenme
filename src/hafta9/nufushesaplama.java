package hafta9;

import java.util.Scanner;

public class nufushesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nufus , artisorani , yil;

        System.out.print("baslangic nufusunu girin:");
        nufus = input.nextInt();

        System.out.print("yıllık artıs oranını girin:");
        artisorani = input.nextInt();

        System.out.print("kac yıl sonraki nufusu istiyorsunuz:");
        yil = input.nextInt();

        System.out.println(yil + "yil sonraki nufus:" + nufusHesaplama(nufus, artisorani, yil));

        input.close();

    }
    public static int nufusHesaplama (int nufus , int oran , int yil){
        int yeninufus = nufus;
        for (int i=1; i<=yil ; i++){
            yeninufus = yeninufus + (int)(yeninufus * (oran/100.0));
        }
        return yeninufus ;
    }
}
