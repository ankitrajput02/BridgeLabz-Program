package model;
public class CustomerDetail {

	public String custName;
	public int noOfShares;
	public float price;
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getNoOfShares() {
		return noOfShares;
	}
	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}
	public float getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "CustomerDetails [custName=" + custName + ", noOfShares=" + noOfShares + ", price=" + price + "]";
	}
	
	
}