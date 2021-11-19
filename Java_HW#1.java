import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int i = 0;

        //Scanner sc = new Scanner(System.in);  //  new command
        for (i = 0;i <= 100;i++) {
            //System.out.print("Introdu un numar: ");
            System.out.println("Numarul este " + x);
            if (x % 5 == 0 && x % 3 == 0)
                System.out.println("~ FizzBuzz ~"); // prima conditie
            else if (x % 5 == 0) // else if pe aceeasi linie
                //acolade chiar si pt o singura comanda de executie
                System.out.println("~ Fizz ~");
            else if (x % 3 == 0)
                System.out.println("~ Buzz ~");
            else
                System.out.println(x + " nu este divizibil nici cu 3, nici cu 5");
            x++;
        }
    }
}

        /*int floor = 59;
        char character = 87;  //  ascii

        System.out.println(floor);
        System.out.println(character);

        boolean iAmHired = false;
        System.out.println(iAmHired);


        int number  = sc.nextInt();
        switch(number)
        {
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            default:
                System.out.println("Nu mai am zile in saptamana");
        }
    }*/