package DecoratorPattern;
public class WhatsAppDecorator extends Decorator {

	/**
	 * 
	 * @param mensaje
	 */
	public WhatsAppDecorator(Notifier notifier) {
		super(notifier);
	}
	
	@Override
	public void send(String mensaje) {
		// envia mensaje por whatsapp
	}

}