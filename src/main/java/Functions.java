import org.jsoup.Jsoup;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.MalformedURLException;


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

    public static void countForms(String URL){
        int countPOST, countGET, form = 1;

        Elements formElement = document.select("[method=post]");
        countPOST = formElement.size();
        System.out.println("Cantidad de formularios del Metodo POST: " + countPOST);

        formElement = document.select("[method=get]");
        countGET = formElement.size();
        System.out.println("Cantidad de formularios del Metodo GET: " + countGET);

        for(Element element: document.getElementsByTag("form").forms()){
            String method = element.attr("method");
            Elements typePOST = element.getElementsByAttributeValueContaining("method", "post");

            for(Element elm: typePOST) {
                String address = element.absUrl("action");
                try {
                    System.out.println("Form: #" + form);
                    Document doc = Jsoup.connect(address)
                            .data("Asignatura", "Practica1")
                            .header("Matricula", "20102155").post();

                    System.out.println(doc.body().toString());
                }
                    catch(IOException e){
                    e.printStackTrace();
                }
            }

            Elements inputs = element.select("input");
                for(Element elm2: inputs){
                    System.out.println("Type: " + elm2.attr("type"));
                }

                System.out.println("");
                form++;
            }
        }

}

