package Insert;

public class Insert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //?  insert(offset, datatypes)
       // sb.insert(0, 'S');
       // System.out.println(sb);

        //second example
        sb.insert(2, 'n');
        System.out.println(sb);
    }
}
