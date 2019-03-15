package sh.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {
	private static Map<String, Car> cars = null;

	public InstanceCarFactory() {

		cars = new HashMap<String, Car>();
		cars.put("BaoMa", new Car("BaoMa", 230000, 345.897));
		cars.put("BenChi", new Car("BenChi", 330000, 345.897));
		cars.put("Aui", new Car("Aui", 130000, 345.897));
	}

	public Car getCar(String name) {
//		if (cars == null) {
//			return null;
//		}
		return cars.get(name);
	}
}
