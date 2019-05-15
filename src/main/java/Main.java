import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Inserte una URL: "); //Asks for URL to User

        Scanner scanner = new Scanner(System.in); //Class that gets users input

        String URL = scanner.nextLine(); //Asigns user input to variable URL

        if(Functions.validateURL(URL)) {
            System.out.println("URL Validada exitosamente!");
            System.out.println("Cantidad de Lineas: " + Functions.countLines(URL));
            System.out.println("Cantidad de Parrafos: " + Functions.countParagraphs(URL));
            System.out.println("Cantidad de Fotos dentro de los Parrafos: " + Functions.countPictures(URL));

            
            Functions.countForms(URL);
        }
        else{
            System.out.println("URL Invalida!");
            }
    }
}
