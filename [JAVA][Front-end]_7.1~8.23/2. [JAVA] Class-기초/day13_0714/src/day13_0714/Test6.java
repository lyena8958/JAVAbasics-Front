package day13_0714;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
static int NumCheck(int a, int num) {
	Scanner sc = new Scanner(System.in);
	while(true) {
		if(num<a) {
			System.out.println("숫자를 잘못입력하셨습니다. "+a+"이상으로 입력해주세요.");
			num = sc.nextInt();
			continue;
		}
		break;
	}
	return num;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 탑의 개수를 입력하세요.
		5
 		단, 탑의 개수는 0이하xxx
		5개의 탑의 높이를 입력하세요. 6 9 5 7 4 [ 0 0 2 2 4]
		1: 6
		2: 9
		3: 5
		4: 7
		5: 4
 		단, 높이는 0이하xxx
		=> [ 0 0 2 2 4 ] */
		
		// 강사님의 답
		System.out.println("탑의 개수를 입력하세요.");
		int n = sc.nextInt();
		
		int[] data = new int[n];
		Random rand = new Random();
		
		for(int i = 0; i < data.length;i++) {
			data[i] = rand.nextInt(9)+1; // 1~9
		}
		
		for(int v:data) {
			System.out.print(v+" ");
		}
		System.out.println();
		/* 배열
		int[] res = new int[n];

		for (int a = data.length-1; a >= 0; a--) {
			// data[4]를 기준으로 진행!
			for (int i = a-1; i >= 0; i--) {
				if (data[a] <= data[i]) { // 나보다 크거나 캍은 탑을 만나면,
					res[a] = i + 1;
					break;
				}
			}
		}
		
		for(int v:res) {
			System.out.print(v+" ");
		}*/
		
		// 변수
		for (int a = 0; a <data.length; a++) { // 위에서 대로 조건을 그대로 하면 값이 반대로 출력된다.
			int pos= 0; //포지션
			for (int i = a-1; i >= 0; i--) {
				if (data[a] <= data[i]) { // 나보다 크거나 캍은 탑을 만나면,
					pos = i + 1;
					break;
				}
			}
			System.out.print(pos+" ");
		}
		
		/* 예나
		System.out.println("탑의 개수를 입력하세요.");
		int num = NumCheck(1,sc.nextInt());
		
		int[] NumArr = new int[num];
		
		for(int i = 0; i < NumArr.length;i++) {
			System.out.println((i+1)+"번째 탑의 높이를 입력하세요");
			NumArr[i] = NumCheck(1,sc.nextInt());
		}
		
		int[] NumIndex = new int[num]; // 전봇대 부딪히는 번호를 저장
		
		for(int i = num-1; i > 0; i--) {
			for(int j = i-1; j >= 0; j--) {
			if(NumArr[i] <NumArr[j]) {
				NumIndex[i] = j+1;
				break;
			}
		}
	}
		System.out.print("[ ");
		for(int v: NumIndex) {
			System.out.print(v+" ");
		}
		System.out.println("]");
		*/

}//main종료
}