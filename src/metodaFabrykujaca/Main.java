package metodaFabrykujaca;

public class Main {

	public static void main(String[] args) {

		PizzaStore storeChicago = new ChicagoPizzaStore();
		PizzaStore storeNY = new NYPizzaStore();
		Pizza pizzaSerowa = storeChicago.orderPizza("Serowa");
		System.out.println(pizzaSerowa.toString());
		System.out.println("----------------------------");
		Pizza pizzaOwoceMorza = storeNY.orderPizza("Owoce Morza");
		System.out.println(pizzaOwoceMorza.toString());

	}

}
