package ex22;

import ex21.Currency;

public class Main {

	public static void main(String[] args) {

		showDescription(Currency.AUD);
		showDescription(Currency.GBP);
		showDescription(Currency.UAH);

	}

	static void showDescription(Currency currency) {

		switch (currency) {

		case USD:
			System.out.println(currency + " # " + currency.ordinal());
			break;
		case UAH:
			System.out.println(currency + " # " + currency.ordinal());
			break;
		case AUD:
			System.out.println(currency + " # " + currency.ordinal());
			break;
		case AZN:
			System.out.println(currency + " # " + currency.ordinal());
			break;
		case GBP:
			System.out.println(currency + " # " + currency.ordinal());
			break;
		case JPY:
			System.out.println(currency + " # " + currency.ordinal());
			break;

		default:
			System.out.println("Default");
		}
	}
}
