public class Main {
    public static void main(String[] args) {
        GameCharacter general = new GameCharacter("General Character", 100);
        Hero brimstone = new Hero("Brimstone", 150);
        Villain viper = new Villain("Viper", 200);

        general.setName("Nova");


        System.out.println("Initial Health: ");
        System.out.println(brimstone.getName() + " health : " + brimstone.getHealth());
        System.out.println(viper.getName() + " health : " + viper.getHealth());
        System.out.println();

        general.attack(viper);
        brimstone.attack(viper);
        viper.attack(brimstone);

    }
}