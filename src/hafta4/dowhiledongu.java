/*Do while kalıbında önce yapılacak olan işlem yapılır ardından
koşulun sağlanıp sağlanmadığına bakılır. Koşul en başta doğru da olsa
yanlış da olsa kod bloğu en az bir kere çalışır. Aşağıda 1 den 100 e
kadar olan sayılarda tek olanları yazdıran kod parçası vardır.

While kısmı yazılırken bitiminden sonra noktalı virgül konulmalıdır.*/

package hafta4;

public class dowhiledongu {
    public static void main(String[] args) {
    int a =0 ;
    do {
        if(a % 2 ==1){
            System.out.println(a);
        }
        a++;
    }while (a <= 100);
    
}
}
