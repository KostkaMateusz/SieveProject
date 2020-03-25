package SieveApp;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private Sieve sieve = new Sieve();

    public void printMenu() throws IOException {
        System.out.println();
        System.out.println("Wybierz Opcje");
        System.out.println("1.Wygeneruj Liczby do ");
        System.out.println("2.Wygeneruj Liczby w przedziale");
        System.out.println("3.Zapisz wygenerowane liczby do pliku");
        //System.out.println("5.Zakoncz dzialanie programu");
        switcher();
    }

    private void switcher() throws IOException {
        int switcher = Integer.valueOf(scanner.nextLine());
        switch (switcher) {
            case 1:
                System.out.println("Podaj gorna granice:");
                int gornaGranica = Integer.valueOf(scanner.nextLine());
                sieve = new Sieve(gornaGranica);
                sieve.sieveOfEratosthenes();
                sieve.printPrimeNumbers();
                printMenu();
                break;
            case 2:
                System.out.println("Podaj gorna granice:");
                int UpperBorder = (Integer.valueOf(scanner.nextLine()));
                System.out.println("Podaj dolna granice:");
                int LowerBorder = (Integer.valueOf(scanner.nextLine()));
                sieve = new Sieve(LowerBorder, UpperBorder);
                sieve.sieveOfEratosthenes();
                sieve.printPrimeNumbers();
                printMenu();
                break;
            case 3:
                sieve.writePrimeNumbersToFile();
                System.out.println("Operacja zakonczona");
                printMenu();
                break;
            case 4:
                break;

        }

    }


}
