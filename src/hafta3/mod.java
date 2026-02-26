package hafta3;
import java.util.Scanner;
/*burada mod almak yani kalanı bulmak için C deki gibi % 2 yazıyoruz. */
public class mod {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);

        int sayi , kalan ;
        
        System.out.println("sayi giriniz:");
        sayi = giris.nextInt();

        kalan = sayi % 2 ;
        
        if (kalan==0){
            System.out.println("sayınız çifftir.");

        }else{
            System.out.println("sayınız tektir.");

        }

        giris.close();

    }

    

    
}
