import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidSudokuTest {
    @Test
    public void testValidSudokuBoard(){
        String [][] input = {{"5","3",".",".","7",".",".","."},{"6",".",".","1","9","5",".",".","."},{".","9","8",".",".",".",".","6","."},
                {"8",".",".",".","6",".",".",".","3"},{"4",".",".","8",".","3",".",".","1"},{"7",".",".",".","2",".",".",".","6"},
                {".","6",".",".",".",".","2","8","."},{".",".",".","4","1","9",".","6","."}};
        boolean isValidSudokuBoard = ValidSudoku.isValidBoard(input);
        assertTrue(isValidSudokuBoard);

    }

}