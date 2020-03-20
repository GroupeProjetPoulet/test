package com.example.stock.bean;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Nourriture implements Serializable  {
	private static final long SerialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String ref;
	private Double prixUni; 
	@ManyToOne
	private CategorieNourriture categorieNourriture;
	private Double quantite;
	

	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public Double getPrixUni() {
		return prixUni;
	}
	public void setPrixUni(Double prixUni) {
		this.prixUni = prixUni;
	}
	public CategorieNourriture getCategorieNourriture() {
		return categorieNourriture;
	}
	public void setCategorieNourriture(CategorieNourriture categorieNourriture) {
		this.categorieNourriture = categorieNourriture;
	}
	public Double getQuantite() {
		return quantite;
	}
	public void setQuantite(Double quantite) {
		this.quantite = quantite;
	}
	public static long getSerialversionuid() {
		return SerialVersionUID;
	}
	
	
}
