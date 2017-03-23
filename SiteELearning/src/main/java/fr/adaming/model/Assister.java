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
@Table(name="assisters")
public class Assister {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_assist")
	private int id;
	private float prix_assit;

	@ManyToOne
	@JoinColumn(name="apprenant_id",referencedColumnName="id_u")
	private Apprenant apprenant;

	@ManyToOne
	@JoinColumn(name="formation_id",referencedColumnName="id_f")
	private Formation formation;

	public Assister() {
		super();
	}

	public Assister(float prix_assit) {
		super();
		this.prix_assit = prix_assit;
	}

	public Assister(int id, float prix_assit) {
		super();
		this.id = id;
		this.prix_assit = prix_assit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPrix_assit() {
		return prix_assit;
	}

	public void setPrix_assit(float prix_assit) {
		this.prix_assit = prix_assit;
	}

	public Apprenant getApprenant() {
		return apprenant;
	}

	public void setApprenant(Apprenant apprenant) {
		this.apprenant = apprenant;
	}

	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}

}
