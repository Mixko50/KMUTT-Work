package PrimeNumber;

public class Prime {
    int n;
    int[] primeList;

    public Prime(int x){
        n = x;
        primeList = new int[n];
    }

    public void genPrimeSeiveOfErathosthenes(){
        int[] a = new int[n+1];
        for (int i = 2; i < a.length; i++) { //put 2 to n into array a
            a[i] = i;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (a[i] != 0 ){
                int j = i*i;
                while (j < n){
                    a[j] = 0; //change (sieve) to 0
                    j+=i;
                }
            }
        }
        int count = 0;
        for (int i = 2; i <= n-1; i++) {
            if (a[i] != 0){
                primeList[count] = a[i];
                count++;
            }
        }
    }

    public void genPrimeBruteForce(){
        for (int i = 2, count = 0; i < n; i++) {
            if (isPrime(i)){
                primeList[count] = i;
                count++;
            }
        }
    }

    public boolean isPrime(int x) {
        for (int i = 2; i < x-1; i++) {
            if (x%i == 0){
                return false;
            }
        }
        return true;
    }
}
