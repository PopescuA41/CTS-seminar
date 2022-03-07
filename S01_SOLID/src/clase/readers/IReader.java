package clase.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import clase.Aplicant;

public abstract class IReader {
	public abstract List<Aplicant> readAplicanti(String file) throws FileNotFoundException;
	public void citireAplicant(Scanner input, Aplicant aplicant) {
		String nume = input.next();
		String prenume = input.next();
		int varsta = input.nextInt();
		int punctaj = input.nextInt();
		int nr = input.nextInt();
		String[] vect = new String[5];
		for (int i = 0; i < nr; i++)
			vect[i] = input.next();
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setNr_proiecte(nr, vect);
		
	}
}
