package day0125;

/**
 * for문의 다양한 형태.
 * 
 * @author user
 *
 */
public class TestForType {
	public static void main(String[] args) {
		// 여러개의 인덱스를 한번에 사용할 때.(초기값에 여러개의 변수를 선언.)
		// 증,감소식은 for문을 빠져나갈 수 있는 조건을 가진 변수값만 변경해도 된다.
		for (int i = 0, j = 10, k = 50; i < 10; i++, k += 5) {
			System.out.println("i = " + i + ", j = " + j + ", k = " + k);
		}
		
		//무한루프
		//수를 셀 필요가 없을때
		
		for(;;) {
			System.out.println("무한루프");
			break; // 브레이크가 없으면 무한루프가 되어 아래 출력문에 에러가 나타남.
		}
		
		System.out.println("테스트");
		
		//수를 셀 필요가 있을때
		for(int i = 0; ; i++) {
			System.out.println("무한루프 : " + i);
			if(i==10) {
				break;
			}
		}
		System.out.println("테스트");
	}
}