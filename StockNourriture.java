package com.example.stock.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StockNourriture implements Serializable  {
	private static final long SerialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id; 
	@OneToMany(mappedBy = "stockNourriture")
	private List<AchatNourriture> achatNourriture;
	private Double qteExpire;
	private Double qteMagasin;
	private Double qteutilisable;
	
	public Double getQteExpire() {
		return qteExpire;
	}
	public void setQteExpire(Double qteExpire) {
		this.qteExpire = qteExpire;
	}
	public Double getQteMagasin() {
		return qteMagasin;
	}
	public void setQteMagasin(Double qteMagasin) {
		this.qteMagasin = qteMagasin;
	}
	public Double getQteutilisable() {
		return qteutilisable;
	}
	public void setQteutilisable(Double qteutilisable) {
		this.qteutilisable = qteutilisable;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public static long getSerialversionuid() {
		return SerialVersionUID;
	}
	public List<AchatNourriture> getAchatNourriture() {
		return achatNourriture;
	}
	public void setAchatNourriture(List<AchatNourriture> achatNourriture) {
		this.achatNourriture = achatNourriture;
	}
	

}
