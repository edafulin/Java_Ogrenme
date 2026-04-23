package hafta9;

import java.util.Scanner;

public class parcagetirme {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("kelime girin");
        String kelime = giris.next();
        giris.nextLine();

        System.out.print("baslangıc sayıyı girin: ");
        int baslangic = giris.nextInt();

        System.out.print("bitis sayisini girin:");
        int bitis = giris.nextInt();

        System.out.print("istediginiz parca:");
        for(int i=0; i<=(bitis-baslangic) ; i++){
            System.out.print(parcayiGetir(kelime, baslangic, bitis)[i]);
        }

        giris.close();
    }
    public static String [] parcayiGetir(String kelime , int basla , int bitir){
        String [] gecicikelime = kelime.split("");
        String [] parca = new String[(bitir - basla + 1)];
        int index=0;
        for (int i=(basla-1) ; i<=(bitir-1) ; i++){
            parca[index]=gecicikelime[i];
            index++;
        }
        return parca;
    }
}
