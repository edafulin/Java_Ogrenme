package hafta5;

import java.util.Scanner;

public class hesapmakinesi2 {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int sonuc = 0;

        for(;;){

                    System.out.print("sayı giriniz:");
        int s1 = giris.nextInt();
        
        System.out.print("diğer sayıyı giriniz :");
        int s2 = giris.nextInt();
        
        System.out.print("İşlemi giriniz(+,-.*,/):");
        char islem=giris.next().charAt(0);
        

        switch(islem){
            case '+':
                sonuc = s1 + s2;
                System.out.println("sonuc :"+ sonuc);
                break;
            case '-':
                sonuc = s1 - s2;
                System.out.println("sonuc :"+ sonuc);
                break;
            case '*':
                sonuc = s1 * s2;
                System.out.println("sonuc :"+ sonuc);
                break;
            case '/':
                sonuc = s1 / s2;
                System.out.println("sonuc :"+ sonuc);
                break;
        }

        System.out.println("devam etmek istiyor musun(e/h):");
        char cevap = giris.next().charAt(0);
        
        if (cevap == 'h')
            break;
    }

        giris.close();
    }
}