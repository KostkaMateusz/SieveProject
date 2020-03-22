package SieveApp;

import javax.imageio.IIOException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Sieve sieve;

        System.out.println("Wybierz Opcje");
        System.out.println("1.Wygeneruj Liczby do " );
        System.out.println("2.Wygeneruj Liczby w przedziale");
        //System.out.println("3.Wyswietl wygenerowane liczby");
        //System.out.println("4.Zapisz wygenerowane liczby do pliku");
        //System.out.println("5.Zakoncz dzialanie programu");


        Scanner scanner=new Scanner(System.in);
        int switcher=Integer.valueOf(scanner.nextLine());

            switch (switcher) {
                case 1:
                    System.out.println("Podaj gorna granice:");
                    sieve=new Sieve(Integer.valueOf(scanner.nextLine()));
                    sieve.sieveOfEratosthenes();
                    sieve.printPrimeNumbers();
                    break;
                case 2:
                    System.out.println("Podaj gorna granice:");
                    int UpperBorder=(Integer.valueOf(scanner.nextLine()));
                    System.out.println("Podaj dolna granice:");
                    int LowerBorder=(Integer.valueOf(scanner.nextLine()));
                    sieve=new Sieve(LowerBorder,UpperBorder);
                    sieve.sieveOfEratosthenes();
                    sieve.printPrimeNumbers();
                    break;

        }
    }
}
