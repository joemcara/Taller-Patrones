package DecoratorPattern;
public class TelegramDecorator extends Decorator {

	/**
	 * 
	 * @param mensaje
	 */
	public TelegramDecorator(Notifier notifier) {
		super(notifier);
	}
	
	@Override
	public void send(String mensaje) {
		// envia mensaje por telegram
	}

}