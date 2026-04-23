import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Odev_2416501024 {
    static Random rnd = new Random();
    static Scanner giris = new Scanner(System.in);
    public static void main(String[] args) {
        String kelime;
        String []kelimenindizisi;
        int harfsayisi=0;
        String cevap;
        String kelimeler[] = {"ceyhan","adanali","itfaiye",
                              "ankara","egirdir","edafulin",
                              "rapunzel","camguzeli","gunebakan","lavanta"};

        for(int oyunhakki=1; oyunhakki<=5 ; oyunhakki++){
        kelime = kelimeyisec(kelimeler);
        kelimenindizisi = kelime.split("");

        String [] hafiza = new String[kelimenindizisi.length];
        for ( int i=0; i<kelimenindizisi.length; ++i){
            hafiza[i]= "*";
        }

        harfsayisi = kacharfli(kelime);
        System.out.println("kelimeniz " + kacharfli(kelime) + " harften oluşuyor.");

        yazdirma(kelimenindizisi, harfsayisi , hafiza);

        kelimeler = kelimeleriYenileme(kelimeler, kelime);

        for(int hak=1; hak<=15 ; hak++){
            System.out.println("kalan hakkınız:" + (16-hak));
        testetme(kelimenindizisi,kelime,hafiza);
         if(Arrays.equals(hafiza,kelimenindizisi)){
            System.out.println("Tebrikler");
            break;
            }
         if(hak==15){
            System.out.println("Bilemediniz");
            System.out.println("kelimeniz " + kelime + "'di.");
            }}
        if (oyunhakki < 5){ 
                System.out.println("Tekrar oynamak istiyor musunuz (e/h) ?");
                cevap = giris.next();
                giris.nextLine();
                if (cevap.equalsIgnoreCase("h")) {
                    break;
                }
            }
        }
        
    
    }
    public static String kelimeyisec(String []kelimeler){
        String gidenkelime;
        int index = rnd.nextInt(kelimeler.length);
        gidenkelime = kelimeler[index];
        return gidenkelime;
    }
    public static String[] kelimeleriYenileme(String[]kelimeler , String kelime){
        String []yenikelimeler = new String[kelimeler.length - 1];
        int yeniindex = 0;
        for(int i=0; i<kelimeler.length ; i++){
            if(!kelimeler[i].equals(kelime)){
                yenikelimeler[yeniindex]=kelimeler[i];
                yeniindex++;
            }
        }
        return yenikelimeler;
    }
    public static int kacharfli(String kelime){
        String kelimenindizisi[] = kelime.split("");
        int gidenharfsayisi = kelimenindizisi.length;
        return gidenharfsayisi;
    }
    public static void yazdirma(String[] kelimenindizisi, int harfsayisi, String [] hafiza){
        if (harfsayisi == 6){
            System.out.println(kelimenindizisi[0] + "*****");
            hafiza[0] = kelimenindizisi[0];
        }
        else if (harfsayisi == 7){
            System.out.println(kelimenindizisi[0] + "******");
            hafiza[0] = kelimenindizisi[0];
        }
        else if (harfsayisi == 8){
            System.out.println(kelimenindizisi[0] + "******" + kelimenindizisi[7]);
            hafiza[0] = kelimenindizisi[0];
            hafiza[7] = kelimenindizisi[7]; 
        }
        else if (harfsayisi == 9){
            System.out.println(kelimenindizisi[0] + "*******" + kelimenindizisi[8]);
            hafiza[0] = kelimenindizisi[0];
            hafiza[8] = kelimenindizisi[8];
        }
    }
    public static void testetme(String []kelimenindizisi, String kelime, String[] hafiza){
        System.out.print("bir harf  girin:");
        String gelenharf = giris.next();
        giris.nextLine();
        int sayac=0;

        for (int i=0 ; i<kelimenindizisi.length ; i++){
            if(gelenharf.equalsIgnoreCase(kelimenindizisi[i])){
                hafiza[i] = kelimenindizisi[i];
                sayac+=1;
            }
        }
            if ( sayac > 0){
                for(int i=0 ; i<hafiza.length ; i++){
                    System.out.print(hafiza[i]);
            }System.out.println();
            }else{
                System.out.println("harf yok !");
            }
    }
}