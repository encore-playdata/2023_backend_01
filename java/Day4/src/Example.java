
public class Example {
// static Á¤Àû 
	public static void main(String[] args) {
		Test test = new Test();
		test.a = 1;
		System.out.println(test.b + " " + Test.b);
		for(int i=0; i<3; i++) {
			Test test1 = new Test();
			Test.plus(i);
//			test1.plus(i);
		}
		
		System.out.println(test.b + " " + Test.b);
	}

}
class Test{
	int a;
	static int b = 10;
	public Test() {
		b++;
	}
	public static void plus(int i) {
		b += i;
	}
	
}