import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TestClass {
	private String name = "abc";
	public String name2 = "abc2";
	public String name3 = "abc3";
	public String name11 = "abc";
	public String name112 = "abc2";
	public String name13 = "abc3";
	public String name1111 = "abc";
	public String name11112 = "abc2";
	public String name113 = "abc3";
	
	public TestClass() {
		
	}
	
	public TestClass(String name) {
		this.name = name;
	}
	
	public void testFunction(String printS) {
		System.out.println(printS);
	}
	
	private Object getValue(Field field) {
		try {
			return field.get(this);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			return null;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public String toString() {
		return Arrays
				.stream(TestClass.class.getDeclaredFields())
				.map(field -> field.getName() + " : " + this.getValue(field))
				.collect(Collectors.joining("\n"));
	}

	public static void main(String[] args) throws Exception {
		Class<TestClass> clazz = TestClass.class;
		TestClass tc = clazz.newInstance();
		Constructor<TestClass> c = clazz.getConstructor(String.class);
		TestClass tc2 = c.newInstance("qgd");
		//Field f = clazz.getDeclaredField("name");
		Field[] f = clazz.getFields();
		//f.setAccessible(false);
		f[0].set(tc2, "asdfad");
		System.out.println(tc2);
	}
}
