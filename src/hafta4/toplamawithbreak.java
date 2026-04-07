package hafta4;
import java.util.Scanner;

public class toplamawithbreak {

public static void main(String[] args) {
    Scanner giris =new Scanner(System.in);
    int toplam=0;
    int adet=0;
   int b=1;

    while( true ){
        System.out.print("sayi giriniz:");
        b = giris.nextInt();
        if(b > 10){
            toplam += b;
            adet++;
        }
        if (b<0) break;
    }

    System.out.println("toplam="+ toplam);
    System.out.println("adet="+ adet);

    giris.close();

}
    
}
