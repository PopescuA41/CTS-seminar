package clase;

public class AutobuzBuilder implements Builder {
    private String numeSofer;
    private int nrLinie;
    private boolean pauzaSofer;
    private boolean deschideUsi;
    private int oraInceput;
    private String textDerulat;

    public AutobuzBuilder() {
        this.numeSofer = "sofer";
        this.nrLinie = 2;
        this.pauzaSofer = true;
        this.deschideUsi = false;
        this.oraInceput = 8;
        this.textDerulat = "ceva";
    }

    @Override
    public Autobuz build() {

        return new Autobuz(this.numeSofer, this.nrLinie, this.pauzaSofer, this.deschideUsi, this.oraInceput, this.textDerulat);
    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
        return this;
    }

    public AutobuzBuilder setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
        return this;
    }

    public AutobuzBuilder setPauzaSofer(boolean pauzaSofer) {
        this.pauzaSofer = pauzaSofer;
        return this;
    }

    public AutobuzBuilder setDeschideUsi(boolean deschideUsi) {
        this.deschideUsi = deschideUsi;
        return this;
    }

    public AutobuzBuilder setOraInceput(int oraInceput) {
        this.oraInceput = oraInceput;
        return this;
    }

    public AutobuzBuilder setTextDerulat(String textDerulat) {
        this.textDerulat = textDerulat;
        return this;
    }
}
