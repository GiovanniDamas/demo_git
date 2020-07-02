
/**
 * @author giovanni
 *
 */
public class Utilisateur {
	
	/*______________________ props ________________________*/
	private int id;
	private String nom;
	private String prenom;
	private String telephone;
	
	
	/*_______________________ ctor ________________________*/
	
	public Utilisateur() {

	}

	public Utilisateur(int id, String nom, String prenom) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	
	public Utilisateur(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	/*___________________ getter/setters __________________*/

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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	

}//END CLASS