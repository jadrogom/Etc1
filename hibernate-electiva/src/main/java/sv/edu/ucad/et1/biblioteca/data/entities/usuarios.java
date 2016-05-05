package sv.edu.ucad.et1.biblioteca.data.entities;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="usuarios")
@Access(value=AccessType.PROPERTY)
public class usuarios {

	//@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@Column(name="codusu")
	private int codusu;
	//@Column(name="apeusu")
	private String apeusu;
	//@Column(name="nomusu")
	private String nomusu;
	//@Column(name="celusu")
	private String celusu;
	//@Column(name="dirusu")
	private String dirusu;
	//@Column(name="maiusu")
	private String maiusu;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codusu", updatable=false)
	public int getCodusu() {
		return codusu;
	}
	
	public void setCodusu(int codusu) {
		this.codusu = codusu;
	}
	
	@Column(name="apeusu")
	public String getApeusu() {
		return apeusu;
	}
	
	public void setApeusu(String apeusu) {
		this.apeusu = apeusu;
	}
	@Column(name="nomusu")
	public String getNomusu() {
		return nomusu;
	}
	public void setNomusu(String nomusu) {
		this.nomusu = nomusu;
	}
	@Column(name="celusu")
	public String getCelusu() {
		return celusu;
	}
	public void setCelusu(String celusu) {
		this.celusu = celusu;
	}
	@Column(name="dirusu")
	public String getDirusu() {
		return dirusu;
	}
	public void setDirusu(String dirusu) {
		this.dirusu = dirusu;
	}
	@Column(name="maiusu")
	public String getMaiusu() {
		return maiusu;
	}
	public void setMaiusu(String maiusu) {
		this.maiusu = maiusu;
	}
	// propiedad bandera que se declara como @Transient
	private boolean estado;
	
	@Transient
	public boolean isEstado(){
		return estado;
	}
	public void setEstado(boolean estado){
		this.estado = estado;
	}
	
}

