package prostaFabryka;

public class PizzaStore {

	private SimplePizzaFactory factory;

	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}

	public Pizza orderPizza(String nazwa) {
		return factory.createPizza(nazwa);
	}
	
	
}
