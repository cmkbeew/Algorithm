package Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class P_Main {

	public static void main(String[] args) {
		Student st1 = new Student("�迬��", "0693");
		Student st2 = new Student("�����", "3536");
		Student st3 = new Student("�ڴ��", "0306");
		Student st4 = new Student("�ڻ��", "9972");
		Student st5 = new Student("���־�", "5489");
		Student st6 = new Student("���־�", "0366");
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);
		list.add(st6);
		
		//list�� ��� ���� Ȯ��
//		for(Student stu : list) {
//			System.out.println(stu.getName());
//		}
		
		Scanner sn = new Scanner(System.in);
		
		while(true) {
			System.out.println("y: �˻�, n: ����");
			String input = sn.next();
			
			if(input.equals("y")) {
				System.out.print("�˻��� �̸�: ");
				String name = sn.next();
				boolean flag = false;
				
				for(Student stu : list) {
					if(stu.getName().equals(name)) {
						System.out.println("�˻����: " + stu.getName() + ", " + stu.getNo());
						flag = true;
					}
				}
				
				if(!flag) {
					System.out.println("�˻��Ͻ� ����� �����ϴ�.");
				}
				
			}else if(input.equals("n")) {
				break;
			}else {
				System.out.println("y �Ǵ� n�� �Է����ּ���.");
			}
		}
		System.out.println("�˻��� �����մϴ�.");
	}

}
