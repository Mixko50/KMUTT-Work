package EmpericalAnalysis;

public class EmpericalAnalysis {
    //(1) + (1+2) + (1+2+3)
    //i*(n-1+1) + i*(n-2+1) + i(n-3+1)
    //i*(n-i+1) + i*(n-i+1) + i(n-i+1)
    public static void main(String[] args) {
        long start,end;
        long n = 1000000;
        start = System.currentTimeMillis();
        System.out.println(sumOfSum(n));
        end = System.currentTimeMillis();
        System.out.println("Sum of summation "+ (end - start) +" milliseconds.");

        start = System.currentTimeMillis();
        System.out.println(sumOfSumByFormular(n));
        end = System.currentTimeMillis();
        System.out.println("Sum of summation by formular "+ (end - start) +" milliseconds.");

        start = System.currentTimeMillis();
        System.out.println(sumOfSumByMultiply(n));
        end = System.currentTimeMillis();
        System.out.println("Sum of summation by multiply "+ (end - start) +" milliseconds.");
    }

    public static double sumOfSumByMultiply(long n) {
        double sumOfSum = 0;
        for (int i = 0; i <= n; i++) {
            sumOfSum += i*(n-i+1);
        }
        return sumOfSum;
    }

    public static double sumOfSumByFormular(long n){
        double sumOfSum = 0;
        long sum = 0;
        for (long i = 0; i <= n; i++) {
            sum = i*(i+1) / 2;
            sumOfSum += sum;
        }
        return sumOfSum;
    }

    public static double sumOfSum(long n){
        double sumOfsum = 0;
        for (int i = 0; i <= n; i++) {
            double sum = 0;
            for (int j = 0; j <= i; j++) {
                sum+=j;
            }
            sumOfsum += sum;
        }
        return sumOfsum;
    }
}
