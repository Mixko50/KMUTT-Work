package TowerOfHanoi;

public class TowerMain {
    public static void main(String[] args) {
        TowerOfHanoi th = new TowerOfHanoi(3);
//        while (!th.pegA.isEmpty()){
//            System.out.println(th.pegA.pop());
//        }
        th.play();
    }
}
