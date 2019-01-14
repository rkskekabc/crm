public class test {
	public static void main(String[] args) throws InterruptedException {
		Testinter<Integer, Integer> ti = (a, b) -> System.out.println(a + b);
		Runnable c = new Runnable() {
			public void run() {
				System.out.println("abc");
			}
		};
		setTimeOut((num, num2)-> System.out.println(num), 3000);
	}
	
	public static void setTimeOut(Testinter<Integer, Integer> ti, int time) throws InterruptedException {
		ti.run(3, 4);
	}
	
	public interface Testinter<T, R> {
		public void run(T t, R r);
	}
	
	public static class MyDate {
		public int age;
		public String name;
		public String job;
		
		public String toString() {
			return "" + age + ", " + name + ", " + job;
		}
	}
}
