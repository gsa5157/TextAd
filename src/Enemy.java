public class Enemy {
    protected String name;
    protected int hp;
    protected int damage;
    protected String description;
    protected int size;
    protected int speed;

    public Enemy(String name, int hp, int damage, int speed, String description, int size) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.description = description;
        this.size = size;
        this.speed = speed;

    }

    public String toString() {
        return String.format("%s \n=====\n %s \nValue: %d \n", this.name, this.description, this.hp, this.damage, this.size, this.speed);

    }
}