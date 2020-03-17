import java.util.*;
import java.util.ArrayList; // <- import!

/*
This problem was asked by Microsoft.

Given a 2D matrix of characters and a target word, write a function that returns whether the word can be found in the matrix by going left-to-right, or up-to-down.

For example, given the following matrix:

[['F', 'A', 'C', 'I'],
 ['O', 'B', 'Q', 'P'],
 ['A', 'N', 'O', 'B'],
 ['M', 'A', 'S', 'S']]
and the target word 'FOAM', you should return true, since it's the leftmost column. Similarly, given the target word 'MASS', you should return true, since it's the last row.
*/

class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Character> > board
                = new ArrayList<ArrayList<Character> >();

        String target1 = "FOAM";
        String target2 = "MASS";

        board.add(new ArrayList<Character>(Arrays.asList('F', 'A', 'C', 'I')));
        board.add(new ArrayList<Character>(Arrays.asList('O', 'B', 'Q', 'P')));
        board.add(new ArrayList<Character>(Arrays.asList('A', 'N', 'O', 'B')));
        board.add(new ArrayList<Character>(Arrays.asList('M', 'A', 'S', 'S')));

        if (isExist(board, target2))
        {
            System.out.println("Found!!");
        }
    }

    public static boolean compareArraylist(ArrayList<Character> boardword,ArrayList<Character> word)
    {
        if (boardword.equals(word))
            return true;

        return false;
    }

    public static void print (ArrayList<Character> word)
    {
        for (int i = 0; i < word.size(); i++)
        {
            System.out.print(word.get(i) + " ");
        }
        System.out.println();
    }

    public static boolean isExist (ArrayList< ArrayList<Character> > board, String word){
        ArrayList<Character> chars = new ArrayList<Character>();
        for (char c : word.toCharArray()) {
            chars.add(c);
        }

        // Search across
        for (int i = 0; i < chars.size(); i++)
        {
			print(board.get(i));
            if (compareArraylist(board.get(i), chars))
			{
                return true;
            }
        }

        // Search horizontal
        for (int i = 0; i < chars.size(); i++){
            ArrayList<Character> extractWord = new ArrayList<Character>();
            for(int j = 0; j < chars.size(); j++){
                extractWord.add(board.get(j).get(i));
            }
            print(extractWord);

            if (compareArraylist(extractWord, chars))
                return true;
        }

        return false;
    }
}