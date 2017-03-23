package fr.adaming.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "formations")
public class Formation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_f")
	private int id;
	private String titre_formation;
	private String niveau;
	private String description;

	@Temporal(TemporalType.DATE)
	private Date date_creation;
	
	@Temporal(TemporalType.DATE)
	private Date date_formation;

	@Temporal(TemporalType.TIME)
	private Date heure_formation;

	private int duree;

	@OneToMany(mappedBy = "formation", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Assister> formationAssits;

	@OneToMany(mappedBy = "formation", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Enseigner> formationEnseigns;

	@ManyToMany(mappedBy = "formations")
	private Set<Module> modules;

	public Formation() {
		super();
	}

	public Formation(String titre_formation, String niveau, String description, Date date_creation, Date date_formation,
			Date heure_formation, int duree) {
		super();
		this.titre_formation = titre_formation;
		this.niveau = niveau;
		this.description = description;
		this.date_creation = date_creation;
		this.date_formation = date_formation;
		this.heure_formation = heure_formation;
		this.duree = duree;
	}

	public Formation(int id, String titre_formation, String niveau, String description, Date date_creation,
			Date date_formation, Date heure_formation, int duree) {
		super();
		this.id = id;
		this.titre_formation = titre_formation;
		this.niveau = niveau;
		this.description = description;
		this.date_creation = date_creation;
		this.date_formation = date_formation;
		this.heure_formation = heure_formation;
		this.duree = duree;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre_formation() {
		return titre_formation;
	}

	public void setTitre_formation(String titre_formation) {
		this.titre_formation = titre_formation;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate_creation() {
		return date_creation;
	}

	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}

	public Date getDate_formation() {
		return date_formation;
	}

	public void setDate_formation(Date date_formation) {
		this.date_formation = date_formation;
	}

	public Date getHeure_formation() {
		return heure_formation;
	}

	public void setHeure_formation(Date heure_formation) {
		this.heure_formation = heure_formation;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public Set<Assister> getFormationAssits() {
		return formationAssits;
	}

	public void setFormationAssits(Set<Assister> formationAssits) {
		this.formationAssits = formationAssits;
	}

	public Set<Enseigner> getFormationEnseigns() {
		return formationEnseigns;
	}

	public void setFormationEnseigns(Set<Enseigner> formationEnseigns) {
		this.formationEnseigns = formationEnseigns;
	}

	public Set<Module> getModules() {
		return modules;
	}

	public void setModules(Set<Module> modules) {
		this.modules = modules;
	}

	@Override
	public String toString() {
		return "Formation [id=" + id + ", titre_formation=" + titre_formation + ", niveau=" + niveau + ", description="
				+ description + ", date_creation=" + date_creation + ", date_formation=" + date_formation
				+ ", heure_formation=" + heure_formation + ", duree=" + duree + "]";
	}

}
