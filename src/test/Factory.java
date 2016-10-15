package test;

public class Factory {

	public static ICounterUpdate create(Object dataSource) {
		switch (dataSource.getClass().getSimpleName()) {
		case "DataSource1":
			System.out.println("Counter1");
			return new Counter1((DataSource1) dataSource);

		case "DataSource2":
			System.out.println("Counter2");
			return new Counter2((DataSource2) dataSource);
		}
		return null;
	}
}
