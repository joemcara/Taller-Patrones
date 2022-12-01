package DecoratorPattern;
public class SignalDecorator extends Decorator {

	/**
	 * 
	 * @param mensaje
	 */
	
	public SignalDecorator(Notifier notifier) {
		super(notifier);
	}
	
	@Override
	public void send(String mensaje) {
		// enviar mensaje por signal
	}

}