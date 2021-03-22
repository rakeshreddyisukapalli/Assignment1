package Assignment.pizzademo;

public class Nutritionist {
	
	void printCalories(Pizza p) {
		Pizza pizza=new Pizza();
		String cal=pizza.fetchCalories(p);
		System.out.println(cal);
	}

}
