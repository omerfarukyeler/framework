package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    //burasını configuration readerı okuması için oluşturduk.

 public static   Properties properties;//alttaki static bloğun içerisine girebilmesi için statik yaptık.
                                 //static bloğun içine sadece statikler girebilir.


    static{//main metod varsa main metod çalışır .Ama main metoddan da önce static blok çalışır!!!!

        String path ="configuration.properties";

        try {
            FileInputStream fis = new FileInputStream(path);//dosyayı bu nesne okur
            properties =new Properties();
            properties.load(fis);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    public static String getProperty(String key){//url in karşısında dönecek string olduğu için string dönüşlü yapıldı.


        return properties.getProperty(key);
    }




}
