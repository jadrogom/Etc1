package sv.edu.ucad.et1.biblioteca.data.entities;

import java.util.Date;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="usuario")
@Access(value=AccessType.PROPERTY)
public class Usuario {
	
	private int codusu;
	private String nomusu;
	private String apeusu;
	private String nivusu;
	private String clavusu;
	private String carusu;
	private String mailusu;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codusu", updatable=false)
		public int getCodusu() {
		return codusu;
	}
	
	public void setCodusu(int codusu) {
		this.codusu = codusu;
	}
	@Column(name="nomusu")
	public String getNomusu() {
		return nomusu;
	}
	public void setNomusu(String nomusu) {
		this.nomusu = nomusu;
	}
	@Column(name="apeusu")
	public String getApeusu() {
		return apeusu;
	}
	public void setApeusu(String apeusu) {
		this.apeusu = apeusu;
	}
	@Column(name="nivusu")
	public String getNivusu() {
		return nivusu;
	}
	public void setNivusu(String nivusu) {
		this.nivusu = nivusu;
	}
	@Column(name="clavusu")
	public String getClavusu() {
		return clavusu;
	}
	public void setClavusu(String clavusu) {
		this.clavusu = clavusu;
	}
	@Column(name="carusu")
	public String getCarusu() {
		return carusu;
	}
	public void setCarusu(String carusu) {
		this.carusu = carusu;
	}
	
	public String getMailusu() {
		return mailusu;
	}
	public void setMailusu(String mailusu) {
		this.mailusu = mailusu;
	}
	


}
