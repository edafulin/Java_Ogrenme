package hafta10;

import java.io.File;

public class dosyaolustur {
    public static void main(String[] args) throws Exception {
        File dosya = new File("eda.txt");
        dosya.createNewFile();
        System.out.println("Dosyanın tam yeri: " + dosya.getAbsolutePath());

        int sayi = 4;
        int bolen = 0;
        metot(sayi, bolen);
    }
    public static void metot (int sayi , int bolen){
        try{
        if (bolen == 0){
            throw new ArithmeticException();
        }
        }catch(Exception e){
            System.out.println("bu işlem yapılamaz.");
        }
    }
    
}
