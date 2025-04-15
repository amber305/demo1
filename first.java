// package myfirst;

import java.util.*;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while(testcase>0){
            // int sta = sc.nextInt();
            String brac = sc.next();
            Stack<Character> st = new Stack<>();

            for(int i = 0; i<brac.length(); i++){
                char ch = brac.charAt(i);
                if(ch=='('){
                    st.push('(');
                }else if(!st.isEmpty()){
                    st.pop();
                }
                
            }
            testcase--;
            System.out.println(st.size());
            

        }
    }

   
}
