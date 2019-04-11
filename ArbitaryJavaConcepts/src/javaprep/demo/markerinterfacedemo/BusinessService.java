package javaprep.demo.markerinterfacedemo;

import javaprep.demo.markerinterfacedemo.exception.InvalidBusinessObjectException;

public class BusinessService {
	
	public void businessService(BusinessObject bo) throws InvalidBusinessObjectException{
		
		bo.setAmt(1000+.02*1000);
		bo.setTxnNo(1001L);
		bo.setDebitCredit("D");
		
		
		DAOClass dao = new DAOClass();
		dao.saveBusinessTransaction(bo);
		
	}

}
