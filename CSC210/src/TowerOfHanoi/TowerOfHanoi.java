package TowerOfHanoi;

import java.util.Stack;

public class TowerOfHanoi {
    Stack<Integer> pegA, pegB, pegC;
    int amountOfDisks;
    int iMove;

    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_PURPLE = "\u001B[35m";

    public TowerOfHanoi(int amountOfDisks) {
        this.amountOfDisks = amountOfDisks;
        iMove = 0;
        pegA = new Stack<Integer>();
        pegB = new Stack<Integer>();
        pegC = new Stack<Integer>();
        for (int i = amountOfDisks; i > 0; i--) {
            pegA.push(i);
        }
    }

    public void play(){
        move(pegA.size(), pegA, pegC, pegB);
    }

    public void move(int n, Stack fromPeg, Stack toPeg, Stack avaliblePeg) {
        if (n == 1){
            toPeg.push( fromPeg.pop());
            iMove++;
            showTowerOfHanoi();
            return;
        }
        move(n-1, fromPeg, avaliblePeg, toPeg);
        move(1,fromPeg, toPeg, avaliblePeg);
        move(n-1, avaliblePeg, toPeg, fromPeg);
    }

    public void showTowerOfHanoi() {
        int max;
        if (pegA.size() >= pegB.size() && pegA.size() >= pegC.size()) {
            max = pegA.size()-1;
        } else if (pegB.size() >= pegA.size() && pegB.size() >= pegC.size()){
            max = pegB.size()-1;
        } else {
            max = pegC.size()-1;
        }

        for (int i = max; i >= 0 ; i--) {
            if (pegA.size() - 1 >= i){
                System.out.print(TEXT_RED + pegA.elementAt(i)+"    "+ TEXT_RESET);
            } else {
                System.out.print("     ");
            }
            if (pegB.size() - 1 >= i){
                System.out.print(TEXT_YELLOW + pegB.elementAt(i)+"    "+TEXT_RESET);
            } else {
                System.out.print("     ");
            }
            if (pegC.size() - 1 >= i){
                System.out.print(TEXT_PURPLE + pegC.elementAt(i)+"    " + TEXT_RESET);
            } else {
                System.out.print("     ");
            }
            System.out.println("");
        }
        System.out.println("-- "+ TEXT_GREEN +"Move "+ iMove + TEXT_RESET + " --");
    }

}
