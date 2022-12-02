package FactoryPattern;

public class BasicCardFactory extends CardFactory {
	
	@Override
	public AfiliateCard createCard() {
		// codigo que crea y retorna la basic card con sus atributos
		return new BasicCard();
	}
	

}
