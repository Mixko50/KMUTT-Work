package RecursionHomework;

import java.util.Scanner;

public class oddFromNtoOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input your number : ");
        oddRecursionFromN(sc.nextInt());

    }

    public static void oddRecursionFromN(int number){
        if (number == 1){
            System.out.print(number + " ");
        } else {
            if (number %2 == 1){
                System.out.print(number + " ");
                oddRecursionFromN(number - 1);
            } else {
                oddRecursionFromN(number -1 );
            }
        }
    }
}
