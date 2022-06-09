import java.util.*;

class ValidParenthsis {
    
    public boolean isValid(String s) {
        
        Stack stack = new Stack();
        Map<Character, Character> staticMap = new HashMap<>();
        
        staticMap.put('(', ')');
        staticMap.put('{', '}');
        staticMap.put('[', ']');
        
        
        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(staticMap.get(s.charAt(i)));
            } else if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}'){
                if (stack.isEmpty()) {
                    return false;
                } else if (!stack.pop().equals(s.charAt(i))) {
                    return false;
                }
            }
        }
        
        if (stack.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}
