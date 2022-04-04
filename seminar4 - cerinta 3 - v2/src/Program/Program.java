package Program;

import clase.Autobuz;
import clase.AutobuzBuilder;

public class Program {
    public static void main(String[] args) {
        AutobuzBuilder builder = new AutobuzBuilder();
        builder.setTextDerulat("La multi ani!").setOraInceput(9);

        Autobuz a1 = builder.build();
        builder.setTextDerulat("Romania").setOraInceput(5);
        Autobuz a2 = builder.build();

        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}
