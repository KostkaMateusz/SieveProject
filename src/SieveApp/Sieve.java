package SieveApp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sieve {
   private int upperBorder;
   private int lowerBorder=2;
   private boolean[] prime;
   private List<Integer> primeNumbersList=new ArrayList<>();

    // Create a boolean array "prime[0..n]" and initialize
    public Sieve(int upperBorder){
        this.upperBorder=upperBorder;
        this.prime=new boolean[upperBorder + 1];
        Arrays.fill(prime, true);
    }

    public Sieve(int lowerBorder,int upperBorder){
        this.upperBorder=upperBorder;
        this.lowerBorder=lowerBorder;
        this.prime=new boolean[upperBorder + 1];
        Arrays.fill(prime, true);
    }

    public void sieveOfEratosthenes() {
        // finally be false if i is Not a prime, else true.
        // If prime[p] is not changed, then it is a prime
        // Update all multiples of p
        for (int p = 2; p * p <= upperBorder; p++)
            if (prime[p] == true)
                for (int i = p * 2; i <= upperBorder; i += p)
                    prime[i] = false;
    }

    public void writePrimeNumbersToFile() throws IOException {
        populatePrimeNumberList(this.prime);
        FileReaderWriter.primeWriter(this.primeNumbersList);

    }

    private void populatePrimeNumberList(boolean[] prime){
        for (int i = 2; i <= upperBorder; i++)
            if (prime[i] == true)
                this.primeNumbersList.add(i);
    }


    public void printPrimeNumbers() {
        System.out.println("These are PrimeNumbers from 2 to "+upperBorder+":");
        int wydrukowane=0;
        for (int i = lowerBorder; i <= upperBorder; i++) {
            if (prime[i] == true){
                System.out.print(i + " ");
                wydrukowane++;
                if (wydrukowane==20) {
                    System.out.println();
                    wydrukowane=0;
                }
            }
        }
    }
}