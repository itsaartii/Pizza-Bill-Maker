package pbg;

public class Main {

	public static void main(String[] args) {
//		Pizza basePizza = new Pizza(true);
//		basePizza.addExtraToppings();
//		basePizza.addExtraCheese();
//		basePizza.getBill();
		
		
		
		DeluxPizza dPizza = new DeluxPizza(false);
		dPizza.addExtraCheese();
		dPizza.addExtraToppings();
		dPizza.getBill();
		

	}

}
