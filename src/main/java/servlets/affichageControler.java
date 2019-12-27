package servlets;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Etudiant;
import dao.FakeDataBase;
import dao.FakeDataBaseFactory;
import dao.FakeDataBaseImpl;


public class affichageControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
    FakeDataBase fakeDataBase;
 
    public affichageControler() {
        super();
    }
    @Override
    public void init() throws ServletException {
    	super.init();
    	fakeDataBase = FakeDataBaseFactory.getFakeDataBase();
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HashMap<Integer, Etudiant> etudiantsMap = fakeDataBase.getEtudiants();
		request.setAttribute("etudiantsMap", etudiantsMap);
		this.getServletContext().getRequestDispatcher("/WEB-INF/afficher.jsp").forward(request, response);
	}

	
	
	
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
