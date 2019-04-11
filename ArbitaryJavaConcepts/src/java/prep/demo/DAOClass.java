package java.prep.demo;

public class DAOClass {
	
	public void saveBusinessTransaction(BusinessService service) throws Exception {
		
		if(service instanceof TransactionObjectInterface ) {
			throw new Exception("Non transaction object"); 
		}else {
			System.out.println("Transaction saved successfully");
		}
	}

}
