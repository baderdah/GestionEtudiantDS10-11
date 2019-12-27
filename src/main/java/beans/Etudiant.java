package beans;

public class Etudiant {
	
	private int id;
	private String nom;
	private String prenom;
	private int age;
	private String tel;
	private String mail;
	private NiveauEtude niveauEtude;
	
	public Etudiant(String nom, String prenom, int age, String tel, String mail, NiveauEtude niveauEtude) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.tel = tel;
		this.mail = mail;
		this.niveauEtude = niveauEtude;
	}

	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", tel=" + tel
				+ ", mail=" + mail + ", niveauEtude=" + niveauEtude + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public NiveauEtude getNiveauEtude() {
		return niveauEtude;
	}

	public void setNiveauEtude(NiveauEtude niveauEtude) {
		this.niveauEtude = niveauEtude;
	}
	
	
	
	

}
