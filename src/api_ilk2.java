import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class api_ilk2 {
    public static void main(String[] args) {
        try{
        String apiUrl = "https://makeup-api.herokuapp.com/api/v1/products";
        URI uri = URI.create(apiUrl);
        URL url = uri.toURL();

        //Url nesnesiyle veri çekmek için internetten bağlanıyoruz.
        HttpURLConnection baglanti = (HttpURLConnection) url.openConnection();

        //verileri getiriyoruz.
        baglanti.setRequestMethod("GET");

        //verileri okumak için okuyucu oluşturuyoruz.
        BufferedReader oku = new BufferedReader(new InputStreamReader(baglanti.getInputStream()));

        String veriler = new String();

        String satir;
        while((satir=oku.readLine())!=null){
            veriler += satir;
        }
        oku.close();

        String [] urunler = veriler.split("\"id\":");
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
