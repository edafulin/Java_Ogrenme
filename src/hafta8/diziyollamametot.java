//50 elemanlı bir diziye 0-100 arasında 
//rastgele sayılar atanacaktır.  
//DiziyiSirala adında bir metot a dizi 
//parametre olarak yollanacaktır. Metot 
//diziyi küçükten büyüğe doğru 
//sıralayarak ekrana yazdıracaktır.

package hafta8;

import java.util.Arrays;
import java.util.Random;

public class diziyollamametot {
    public static void main(String[] args) {
        Random rnd = new Random();
        int a[] = new int[50];
        for (int i = 0 ; i<50 ; ++i){
            a [i] = rnd.nextInt(101);
        }
        System.out.println("sıralnmamış hali:" + Arrays.toString(a));
        System.out.println("***********************");
        System.out.println("sıralanmış dizi:" + Arrays.toString(dizisirala(a)));


    }
    public static int[] dizisirala (int [] gelendizi){
        Arrays.sort(gelendizi);
        return gelendizi.clone();
    }
}
