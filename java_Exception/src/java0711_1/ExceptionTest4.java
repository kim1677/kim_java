package java0711_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionTest4 {

	public static void main(String[] args) {
		
		// ���Ͽ� ����
		try (BufferedReader br = new BufferedReader(new FileReader("C:/test/data.txt")))			// ������ ���µ� ������ �Ͼ�� �˾Ƽ� close�� ����
		{
			String text = br.readLine();															// ������ ���پ� �а���
			System.out.println(text);
		}catch(Exception e) {
			System.out.println("���� ���� ���� �Ǵ� ���� ���� ����");
		}
		
//		BufferedWriter br = null;
//		try {
//			br = new BufferedWriter(new FileWriter("C:/test/data.txt") );	// C ����̺꿡 ��μ���
//			String name = "�̼���";
//			br.write("�̼��� 34 ����"+name.substring(10));												// 10�� �ε��� ���Ŀ��� ���� ���ڸ� ����϶�
//			br.close();																				// ������ �ݾƼ� �޸𸮸� ���
//		}catch(Exception e){
//			System.out.println("���� ���� ���� �Ǵ� ���� ���� ����");										// ����̺꿡 ��ο� ������ ������ �����߻�
//			try {
//				br.close();																			// ���Ͽ� ������ ���� �޸𸮸� �������
//			}catch(IOException e1) {
//				e1.printStackTrace();
//			}
//			
//		}
		
		
	}

}

// ���� ó�� - �ڵ��ڿ���ȯ
// ���� �б�, ���⸦ �Ϸ��� ������ ������Ѵ�.
// ������ ��� ����� �������� ���� �ڿ��� �ݳ��ؾ� �Ѵ�.
// ���� �ݱ⸦ ����� �Ѵ�.
// �����ͺ��̽����� �����͸� �����ϰų� �������� ������ �ߴٸ� �ݱ⸦ ����� �Ѵ�.