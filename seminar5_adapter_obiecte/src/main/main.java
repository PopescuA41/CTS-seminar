package main;

import clase.Metrou.ValidatorMetrou;
import clase.Validator;
import clase.ValidatorAutobuz;
import clase.ValidatorSubteranAdapter;
import validator_clase.AdapterMetrou;

public class main {
    public static void valideazaBilet(Validator validator) {
        validator.v_bilet();

    }

    public static void valideazaAbonament(Validator validator) {
        validator.validareAbonament();

    }

    public static void main(String[] args) {
        ValidatorAutobuz validatorAutobuz = new ValidatorAutobuz();
        valideazaBilet(validatorAutobuz);
        ValidatorMetrou validatorMetrou = new ValidatorMetrou();
        ValidatorSubteranAdapter adapter = new ValidatorSubteranAdapter(validatorMetrou);
        valideazaBilet(adapter);

        AdapterMetrou adapterMetrou = new AdapterMetrou();
        valideazaAbonament(adapterMetrou);

    }
}
