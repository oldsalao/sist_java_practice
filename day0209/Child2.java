package day0209;

/**
 * Parent의 자식 클래스
 * @author user
 */
public class Child2 extends Parent{
	int child2;
	
	@Override
	public void printAge() {
		System.out.println("Child2 클래스가 Overriding 한 method");
	}
}
