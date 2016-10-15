package test;

public class Main {

	public static void main(String[] args) {
		
		ICounterUpdate c1 = Factory.create(new DataSource1());
		ICounterUpdate c2 = Factory.create(new DataSource2());
		c1.update();
		c2.update();
	}
}
