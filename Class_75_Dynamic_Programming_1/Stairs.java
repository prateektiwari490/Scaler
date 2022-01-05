package Class_75_Dynamic_Programming_1;

public class Stairs {

	public static void main(String[] args) {
		int A = 20;
		int third = -1;
        if(A == 1){
        	System.out.println(1);
        }
        else if(A == 2){
        	System.out.println(2);
        }
        else{
            int first = 1;
            int second = 2;
            
            for(int i=3;i<=A;i++){
                third = first + second;
                first = second;
                second = third;
            }
        }
        System.out.println(third);
//        return third;
	}

}
