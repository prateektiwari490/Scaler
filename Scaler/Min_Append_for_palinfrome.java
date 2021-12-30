package Scaler;

public class Min_Append_for_palinfrome {

	public static void main(String[] args) {
		String str = "abede";
		String s = "";
        int len = str.length();
        for(int i=len-1;i>=0;i--){
            s = s + str.charAt(i);
        }
        s = s + '$';
        s = s + str;
        System.out.println(s);
        int i = 0;
        int j = s.length()-1;
        int flag = 0;
        while(i<j) {
        	if(s.charAt(i) == s.charAt(j)) {
        		flag++;
        		i++;
        		j--;
        	}else {
        		break;
        	}
        }
        System.out.println(flag);
	}

}
