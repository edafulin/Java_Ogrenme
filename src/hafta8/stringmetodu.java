//Parametre olarak yollanan bir cümleyi 
//tersten ekrana yazdıran bir metot yazınız.

package hafta8;

import java.util.Scanner;

public class stringmetodu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("bir cümle giriniz:");
        String cumle = input.nextLine();

        System.out.println("*****************");
        TerstenCumle(cumle);

        input.close();

    }
    public static void TerstenCumle(String cumle){
        String[] terstenCumle = cumle.split("");
        for(int i =(terstenCumle.length - 1); i >=0 ; i--){
            System.out.print(terstenCumle[i]);
        }
    }
}