abstract public class Hero {
    protected String name;
    public Hero() {}
    public Hero(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract void attackEnemy(Enemy enemy);
}
