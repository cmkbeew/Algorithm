package chap3;

import java.util.Scanner;

// p.109.3-4: ���� �˻�
public class BinSearch {
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;
		int pr = n-1;
		
		do {
			int pc = (pl+pr)/2;
			if(a[pc] == key) {
				return pc;
			}else if(a[pc] < key) {
				pl = pc + 1;
			}else { // a[pc] > key
				pr = pc - 1;
			}
		}while(pl<=pr);
		
		return -1;
	}
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		
		System.out.print("��ڼ�: ");
		int num = sn.nextInt();
		int[] x = new int[num];
		
		System.out.println("������������ �Է��ϼ���.");
		
		System.out.print("x[0]: ");
		x[0] = sn.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x["+i+"]: ");
				x[i] = sn.nextInt();
			}while(x[i] <= x[i-1]);
		}
		
		System.out.print("�˻��� ��: ");
		int ky = sn.nextInt();
		
		int idx = binSearch(x, num, ky);
		
		if(idx == -1) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		}else {
			System.out.println("�� ���� x["+idx+"]�� �ֽ��ϴ�.");
		}
	}

}
