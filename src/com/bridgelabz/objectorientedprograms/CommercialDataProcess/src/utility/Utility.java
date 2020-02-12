package utility;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Utility {

	static Scanner sc = new Scanner(System.in);

	public static int inputNumber() {
		return sc.nextInt();
	}

	public static double inputDouble() {
		return sc.nextDouble();
	}

	public static String inputString() {
		return sc.next();
	}

	public static Long inputLong() {
		return sc.nextLong();
	}

	public static float inputFloat() {
		return sc.nextFloat();
	}

	public static boolean inputBoolean() {
		return sc.nextBoolean();
	}

	public static String stringValidation(String string) {
		Pattern pattern = Pattern.compile("^[a-zA-Z]*$");
		if (!pattern.matcher(string).matches()) {
			throw new InputMismatchException();

		} else {
			return string;
		}
	}
}