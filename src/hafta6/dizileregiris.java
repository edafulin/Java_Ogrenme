package hafta6;

public class dizileregiris {
    public static void main(String[] args) {
            // dizinin eleman sayısını başlangıçta belirlemek
            int sayilar1[] = new int [5];
            int sayilar2[] = new int [4];
            for (int i=0; i < sayilar1.length; i++ )
                System.out.println(sayilar1[i]);

            System.out.println("**************");

            for (int i=0; i < sayilar2.length; i++ )
            System.out.println(sayilar2[i]);
            // iki yazımda doğrudur.


            //dizinin eleman sayısının sonra belirlenmesi 
            int [] sayilar3;
            sayilar3 = new int [6];
            for (int i = 0 ; i< sayilar3.length; i++)
            System.out.println(sayilar3[i]);
            System.out.println("*****************");

            // diziye başlangıçta değer atanması ,
            int sayilar4 [] = new int[]{ 5,4,9,7,8};
            for (int i =0; i < sayilar4.length; i++)
                System.out.println(sayilar4[i]);
            System.out.println("*******************"); 

            // başlangıçta değer ataması yapılan dizilerde new anahtarının 
            //kullanılmasına gerek yoktur.
            int [] sayilar5 = { 5,4,9,7,8};
            for (int i =0; i < sayilar5.length; i++)
                System.out.println(sayilar4[i]);
            System.out.println("*******************"); 
    }
}
