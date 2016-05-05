package sv.edu.ucad.et1.biblioteca.data.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Clientes {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codcli")
	private int codcli;
	@Column(name="nomcli")
	private String nomcli;
	@Column(name="apecli")
	private String apecli;
	@Column(name="carrcli")
	private String carrcli;
	@Column(name="carcli")
	private String carcli;
	@Column(name="tipcli")
	private String tipcli;
	public int getCodcli() {
		return codcli;
	}
	public void setCodcli(int codcli) {
		this.codcli = codcli;
	}
	public String getNomcli() {
		return nomcli;
	}
	public void setNomcli(String nomcli) {
		this.nomcli = nomcli;
	}
	public String getApecli() {
		return apecli;
	}
	public void setApecli(String apecli) {
		this.apecli = apecli;
	}
	public String getCarrcli() {
		return carrcli;
	}
	public void setCarrcli(String carrcli) {
		this.carrcli = carrcli;
	}
	public String getCarcli() {
		return carcli;
	}
	public void setCarcli(String carcli) {
		this.carcli = carcli;
	}
	public String getTipcli() {
		return tipcli;
	}
	public void setTipcli(String tipcli) {
		this.tipcli = tipcli;
	}
	
	
	


}
