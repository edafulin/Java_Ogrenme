package hafta6;

public class dizicesitleri {
    public static void main(String[] args) {
        // tek noyutlu diziler 
        int dizi1[] =new int [3] ;
        System.out.println(dizi1[0]);
        System.out.println(dizi1[1]);
        System.out.println(dizi1[2]);
        //dizinin 3 elemanı varsa bu dizinin elemanlarının indisleri yazılarak
        //çağırılır bu indisler 0,1,2... diye ilerler.

        // çok boyutlu diziler   3 boyutlu dizi de olabilir.
        int dizi2 [] [] = new int[2][2];
        System.out.println(dizi2[0][0]);
        System.out.println(dizi2[0][1]);
        System.out.println(dizi2[1][0]);
        System.out.println(dizi2[1][1]);
        // tek tek yazmak uzun  dizilerde dor olacağından
        // for döngüsüyle yazmak daha temiz olacaktır.
        System.out.println("*****************");
        int dizi3[] [] = new int[9][5];
        for ( int i = 0 ; i < dizi3.length; i++){ // i satır numaraları için kullanılıyor. 
            for (int j = 0; j < 5 ; j++ )
                System.out.println(dizi3[i][j]);
        }
   }
}
