package Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Student st1 = new Student("손오공", "1928");
		Student st2 = new Student("저팔계", "1395");
		Student st3 = new Student("사오정", "1581");
		
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
			System.out.println("계속 검색을 원하시면 y, 종료하고싶으면 n");
			
			String input = sn.next();
			
			if(input.equals("y")) {
				System.out.println("검색을 시작합니다.");
				System.out.print("검색할 이름: ");
				String name = sn.next();
				boolean flag = false;
				
				for(Student stu : list) {
					if(stu.getName().equals(name)) {
						System.out.println("이름: " + stu.getName() + ", 학번: " + stu.getNo());
						flag = true;
					}
//					else {
//						System.out.println("해당하는 학생이름이 없습니다.");
//					}
				}
				
				//for문 안에서 else처리하면 ArrayList에 담김 수 만큼 반복되기때문에 flag를 통해 1번만 수행할 수 있도록 처리.
				if(!flag) { 
					System.out.println("해당하는 학생이름이 없습니다.");
				}
			}else if(input.equals("n")) {
				break;
			}
		}
		
		System.out.println("종료되었습니다.");
	}

}
