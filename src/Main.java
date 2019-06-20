import java.util.Scanner;

public class Main {

    //[0,0,0,1,0,0,0]
    //[0,0,1,1,1,0,0]
    //[0,1,2,3,2,1,0]
    //[1,3,6,7,6,3,1]

    public static void initial_recursion(int i)
    {
        while(i>=0) {
            System.out.print(" 1 ");
            i--;
            initial_recursion(i);
        }
    }

    public static void recursion(int i)
    {
        while(i>=0) {
            System.out.print(" 1 ");
            i--;
            recursion(i);
        }
    }

    public static void main(String[] args) {

        int depth;
        int length;

        System.out.println("Trinomial Triangle");

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a Triangle Depth: ");
        depth = in.nextInt();
        length = depth*2 -1;

        initial_recursion(length);
        recursion(length);
    }
}
