package fr.adaming.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

// pour l'heritage 
@Entity
@Table(name = "utilisateurs")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)// Pour le mapping de l'héritage
@DiscriminatorColumn(name = "status")// Pour créer une colonne pour la distrinction des classes mère et filles
//@DiscriminatorValue(value="Emp")// La valeur écrite dans la colonne "fonction" pour les employés

public abstract class Utilisateur {

	// ********* les attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_u")
	protected int id;
	protected String nom;
	protected String prenom;
	protected String pseudo;
	protected String mot_pass;
	
	@Temporal(TemporalType.DATE)
	protected Date date_nais;
	protected String email;
	protected int tel;
	protected String pays;

	@ManyToMany(mappedBy="listeUtilisateurs")
	protected Set<Reclamation> reclamations;

	// ********* les constructeurs
	public Utilisateur() {
		super();
	}

	public Utilisateur(String nom, String prenom, String pseudo, String mot_pass, Date date_nais, String email, int tel,
			String pays) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.pseudo = pseudo;
		this.mot_pass = mot_pass;
		this.date_nais = date_nais;
		this.email = email;
		this.tel = tel;
		this.pays = pays;
	}

	public Utilisateur(int id, String nom, String prenom, String pseudo, String mot_pass, Date date_nais,
			String email, int tel, String pays) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.pseudo = pseudo;
		this.mot_pass = mot_pass;
		this.date_nais = date_nais;
		this.email = email;
		this.tel = tel;
		this.pays = pays;
	}

	// ********* les getters et Setters
	public int getId_u() {
		return id;
	}

	public void setId_u(int id) {
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

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getMot_pass() {
		return mot_pass;
	}

	public void setMot_pass(String mot_pass) {
		this.mot_pass = mot_pass;
	}

	public Date getDate_nais() {
		return date_nais;
	}

	public void setDate_nais(Date date_nais) {
		this.date_nais = date_nais;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}



	public Set<Reclamation> getReclamations() {
		return reclamations;
	}

	public void setReclamations(Set<Reclamation> reclamations) {
		this.reclamations = reclamations;
	}

}
