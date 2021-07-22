import java.util.Scanner;

class tydzien1 {
    public static void main(String[] args){     //od tego miejsca zaczyna się działanie programu
        greatings();
        zadanie1();
    }
    public static void greatings(){
        System.out.println("Hello user !!!");
    }

    public static void zadanie1() {
        Scanner x = new Scanner(System.in);
        String name;
        System.out.print("Imput your name: ");
        name = x.nextLine();
        String surname;
        System.out.print("Imput your surname: ");
        surname = x.nextLine();
        int age;
        System.out.print("Imput your age:");
        age = x.nextInt();
        System.out.println("Hello " + surname + " " + name + " you are " + age);
    }
    // F = (C x 1,8) + 32
    public static void zadanie2(){
        Scanner x = new Scanner(System.in);
        int C;
        System.out.print("imput the temperature in degrees Celsius:");
        C = x.nextInt();
        int F = (int) (C * 1.8) + 32;
        // wynik w liczbach całkowitych
        System.out.println("degrees Celsius: " + C);
        System.out.println("degrees Fahrenheit: " + F);
    }
    // C = (F - 32) x 0,5555
    public static void zadanie3(){
        Scanner x = new Scanner(System.in);
        int F;
        System.out.print("imput the temperature in degrees Fahrenheit:");
        F = x.nextInt();                            //F = x.nextFloat();
        int C = (int) ((F - 32) * 0.5555);           // dopisać (int) i reszta w nawiasy

        System.out.println("degrees Fahrenheit: " + F);
        System.out.println("degrees Celsius: " + C);
    }
        // a2+b2=c2
    public static void zadanie4(){
        Scanner x = new Scanner(System.in);
        int a;
        System.out.print("Wprowadz wartosc przyprostokatnej A:");
        a = x.nextInt();
        int aa = (int) Math.pow(a,2);
        //int aa = (a * a); pierwiastkowanie Math.pow(a,a) - drugie to wielkość potęgi
        int b;
        System.out.print("Wprowadz wartosc przyprostokatnej B:");
        b = x.nextInt();
        int bb = (int) Math.pow(b,2);
        double c = Math.sqrt(aa + bb);
        c = Math.round(c);
        System.out.println("wynik: " + c);
    }
    //zadanie 5 - BMI = masa(kg) / wzrost do kwadratu (w metrach)
    public static void zadanie5(){
        Scanner x = new Scanner(System.in);
        int a;
        System.out.print("Wprowadz masę ciała (kg):");
        a = x.nextInt();
        float b;
        System.out.print("Wprowadz wzrost (w przeliczeniu na metry):");
        b = x.nextFloat();
        float BMI = (a) / ((float)Math.pow(b,2));
        BMI = Math.round(BMI);
        System.out.println("Twoje BMI to: " + BMI);
    }
    public static void zadanie6(){
        Scanner x = new Scanner(System.in);
        int m1;
        System.out.print("Wprowadz masę pojazdu 1 (kg):");
        m1 = x.nextInt();
        int m2;
        System.out.print("Wprowadz masę pojazdu 2 (kg):");
        m2 = x.nextInt();
        int a1;
        System.out.print("Wprowadz przyspieszenie pojazdu 1 (m/s2):");
        a1 = x.nextInt();
        int a2;
        System.out.print("Wprowadz przyspieszenie pojazdu 2 (m/s2):");
        a2 = x.nextInt();
        int F = ((m1 * a1) + (m2 * a2)) / 1000;
        System.out.println("Siła zderzenia dwoch pojazdow wynosi " + F + "kN");
    }
}

/*
   zadanie 6 - obliczyć siłę zderzenia w Niutonach
 */
