package java0711_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionTest4 {

	public static void main(String[] args) {
		
		// 파일에 쓰기
		try (BufferedReader br = new BufferedReader(new FileReader("C:/test/data.txt")))			// 파일을 쓰는데 오류가 일어나도 알아서 close를 해줌
		{
			String text = br.readLine();															// 파일을 한줄씩 읽게함
			System.out.println(text);
		}catch(Exception e) {
			System.out.println("파일 열기 실패 또는 파일 쓰기 실패");
		}
		
//		BufferedWriter br = null;
//		try {
//			br = new BufferedWriter(new FileWriter("C:/test/data.txt") );	// C 드라이브에 경로설정
//			String name = "이순신";
//			br.write("이순신 34 군인"+name.substring(10));												// 10번 인덱스 이후에서 부터 문자를 출력하라
//			br.close();																				// 파일을 닫아서 메모리를 비움
//		}catch(Exception e){
//			System.out.println("파일 열기 실패 또는 파일 쓰기 실패");										// 드라이브에 경로에 폴더가 없으면 오류발생
//			try {
//				br.close();																			// 파일에 오류가 나도 메모리를 비워야함
//			}catch(IOException e1) {
//				e1.printStackTrace();
//			}
//			
//		}
		
		
	}

}

// 예외 처리 - 자동자원반환
// 파일 읽기, 쓰기를 하려면 파일을 열어야한다.
// 파일을 열어서 사용이 끝났으면 사용된 자원을 반납해야 한다.
// 파일 닫기를 해줘야 한다.
// 데이터베이스에도 데이터를 저장하거나 가져오는 행위를 했다면 닫기를 해줘야 한다.