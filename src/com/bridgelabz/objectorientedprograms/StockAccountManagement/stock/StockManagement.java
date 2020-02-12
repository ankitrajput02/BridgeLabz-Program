package stock;

import operation.Operations;
import utility.Utility;
import java.io.IOException;
import java.util.List;
import controller.MyController;
import model.StockDetails;

/**
 * Title:program to read in Stock Names, Number of Share, Share Price. Print a
 * Stock Report with total value of each Stock and the total value of Stock.
 * Created By:Ankit Rajput
 *
 */
public class StockManagement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Operations operations = new Operations();
		MyController controller = new MyController();
		List<StockDetails> read = controller.readFile();

		for (StockDetails sd : read) {
			System.out.println(
					"Name " + sd.getName() + "No of Shares " + sd.getShare() + "Price of shares " + sd.getPrice());
		}
		int ch;
		do {
			System.out.println(
					"Please enter\n1.Add Stock\n2.Remove Stock\n" + "3.Total Share\n4.Total Share Market\n5.Exit");
			ch = Utility.inputNumber();
			switch (ch) {
			case 1:
				// Add Stock
				List<StockDetails> read1 = controller.readFile();
				List<StockDetails> list1 = operations.addStock(read1);
				controller.writeFile(list1);
				break;
			case 2:
				// Remove Stock
				List<StockDetails> read2 = controller.readFile();
				List<StockDetails> list2 = operations.removeStock(read2);
				controller.writeFile(list2);
				break;
			case 3:
				// Total Share
				List<StockDetails> read3 = controller.readFile(); // reading json file
				operations.totalShare(read3); // writing data in json file
				break;

			case 4:
				// Total Market Share
				List<StockDetails> read4 = controller.readFile(); // reading json file
				operations.totalShareMarket(read4); // method to calculate total shares
				break;
			case 5:
				return;
			default:
				System.out.println("Please enter correct Input");
				break;
			}
		} while (ch != 5);
	}

}
