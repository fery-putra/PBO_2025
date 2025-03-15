class Hero extends GameCharacter {
    public Hero(String name,int health) {
        super(name, health);

    }
@Override
    public void attack(GameCharacter target) {
    System.out.println(getName() + " attacks " + target.getName() + " using Orbital Strike" );
    target.setHealth(target.getHealth()-20);
    System.out.println(target.getName() + " health now " + target.getHealth());
}
}
