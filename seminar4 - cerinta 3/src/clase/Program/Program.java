package clase.Program;

import clase.Autobuz;
import clase.AutobuzBuilder;

public class Program {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setNumeSofer("Nicu").setDeschideUsi(false);
        Autobuz autobuz = autobuzBuilder.build(); //creaza autobuzul

        //sau
        Autobuz autobuz1 = new AutobuzBuilder().setNrLinie(7).build();

        System.out.println(autobuz.toString());
        System.out.println(autobuz1.toString());

        AutobuzBuilder builder = new AutobuzBuilder();
        builder.setTextDerulat("La multi ani!").setOraInceput(9);

        Autobuz a1 = builder.build();

    }
}
