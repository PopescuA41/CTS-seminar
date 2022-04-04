package clase;

public class Autobuz implements MijlocTransport {
    private String numeSofer;

    public Autobuz(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) super.clone();
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                '}';
    }
}
