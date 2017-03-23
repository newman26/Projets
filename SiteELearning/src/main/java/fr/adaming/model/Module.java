package fr.adaming.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="modules")
public class Module {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_m")
	private int id;
	
	private String libellee;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "formation_module", joinColumns = @JoinColumn(name = "id_f"), inverseJoinColumns = @JoinColumn(name = "id_m"))
	private List<Formation> formations;
	
	@OneToMany(mappedBy = "module", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Chapitre> chapitres;
	
	
	public Module() {
		super();
	}

	public Module(String libellee) {
		super();
		this.libellee = libellee;
		this.chapitres=new ArrayList<Chapitre>();
	}

	public Module(int id, String libellee) {
		super();
		this.id = id;
		this.libellee = libellee;
		this.chapitres=new ArrayList<Chapitre>();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibellee() {
		return libellee;
	}

	public void setLibellee(String libellee) {
		this.libellee = libellee;
	}

	public List<Formation> getFormations() {
		return formations;
	}

	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}

	public List<Chapitre> getChapitres() {
		return chapitres;
	}

	public void setChapitres(List<Chapitre> chapitres) {
		this.chapitres = chapitres;
	}
	
	
	
	
}
