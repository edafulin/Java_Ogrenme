package hafta11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class diziyilisteyecevir {
    public static void main(String[] args) {
        String [] dizi = {"eda" , "fulin" , "halil" , "muhammed"};
        //1. yöntem
        List <String> list1 = Arrays.asList(dizi);
        System.out.println(list1);
        //2. yöntem 
        List<String> list2 = new ArrayList<String>();
        Collections.addAll(list2, dizi);//dizinin verilerini list2 ye ata.
        System.out.println(list2);
        //3.yöntem
        List<String> list3 = new ArrayList<String>();
        for (String i : dizi){
            list3.add(i);
        }
        System.out.println(list3);

    }
    
}
