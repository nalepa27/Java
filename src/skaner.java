//klasa Scanner znajduje się w pakiecie java.util
//jeśli chcemy jej użyć to musimy ją importować
import java.util.Scanner;

public class skaner {
    public static void main(String[]args){
        //utworzenie obiektu typu Scanner ponieważ chcemy cos wczytac od uzytkownika.
        Scanner scan = new Scanner(System.in);
        System.out.println("Jak masz na imie?");
        //metoda nextLine() wstrzymuje program wpisanie czegos na konsoli i zatwierdzenie
        //Metoda zwraca napis i zapamiętuje w firstName a następnie wykorzystuje do powitania
        String firstName = scan.nextLine();

        System.out.println("Witaj " + firstName);
    }
}
