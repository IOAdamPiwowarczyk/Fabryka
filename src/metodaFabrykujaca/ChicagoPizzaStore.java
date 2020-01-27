package metodaFabrykujaca;

public class ChicagoPizzaStore extends PizzaStore {
	public Pizza createPizza(String type) {
		Pizza pizza;
		if(type == "Owoce Morza")
			pizza = new ChicagoStyleCalmPizza();
		else if(type == "Pepperoni")
			pizza = new PizzaPepperoni();
		else if(type == "Serowa")
			pizza = new ChicagoStyleCheesePizza();
		else if(type == "Wegetarianska") 
			pizza = new PizzaWegetarianska();
		else
			throw new UnsupportedOperationException("nie ma takiej");
		return pizza;
	}
}
