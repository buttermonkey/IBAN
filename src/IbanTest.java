import java.util.Arrays;

public class IbanTest {
	public static void main(String[] args) {
		String iban = "AT611904300234573201";

		IbanValidationService validator = new IbanValidationService(iban);

		System.out.println("Laendercode: " + validator.getCountryCode() + " (" + validator.getCountryCodeNumber() + ")");
		System.out.println("Pruefsumme: " + validator.getCheckSum());
		System.out.println("Kontonummer: " + validator.getAccountNumber());
		System.out.println("Pruefzahl: " + validator.getFullCode());
		System.out.println("arr = " + Arrays.toString(validator.buildArray()));
		System.out.println("IBAN ist korrekt: " + validator.isIbanCorrect());
	}
}
