package javaprep.demo.markerinterfacedemo;

public class BusinessObject {
	
	private Long txnNo;
	private Double amt;
	private String debitCredit;
	public Long getTxnNo() {
		return txnNo;
	}
	public void setTxnNo(Long txnNo) {
		this.txnNo = txnNo;
	}
	public Double getAmt() {
		return amt;
	}
	public void setAmt(Double amt) {
		this.amt = amt;
	}
	public String getDebitCredit() {
		return debitCredit;
	}
	public void setDebitCredit(String debitCredit) {
		this.debitCredit = debitCredit;
	}

}
