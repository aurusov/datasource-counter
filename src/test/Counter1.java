package test;

import java.util.function.Supplier;

public class Counter1 implements ICounterUpdate {

	private Supplier<Integer> supplier;

	public Counter1(DataSource1 dataSource) {
		this(() -> dataSource.next());
	}

	public Counter1(Supplier<Integer> supplier) {
		this.supplier = supplier;
	}

	@Override
	public void update() {
		Integer value = supplier.get();
		System.out.println("Counter1.update = " + value.toString());
	}

}
