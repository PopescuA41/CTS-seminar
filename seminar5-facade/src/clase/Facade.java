package clase;

public class Facade {
    public static Autobuz autobuz = Autobuz.getInstance();

    public static void deschideUsi() {
        autobuz.deschideUsaFata();
        autobuz.deschideUsaMijloc();
        autobuz.deschideUsaSpate();
    }

    public static void punePeLiber() {
        autobuz.puneliberUsaFata();
        autobuz.puneliberUsaMijloc();
        autobuz.puneliberUsaSpate();
    }
}
