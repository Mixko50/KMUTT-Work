package RecursionHomework;

import java.util.Scanner;

public class oddFromOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input your number : ");
        oddRecursion(sc.nextInt());
    }

    public static void oddRecursion(int number){
        if (number == 1 ){
            System.out.print(number+" ");
        } else {
            oddRecursion(number-1);
            if (number %2 == 1) {
                System.out.print(number + " ");
            }
        }
    }
}
