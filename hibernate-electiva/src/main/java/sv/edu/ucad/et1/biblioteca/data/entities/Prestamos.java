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
@Table(name="prestamos")
@Access (value=AccessType.PROPERTY)
public class Prestamos {

	
	
	private int codpres;
	private Date fecpres;
	private String docpres;
	private String durpres;
	private Date fecdev;
	
	
	public Usuario usu;
	
	//asociasion uno 0 uno unidereiccional
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="codusu")
	public Usuario getUsu(){
		return usu;
		
	}
	public void setUsu (Usuario usu){
		this.usu =usu;
	}
	//propiedad bandera que se declara como transient
	private boolean estado;
	
	@Transient	
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="codpres", updatable=false)
	public int getCodpres() {
		return codpres;
	}
	public void setCodpres(int codpres) {
		this.codpres = codpres;
	}
	@Column(name="docpres",nullable=false)
	public String getDocpres() {
		return docpres;
	}
	public void setDocpres(String docpres) {
		this.docpres = docpres;
	}
	@Column(name="durpres",nullable=false)
	public String getDurpres() {
		return durpres;
	}
	public void setDurpres(String durpres) {
		this.durpres = durpres;
	}
	@Column(name="fecdev")
	public Date getFecdev() {
		return fecdev;
	}
	public void setFecdev(Date fecdev) {
		this.fecdev = fecdev;
	}
	
	

}//fin de la clase fuente
