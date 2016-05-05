package sv.edu.ucad.et1.biblioteca.data;
import org.hibernate.Session;
import sv.edu.ucad.et1.biblioteca.data.entities.usuarios;
public class DemoPersistUsuarios {
	public static void main (String[] args){
		Session sesion = hibernateUtil.getSessionFactory().openSession();
		sesion.getTransaction().begin();
		
usuarios usuario = new usuarios();
		
		//uso de los metodos para asignar valores a las propiedades
		usuario.setApeusu("Rodriguez");
		usuario.setNomusu("Adilio");
		usuario.setCelusu("61100391");
		usuario.setDirusu("San Salvador");
		usuario.setMaiusu("rolito@yahoo.com");
		//metodo de persistencia para guardar la data
		sesion.save(usuario);
		//metodo para confiramr la transaccion		
		//sesion.beginTransaction().commit(); 
		// preguntar si se tiene que comentariar para que funcione
		//codigo para probar la propiedad updatable=false clase20
		sesion.getTransaction();
		usuarios usuUpdatable =(usuarios) sesion.get(usuarios.class, usuario.getCodusu());
		usuUpdatable.setNomusu("Rolando Armando");
		sesion.update(usuUpdatable);
		sesion.getTransaction().commit();
		//fin de codigo para probar la propiedad updatable=false clase20
		
		
		//cierre de la Sesion Activa
		sesion.close();
		
		
	}

	
	
}
