package fr.adaming.model;


import java.util.Set;

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
import javax.persistence.Table;

@Entity
@Table(name = "reclamations")
public class Reclamation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_rec")
	private int id;

	private String objet;
	private String msg_reclam;
	private String rep_reclam;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "utilisateur_reclamation", joinColumns = @JoinColumn(name = "id_u"), inverseJoinColumns = @JoinColumn(name = "id_rec"))
	private Set<Utilisateur> listeUtilisateurs;

	public Reclamation() {
		super();
	}

	public Reclamation(String objet, String msg_reclam, String rep_reclam) {
		super();
		this.objet = objet;
		this.msg_reclam = msg_reclam;
		this.rep_reclam = rep_reclam;
	}

	public Reclamation(int id, String objet, String msg_reclam, String rep_reclam) {
		super();
		this.id = id;
		this.objet = objet;
		this.msg_reclam = msg_reclam;
		this.rep_reclam = rep_reclam;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getObjet() {
		return objet;
	}

	public void setObjet(String objet) {
		this.objet = objet;
	}

	public String getMsg_reclam() {
		return msg_reclam;
	}

	public void setMsg_reclam(String msg_reclam) {
		this.msg_reclam = msg_reclam;
	}

	public String getRep_reclam() {
		return rep_reclam;
	}

	public void setRep_reclam(String rep_reclam) {
		this.rep_reclam = rep_reclam;
	}

	public Set<Utilisateur> getListeUtilisateurs() {
		return listeUtilisateurs;
	}

	public void setListeUtilisateurs(Set<Utilisateur> listeUtilisateurs) {
		this.listeUtilisateurs = listeUtilisateurs;
	}

	@Override
	public String toString() {
		return "Reclamation [id=" + id + ", objet=" + objet + ", msg_reclam=" + msg_reclam + ", rep_reclam="
				+ rep_reclam + "]";
	}

}
