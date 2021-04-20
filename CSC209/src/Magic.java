public class Magic {
    String spell; //"manatepo"
    int power; //1-10
    String ability; //fly, disguise
    String element; //water, fire, wind, earth

    public Magic(String spell, int power, String ability, String element) {
        this.spell = spell;
        this.power = power;
        this.ability = ability;
        this.element = element;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        if (element.equalsIgnoreCase("water") || element.equalsIgnoreCase("fire") || element.equalsIgnoreCase("wind") || element.equalsIgnoreCase("earth")) {
            this.element = element;
        } else {
            System.out.println(element + " is an invalid element");
        }
    }

    @Override
    public String toString() {
        return "Magic{" + "spell= "+spell+", power="+power+", ability="+ability+", element="+element;
    }

}
