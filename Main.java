package Q2;

public class Main {
	// �Ǻ���ġ ���� -> An = An-1 + An-2
	
	public static void main(String[] args) {
		//1��° ��� -> �迭
		int [] arr = new int[10];
		
		arr[1] = 1;
		arr[2] = 1;
		
		for(int i=3; i<arr.length; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		for(int i=1; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
		
		//2��° ���
		
		int prevPrevNum = 1;
		int prevNum = 1;
		
		System.out.print(prevPrevNum + " ");
		System.out.print(prevNum + " ");
		
		for(int i=3; i<10; i++) {
			int nNum = prevNum + prevPrevNum;
			
			System.out.print(nNum + " ");

			prevPrevNum = prevNum;
			prevNum = nNum;
		}
	}

}
