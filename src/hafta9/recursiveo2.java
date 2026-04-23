package hafta9;

import java.util.Scanner;

public class recursiveo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("tabanı girin: ");
        int taban = input.nextInt();

        System.out.print("ussu girin: ");
        int us = input.nextInt();

        System.out.println("sonuc: " + kuvvetiniBul(taban, us));

        input.close();

    }
    public static int kuvvetiniBul( int taban , int us){
        int sonuc=0;
        if (us==0){
            return 1;
        }
        for(int i=1; i<=us ; i++){
            sonuc = taban*(kuvvetiniBul(taban,(us-1)));
        }
        return sonuc;
    }
    
}
