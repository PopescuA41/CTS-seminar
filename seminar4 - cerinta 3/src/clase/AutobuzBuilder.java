package clase;

public class AutobuzBuilder implements Builder {
    private Autobuz autobuz;

    public AutobuzBuilder() {
        this.autobuz = new Autobuz("Sofer1", 1, true, false, 9, "text");
    }

    @Override
    public Autobuz build() {
        return autobuz;
    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        autobuz.setNumeSofer(numeSofer);
        return this;
    }

    public AutobuzBuilder setNrLinie(int nrLinie) {
        autobuz.setNrLinie(nrLinie);
        return this;
    }

    public AutobuzBuilder setPauzaSofer(boolean pauzaSofer) {
        autobuz.setPauzaSofer(pauzaSofer);
        return this;
    }

    public AutobuzBuilder setDeschideUsi(boolean deschideUsi) {
        autobuz.setDeschideUsi(deschideUsi);
        return this;
    }

    public AutobuzBuilder setOraInceput(int oraInceput) {
        autobuz.setOraInceput(oraInceput);
        return this;
    }

    public AutobuzBuilder setTextDerulat(String textDerulat) {
        autobuz.setTextDerulat(textDerulat);
        return this;
    }
}
