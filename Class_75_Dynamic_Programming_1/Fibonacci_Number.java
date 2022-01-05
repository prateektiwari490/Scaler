package Class_75_Dynamic_Programming_1;

import java.util.Scanner;

public class Fibonacci_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        int first = 0;
        int second = 1;
        int third = -1;
        if(A == 0){
            System.out.println(first);
        } else if(A == 1){
            System.out.println(second);
        }else{
            for(int i=2;i<=A;i++){
                third = first + second;
                first = second;
                second = third;
            }
        }
        System.out.println(third);

	}

}
