package hafta9;

import java.util.Scanner;

public class hesapmakmetotile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s1,s2;
        String islem;

        System.out.print("sayı giriniz:");
        s1 = input.nextInt();

        System.out.print("sayı giriniz:");
        s2 = input.nextInt();

        System.out.println("yapmak istediğiniz işlemi secin('+' , '-' , '*' , '/'):");
        islem = input.next();
        input.nextLine();

        System.out.println("sonuc:" + hesaplamaYap(s1, s2, islem));
        
        input.close();

    }
    public static int hesaplamaYap (int s1 , int s2 , String islem){
        int sonuc=0;
        if (islem.equals("+")){
            sonuc = s1 + s2;
        }
        else if(islem.equals("-")){
            sonuc = s1-s2;
        }
        else if(islem.equals("*")){
            sonuc = s1*s2;
        }
        else if(islem.equals("/")){
            sonuc = s1/s2;
        }
        return sonuc;
    }
}
