package Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Student st1 = new Student("�տ���", "1928");
		Student st2 = new Student("���Ȱ�", "1395");
		Student st3 = new Student("�����", "1581");
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
//		for(Student stu : list) {
//			System.out.println(stu.getName());
//			System.out.println(stu.getNo());
//		}
		
		Scanner sn = new Scanner(System.in);
		
		while(true) {
			System.out.println("��� �˻��� ���Ͻø� y, �����ϰ������ n");
			
			String input = sn.next();
			
			if(input.equals("y")) {
				System.out.println("�˻��� �����մϴ�.");
				System.out.print("�˻��� �̸�: ");
				String name = sn.next();
				boolean flag = false;
				
				for(Student stu : list) {
					if(stu.getName().equals(name)) {
						System.out.println("�̸�: " + stu.getName() + ", �й�: " + stu.getNo());
						flag = true;
					}
//					else {
//						System.out.println("�ش��ϴ� �л��̸��� �����ϴ�.");
//					}
				}
				
				//for�� �ȿ��� elseó���ϸ� ArrayList�� ��� �� ��ŭ �ݺ��Ǳ⶧���� flag�� ���� 1���� ������ �� �ֵ��� ó��.
				if(!flag) { 
					System.out.println("�ش��ϴ� �л��̸��� �����ϴ�.");
				}
			}else if(input.equals("n")) {
				break;
			}
		}
		
		System.out.println("����Ǿ����ϴ�.");
	}

}
