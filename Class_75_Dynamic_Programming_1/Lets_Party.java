package Class_75_Dynamic_Programming_1;

public class Lets_Party {

	public static void main(String[] args) {
		int A = 5;
		if(A == 1){
            System.out.println(1);
        }
        if(A == 2){
            System.out.println(2);
        }
        int first = 1;
        int second = 2;
        int third = -1;
        for(int i=3;i<=A;i++){
            third = second%10003 + ((i-1)%10003*first%10003)%10003;
            first = second%10003;
            second = third%10003;
        }
        System.out.println(third%10003);
//        return third%10003;
	}

}
