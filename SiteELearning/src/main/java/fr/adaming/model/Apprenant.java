package fr.adaming.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="apprenants")
public class Apprenant extends Utilisateur {

	private String niveau_etude;
	private String diplome;
	
	
	@OneToMany(mappedBy = "apprenant", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Assister> formationsAssit;

	public Apprenant() {
		super();
	}

	public Apprenant(String nom, String prenom, String pseudo, String mot_pass, Date date_nais, String email, int tel,
			String pays, String niveau_etude, String diplome) {
		super(nom, prenom, pseudo, mot_pass, date_nais, email, tel, pays);
		this.niveau_etude = niveau_etude;
		this.diplome = diplome;
	}

	public Apprenant(int id_u, String nom, String prenom, String pseudo, String mot_pass, Date date_nais, String email,
			int tel, String pays, String niveau_etude, String diplome) {
		super(id_u, nom, prenom, pseudo, mot_pass, date_nais, email, tel, pays);
		this.niveau_etude = niveau_etude;
		this.diplome = diplome;
	}

	public String getNiveau_etude() {
		return niveau_etude;
	}

	public void setNiveau_etude(String niveau_etude) {
		this.niveau_etude = niveau_etude;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public List<Assister> getFormationsAssit() {
		return formationsAssit;
	}

	public void setFormationsAssit(List<Assister> formationsAssit) {
		this.formationsAssit = formationsAssit;
	}

	@Override
	public String toString() {
		return "Apprenant [niveau_etude=" + niveau_etude + ", diplome=" + diplome + ", id=" + id + ", nom=" + nom
				+ ", prenom=" + prenom + ", pseudo=" + pseudo + ", mot_pass=" + mot_pass + ", date_nais=" + date_nais
				+ ", email=" + email + ", tel=" + tel + ", pays=" + pays + ", reclamations=" + reclamations + "]";
	}

}
