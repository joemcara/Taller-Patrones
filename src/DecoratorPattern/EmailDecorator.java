package DecoratorPattern;
public class EmailDecorator extends Decorator {

	/**
	 * 
	 * @param mensaje
	 */
	public EmailDecorator(Notifier notifier) {
		super(notifier);
	}
	
	@Override
	public void send(String mensaje) {
		// enviar mensaje por email
		
	}

}