package clase;

import java.io.FileNotFoundException;
import java.util.List;

import clase.readers.AngajatiReader;
import clase.readers.IReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		IReader reader = new AngajatiReader();
		try {
			listaAngajati = reader.readAplicanti("angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
