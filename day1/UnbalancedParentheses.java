import java.util.*;

public class UnbalancedParentheses {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        Stack<Integer> stack=new Stack<>();
        Set<Integer> removeInd=new HashSet<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stack.push(i);
            }else if(ch==')'){
                if(!stack.isEmpty() ){
                    stack.pop();
                }else{
                    removeInd.add(i);
                }
            }
        }
        while(!stack.isEmpty()){
            removeInd.add(stack.pop());
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!removeInd.contains(i)){
                ans.append(s.charAt(i));
            }
        }
        System.out.println(ans.toString());
        sc.close();
    }
}
