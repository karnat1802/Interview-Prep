/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
class Solution {
    public NestedInteger deserialize(String s) {
        if(s.isEmpty())
            return null;
        if(s.charAt(0)!='[')
            return new NestedInteger(Integer.valueOf(s));
        Stack<NestedInteger> stack = new Stack<NestedInteger>();
        NestedInteger curr = null;
        int index=0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='[')
            {
                if(curr!=null){
                    stack.push(curr);
                }
                curr = new NestedInteger();
                index = i + 1;
            }
            else if(ch==']')
            {
                String num = s.substring(index,i);
                if(!num.isEmpty())
                {
                    curr.add(new NestedInteger(Integer.valueOf(num)));
                }
                if(!stack.isEmpty()){
                    NestedInteger pop = stack.pop();
                    pop.add(curr);
                    curr = pop;
                }
                index = i +1 ;
            }
            else if(ch==',')
            {
                if(s.charAt(i-1)!=']')
                {
                    String num = s.substring(index,i);
                    curr.add(new NestedInteger(Integer.valueOf(num)));
                }
                index = i + 1;    
            }
        }
            
        return curr;
        
    }
}