class Solution {
    public boolean isvowel(char ch)
        {
            return ch =='a'|| ch =='e'||ch =='i'||ch =='o'||ch =='u'||ch =='A'|| ch =='E'||ch =='I'||ch =='O'||ch =='U';
        }
    public String reverseVowels(String s) {
        
        char [] arr = s.toCharArray();
        int left = 0,right = arr.length - 1;
        while(left < right)
        {
            while(left < right && !isvowel(arr[left]))
            {
                left++;
            }
            while(left < right && !isvowel(arr[right]))
            {
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}