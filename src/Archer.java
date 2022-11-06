public class Archer extends Hero {
    public Archer() {}
    public Archer(String name) {
        this.name = name;
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(40);
        System.out.println("Archer " + name + " is attacking!");
    }
}
