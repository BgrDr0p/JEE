package domain;

public class Contact {
	
		private int id;
		private String nom;
		private String prenom;
		private String email;
		private String numTel;
		private String rue;
		private String ville;
		private String pays;
		public Contact(int id,String nom,String prenom,String email,String numTel,String rue,String ville,String pays)
		{
			this.id = id;
			this.nom = nom;
			this.prenom = prenom;
			this.email = email;
			this.numTel = numTel;
			this.rue = rue;
			this.ville = ville;
			this.pays = pays;
		}
		public int getId() {return id;}
		public String getNom() {return nom;	}
		public String getPrenom() {return prenom;}
		public String getEmail() {return email;}
		public String getNumTel() {return numTel;}
		public String getRue() {return rue;}
		public String getVille() {return ville;}
		public String getPays() {return pays;}
		public void setId(int id){this.id = id;}
		public void setNom(String nom) {this.nom = nom;}
		public void setPrenom(String prenom) {this.prenom = prenom;}
		public void setNumTel(String numTel) {this.numTel = numTel;}
		public void setRue(String rue) {this.rue = rue;}
		public void setVille(String ville) {this.ville = ville;}
		public void setPays(String pays) {this.pays = pays;}
		
		
		
}
