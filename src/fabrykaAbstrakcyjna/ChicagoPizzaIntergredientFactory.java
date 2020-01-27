package fabrykaAbstrakcyjna;

public class ChicagoPizzaIntergredientFactory implements PizzaIngredientFactory {

	@Override
	public Ciasto utworzCiasto() {
		// TODO Auto-generated method stub
		return new GrubeChrupkieCiasto();
	}

	@Override
	public Sos utworzSos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ser utworzSer() {
		// TODO Auto-generated method stub
		return new SerReggiano();
	}

	@Override
	public Warzywa utworzWarzywa() {
		// TODO Auto-generated method stub
		return new CzerwonaPapryka();
	}

}
