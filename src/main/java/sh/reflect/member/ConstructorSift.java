package sh.reflect.member;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import static java.lang.System.out;

public class ConstructorSift {
	
	public ConstructorSift(java.lang.Integer i) {
		
	}
	
	public static void main(String... args) {
		try {
			Class<?> cArg = Class.forName(args[1]);

			Class<?> c = Class.forName(args[0]);
			Constructor[] allConstructors = c.getDeclaredConstructors();
			
			System.out.println(allConstructors);
			for (Constructor ctor : allConstructors) {
				
				System.out.println(ctor);
				
				Class<?>[] pType = ctor.getParameterTypes();
				
				System.out.println(pType.length);
				
				for (int i = 0; i < pType.length; i++) {
					
					System.out.println(pType[i]);
					
					
					if (pType[i].equals(cArg)) {
						out.format("%s%n", ctor.toGenericString());

						Type[] gpType = ctor.getGenericParameterTypes();
						for (int j = 0; j < gpType.length; j++) {
							char ch = (pType[j].equals(cArg) ? '*' : ' ');
							out.format("%7c%s[%d]: %s%n", ch, "GenericParameterType", j, gpType[j]);
						}
						break;
					}
				}
			}

			// production code should handle this exception more gracefully
		} catch (ClassNotFoundException x) {
			x.printStackTrace();
		}
	}
}