package sv.edu.ucad.et1.biblioteca.data;


import java.util.Date;
import org.hibernate.Session;

import sv.edu.ucad.et1.biblioteca.data.entities.Prestamos;
import sv.edu.ucad.et1.biblioteca.data.entities.Usuario;
public class DemoUno {
	public static void main(String[] args){
		Session sesion = hibernateUtil.getSessionFactory().openSession();
		
//Inicio de la transaccion
		try{
			org.hibernate.Transaction transaccion = sesion.beginTransaction();
		
			Usuario usu = createNewUsuario();
			Prestamos pres = createNewPrestamos(usu);

			sesion.save(pres);
			transaccion.commit();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			sesion.close();
			hibernateUtil.getSessionFactory().close();
		}	
	}
//clases empotradas que crean prestamos y usuasrios
private static Prestamos createNewPrestamos(Usuario usu){
	
		Prestamos nusu = new Prestamos();
		nusu.setDocpres("DUI");
		nusu.setDurpres("2");
		nusu.setFecdev(new Date());
		
		
		//nusu.setFecpres(new Date());
		nusu.setUsu(usu);
		return nusu;
	}
	
//crea un nuevo ausuario
	private static Usuario createNewUsuario() {
		Usuario nautor = new Usuario();
		nautor.setNomusu("Pedro");
		nautor.setApeusu("Abarca");
		nautor.setNivusu("1");
		nautor.setCarusu("estudiante");
		nautor.setMailusu("Brasileño@yahoo.com");
		nautor.setClavusu("1234#$");
		
		return nautor;
	}
}