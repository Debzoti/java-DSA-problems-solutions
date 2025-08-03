package arshGoyalSheet.Tries;

import java.util.HashMap;


public class WordDictionary {
     
    public class TrieNode{
        HashMap<Character,TrieNode> child ;
        boolean endOfWord;

        public TrieNode(){
            child = new HashMap<>();
            endOfWord= false;
        }
    }

    private TrieNode root;
    
    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode curr = root;
        for (char ch : word.toCharArray()) {
            curr.child.putIfAbsent(ch, new TrieNode());
            curr = curr.child.get(ch);
        }
        curr.endOfWord=true;
    }
    
    public boolean search(String word) {
        // TrieNode curr = root;
        // for (char ch : word.toCharArray()) {
        //     if (!curr.child.containsKey(ch)) {
        //         return false;
        //     }
        //     curr = curr.child.get(ch);
        // }
        // return curr.endOfWord;

        //need to recurse to find the after part of dot 
        return dfs(word.toCharArray(),0,root);
    }

    private boolean dfs(char[] word, int index, TrieNode node){
        //base case
        if(index==word.length) return node.endOfWord;

        char ch = word[index];
        //search and handle . all possible 
        if(ch == '.'){
            for (TrieNode child : node.child.values()) {
                boolean isEndReached = dfs(word, index+1, child);
                if (isEndReached) {
                    return true;
                }
            }
            return false;
        }else{
            if (!node.child.containsKey(ch)) {
                return false;
            }
            node = node.child.get(ch);
            return dfs(word, index+1, node);
        }
    }
}
