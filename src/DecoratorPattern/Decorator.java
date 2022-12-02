package DecoratorPattern;
public abstract class Decorator implements Notifier {

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
		envoltorio.send(mensaje);
	}

}