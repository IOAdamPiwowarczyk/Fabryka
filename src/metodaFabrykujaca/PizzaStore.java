package metodaFabrykujaca;

public class PizzaStore {

//	private SimplePizzaFactory factory;
//
//	public PizzaStore(SimplePizzaFactory factory) {
//		this.factory = factory;
//	}

	public Pizza orderPizza(String nazwa) {
		Pizza pizza = createPizza(nazwa);
		pizza.przygotowanie();
		pizza.pieczenie();
		pizza.krojenie();
		pizza.pakowanie();
		return pizza;
	}
	
	public Pizza createPizza(String type) {
		Pizza pizza;
		if(type == "Owoce Morza")
			pizza = new PizzaOwoceMorza();
		else if(type == "Pepperoni")
			pizza = new PizzaPepperoni();
		else if(type == "Serowa")
			pizza = new PizzaSerowa();
		else if(type == "Wegetarianska") 
			pizza = new PizzaWegetarianska();
		else
			throw new UnsupportedOperationException("nie ma takiej");
		return pizza;
	}
	
	
}
