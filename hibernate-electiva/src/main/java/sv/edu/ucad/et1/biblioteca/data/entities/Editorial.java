package sv.edu.ucad.et1.biblioteca.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="editorial")
public class Editorial {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codedi")
	private int codedi;
	@Column(name="nomedi")
	private String nomedi;
	@Column(name="ciuedi")
	private String ciuedi;
	@Column(name="paiedi")
	private String paiedi;
	@Column(name="webedi")
	private String webedi;
	public int getCodedi() {
		return codedi;
	}
	public void setCodedi(int codedi) {
		this.codedi = codedi;
	}
	public String getNomedi() {
		return nomedi;
	}
	public void setNomedi(String nomedi) {
		this.nomedi = nomedi;
	}
	public String getCiuedi() {
		return ciuedi;
	}
	public void setCiuedi(String ciuedi) {
		this.ciuedi = ciuedi;
	}
	public String getPaiedi() {
		return paiedi;
	}
	public void setPaiedi(String paiedi) {
		this.paiedi = paiedi;
	}
	public String getWebedi() {
		return webedi;
	}
	public void setWebedi(String webedi) {
		this.webedi = webedi;
	}
	

}
