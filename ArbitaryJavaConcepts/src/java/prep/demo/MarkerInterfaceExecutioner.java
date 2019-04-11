package java.prep.demo;

public class MarkerInterfaceExecutioner {

	// Marker Interfaces are interfaces without any abstract methods or value declarations
	// It is just a way for the coding logic to ensure only it's subclasses/ implemented classes
	// can behave in a particular way
	
	public static void main(String[] args) {
		
		DAOClass dao = new DAOClass();
		BusinessService service = new BusinessService();
		
		try {
			dao.saveBusinessTransaction(service);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
