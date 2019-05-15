import org.jsoup.Jsoup;
import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.io.IOException;
import java.io.PushbackInputStream;
import java.net.MalformedURLException;
import java.security.PublicKey;

public class Functions {

    public static Document document;
    public static boolean validateURL(String URL){

        try{
            document = Jsoup.parse(URL);
            document = Jsoup.connect(URL).get();
        }
        catch(MalformedURLException e){
            return false;
        }
        catch(IOException e){
            return false;
        }
        catch(IllegalArgumentException e){
            return false;
        }

        return true;
    }

    public static int countLines(String URL){
        String body = "";

        try{
            Connection.Response doc = Jsoup.connect(URL).execute();
            body = doc.body();
        }
        catch(IOException e){
            e.printStackTrace();
        }

        return body.split("\n").length;
    }

    public static int countParagraphs(String URL){
        int countP;

        Elements elements = document.select("p");
        countP = elements.size();

        return countP;
    }

    public static int countPictures(String URL){
        int countPic;

        Elements elements = document.select("p img");
        countPic = elements.size();

        return countPic;
    }

    public 
}
