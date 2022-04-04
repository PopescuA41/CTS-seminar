package clase.Program;

import clase.Autobuz;
import clase.Tramvai;

public class Program {
    public static void main(String[] args) throws CloneNotSupportedException {
        Autobuz autobuz = new Autobuz("Mircea");
        Tramvai tramvai = new Tramvai("Doru");

        Autobuz autobuzClone = (Autobuz) autobuz.copiaza();
        Tramvai tramvaiClone = (Tramvai) tramvai.copiaza();

        System.out.println(autobuz.toString());
        System.out.println(autobuzClone.toString());
        System.out.println(tramvai.toString());
        System.out.println(tramvaiClone.toString());


    }
}
