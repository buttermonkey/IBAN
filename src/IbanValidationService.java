public class IbanValidationService {
	private final String iban;
	private int calculatedChecksum = -1;

	public IbanValidationService(String iban) {
		this.iban = iban;
	}

	public String getCountryCode() {
		return iban.substring(0, 2);
	}

	public int getCheckSum() {
		return digitToPlaceValue(iban.charAt(2)) * 10 + digitToPlaceValue(iban.charAt(3));
	}

	public String getAccountNumber() {
		return iban.substring(4);
	}

	private static int digitToPlaceValue(char digit) {
		return digit - '0';
	}
}
