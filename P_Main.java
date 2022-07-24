package Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class P_Main {

	public static void main(String[] args) {
		Student st1 = new Student("김연균", "0693");
		Student st2 = new Student("나경민", "3536");
		Student st3 = new Student("박대부", "0306");
		Student st4 = new Student("박상우", "9972");
		Student st5 = new Student("이주안", "5489");
		Student st6 = new Student("이주안", "0366");
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);
		list.add(st6);
		
		//list에 담긴 내용 확인
//		for(Student stu : list) {
//			System.out.println(stu.getName());
//		}
		
		Scanner sn = new Scanner(System.in);
		
		while(true) {
			System.out.println("y: 검색, n: 종료");
			String input = sn.next();
			
			if(input.equals("y")) {
				System.out.print("검색할 이름: ");
				String name = sn.next();
				boolean flag = false;
				
				for(Student stu : list) {
					if(stu.getName().equals(name)) {
						System.out.println("검색결과: " + stu.getName() + ", " + stu.getNo());
						flag = true;
					}
				}
				
				if(!flag) {
					System.out.println("검색하신 사람은 없습니다.");
				}
				
			}else if(input.equals("n")) {
				break;
			}else {
				System.out.println("y 또는 n만 입력해주세요.");
			}
		}
		System.out.println("검색을 종료합니다.");
	}

}
