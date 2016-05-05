//inicio de clase Scompras Clase Fuente unidireccional con Catedraticos

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
@Table(name="scompras")
@Access(value=AccessType.PROPERTY)//ACCESO ATRAVEZ DE GETTER

public class Scompras {

	//@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@Column(name="codscom")
	private int codscom;
	//@Column(name="fecscom")
	private Date fecscom;
	//@Column(name="libscom")
	private String libscom;
	//@Column(name="ediscom")
	private String ediscom;
	//@Column(name="carrscomp")
	private String carrscom;
	
	public Catedraticos cate;
	//public Cargos cargos; // bidireccional
	
	//asociacion UnoaUno Unidireccional
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="codcat")
	public Catedraticos getCate() {
		return cate;
	}
	public void setCate(Catedraticos cate) {
		this.cate = cate;
	}
	//Asociacion UnoaUno Bidireccional
		//@OneToOne(cascade=CascadeType.ALL)
		//@JoinColumn(name="codcar")
		//public Cargos getCargos() {
			//return cargos;
		//}
		//public void setCargos(Cargos cargos) {
			//this.cargos = cargos;
		//}
	//propiedad bandera, que se declara como @Transient
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
		@Column(name="codscom", updatable=false)
	public int getCodscom() {
		return codscom;
	}
	public void setCodscom(int codscom) {
		this.codscom = codscom;
	}
	@Column(name="fecscom", nullable=false)
	public Date getFecscom() {
		return fecscom;
	}
	public void setFecscom(Date date) {
		this.fecscom = date;
	}
	@Column(name="libscom", nullable=false)
	public String getLibscom() {
		return libscom;
	}
	public void setLibscom(String libscom) {
		this.libscom = libscom;
	}
	@Column(name="ediscom", nullable=false)
	public String getEdiscom() {
		return ediscom;
	}
	public void setEdiscom(String ediscom) {
		this.ediscom = ediscom;
	}@Column(name="carrscom")
	public String getCarrscomp() {
		return carrscom;
	}
	public void setCarrscomp(String carrscomp) {
		this.carrscom = carrscomp;
	}
	
	
}// fin de Scompras clase Fuente