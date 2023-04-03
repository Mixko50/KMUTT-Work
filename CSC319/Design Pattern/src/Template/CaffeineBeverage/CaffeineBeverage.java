package Template.CaffeineBeverage;

public abstract class CaffeineBeverage {
    final public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiment();
    }

    protected abstract void brew();

    protected abstract void addCondiment();

    protected void boilWater() {
        System.out.println("Boiling water");
    }

    protected void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
