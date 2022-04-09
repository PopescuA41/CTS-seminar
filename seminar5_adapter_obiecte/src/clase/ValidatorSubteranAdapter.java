package clase;

import clase.Metrou.ValidatorMetrou;

public class ValidatorSubteranAdapter implements Validator{
    private ValidatorMetrou validatorMetrou;

    public ValidatorSubteranAdapter(ValidatorMetrou validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }

    @Override
    public void validareAbonament() {
        validatorMetrou.validareAbonament();
    }

    @Override
    public void v_bilet() {
        validatorMetrou.validareCalatorie();
    }
}
