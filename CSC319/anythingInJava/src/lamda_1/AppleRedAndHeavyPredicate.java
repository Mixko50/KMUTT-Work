package lamda_1;

public class AppleRedAndHeavyPredicate implements ApplePredicate {

    public boolean test(Apple apple) {
        return "RED".equals(apple.getColor()) && apple.getWeight() > 150;
    }
}
