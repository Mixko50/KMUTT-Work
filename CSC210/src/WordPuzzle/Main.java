package WordPuzzle;

class Main{
    public static boolean move(String input, char[][] arr, int x, int y, int ax, int ay, int w){
        if(input.length() <= w) return true;
        if(arr.length <= y || arr[0].length <= x ) return false;
        if(arr[y][x] == input.charAt(w)){
            return move(input, arr, x+ax, y+ay, ax, ay, w+1);
        }
        return move(input, arr, x+ax, y+ay, ax, ay, 0);
    }
    public static boolean check(String input, char[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(move(input, arr, i, j,1,0, 0) || move(input, arr, i, j,0,1, 0)) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        char[][] arr = {{'w','a','r','w','c','a','t'},{'w','a','r','w','c','b','t'},{'w','a','r','w','c','a','h'}};
        String input = "cat";
        System.out.println(check(input, arr));
    }
}