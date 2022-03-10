import java.util.ArrayList;
import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, z, n;
        n = input.nextInt();
        ArrayList<Integer[]> arrayList = new ArrayList<>();
        while(n-- > 0)
        {
            x = input.nextInt();
            y = input.nextInt();
            z = input.nextInt();
            arrayList.add(new Integer[]{x, y, z});
        }
        if(solveYoungPhysicist(arrayList) == 1) System.out.println("YES");
        else System.out.println("NO");
    }
    public static Integer solveYoungPhysicist(ArrayList<Integer[]> arrayList){

        int x = 0, y = 0, z = 0;
        for (Integer[] integers : arrayList) {
            x += integers[0];
            y += integers[1];
            z += integers[2];
            //if(x )
        }
        if(x == 0 && y == 0 && z == 0) return 1;
        return 0;

    }
}
