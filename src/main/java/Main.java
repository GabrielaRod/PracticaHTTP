import jdk.nashorn.internal.ir.FunctionCall;

import java.util.Scanner;
import java.io.IOException;
import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inserte una URL: "); //Asks for URL to User

        Scanner scanner = new Scanner(System.in); //Class that gets users input

        String URL = scanner.nextLine(); //Asigns user input to variable URL

        Functions.validateURL(URL);
        Functions.countLines(URL);
        Functions.countParagraphs(URL);
        Functions.countPictures(URL);
    }
}
