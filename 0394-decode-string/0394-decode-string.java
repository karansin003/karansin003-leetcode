import java.util.Stack;

class Solution {

    public String decodeString(String s) {

        Stack<Integer> counts = new Stack<>();
        Stack<String> words = new Stack<>();

        String current = "";

        int number = 0;
        for(char ch : s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                number = number * 10 +(ch -'0');
            }

            else if(ch == '[')
            {
                counts.push(number);
                words.push(current);
                number = 0;
                current = "";
            }
            
            else if(ch == ']')
            {
                int repeat = counts.pop();
                String prev = words.pop();
                String temp="";
                for( int i = 0; i < repeat;i++)
                {
                    temp += current;
                }
                current = prev+temp;
            }
            else 
            {
                current+=ch;
            }
        }
            return  current;
        }
}