package clase;

public class ValidatorAutobuz implements Validator {

    @Override
    public void validareAbonament() {
        System.out.println("Am validat abonamentul");
    }

    @Override
    public void v_bilet() {
        System.out.println("Am verificat biletul");

    }
}
