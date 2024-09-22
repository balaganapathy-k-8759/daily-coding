public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            for(int j = 0; j<9; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                if (!isValidCharacter(board,i,j)){
                    return false;
                }
            }
        }
        return true;
    }
    private static boolean isValidCharacter(char[][] board, int pos1, int pos2){
        char toCheck = board[pos1][pos2];

        //check vertical
        for(int i = 0,j = pos2; i<9; i++){
            if(pos1 == i){
                continue;
            }
            if(toCheck == board[i][j]){
                return false;
            }
        }
        //check horizontal
        for(int i = pos1,j = 0; j<9; j++){
            if(pos2 == j){
                continue;
            }
            if(toCheck == board[i][j]){
                return false;
            }
        }
        //check 3x3
        //5,8 = 3,6
        int starti = pos1 - (pos1 % 3) ;
        int startj = pos2 - (pos2 % 3);

        for(int i=starti; i<starti+3 ;i++){
            for(int j=startj; j<startj+3; j++){
                if(pos1 == i && pos2 == j){
                    continue;
                }
                if(toCheck == board[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
