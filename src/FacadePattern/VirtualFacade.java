package FacadePattern;

public class VirtualFacade {
	public boolean solicitarTarjeta(String[] datos) {
		Contabilidad cont = new Contabilidad();
		if (cont.verificarDatos(datos)) {
			CardFactory cf = new BasicCardFactory();
			cf.createCard();
			return true;
		}
		return false;
	}
}
