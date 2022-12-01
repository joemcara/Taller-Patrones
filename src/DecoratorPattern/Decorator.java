package DecoratorPattern;
public abstract class Decorator extends Notifier {

	private Notifier envoltorio;

	/**
	 * 
	 * @param notifier
	 */
	public Decorator(Notifier notifier) {
		this.envoltorio = notifier;
	}
	
	@Override
	public void send(String mensaje) {
		//metodo de enviar mensaje
	}

}