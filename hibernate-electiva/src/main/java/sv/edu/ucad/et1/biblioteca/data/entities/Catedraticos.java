// inicio de clase destino y la clase
//fuente Scompras para asociasioin unidireccional

package sv.edu.ucad.et1.biblioteca.data.entities;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="catedraticos")
@Access(value=AccessType.PROPERTY) //acceso a traves de getters


public class Catedraticos {
	//@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@Column(name="codcat")
	private int codcat;
	//@Column(name="nomcat")
	private String nomcat;
	//@Column(name="apecat")
	private String apecat;
	//@Column(name="carrcat")null
	private String carrcat;
	//@Column(name="faccat")
	private String faccat;
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codcat", updatable=false)	
	public int getCodcat() {
		return codcat;
	}
	public void setCodcat(int codcat) {
		this.codcat = codcat;
	}
	@Column(name="nomcat", nullable=false)	
	public String getNomcat() {
		return nomcat;
	}
	public void setNomcat(String nomcat) {
		this.nomcat = nomcat;
	}
	@Column(name="apecat", nullable=false)	
	public String getApecat() {
		return apecat;
	}
	public void setApecat(String apecat) {
		this.apecat = apecat;
	}
	@Column(name="carrcat")	
	public String getCarrcat() {
		return carrcat;
	}
	public void setCarrcat(String carrcat) {
		this.carrcat = carrcat;
	}
	@Column(name="faccat",nullable=false)	
	public String getFaccat() {
		return faccat;
	}
	public void setFaccat(String faccat) {
		this.faccat = faccat;
	}
	
	

}