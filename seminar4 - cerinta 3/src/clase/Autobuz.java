package clase;

public class Autobuz {
    private String numeSofer;
    private int nrLinie;
    private boolean pauzaSofer;
    private boolean deschideUsi;
    private int oraInceput;
    private String textDerulat;

    public Autobuz(String numeSofer, int nrLinie, boolean pauzaSofer, boolean deschideUsi, int oraInceput, String textDerulat) {
        this.numeSofer = numeSofer;
        this.nrLinie = nrLinie;
        this.pauzaSofer = pauzaSofer;
        this.deschideUsi = deschideUsi;
        this.oraInceput = oraInceput;
        this.textDerulat = textDerulat;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", nrLinie=" + nrLinie +
                ", pauzaSofer=" + pauzaSofer +
                ", deschideUsi=" + deschideUsi +
                ", oraInceput=" + oraInceput +
                ", textDerulat='" + textDerulat + '\'' +
                '}';
    }

    void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    void setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    void setPauzaSofer(boolean pauzaSofer) {
        this.pauzaSofer = pauzaSofer;
    }

    void setDeschideUsi(boolean deschideUsi) {
        this.deschideUsi = deschideUsi;
    }

    void setOraInceput(int oraInceput) {
        this.oraInceput = oraInceput;
    }

    void setTextDerulat(String textDerulat) {
        this.textDerulat = textDerulat;
    }

    //am facut setter-ii default ca sa poata fi apelati doar din pachet si sa nu mai putem apela din main
}
