public class Mage extends Hero {
    public Mage() {}
    public Mage(String name) {
        this.name = name;
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(30);
        System.out.println("Mage " + name + " is attacking!");
    }
}
