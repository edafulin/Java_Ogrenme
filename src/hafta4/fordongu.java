/*for döngülerinde genellikle terkarsa sayıları başta bellidir.
başlangıç şart ve artış aynı satırda en başta söylenir. 0 dan
100 e kadar olan tek sayıları yazdıran program aşağıdadır. 
Değişkeni tanımlarken for döngüsünün içinde tanımlamak daha
temiz olur ve değişkenin oraya ait olmasının sağlar. */

package hafta4;

public class fordongu{
    public static void main(String[] args) {
        for(int a=0;a<=100;a++) {
            if(a%2==1) System.out.println(a);
        }
    
    }
    
}