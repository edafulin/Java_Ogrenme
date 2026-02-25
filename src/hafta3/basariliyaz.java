package hafta3;

import java.util.Scanner;

public class basariliyaz {
    public static void main(String[] args) {
        
        Scanner giris = new Scanner(System.in);

        System.out.print("vize notunu giriniz:");
        double vize = giris.nextDouble();

        System.out.print("final notunu giriniz:");
        double finnal = giris.nextDouble();

        double ort = vize*40/100 + finnal*60/100 ;

        if (ort>70){

            System.out.println("Başarılı :))");

        }else{

            System.out.println("Başarısız;((");

        }
         
        giris.close();

    }

    
}
