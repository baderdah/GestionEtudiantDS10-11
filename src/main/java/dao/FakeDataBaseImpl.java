package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import beans.Etudiant;

public class FakeDataBaseImpl implements FakeDataBase {
	
	static private HashMap<Integer, Etudiant> ourFakeDataBase = new HashMap<Integer, Etudiant>();
	static private Integer nextId = 0; 
	
	public FakeDataBaseImpl() {
		// connecting to our fake data base ;/ 
	}

	public HashMap<Integer, Etudiant> getEtudiants() {
		
		return ourFakeDataBase;

	}

	public Etudiant addEtudiant(Etudiant etudiant) {
		etudiant.setId(nextId);
		ourFakeDataBase.put(nextId++, etudiant);

		return etudiant;
	}
}
