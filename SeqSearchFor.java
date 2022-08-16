package chap3;

import java.util.Scanner;

// p.102.3-2: ���� �˻� (while => for)
public class SeqSearchFor {
	static int seqSearch(int[] a, int n, int key) {
		for(int i=0; i<n; i++) {
			if(a[i] == key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		
		System.out.print("��ڼ�: ");
		int num = sn.nextInt();
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sn.nextInt();
		}
		
		System.out.print("�˻��� ��: ");
		int ky = sn.nextInt();
		
		int idx = seqSearch(x, num, ky);
		
		if(idx == -1) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		}else {
			System.out.println("�� ���� x["+idx+"]�� �ֽ��ϴ�.");
		}
	}
}
