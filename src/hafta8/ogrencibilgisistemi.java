package hafta8;

import java.util.Scanner;

public class ogrencibilgisistemi {

        //Bilgileri saklamak için oluşturacağımız dizileri iki ayrı metot 
        //içinde kullanacağımız için bu dizileri local değil global yapmamız
        //lazım. Böylece tüm metotlar bu scanner sınıfına ve dizilere erişebilir.
        static Scanner giris = new Scanner(System.in);

        static String ad[] = new String[50];
        static String soyad [] = new String[50];
        static int sinif [] = new int[50];
        static char cinsiyet[] = new char[50];
        static int numara [] = new int[50];
        static int ogrencisayisi = 0;

    public static void main(String[] args) {

        int secim =0;
        do {
        System.out.println("[1] Bilgi Gir \n" +
                        "[2] Öğrenci Listele\n" +
                        "[3] Çıkış\n" +
                        "Secim Yapınız:");
        secim = giris.nextInt();
        giris.nextLine();
        
        if (secim == 1){
            System.out.println("Listeniz getiriliyor...");
            bilgigirme();
        }

        else if (secim == 2){
            listeleme();
        }
        else if (secim ==3){
            System.out.println("Çıkış yapılyor...");
            System.out.println("Çıktınız.");
            break;
        }
        }while(true);
    }

    public static void bilgigirme(){
        int sayi = ogrencisayisi;
        if( sayi >= 50){
        System.out.println("sistem doldu!");
            return; 
        }
   
        System.out.print("Öğrenci Adı:");
        ad[sayi] = giris.nextLine();

        System.out.print( "Öğrenci Soyadı :");
        soyad[sayi] = giris.nextLine();

        System.out.print("Öğrenci sınıfı:");
        sinif[sayi] = giris.nextInt();

        System.out.print("Öğrenci cinsiyeti E/K :");
        cinsiyet[sayi] = giris.next().charAt(0);

        System.out.print("Öğrenci numarası :");
        numara[sayi] = giris.nextInt();

        // en son nextInt kulandık bu da sayı girişi oldu bundan sonra 
        // gireceğimiz bir string için sorun yaratır bu sebeple 
        // sonda kalan \n i silmemiz gerekir.
        giris.nextLine();

        sayi++;
        System.out.println("öğrenci kaydedildi.");
        ogrencisayisi = sayi;
    }

    public static void listeleme(){
        int sayi = ogrencisayisi;
        int secim2=0;
        do{
        System.out.println( "[1] Hepsini Listele\r\n" +
                            "[2] Sınıfa Göre Listele\r\n" +
                            "[3] Cinsiyete Göre Listele\r\n" +
                            "[4] Ana Menüye Dön\r\n" +
                            "Seçim Yapınız:");

        secim2 = giris.nextInt();

        if (secim2 == 1){
            for(int i = 0; i< ogrencisayisi; i++){
            System.out.println((i+1) +".öğrenci");
            System.out.println("Ad Soyad:" + ad[i] + " " + soyad[i]);
            System.out.println("Sınıf:" + sinif[i]);
            System.out.println("Cinsiyet:" + cinsiyet[i]);
            System.out.println("Numara:" + numara[i]);
            System.out.println("*************");
            }
        }
        else if (secim2 == 2){

            //Sınıfları küçükten büyüğe olacak şekilde sıralamamız için
            //buble sort yöntemiini kullanırız yani ilk elemanı en büyük 
            //değermiş gibi kabul ederiz ve ondan sonra gelen elemanlarla
            //tek tek karşılaştırırız. Eğer ilk eleman büyükse bir sonraki
            //elemanla yer değiştiririz. Ancak bu sistemde tüm dizilerde
            //indexleri aynı olanlar aynı kişiye ait olacak şekildedir.
            //Dolayısıyla bir dizide yer değişimi yapılıyorsa diğer 
            //dizilerde de yapılmalıdır. 


            //dış döngüde sayi-1 yapmamızın sebebi diyelim ki 5 elemanımız
            //olsun o zaman 4 eleman doğru sıraya geçerse son eleman zaten
            //doğru sırada olur o yüzden o eleman için programın tekrar
            //çalılmasına gerek yoktur.

            for(int j = 0 ; j < sayi-1 ; j++){

            //iç döngüde sayi-1 yapmamızın sebebi yine 5 elemanl bir dizi 
            //olsun bu dizide son elemana geldiğimizde yani indexi 4 olan
            //elemana geldiğimizde indexi 5 olan elemanla eşitlik kurulur 
            //buda sistemi çökertir 5 index 5 elemanlı dizide yoktur. 

                for (int i=0; i < sayi-1 ; i++){
                    if(sinif[i] > sinif[i+1]){
                        int gecicisinif = sinif[i+1];
                        sinif[i+1]=sinif[i];
                        sinif[i]=gecicisinif;

                        String geciciad = ad[i+1];
                        ad[i+1] = ad[i];
                        ad[i]= geciciad;

                        String gecicisoyad = soyad[i+1];
                        soyad[i+1] = soyad[i];
                        soyad[i] = gecicisoyad;
                    
                        char gecicicinsiyet = cinsiyet[i+1];
                        cinsiyet[i+1] = cinsiyet[i];
                        cinsiyet[i] = gecicicinsiyet;

                        int gecicinumara = numara[i+1];
                        numara[i+1] = numara[i];
                        numara[i] = gecicinumara;
                    }   
                }
            }
            int sinifnumarasi = 0;
            for (int i = 0 ; i < sayi ; i++){
                if ( sinifnumarasi != sinif[i]){
                    System.out.println( "---------" + sinif[i] + ".SINIF ÖĞRENCİLERİ-------");
                    sinifnumarasi = sinif[i];
                }
                    System.out.println("Ad Soyad:" + ad[i] + " " + soyad[i]);
                    System.out.println("Cinsiyet:" + cinsiyet[i]);
                    System.out.println("Numara:" + numara[i]);
                }
        }

        else if (secim2 == 3){
            System.out.println("----KIZ ÖĞRENCİLER----");
            for(int i = 0; i < sayi ; i++){
                if(cinsiyet[i] == 'K' || cinsiyet[i] == 'k'){
                    System.out.println("Ad Soyad:" + ad[i] + " " + soyad[i]);
                    System.out.println("Sınıf:" + sinif[i]);
                    System.out.println("Numara:" + numara[i]);
                    System.out.println("*****************");
                }
            }
            System.out.println("----ERKEK ÖĞRENCİLER----");
            for(int i = 0; i < sayi ; i++){
                if(cinsiyet[i] == 'E' || cinsiyet[i] == 'e'){
                    System.out.println("Ad Soyad:" + ad[i] + " " + soyad[i]);
                    System.out.println("Sınıf:" + sinif[i]);
                    System.out.println("Numara:" + numara[i]);
                    System.out.println("**********************");
                }
            }
        }
        else if ( secim2 == 4){
            System.out.println("Ana menüye yönlendiriliyorsunuz...");
            break;
        }
    }while(true); 
    }
    
}