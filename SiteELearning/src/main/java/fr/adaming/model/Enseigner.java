package fr.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="enseigners")
public class Enseigner {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_ens")
	private int id;

	private float prix_animer;

	
	@ManyToOne
	@JoinColumn(name="formation_id",referencedColumnName="id_f")
	private Formation formation;

	
	@ManyToOne
	@JoinColumn(name="formateur_id",referencedColumnName="id_u")
	private Formateur formateur;

	public Enseigner() {
		super();
	}

	public Enseigner(float prix_animer) {
		super();
		this.prix_animer = prix_animer;
	}

	public Enseigner(int id, float prix_animer) {
		super();
		this.id = id;
		this.prix_animer = prix_animer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPrix_animer() {
		return prix_animer;
	}

	public void setPrix_animer(float prix_animer) {
		this.prix_animer = prix_animer;
	}

	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}

	public Formateur getFormateur() {
		return formateur;
	}

	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}

}
