package SieveApp;

import javax.imageio.IIOException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
    Sieve sieve=new Sieve(100);
        sieve.sieveOfEratosthenes();
        sieve.printPrimeNumbers();

        sieve.writePrimeNumbersToFile();



    }
}
