package charAtsetCharAt;

public class charAtsetCharAt {

     public static void main(String[] args) {
        //! StringBuilder syntax
        //? StringBuilder StringBuilderName = new StringBuilder
        StringBuilder sb = new StringBuilder("Kaushik");
        System.out.println(sb);
        
        //? charAt(index)
        System.out.println(sb.charAt(0));

        //? setCharAt(index, char)
         sb.setCharAt(0, 'k');
         System.out.println(sb);
     }
}