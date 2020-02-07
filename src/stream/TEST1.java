package stream;

public class TEST1 {
    public static void main(String[] args) {
        int a = 0;

        if(true) {
            int b = 0;
            for (int c = 0; c < 5; c++) {
                System.out.println("c= "+c);
            }
            System.out.println("c= "+ c);
        }
        System.out.println("c= "+ b);
    }
}
