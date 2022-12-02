package FactoryPattern;

public class PremiumCardFactory extends CardFactory {
	
	@Override
	public AfiliateCard createCard() {
		// codigo que crea y retorna una premiumCard con todos sus atributos
		return new PremiumCard();
	}

}
