package day0201;

/**
 * 일차원 배열의 사용.
 * @author user
 */
public class UseArray1 {

	public static void main(String[] args) {
		//1.배열 선언. 데이터형[] 배열명 = null;
		int[] arr = null;
		System.out.println(arr);
		
		//2.생성. 배열명 = new 데이터형[요소갯수];
		arr = new int[15]; // 생성할때 배열의 크기는 프로그램 실행도중 변경되지 않는다.(고정길이형)
		System.out.println(arr);//배열명을 출력하면 배열의 시작주소가 출력.
		System.out.println(arr[0] + " " + arr[4]);
		
		//3.값 할당. 배열명[인덱스] = 값;
		
		arr[0] = 2021;
		arr[1] = 2;
		arr[2] = 1;
		arr[3] = 16;
		arr[4] = 27;
		
		//4. 값사용. 배열명[인덱스]
		
		System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);
		
		System.out.println("배열의 방의 갯수 : " + arr.length);
		
//		일괄처리 : 배열의 방은 0번부터 시작하고, 배열명.length 번째 까지 1씩 증가하면서 도달하게 된다.
		for(int i = 0; i < 5; i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}
	}

}
