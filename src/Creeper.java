import javax.swing.*;

public class Creeper extends Enemy{
    private Explodes explodes;
    public Creeper(Explodes explodes){

        super("Creeper", 35, 20, 3, "A silently approaching mob that explodes when it gets close", 3);
        this.explodes = explodes;
    }
}
