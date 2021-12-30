package LeetCode;

import java.util.Vector;

public class Simplify_Path {

	public static void main(String[] args) {
		String A = "/a//b//c//////d";
		
		Vector<String> v = new Vector<String>();
        int n = A.length();
        String ans = "";
        for (int i = 0; i < n; i++) {
            String dir = "";
            
            // forming the current directory.
            while (i < n && A.charAt(i) != '/') {
                dir += A.charAt(i);
                i++;
            }
       
            // if ".." , we pop.
            if (dir.equals("..")) {
                if (v.size() != 0)
                {
                    v.remove(v.size() - 1);
                }
            }
            else if (dir.equals(".") || dir.equals("")) {
                // do nothing (added for better understanding.)
            }
            else {
                // push the current directory into the vector.
                v.add(dir);
            }
        }
       
        // forming the ans
        for(String i : v) {
            ans += "/" + i;
        }
       
        // vector is empty
        if (ans == "")
            System.out.println("/");
       
        System.out.println(ans);
	}

}
