import java.util.Scanner;

public class zadania2 {
    public static void main(String[] args){
        zadanie3();
    }
    public static void zadanie1(){
        Scanner x = new Scanner(System.in);
        System.out.print("uzytkowniku 1 podaj swoje imie: ");
        String name1 = x.nextLine();
        System.out.print("uzytkowniku 2 podaj swoje imie: ");
        String name2 = x.nextLine();
        System.out.print("uzytkowniku 1 podaj swoj wiek: ");
        int age1 = x.nextInt();
        System.out.print("uzytkowniku 2 podaj swoj wiek: ");
        int age2 = x.nextInt();
            if (age1 > age2){
                System.out.println(name1 +" jest starszy a " + name2 + " jest mlodszy");}
            else if (age2 > age1){
                System.out.println(name2 +" jest starszy a " + name1 + " jest mlodszy");}
            else
                System.out.println("jestescie w tym samym wieku");
    }
    public static void zadanie2(){
        Scanner x = new Scanner(System.in);
        System.out.print("uzytkowniku 1 podaj swoje imie: ");
        String name1 = x.nextLine();
        System.out.print("uzytkowniku 2 podaj swoje imie: ");
        String name2 = x.nextLine();
        System.out.print("uzytkowniku 1 podaj swoj wiek: ");
        int age1 = x.nextInt();
        System.out.print("uzytkowniku 2 podaj swoj wiek: ");
        int age2 = x.nextInt();
        int length1 = name1.length();
        int length2 = name2.length();
            if (length1 > length2){
                System.out.println(name1 +" ma dluzsze imie od " + name2);
            }
            else if (length1 < length2){
                System.out.println(name2 +" ma dluzsze imie od " + name1);
            }
            else
                System.out.println("imiona maja taka sama dlugosc");


    }
    public static void zadanie3() {
        Scanner x = new Scanner(System.in);
        System.out.print("user 1 podaj swoje imie: ");
        String name1 = x.nextLine();
        System.out.print("user 2 podaj swoje imie: ");
        String name2 = x.nextLine();
        System.out.print("user 3 podaj swoje imie: ");
        String name3 = x.nextLine();
        System.out.print("user 1 podaj swoj wiek: ");
        int age1 = x.nextInt();
        System.out.print("user 2 podaj swoj wiek: ");
        int age2 = x.nextInt();
        System.out.print("user 3 podaj swoj wiek: ");
        int age3 = x.nextInt();
//user1 - starszy
        if((age1 > age2) && (age1 > age3)){
            System.out.println(name1 + " jest najstarsza osoba");
            if ((age1 > 17)&&(age1 <71)){
                System.out.println(name1 + " to dorosla osoba");
            }
            else if((age1 < 18)&&(age1 > 10)){
                System.out.println(name1 + " to nastolatek");
            }
            else if((age1 >= 0 )&&(age1 < 11)){
                System.out.println(name1 + " to dziecko");
            }
            else if(age1 > 70){
                System.out.println(name1 + " to emeryt/ka");
            }
        }
// user1 - mlodszy
        if((age1 < age2)&&(age1 < age3)) {
            System.out.println(name1 + " jest najmlodsza osoba");
            if (age1 >= 18){
                System.out.println(name1 + " to dorosla osoba");
            }
            else if((age1 < 18)&&(age1 > 10)){
                System.out.println(name1 + " to nastolatek");
            }
            else if((age1 >= 0 )&&(age1 <= 10)){
                System.out.println(name1 + " to dziecko");
            }
            else if(age1 >= 71){
                System.out.println(name1 + " to emeryt/ka");
            }
        }
//user2 - starszy
        if((age2 > age1) && (age2 > age3)){
            System.out.println(name2 + " jest najstarsza osoba");
            if ((age2 > 17)&&(age2 <71)){
                System.out.println(name2 + " to dorosla osoba");
            }
            else if((age2 < 18)&&(age2 > 10)){
                System.out.println(name2 + " to nastolatek");
            }
            else if((age2 >= 0 )&&(age2 < 11)){
                System.out.println(name2 + " to dziecko");
            }
            else if(age2 > 70){
                System.out.println(name2 + " to emeryt/ka");
            }
        }
// user2 - mlodszy
        if((age2 < age1)&&(age2 < age3)) {
            System.out.println(name2 + " jest najmlodsza osoba");
            if ((age2 > 17)&&(age2 <71)){
                System.out.println(name2 + " to dorosla osoba");
            }
            else if((age2 < 18)&&(age2 > 10)){
                System.out.println(name2 + " to nastolatek");
            }
            else if((age2 >= 0 )&&(age2 < 11)){
                System.out.println(name2 + " to dziecko");
            }
            else if(age2 > 70){
                System.out.println(name2 + " to emeryt/ka");
            }
        }
//user3 - starszy
        if((age3 > age1) && (age3 > age2)){
            System.out.println(name3 + " jest najstarsza osoba");
            if ((age3 > 17)&&(age3 <71)){
                System.out.println(name3 + " to dorosla osoba");
            }
            else if((age3 < 18)&&(age3 > 10)){
                System.out.println(name3 + " to nastolatek");
            }
            else if((age3 >= 0 )&&(age3 < 11)){
                System.out.println(name3 + " to dziecko");
            }
            else if(age3 > 70){
                System.out.println(name3 + " to emeryt/ka");
            }
        }
// user3 - mlodszy
        if((age3 < age1)&&(age3 < age2)) {
            System.out.println(name3 + " jest najmlodsza osoba");
            if ((age3 > 17)&&(age3 <71)){
                System.out.println(name3 + " to dorosla osoba");
            }
            else if((age3 < 18)&&(age3 > 10)){
                System.out.println(name3 + " to nastolatek");
            }
            else if((age3 >= 0 )&&(age3 < 11)){
                System.out.println(name3 + " to dziecko");
            }
            else if(age3 > 70){
                System.out.println(name3 + " to emeryt/ka");
            }
        }

    }

}
