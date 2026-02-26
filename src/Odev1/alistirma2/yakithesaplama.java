/*Bir otomobil kışın ısıdan dolayı %5 daha fazla yakıt tüketir. Yazın ortalama olarak 1-50 km/h 
giderken 100 km de 10 litre, 51-100 km/h giderken 100 km de 7,5 litre, 101-150 km/h giderken 
100 km de 9 litre yakıt tüketmektedir. Buna göre mevsim (yaz için Y, kış için K girildiğini 
düşününüz), ortalama hız bilgisi ve gideceği mesafe girildikten sonra kaç litre yakıt tüketeceğini 
hesaplayıp ekrana yazdıran programın kodlarını yazınız. */
package Odev1.alistirma2;
import java.util.Scanner;
public class yakithesaplama {
    public static void main(String[] args) {
        Scanner giris =new Scanner(System.in);

        System.out.println("Arabanızı yazın mı kışın mı sürüyorsunuz? \n yaz ise Y kış ise K yazın.");
        String mevsim = giris.nextLine();

        System.out.println("Arabanızı ort kaç km/h ile sürüyorsunuz?");
        Double hiz = giris.nextDouble();

        System.out.println("Kaç km gideceksiniz?");
        Double mesafe = giris.nextDouble();

            if ( hiz <= 50 ){
                double yakit = 0.1 * mesafe;
                /*  bu satırda 0,1 i 10/100 yazarsanız çalışmaz. Çünkü java int ile olan 
                tam sayılarda bölme işlemi yaptığında otomatik  olarak ondalıklı kısmı atar burada da
                0,1 in 1 ini atar ve 0 mış gibi iş yapar. */
                if (mevsim.equals("Y")){
                    System.out.println("harcadığınız yakıt : " + yakit + " litre");
                }
                if (mevsim.equals("K")){
                    System.out.println("harcadığınız yakıt : " + (yakit)*105/100 + " litre" );
                }
            }
             if ( hiz > 50  && hiz <= 100){
                double yakit = 0.75 * mesafe;
                if (mevsim.equals("Y")){
                    System.out.println("harcadığınız yakıt : " + yakit + " litre");
                }
                if (mevsim.equals("K")){
                    System.out.println("harcadığınız yakıt : " + (yakit)*105/100 + " litre");
                }
            }
            if ( hiz > 101  && hiz <= 150){
                double yakit = 0.09 * mesafe;
                if (mevsim.equals("Y")){
                    System.out.println("harcadığınız yakıt : " + yakit + " litre" );
                }
                if (mevsim.equals("K")){
                    System.out.println("harcadığınız yakıt : " + (yakit)*105/100 + " litre" );
                }
            }

        giris.close();



    }

}
