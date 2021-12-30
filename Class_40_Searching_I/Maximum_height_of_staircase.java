package Class_40_Searching_I;

public class Maximum_height_of_staircase {

	public static void main(String[] args) {
		int A = 20;
		
		int i=0;
		int val = 0;
		while(val <= A) {
			System.out.println(val + " " + i);
			i++;
			val = i*(i+1)/2;
			
		}
		System.out.println(i-1);
	}

}
