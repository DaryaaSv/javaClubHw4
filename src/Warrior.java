public class Warrior extends Hero {
    public Warrior() {}
    public Warrior(String name) {
        this.name = name;
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(25);
        System.out.println("Warrior " + name + " is attacking!");
    }
}
