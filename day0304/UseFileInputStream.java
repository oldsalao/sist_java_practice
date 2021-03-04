package day0304;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 8bit Stream을 사용하여 파일의 내용읽기.(한글깨짐 - 파일을 복사하면 깨지지 않는다.)<br>
 * 
 * @author user
 */
public class UseFileInputStream {
	public UseFileInputStream() {
		File file = new File("C:\\dev\\temp\\java_read.txt");
		int data = 0;

		try {
			if (file.exists()) {// 파일이 존재한다면
				FileInputStream fis = new FileInputStream(file); // 파일에 스트림을 연결하고
				data = fis.read();// 처음 글자를 읽어들인다.
				while ((data = fis.read()) != -1) {
					System.out.print((char) data);// 1byte씩 읽어들인 내용을 출력.숫자나 영어는 1byte이기 때문에
					// 1byte를 읽어들여 출력하면 깨지지 않지만, 한글은 최소 2byte의 조합으로 글자가 만들어지기 때문에
					// 1byte씩 읽어들여 출력하면 깨진다.
				}
				// 스트림 사용이 끝났다면 스트림을 끊어서 메모리 확보.
				fis.close();
			} else {
				System.out.println(file + "의 경로를 확인해주세요.");
			}
		} catch (IOException e) {
			System.err.println("파일을 읽는 도중 문제가 발생.");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new UseFileInputStream();
	}

}
