package hafta11;

import java.util.List;

import java.util.Arrays;

public class listeyidiziyecevir {
    public static void main(String[] args) {
        //listemizi oluşturduk.
        List<Integer> liste = Arrays.asList(22, 12, 6, 9);
        //listemiziyi metne çevirdik.
        String metin = liste.toString();
        System.out.println("metin halinde:" + metin);

        //listemizi diziye atamak için:
        Integer[] dizi2 = liste.toArray(new Integer []{});
        System.out.println("dizi halinde :" + Arrays.toString(dizi2));
    }
}
