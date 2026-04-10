//Kendisine parametre olarak yollanan bir boyutlu dizi 
//ile yine kendisine parametre olarak yollanan 
//2 adet eleman index ini yer değiştirip 
//geriye döndüren bir metot yazınız.

package hafta8;

import java.util.Arrays;
import java.util.Scanner;

public class elemandegistirmetodu {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int dizi[]= {5,4,29,13,55,22,19,20,21,99};

        System.out.println(Arrays.toString(dizi));

        System.out.print("hangi index numaralı elemanların yeri değişsin:");
        int index1 = giris.nextInt();
        int index2 = giris.nextInt(); 

        System.out.println(Arrays.toString(degismisDizi(dizi, index1, index2)));

        giris.close();
    }
    public static int [] degismisDizi (int[]dizi, int index1, int index2){
        
        int [] degismisDizi = dizi.clone();

        int a= degismisDizi[index1];
        int b= degismisDizi[index2];

        degismisDizi[index1]=b;
        degismisDizi[index2]=a;

        return degismisDizi.clone();
    }
}
