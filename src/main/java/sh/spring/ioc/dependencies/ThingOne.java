package sh.spring.ioc.dependencies;

public class ThingOne {

	public ThingOne(ThingTwo thingTwo, ThingThree thingThree) {
		System.out.println("1 "+thingTwo);
		System.out.println("2 "+thingThree);
	}
}
