package sv.edu.ucad.et1.biblioteca.data;



	import org.hibernate.Session;

	public class TestPg {
		public static void main(String[] args){
			
			Session session = hibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.close();
		}

	}

