package clase;

public class Autobuz {
    private Autobuz() {
    }
    //am facut singleton ca un sofer sa poata conduce un singur autobuz
    private static Autobuz autobuz = null;

    public static Autobuz getInstance() {
        if (autobuz != null) {
            return autobuz;
        } else {
            autobuz = new Autobuz();
            return autobuz;
        }

    }

    public void deschideUsaFata() {
        System.out.println("Usa din fata deschisa!");
    }

    public void deschideUsaMijloc() {
        System.out.println("Usa din mijloc deschisa!");
    }

    public void deschideUsaSpate() {
        System.out.println("Usa din spate deschisa!");
    }

    public void puneliberUsaFata() {
        System.out.println("Usa din fata a fost pusa pe liber!");
    }

    public void puneliberUsaMijloc() {
        System.out.println("Usa din mijloc a fost pusa pe liber!");
    }

    public void puneliberUsaSpate() {
        System.out.println("Usa din spate a fost pusa pe liber!");
    }
}
