package clase;

public class Girafa extends Animal{
    public Girafa(String nume) {
        super(nume);
    }

    @Override
    public void mananca(String tipMancare) {
        System.out.println("Girafa" + getNume() + "mananca" + tipMancare);
    }

}