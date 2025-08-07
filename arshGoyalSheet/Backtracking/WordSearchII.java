package arshGoyalSheet.Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import arshGoyalSheet.Tries.Trie.TrieNode;


public class WordSearchII {
    
    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        
        //build the trie
        Trie trie = new Trie();
        for (String string : words) {
            trie.insert(string);
        }
        
        //start checkig the board
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                //check if root has children same as r and c letter
                if (trie.root.child.containsKey(board[row][col])) {
                    dfs(board, row, col, trie.root, res);
                }
            }
        }
        return res;
    }
    
    
    
    //dfs function
    public static void dfs(char[][] board,int row, int col, TrieNode node ,List<String> res ){
        
        char letter = board[row][col];

        //thingscan go wrong

        //if not valid index
        if (!isValid(row, col, board)) {
            return;
        }
        //if letter not in node,children
        if (!node.child.containsKey(letter)) {
            return;
        }


        //what to do 
        TrieNode curr = node.child.get(letter); //getting letter in the node 
        //find the letter in the node if found end them add word add it to res if its the last
        if(curr.word!=null && curr.endOfWord){
            res.add(curr.word);
            curr.word = null; // to avoid duplicates in res ro rechanged it
        }

        //mark this visited
        board[row][col] = '#';

        //make movements up down righth left 

         // Explore all 4 directions
            dfs(board, row + 1, col, curr, res); // down
            dfs(board, row - 1, col, curr, res); // up
            dfs(board, row, col + 1, curr, res); // right
            dfs(board, row, col - 1, curr, res); // left

            //backtrack
            board[row][col] = letter;


    }
    

    //isvalid
    static boolean isValid(int row, int col,char[][] board){
        if (row>=0 && row<board.length && col>=0 && col<board[0].length && board[row][col]!='#') {
            return true;
        }
        return false;
    }
    //trie functions and defunations 
    
    class TrieNode{
       HashMap<Character,TrieNode> child ;
       boolean endOfWord;
       String word ;

       public TrieNode(){
           child = new HashMap<>();
           endOfWord= false;
           word = null; //to get word and add to res direct;y to res
       }
   }
    class Trie{
        TrieNode root ; //common root
   
       public Trie() {
           root = new TrieNode();
       }
       
      
       
       public void insert(String word) {
           TrieNode curr = root;
           for (char ch : word.toCharArray()) {
               curr.child.putIfAbsent(ch, new TrieNode());
               curr = curr.child.get(ch);
           }
           curr.endOfWord=true;
           curr.word = word; //setting to word
       }
   }
}
