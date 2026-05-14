package hafta10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
//klavyeden girilen trihi nasıl girilirse girilsin slash lı yazan program.

public class tarihiyazdirma {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        
        System.out.print("'gün/ay/yıl' şeklinde yazınız . \ntarihi giriniz:");
        String  gelentarih = giris.nextLine();

        String gecicitarih = gelentarih.replaceAll("[^0-9]", ""); 
        // ("//D" , ""); da yazabilirdik ikiside sayı değil anlamına gelir.
        DateFormat df1 = new SimpleDateFormat("ddMMyyyy");
         
        Date gecicitarihyazimi = new Date();
        DateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
        try{
        gecicitarihyazimi = df1.parse(gecicitarih);
        //.format bizim date nesnemizi stringe çevirir
        //.parse de stringi tekrar date nesnesine çeviiryor.
        }catch(Exception e){
            System.out.println("yanlış girdiniz tekrar girin.");
        }
        System.out.print("tarihiniz:" + df2.format(gecicitarihyazimi));
        giris.close();
    }
    
}
