package Length;

public class Length {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("H");
        System.out.println(sb);

        //first example
        //? append(String str)
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
