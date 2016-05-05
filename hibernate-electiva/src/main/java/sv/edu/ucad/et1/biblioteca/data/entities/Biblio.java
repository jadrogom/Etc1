package sv.edu.ucad.et1.biblioteca.data.entities;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="biblio")
public class Biblio {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codbib")
	private int codbib;
	@Column(name="edibib")
	private String edibib;
	@Column(name="fpubib")
	private Date fpubib;
	@Column(name="isbbib")
	private int isbbib;
	@Column(name="ejbib")
	private int ejbib;
	@Column(name="volbib")
	private int volbib;
	@Column(name="pagbib")
	private int pagbib;
	@Column(name="titbib")
	private String titbib;
	@Column(name="cvñbib")
	private String cvñbib;
	@Column(name="dewbib")
	private String dewbib;
	@Column(name="cuttbib")
	private String cuttbib;
	@Column(name="ubibib")
	private String ubibib;
	@Column(name="viadbib")
	private String viadbib;
	public int getCodbib() {
		return codbib;
	}
	public void setCodbib(int codbib) {
		this.codbib = codbib;
	}
	public String getEdibib() {
		return edibib;
	}
	public void setEdibib(String edibib) {
		this.edibib = edibib;
	}
	public Date getFpubib() {
		return fpubib;
	}
	public void setFpubib(Date fpubib) {
		this.fpubib = fpubib;
	}
	public int getIsbbib() {
		return isbbib;
	}
	public void setIsbbib(int isbbib) {
		this.isbbib = isbbib;
	}
	public int getEjbib() {
		return ejbib;
	}
	public void setEjbib(int ejbib) {
		this.ejbib = ejbib;
	}
	public int getVolbib() {
		return volbib;
	}
	public void setVolbib(int volbib) {
		this.volbib = volbib;
	}
	public int getPagbib() {
		return pagbib;
	}
	public void setPagbib(int pagbib) {
		this.pagbib = pagbib;
	}
	public String getTitbib() {
		return titbib;
	}
	public void setTitbib(String titbib) {
		this.titbib = titbib;
	}
	public String getCvñbib() {
		return cvñbib;
	}
	public void setCvñbib(String cvñbib) {
		this.cvñbib = cvñbib;
	}
	public String getDewbib() {
		return dewbib;
	}
	public void setDewbib(String dewbib) {
		this.dewbib = dewbib;
	}
	public String getCuttbib() {
		return cuttbib;
	}
	public void setCuttbib(String cuttbib) {
		this.cuttbib = cuttbib;
	}
	public String getUbibib() {
		return ubibib;
	}
	public void setUbibib(String ubibib) {
		this.ubibib = ubibib;
	}
	public String getViadbib() {
		return viadbib;
	}
	public void setViadbib(String viadbib) {
		this.viadbib = viadbib;
	}
	
	
	
	


}
