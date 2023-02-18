package Strings;

public class UpperCaseToLowerCase {
    public static void main(String[] args){
        String st = "WelCome TO MY WorlD";
        uppercaseTolowercase(st);
    }

    public static void uppercaseTolowercase(String st){
        char[] ch = st.toCharArray();

        for(int i=0; i< ch.length; i++){
            char s = ch[i];
            if(s>='A' && s<='Z'){
                char ans = (char)(s-'A'+'a');
                ch[i] = ans;
            }
        }
        for(char s : ch){
            System.out.print(s);
        }

    }
}
