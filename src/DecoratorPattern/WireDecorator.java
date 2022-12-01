package DecoratorPattern;
public class WireDecorator extends Decorator {

	/**
	 * 
	 * @param mensaje
	 */
	
	public WireDecorator(Notifier notifier) {
		super(notifier);
	}
	@Override
	public void send(String mensaje) {
		// envia mensaje por wire
	}

}