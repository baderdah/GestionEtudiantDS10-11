package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Etudiant;
import beans.NiveauEtude;
import dao.FakeDataBase;
import dao.FakeDataBaseFactory;

/**
 * Servlet implementation class ajoutControler
 */
public class ajoutControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	FakeDataBase fakeDataBase;
    public ajoutControler() {
        super();
    }


   
    public void init() throws ServletException {
    	
    	fakeDataBase = FakeDataBaseFactory.getFakeDataBase();
    	super.init();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operationResultMessage = "";
		request.setAttribute("operationResultMessage", operationResultMessage);
		this.getServletContext().getRequestDispatcher("/WEB-INF/ajouter.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// get data from the from 
		
		Etudiant etudiant = getFormsData(request);
		String operationResultMessage;
		if(etudiant !=null) {
			etudiant = fakeDataBase.addEtudiant(etudiant);
			operationResultMessage = "l'etudiant est bien ajouter a la base de donnee"; // the fake one hhhh
		}
		else {
			operationResultMessage = "les information que vous avez entrer sont erroner ... ";
		}
		
		System.out.println(operationResultMessage);
		System.out.println(etudiant.toString());
		request.setAttribute("operationResultMessage", operationResultMessage);
		this.getServletContext().getRequestDispatcher("/WEB-INF/ajouter.jsp").forward(request, response);
	}

	

	
	private Etudiant getFormsData(HttpServletRequest request) {
		
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		int age;
		
		try {
			age = Integer.valueOf(request.getParameter("age"));
		}catch(Exception e) {
			age = 0;
		}
		
		String tel = request.getParameter("tel");
		String mail = request.getParameter("mail");
		int niveau = Integer.valueOf(request.getParameter("niveau"));
		NiveauEtude niveauEtude;
		switch (niveau) {
		case 1:
			niveauEtude = NiveauEtude.premiere;
			break;
		case 2:
			niveauEtude = NiveauEtude.deuxieme;
			break;
		case 3:
			niveauEtude = NiveauEtude.troisieme;
			break;
		case 4:
			niveauEtude = NiveauEtude.quatrieme;
			break;
		case 5:
			niveauEtude = NiveauEtude.cinquieme;
			break;
		default:
			niveauEtude = NiveauEtude.premiere;
			break;
		}
		
		return new Etudiant (nom, prenom, age, tel, mail, niveauEtude);
	}
}
