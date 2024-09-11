package Delete;

public class Delete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        sb.insert(2, 'n');
        System.out.println(sb);

        //?delete(start, end)
        sb.delete(2, 3);
        System.out.println(sb);
    }
}
