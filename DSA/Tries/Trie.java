package Tries;

public class Trie {
    static class Node{
        Node children[] = new Node[26];
        boolean endOfWord = false;
        public Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String word){  //O(L)
        Node curr = root;
        for(int level =0; level<word.length(); level++){
            int idx = word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.endOfWord=true;
    }
    public static boolean search(String key){ //O(L)
        Node curr = root;
        for(int level = 0; level < key.length(); level++){
            int idx = key.charAt(level)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.endOfWord == true;
    }
    public static boolean wordBreak(String key){  //O(L)
        if(key.length()==0){
            return true;
        }
        for(int i=1; i<=key.length(); i++){  //substring(0,1)
            if(search(key.substring(0,i)) && wordBreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String words[] = {"the","a","there","their","any","thee"};
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
        System.out.println(search("thee"));
        System.out.println(search("thor"));

        //word break problem
        String key = "theanythee";
        System.out.println("Word Break : "+wordBreak(key));
    }
}
