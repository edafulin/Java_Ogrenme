package hafta3;

import java.util.Scanner;
/*Eğer switch case kalıbında koşullar için string kullanıyorsak 
koşulları çift tırnak içine "" almalıyız. Burda hesap makinesi 
yapılmıştır. */

public class switchstringile {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        double sonuc;

        System.out.print("birinci sayıyı giriniz:");
        double sayi1 = giris.nextDouble();

        System.out.print("ikinci sayıyı giriniz:");
        double sayi2 = giris.nextDouble();

        System.out.print("yapmak istediğiniz işlemi giriniz:");
        String islem = giris.next();

        switch (islem){
		case "+":
			sonuc = sayi1 + sayi2 ;
			System.out.println(sonuc);
			break;
		case "-" :
			sonuc= sayi1 - sayi2 ;
			System.out.println(sonuc);
			break;
		case "*":
			sonuc = sayi1 * sayi2 ;
			System.out.println(sonuc);
			break;
		case "/":
			sonuc = sayi1 / sayi2 ; 
			System.out.println(sonuc);
			break;
	}

    giris.close();
}
}
