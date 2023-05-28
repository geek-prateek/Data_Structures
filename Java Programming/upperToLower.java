public class upperToLower {
    public static void main(String[] args) {
        String str1 = "Ganit";
        uppertolower(str1);
    }
    public static void uppertolower(String str){
        String newStr= "";
      char ans =0;
        for(int i=0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c>='A' && c<='Z'){
                ans = (char)(c-'A'+'a');
            }else if(c>='a' && c<='z'){
                ans = (char)(c-'a'+'A');

            }
            newStr += ans;


        }

        System.out.println(newStr);

    }
}