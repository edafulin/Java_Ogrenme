package hafta11;

import java.util.List;

import java.util.ArrayList;

public class listeler {
    public static void main(String[] args) {
//************LİSTELER***********************
System.out.println("********LİSTELER************");
//____LİSTE OLUŞTURMA____
        List<Integer> liste1 = new ArrayList<Integer>();
        //List<Integer> liste1 = new ArrayList<>(); yazımı da doğrudur hatta bu daha yeni versiyondur.
        //ArrayList<Integer> liste1 = new ArrayList<>(); bu da yazılır List ve ArraysList farkı 
        //List daha kapsamlıdır yani bu oluşturduğumuz arraylisti ileride vector yapabiliriz 
        //ama şu anlık iki yazım da doğrudur.
        //LİST --> Interface (arayüzdür)
        //ARRAYLİST --> Class (sınıftır)
        liste1.add(1);
        liste1.add(2);
        liste1.add(3);
        System.out.println("liste1:" + liste1);

        //Listenin eleman sayısını verir.
        System.out.println(liste1.size());

        //Farklı tiplerde de listeler oluşturulabilir. 
        List<String> liste2 = new ArrayList<>();
        liste2.add("e");
        liste2.add("d");
        liste2.add("a");
        System.out.println("liste2:" + liste2);

        //listelere yeni eleman eklemeyi döngü içinde de yapabiliriz:
        ArrayList<Integer> liste3 = new ArrayList<>();

        //normal for döngüsüyle eleman ekledik.
        for(int i = 0 ; i < 10 ; i++){
            liste3.add(i);
        }
        System.out.println("liste3:" + liste3);

        //for-each döngüsü ile de ekrana yazdırdık. Bu döngü bana verdiğin listedeki veya 
        //dizideki her integer elemanı al ona geçici olarak i de ve döngüye sok mantığıyla çalışır.
        System.out.print("liste3:");
        for (Integer i : liste3){
            System.out.print( i + " ");
        }


    }
}