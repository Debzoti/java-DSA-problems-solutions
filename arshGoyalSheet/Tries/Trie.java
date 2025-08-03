package arshGoyalSheet.Tries;

import java.util.HashMap;



class Trie {

      
    public class TrieNode{
        HashMap<Character,TrieNode> child ;
        boolean endOfWord;

        public TrieNode(){
            child = new HashMap<>();
            endOfWord= false;
        }
    }

    private TrieNode root; //common root
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
    }
    
    public boolean search(String word) {
        TrieNode curr = root;
        for (char ch : word.toCharArray()) {
            if (!curr.child.containsKey(ch)) {
                return false;
            }
            curr = curr.child.get(ch);
        }
        return curr.endOfWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for (char ch : prefix.toCharArray()) {
            if (!curr.child.containsKey(ch)) {
                return false;
            }
            curr = curr.child.get(ch);
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */