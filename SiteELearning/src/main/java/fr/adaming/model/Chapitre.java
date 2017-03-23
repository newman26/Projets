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
@Table(name="chapitres")
public class Chapitre {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_c")
	private int id;

	private String libellee;

	@ManyToOne
	@JoinColumn(name = "module_id", referencedColumnName = "id_m")
	private Module module;

	public Chapitre() {
		super();
	}

	public Chapitre(String libellee) {
		super();
		this.libellee = libellee;
	}

	public Chapitre(int id, String libellee) {
		super();
		this.id = id;
		this.libellee = libellee;
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

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

}
