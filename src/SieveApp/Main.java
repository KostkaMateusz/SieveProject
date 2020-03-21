package SieveApp;

import javax.imageio.IIOException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
    Sieve sieve=new Sieve(10000000);
        sieve.sieveOfEratosthenes();
        sieve.printPrimeNumbers();
        try {
            sieve.writePrimeNumbersToFile();
        }
        catch (IIOException e){
            System.out.println("zjebalo sie");
        }

    }
}
