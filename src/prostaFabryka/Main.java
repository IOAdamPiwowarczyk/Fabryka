package prostaFabryka;

public class Main {

	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		Pizza pizzaSerowa = store.orderPizza("Serowa");
		System.out.println(pizzaSerowa.toString());
		System.out.println("----------------------------");
		Pizza pizzaOwoceMorza = store.orderPizza("Owoce Morza");
		System.out.println(pizzaOwoceMorza.toString());

	}

}
