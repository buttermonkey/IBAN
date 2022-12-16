public class IbanTest {
	public static void main(String[] args) {
		String iban = "AT611904300234573201";

		IbanValidationService validator = new IbanValidationService("AT611904300234573201");

		System.out.println("Laendercode: " + validator.getCountryCode());
		System.out.println("Pruefsumme: " + validator.getCheckSum());
		System.out.println("Kontonummer: " + validator.getAccountNumber());
	}
}
