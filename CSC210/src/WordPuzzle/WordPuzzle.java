package WordPuzzle;

import java.util.Scanner;

public class WordPuzzle {
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    String[][] puzzle;
    String[] words;
    int col, row;
    boolean loopCheck = true, skip = false;

    public void play() {
        puzzle = addChar();
        words = whichWord();
        findWords();
    }

    public String[][] addChar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Row : ");
        int row = sc.nextInt();
        System.out.print("Column : ");
        int col = sc.nextInt();
        System.out.println("Fill your char of each row and column.");
        String[][] puzzle = new String[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                puzzle[i][j] = sc.next().toUpperCase();
            }
        }
        this.row = row;
        this.col = col;
        return puzzle;
    }

    public String[] whichWord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of words that need to find : ");
        int numberOfWord = sc.nextInt();
        String[] checkWords = new String[numberOfWord];
        for (int i = 0; i < checkWords.length; i++) {
            System.out.print("Number " + (i + 1) + " : ");
            checkWords[i] = sc.next().toUpperCase();
        }
        return checkWords;
    }

    public void findWords() {
        String temp = "";
        for (int word = 0; word < words.length; word++) {
            if (!skip) {
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        //right
                        if (loopCheck) {
                            for (int k = 0; k < words[word].length()  && j + k < col; k++) {
                                if (words[word].charAt(k) == (puzzle[i][j + k].charAt(0))) {
                                    temp = temp.concat(puzzle[i][j + k]);
                                    if (k == words[word].length() - 1) check(temp, words[word]);
                                } else break;
                            }
                        }
                        temp = "";

                        //left
                        if (loopCheck) {
                            for (int k = 0; k <= words[word].length() - 1 && j - k >= 0; k++) {
                                if (words[word].charAt(k) == (puzzle[i][j - k].charAt(0))) {
                                    temp = temp.concat(puzzle[i][j - k]);
                                    if (k == words[word].length() - 1) check(temp, words[word]);
                                } else break;
                            }
                        }
                        temp = "";

                        //top
                        if (loopCheck) {
                            for (int k = 0; k < words[word].length() && i - k >= 0; k++) {
                                if (words[word].charAt(k) == (puzzle[i - k][j].charAt(0))) {
                                    temp = temp.concat(puzzle[i - k][j]);
                                    if (k == words[word].length() - 1) check(temp, words[word]);
                                } else break;
                            }
                        }
                        temp = "";

                        //bottom
                        if (loopCheck) {
                            for (int k = 0; k < words[word].length() && i + k < row; k++) {
                                if (words[word].charAt(k) == (puzzle[i + k][j].charAt(0))) {
                                    temp = temp.concat(puzzle[i + k][j]);
                                    if (k == words[word].length() - 1) check(temp, words[word]);
                                } else break;
                            }
                        }
                        temp = "";

                        //NE -> Right, Top
                        if (loopCheck) {
                            for (int k = 0; k < words[word].length() && i - k >= 0 && j + k < col; k++) {
                                if (words[word].charAt(k) == (puzzle[i - k][j + k].charAt(0))) {
                                    temp = temp.concat(puzzle[i - k][j + k]);
                                    if (k == words[word].length() - 1) check(temp, words[word]);
                                } else break;
                            }
                        }
                        temp = "";

                        //SE -> Right, Bottom
                        if (loopCheck) {
                            for (int k = 0; k < words[word].length() && i + k < row && j + k < col; k++) {
                                if (words[word].charAt(k) == (puzzle[i + k][j + k].charAt(0))) {
                                    temp = temp.concat(puzzle[i + k][j + k]);
                                    if (k == words[word].length() - 1) check(temp, words[word]);
                                } else break;
                            }
                        }
                        temp = "";

                        //SW -> Left, Bottom
                        if (loopCheck) {
                            for (int k = 0; k < words[word].length() && i + k < row && j - k >= 0; k++) {
                                if (words[word].charAt(k) == (puzzle[i + k][j - k].charAt(0))) {
                                    temp = temp.concat(puzzle[i + k][j - k]);
                                    if (k == words[word].length() - 1) check(temp, words[word]);
                                } else break;
                            }
                        }
                        temp = "";

                        //NW -> Left, Top
                        if (loopCheck) {
                            for (int k = 0; k < words[word].length() && i - k >= 0 && j - k >= 0; k++) {
                                if (words[word].charAt(k) == (puzzle[i - k][j - k].charAt(0))) {
                                    temp = temp.concat(puzzle[i - k][j - k]);
                                    if (k == words[word].length() - 1) check(temp, words[word]);
                                } else break;
                            }
                        }
                        temp = "";
                    }
                }
            }
            skip = false;
            loopCheck = true;
        }
    }

    public void check(String temp, String word) {
        System.out.println(TEXT_YELLOW + word + TEXT_GREEN + " Found" + TEXT_RESET);
        if (temp.equals(word)) {
            loopCheck = false;
            skip = true;
        }
    }
}