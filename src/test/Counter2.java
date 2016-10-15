package test;

import java.util.function.Supplier;

public class Counter2 implements ICounterUpdate {

	private Supplier<Double> supplier;

	public Counter2(DataSource2 dataSource) {
		this(() -> dataSource.next());
	}

	public Counter2(Supplier<Double> supplier) {
		this.supplier = supplier;
	}

	@Override
	public void update() {
		Double value = supplier.get();
		System.out.println("Counter2.update = " + value.toString());
	}
}
