package clase;

public abstract class Animal {
    private String nume;

    public abstract void mananca(String tipMancare);

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Animal(String nume) {
        this.nume = nume;
    }
}