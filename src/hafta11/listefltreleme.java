package hafta11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class listefltreleme {
    public static void main(String[] args) {
        List <Integer> liste = Arrays.asList(22,12,6,6,9,5);
        System.out.println("eski liste:" + liste );
        //yeni dizimiz:
        List <Integer> yeniliste = liste.stream().filter(i -> i %2 == 0 ).collect(Collectors.toList());
        System.out.println("yeni liste:" + yeniliste);
    }
    
}
