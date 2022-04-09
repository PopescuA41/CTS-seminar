package validator_clase;

import clase.Metrou.ValidatorMetrou;
import clase.Validator;

public class AdapterMetrou extends ValidatorMetrou implements Validator {
    @Override
    public void v_bilet() {
        super.validareCalatorie();
    }

    public void validareAbonament() {
        super.validareAbonament();
    }
}
