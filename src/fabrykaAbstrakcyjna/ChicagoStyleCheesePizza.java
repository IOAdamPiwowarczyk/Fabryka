package fabrykaAbstrakcyjna;

public class ChicagoStyleCheesePizza extends Pizza {
	PizzaIngredientFactory factory;
	
	public ChicagoStyleCheesePizza(PizzaIngredientFactory factory) {
		this.factory = factory;
	}

	public ChicagoStyleCheesePizza() {
		nazwa = "Pizza Serowa Chicago";
		ciasto = "dobre";
		sos = "nie dobry";
		dodatki = "takie sobie";
	}
}
