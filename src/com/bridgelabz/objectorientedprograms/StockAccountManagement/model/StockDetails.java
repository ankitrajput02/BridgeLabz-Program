package model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**Getter and setter methods to get Name,Price,Share
 * and set Name,Price,Share
 * 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class StockDetails {

	String name;
	double price;
	double share;

	public String getName() {
		return name;
	}

	/**
	 * @param name String type
	 */
	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	/**
	 * @param price double type
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	public double getShare() {
		return share;
	}

	/**
	 * @param share double type
	 */
	public void setShare(double share) {
		this.share = share;
	}

	/**Returns a string representation of the object
	 *
	 */
	@Override
	public String toString() {
		return "StockDetails[name=" + name + ",price=" + price + ",share=" + share + "]";
	}

}
