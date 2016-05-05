package sv.edu.ucad.et1.biblioteca.data;

import java.util.Date;

//import org.hibernate.Hibernate;
import org.hibernate.Session;

import sv.edu.ucad.et1.biblioteca.data.entities.Catedraticos;
import sv.edu.ucad.et1.biblioteca.data.entities.Scompras;

public class UnoaUno {
	public static void main(String[] args){
		Session sesion = hibernateUtil.getSessionFactory().openSession();
		
		//inicio de la transaccion
		try{
			org.hibernate.Transaction transaccion = sesion.beginTransaction();
		
			Catedraticos cate = createNewCatedraticos();
			Scompras usuarios = createNewScompras(cate);

			sesion.save(usuarios);
			transaccion.commit();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sesion.close();
			hibernateUtil.getSessionFactory().close();
		}
		
	}
	
	//clases empotradas que crean usuarios y deptos
	//crea un nuevo usuario
	
	private static Scompras createNewScompras(Catedraticos cate) {
		Scompras nusu = new Scompras();
		nusu.setFecscom(new Date());
		nusu.setLibscom("Psicologia ");
		nusu.setEdiscom("tercera");
		nusu.setCarrscomp(" Administracion");
		nusu.setCate(cate);
		//nusu.setCueusu("messi@barcelona.com");
		//nusu.setClausu("12345");
		//nusu.setDeptos(deptos);
		//modif por la OneToOne Uni nusu.setCodcar((long) 1);
		//nusu.setCodsuc((long) 1);		
		return nusu;
	}
	
	//crea un nuevo depto
	private static Catedraticos createNewCatedraticos() {
		Catedraticos  ndepto = new Catedraticos ();
		ndepto.setNomcat("Carlos Luis");
		ndepto.setApecat("Madrid ");
		ndepto.setCarrcat("Administracion de Empresas");
		ndepto.setFaccat("Ciencias Economicas");
		//ndepto.setEstdep(true);
		return ndepto;
	}

}//fin de la clase Principal