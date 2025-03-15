class Villain extends GameCharacter {
    public Villain(String name,int health) {
        super(name, health);

    }
    @Override
    public void attack(GameCharacter target) {
        System.out.println(getName() + " attacks " + target.getName() + " using Snack Bite! ");
        target.setHealth(target.getHealth()-15);
        System.out.println(target.getName() + " health now " + target.getHealth());
    }
}
