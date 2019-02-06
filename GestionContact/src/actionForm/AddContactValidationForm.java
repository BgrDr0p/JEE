package actionForm;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class AddContactValidationForm extends ActionForm {
	
	private static final long serialVersionUID = 1L;
	
	private String nom;
	private String prenom;
	private String email;
	private String numTel;
	private String rue;
	private String ville;
	private String pays;
	
	public String getNom() {return nom;	}
	public String getPrenom() {return prenom;}
	public String getEmail() {return email;}
	public String getNumTel() {return numTel;}
	public String getRue() {return rue;}
	public String getVille() {return ville;}
	public String getPays() {return pays;}
	public void setNom(String nom) {this.nom = nom;}
	public void setPrenom(String prenom) {this.prenom = prenom;}
	public void setEmail(String email) {this.email = email;}
	public void setNumTel(String numTel) {this.numTel = numTel;}
	public void setRue(String rue) {this.rue = rue;}
	public void setVille(String ville) {this.ville = ville;}
	public void setPays(String pays) {this.pays = pays;}
	
	public void reset(ActionMapping mapping, HttpServletRequest request) 
	{
		
		this.nom = null;
		this.prenom= null;
		this.email= null;
		this.numTel= null;
		this.rue= null;
		this.ville= null;
		this.pays= null;
		
	}
	
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request ) 
	{
			ActionErrors errors = new ActionErrors();
			if( getNom()== null || getNom().length() < 1 ) 
			{
				errors.add("nom",new ActionMessage("creation.nom.error.required"));
				
			}
			if( getPrenom()== null || getPrenom().length() < 1 ) 
			{
				errors.add("prenom",new ActionMessage("creation.prenom.error.required"));
				
			}
			if( getEmail() == null || getEmail().length() < 1 ) 
			{
				errors.add("email", new ActionMessage("creation.email.error.required"));
				System.out.println(getEmail());
			
			}
			if( getNumTel() == null || getNumTel().length() < 1 ) 
			{
				errors.add("numTel", new ActionMessage("creation.numTel.error.required"));
			
			}
			if( getRue() == null || getRue().length() < 1 ) 
			{
				errors.add("rue", new ActionMessage("creation.rue.error.required"));
			
			}
			if( getVille() == null || getVille().length() < 1 ) 
			{
				errors.add("ville", new ActionMessage("creation.ville.error.required"));
			
			}
			if( getPays() == null || getPays().length() < 1 ) 
			{
				errors.add("pays", new ActionMessage("creation.pays.error.required"));
			
			}
			
			
			
			
			return errors;
	}
	
}
	

	
