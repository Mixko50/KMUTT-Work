package lamda_1;

public class AppleGreenColorPredicate implements ApplePredicate {

    public boolean test(Apple apple) {
        return "GREEN".equals(apple.getColor());
    }
}
