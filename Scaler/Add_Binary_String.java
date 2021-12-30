package Scaler;

public class Add_Binary_String {

	public static void main(String[] args) {
//			A : "1110000000010110111010100100111"
//			B : "101001"
//			The expected output for this testcase is:
//			1110000000010110111010101010000
		
//			A : "1010110111001101101000"
//			B : "1000011011000000111100110"
		
		
		String A = "11";
		String B = "1";
		int n = A.length();
        int m = B.length();
        
        if(n==0){
//            return B;
            System.out.println(B);
        }else if(m == 0){
//            return A;
        	System.out.println(A);
        }
//        else if(n == 1 && m == 1){
//            if(A.charAt(0) == '0' && B.charAt(0) == '0'){
////                return "0";
//                System.out.println("0");
//            }else if(A.charAt(0) == '1' && B.charAt(0) == '0'){
////                return "1";
//            	System.out.println("1");
//            }else if(A.charAt(0) == '0' && B.charAt(0) == '1'){
////                return "1";
//            	System.out.println("1");
//            }else if(A.charAt(0) == '1' && B.charAt(0) == '1'){
////                return "10";
//            	System.out.println("10");
//                
//            }
//        }
        
        
        
        n = n-1;
        m = m-1;
        
//        System.out.println(n);
//        System.out.println(m);
//        System.out.println(B);
//        System.out.println("100111");
        
        int len = m<n?m:n;
//        System.out.println(len);
        
        int rem = 0;
        String str = "";
        
        StringBuilder s = new StringBuilder();
        while(len>=0){
            if(A.charAt(n) == '0' && B.charAt(m) == '0' && rem == 0){
//                s += '0';
                s.append('0');
            }
            else if(A.charAt(n) == '0' && B.charAt(m) == '0' && rem == 1){
//                s += '1';
                s.append('1');
                rem = 0;
            }
            else if(A.charAt(n) == '1' && B.charAt(m) == '0' && rem == 0){
//                s += '1';
                s.append('1');
            }
            else if(A.charAt(n) == '1' && B.charAt(m) == '0' && rem == 1){
//                s += '0';
                s.append('0');
                rem = 1;
            }
            else if(A.charAt(n) == '0' && B.charAt(m) == '1' && rem == 0){
//                s += '1';
                s.append('1');
            }
            else if(A.charAt(n) == '0' && B.charAt(m) == '1' && rem == 1){
//                s += '0';
                s.append('0');
                rem = 1;
            }
            else if(A.charAt(n) == '1' && B.charAt(m) == '1' && rem == 0){
//                s += '0';
            	s.append('0');
                rem = 1;
            }
            else if(A.charAt(n) == '1' && B.charAt(m) == '1' && rem == 1){
//                s += '1';
            	s.append('1');
                rem = 1;
            }
            
//            System.out.println("rem = " + rem);
//            System.out.println("n = " + n);
//            System.out.println("m = " + m);
//            System.out.println("len = " + len);
            n--;
            m--;
            len--;
        }
        
        if(n>m) {
        	while(n>=0) {
        		if(rem == 1 && A.charAt(n) == '1') {
//            		s += '0';
        			s.append('0');
            	}
            	else if(rem == 0 && A.charAt(n) == '1') {
//            		s += '1';
            		s.append('1');
            	}
            	else if(rem == 1 && A.charAt(n) == '0') {
//            		s += '1';
            		s.append('1');
            		rem = 0;
            	}
            	else if(rem == 0 && A.charAt(n) == '0') {
//            		÷s += '0';
            		s.append('0');
            	}
            	n--;
        	}
        	if(rem == 1){
//        	    s += '1';
        		s.append('1');
        	}
        }else {
        	while(m>=0) {
        		if(rem == 1 && B.charAt(m) == '1') {
//            		s += '0';
        			s.append('0');
            	}
            	else if(rem == 0 && B.charAt(m) == '1') {
//            		s += '1';
            		s.append('1');
            	}
            	else if(rem == 1 && B.charAt(m) == '0') {
//            		s += '1';
            		s.append('1');
            		rem = 0;
            	}
            	else if(rem == 0 && B.charAt(m) == '0') {
//            		s += '0';
            		s.append('0');
            	}
            	m--;
        	}
        	if(rem == 1){
//        	    s += '1';
        		s.append('1');
        	}
        }
        
        String revStr = "";
        for(int i=s.length()-1;i>=0;i--) {
        	revStr += s.charAt(i);
        }
        
         System.out.println(revStr);
	}

}
