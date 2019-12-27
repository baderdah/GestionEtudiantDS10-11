package dao;

import java.util.HashMap;
import java.util.List;

import beans.Etudiant;

public interface FakeDataBase  {

	public HashMap<Integer, Etudiant>  getEtudiants();
	
	public Etudiant addEtudiant (Etudiant etudiant);
	
}
