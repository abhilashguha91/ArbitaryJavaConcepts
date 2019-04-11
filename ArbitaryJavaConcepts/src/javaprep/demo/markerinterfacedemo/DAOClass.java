package javaprep.demo.markerinterfacedemo;

import javaprep.demo.markerinterfacedemo.exception.InvalidBusinessObjectException;

public class DAOClass {
	
	public void saveBusinessTransaction(BusinessObject bo) throws InvalidBusinessObjectException {
		
		if(bo instanceof TransactionObjectInterface ) {
			throw new InvalidBusinessObjectException("Non transaction object"); 
		}else {
			System.out.println("Transaction saved successfully");
		}
	}

}
