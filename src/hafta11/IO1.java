package hafta11;

import java.io.File;
import java.io.IOException;

public class IO1 {
    public static void main(String[] args) {
        //klasör oluşturma
        File klasor = new File("d:\\IOdenemeilk");
        if(!klasor.exists()){
            klasor.mkdir();
            System.out.println("klasör oluşturuldu.");
        }
        //dosya oluşturma
        File dosya = new File("d:\\IOdenemeilk\\dosya.txt");
        try{        
            if(!dosya.exists()){
            dosya.createNewFile();
            System.out.println("dosya oluşturuldu");
        }
        }catch(IOException e){
            System.out.println("sistem dolu!");
        }
        //Dosya silme
        File silinecekDosya = new File("d:\\IOdenemeilk\\dosya.txt");
        if (silinecekDosya.exists()){
            silinecekDosya.delete();
            System.out.println("dosya silindi");
        }
        //klasör silme
        File silinecekKlasor = new File("d:\\IOdenemeilk");
        if (silinecekKlasor.exists()){
            silinecekKlasor.delete();
            System.out.println("klasör silindi");
        }
    }
    
}
