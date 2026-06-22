class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int i = 0;i < board.length;i++)
        {
            for(int j = 0 ; j < board.length;j++)
            {
                char ch = board[i][j];
                if(ch == '.')
                {
                    continue;
                }

                String row = ch + "row" + i;
                String col =  ch + "col" + j;
                String box = ch + "box" + (i/3) + "_" + (j/3);
                if(set.contains(row)||set.contains(col)|| set.contains(box))
                {
                    return false;
                }
                set.add(row);
                set.add(col);
                set.add(box);

            }
        }
        return true;
    }
}