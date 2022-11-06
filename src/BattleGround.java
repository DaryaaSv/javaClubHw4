public class BattleGround {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Ola");
        Enemy enemy = new Enemy(200);
        warrior.attackEnemy(enemy);
        System.out.println(enemy.getHealth());
        System.out.println(enemy.isAlive() + "\n");

        Mage mage = new Mage("Lin");
        mage.attackEnemy(enemy);
        mage.attackEnemy(enemy);
        mage.attackEnemy(enemy);
        System.out.println(enemy.getHealth());
        System.out.println(enemy.isAlive());
    }
}
