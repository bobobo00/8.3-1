package day11;

/**
 * @ClassName FirstChar
 * @Description TODO
 * @Auther danni
 * @Date 2019/8/3 22:19]
 * @Version 1.0
 **/

public class FirstChar {
    public char first (String s){
        for (int i = 0; i <s.length() ; i++) {
            char temp=s.charAt(i);
            for(int j=i+1;j<s.length();j++){
                if((temp^(s.charAt(j)))==0){
                    return temp;
                }
            }
        }
        return '0';
    }

    public static void main(String[] args) {
         String s="qywyer23tdd";
         FirstChar f=new FirstChar();
        System.out.println(f.first(s));
    }
}
