public class Main {
    public static void main(String[] args) {
    Sword magicSword = new Sword();
    Gold goldBar = new Gold(5);
    Arrow arrow = new Arrow();
    Pillow softPillow = new Pillow();
    Mace bigMace = new Mace();
    Ogre greenOgre = new Ogre();
    Ogre redOgre = new Ogre();
    Zombie slowZombie = new Zombie();
    Zombie fastZombie = new Zombie();
    Dog spotDog = new Dog();
    Creeper creeper = new Creeper(Explodes.Lava);
    MoveWest moveWest = new MoveWest();
    MoveEast moveEast = new MoveEast();
    MoveNorth moveNorth = new MoveNorth();
    MoveSouth moveSouth = new MoveSouth();
    Flee flee = new Flee();
    ViewInventory viewInventory = new ViewInventory();
    Crouch crouch = new Crouch();
    World world = new World();
    world.load_tiles();
    }
}