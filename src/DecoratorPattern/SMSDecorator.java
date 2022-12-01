package DecoratorPattern;
public class SMSDecorator extends Decorator {

	/**
	 * 
	 * @param mensaje
	 */
	public SMSDecorator(Notifier notifier) {
		super(notifier);
	}
	
	@Override
	public void send(String mensaje) {
		// enviar mensaje por SMS
	}

}