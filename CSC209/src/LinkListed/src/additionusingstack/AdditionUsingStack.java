package additionusingstack;

import java.util.Scanner;

public class AdditionUsingStack {
    public static void main(String[] args) {
//        Stack st1 = new Stack(100);
//        st1.push(5);
//        st1.push(555);
//        st1.push(44);
//        st1.push(200);
//        System.out.println(st1.pop());
//        st1.pop();
//        System.out.println(st1.size);
        Scanner sc = new Scanner(System.in);
        String operand1 = sc.next();
        String operand2 = sc.next();
        String x = addLongInt(operand1,operand2);
        System.out.println(x);


    }

    public static String addLongInt(String operand1 , String operand2){
        Stack op1 = new Stack(100000);
        Stack op2 = new Stack(100000);
        Stack result = new Stack(100001);

        for (int i = 0; i < operand1.length(); i++) {
            op1.push(Integer.parseInt(operand1.charAt(i)+""));
        }
        for (int i = 0; i < operand2.length(); i++) {
            op2.push(Integer.parseInt( operand2.charAt(i)+""));
        }
        int carry = 0;
        while (!op1.isEmpty() || !op2.isEmpty()){
            int a = (!op1.isEmpty() ? op1.pop() : 0);
            int b = (!op2.isEmpty() ? op2.pop() : 0);

            int immediateAnswer = a + b + carry;
            result.push(immediateAnswer % 10);
            carry = immediateAnswer / 10;
        }
        if (carry == 1 ){
            result.push(carry);
        }
        String answer = "";

        while (!result.isEmpty()){
            answer += result.pop();
        }
        return answer;

    }
}
