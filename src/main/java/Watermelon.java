import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int weight = input.nextInt();
        if(solveWatermelon(weight) == 1) System.out.println("YES");
        else System.out.println("NO");
    }
    public static Integer solveWatermelon(int weight){
        if(weight < 1 || weight > 100) return null;
        else if(weight % 2 == 0 && weight > 2) return 1;
        else return 0;
    }
}
