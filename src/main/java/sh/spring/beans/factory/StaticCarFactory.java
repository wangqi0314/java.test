package sh.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {

	public StaticCarFactory() {

	}

	private static Map<String, Car> cars = new HashMap<String, Car>();
	static {
		cars.put("BaoMa", new Car("BaoMa", 230000, 345.897));
		cars.put("BenChi", new Car("BenChi", 330000, 345.897));
		cars.put("Aui", new Car("Aui", 130000, 345.897));
	}

	public static Car getCar(String name) {
		return cars.get(name);
	}
}
