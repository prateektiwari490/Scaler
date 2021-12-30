package class_15_basicMaths;

import java.util.HashMap;
import java.util.Map;

public class Excel_Column_Title {

	public static void main(String[] args) {
		int A = 943566;

		StringBuilder colName = new StringBuilder();
		 
        while (A > 0) {

            int rem = A % 26;
            
            if (rem == 0) {
                colName.append("Z");
                A = (A / 26) - 1;
            }
            else
            {
                colName.append((char)((rem - 1) + 'A'));
                A = A / 26;
            }
        }
        System.out.println(colName.reverse());
	}

}
