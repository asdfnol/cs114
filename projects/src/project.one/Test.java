package project.one;
public class Test {
    public static void main(String[] args) {
        String str = "hello";
        for ( int i = 0; i < str.length(); i++ ) {
            char l = 'l';
            if (str.charAt(i) == l) {
                System.out.print("erm ");
            }
        }
        System.out.println();
    }
}
