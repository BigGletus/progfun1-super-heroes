public class Superhero {
    private String name;
    private String abilities;
    private int power;

    public Superhero(String name, String abilities, int power) {
        this.name = name;
        this.abilities = abilities;
        this.power = power;
    }

    public void displayHero() {
        System.out.println("Hero's Name: " + name);
        System.out.println("Hero's Abilities: " + abilities);
        System.out.println("Power Level: " + power);
    }
}
