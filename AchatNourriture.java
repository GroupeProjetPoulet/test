package com.example.stock.bean;	

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

import javassist.SerialVersionUID;
@Entity
public class AchatNourriture implements Serializable{
	
	private static final long SerialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date dateAchat;
	private Double montantTotal;
	private String reference;
	@OneToMany(mappedBy = "achatNourriture")
	private List<Fournisseur>fournisseur;
	@ManyToOne
	private StockNourriture stockNourriture;
	@OneToMany(mappedBy = "achaNourriture")
    private List<AchatNourritureDetail> achatNourritureDetail;
    


	

	public List<AchatNourritureDetail> getAchatNourritureDetail() {
		return achatNourritureDetail;
	}

	public void setAchatNourritureDetail(List<AchatNourritureDetail> achatNourritureDetail) {
		this.achatNourritureDetail = achatNourritureDetail;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public Double getMontantTotal() {
		return montantTotal;
	}

	public void setMontantTotal(Double montantTotal) {
		this.montantTotal = montantTotal;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	

	public static long getSerialversionuid() {
		return SerialVersionUID;
	}

	public List<Fournisseur> getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(List<Fournisseur> fournisseur) {
		this.fournisseur = fournisseur;
	}

	public StockNourriture getStockNourriture() {
		return stockNourriture;
	}

	public void setStockNourriture(StockNourriture stockNourriture) {
		this.stockNourriture = stockNourriture;
	} 
	
	
}
