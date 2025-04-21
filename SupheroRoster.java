public class SupheroRoster {

    public static void main(String[] args) {
        String[] heroNames = {"Invincible", "Rexsplode", "The Thing"};
        String[] heroAbilities = {"Flight and Superhuman Strength", "Detonate Non-Organic Matter", "Rock-solid Exterior"};
        int[] power = {95, 80, 85};

        System.out.println("Superhero Roster:");
        for (int i = 0; i < heroNames.length; i++) {
            System.out.println("Hero's Name: " + heroNames[i]);
            System.out.println("Hero's Abilities: " + heroAbilities[i]);
            System.out.println("Power Level: " + power[i]);
        }

        searchHero(heroNames, heroAbilities, power, "Rexsplode");

        searchHero(heroNames, heroAbilities, power, "The Red Guardian");

        System.out.println(calculateAveragePower(power));

        Superhero[] heroRoster = new Superhero[heroNames.length];
        for (int i = 0; i < heroRoster.length; i++) {
            heroRoster[i] = new Superhero(heroNames[i], heroAbilities[i], power[i]);
        }

        for (int i = 0; i < heroRoster.length; i++) {
            heroRoster[i].displayHero();
        }
    }

    public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target) {
        boolean success = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                System.out.println("Found " + names[i]);
                System.out.println("Abilities: " + abilities[i]);
                System.out.println("Power Level: " + powerLevels[i]);
                success = true;
            }
        }

        if (success == false) {
            System.out.println(target + " not found.");
        }
    }

    public static double calculateAveragePower(int[] powerLevels) {
        double result = 0;
        for (int i = 0; i < powerLevels.length; i++) {
            result += powerLevels[i];
        }
        result = result/powerLevels.length;
        return result;
    }
}