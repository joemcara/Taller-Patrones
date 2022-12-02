package FactoryPattern;

public class VipCardFactory extends CardFactory {

	@Override
	public AfiliateCard createCard() {
		// codigo que crea y retorna una vipCard con todos sus atributos
		return new VipCard();
	}

}
