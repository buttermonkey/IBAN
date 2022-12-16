import java.util.Arrays;

public class IbanTest {
	public static void main(String[] args) {
		String iban = "AT611904300234573201";

		IbanValidationService validator = new IbanValidationService("AT611904300234573201");

		System.out.println("Laendercode: " + validator.getCountryCode() + " (" + validator.getCountryCodeNumber() + ")");
		System.out.println("Pruefsumme: " + validator.getCheckSum());
		System.out.println("Kontonummer: " + validator.getAccountNumber());
		System.out.println("Pruefzahl: " + validator.getFullCode());
		System.out.println("arr = " + Arrays.toString(validator.buildArray()));
	}
}
