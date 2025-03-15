public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        animal1.name ="Cat";
        animal1.classification ="Mammals";
        animal1.voice="Meow~~";

        animal2.name ="Dog";
        animal2.classification ="Mammals";
        animal2.voice="Woof-Woof!!";

        animal1.showInfo();

        animal2.showInfo();
    }
}