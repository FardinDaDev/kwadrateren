import java.util.List;
import java.util.Scanner;

public class Uitwerking {
    public static void main(String[] args) {

        //Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Input any number");
        int getal = sc.nextInt();

        /*
        Initialiseer variabelen
        */
        int x = 0;
        int y = 0;
        int z = 0;

        //Som variabel
        int som = 0;

        //Startgetal int i = 1; i is kleiner of gelijk aan getal; i++ voor de increment.
        for (int i = 1; i <= getal; i++) {

            /*

            i % 2 == 0, checkt voor even en oneven getallen, want

            1 % 2 = 1
            2 % 2 = 0
            3 % 2 = 1
            4 % 2 = 0

            */
            if (i % 2 == 0) {
                /*
                Als het getal deelbaar is door modulo 6 en gelijk is aan 0

                Bijvoorbeeld 6 % 6 = 0
                12 % 6 = 0
                24 % 6 = 0

                Deelbare getallen zijn atlijd gelijk aan 0.
                */
                if (i % 6 == 0) {

                    x += 1;
                    //Kwadrateer de i
                    int kwadraat = i * i;

                    System.out.println("Kwadraat: " + kwadraat);

                    /*Voeg de kwadraat toe aan de som

                    Stel getal = 9

                    som = 36

                    */
            
                    som += kwadraat;

                } else {
                    y += 1;
                    System.out.println("Normale integer: " + i);

                    /*Ook voeg je nog de overige integers in de som
                    som = 36 + (2 + 4 + 8) = 50
                    */
                    som += i;
                }
            } else {
                //De oneven getallen worden genegeerd.
                z += 1;
            }
        }

        /*

        De x, y, z variabelen

        Stel getal = 9
        1, 2, 3, 4, 5, 6, 7, 8, 9
        1, 3, 5, 7, 9 worden niet meegeteld. 5 / 9 * 100 = 56%
        2, 4, 8 wel waarvan het getal niet deelbaar is door 6; 3 / 9 * 100 = 33%
        6 is wel deelbaar dus 1 / 9 * 100 = 11%

        We zien dus een verband

        1, 3, 5. 

        Dus 56% + 11% = 67% van de getallen worden opgeteld.

        */

        System.out.println(x + " " + y + " " + z);
        System.out.println("Totaal: " + som);

    }

}
