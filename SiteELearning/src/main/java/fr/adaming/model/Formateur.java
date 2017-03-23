package fr.adaming.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@DiscriminatorValue(value="FR")
public class Formateur extends Utilisateur {

	private String grade;
	private String specialite;

	@OneToMany(mappedBy = "formateur", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Enseigner> formationEnseigns;

	public Formateur() {
		super();
	}

	public Formateur(String nom, String prenom, String pseudo, String mot_pass, Date date_nais, String email, int tel,
			String pays, String grade, String specialite) {
		super(nom, prenom, pseudo, mot_pass, date_nais, email, tel, pays);
		this.grade = grade;
		this.specialite = specialite;
	}

	public Formateur(int id, String nom, String prenom, String pseudo, String mot_pass, Date date_nais, String email,
			int tel, String pays, String grade, String specialite) {
		super(id, nom, prenom, pseudo, mot_pass, date_nais, email, tel, pays);
		this.grade = grade;
		this.specialite = specialite;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public Set<Enseigner> getFormationEnseigns() {
		return formationEnseigns;
	}

	public void setFormationEnseigns(Set<Enseigner> formationEnseigns) {
		this.formationEnseigns = formationEnseigns;
	}

	@Override
	public String toString() {
		return "Formateur [grade=" + grade + ", specialite=" + specialite + ", id=" + id + ", nom=" + nom + ", prenom="
				+ prenom + ", pseudo=" + pseudo + ", mot_pass=" + mot_pass + ", date_nais=" + date_nais + ", email="
				+ email + ", tel=" + tel + ", pays=" + pays + "]";
	}

}
