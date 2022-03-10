import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

public class YoungPhysicistTest {

    @Test
    public void solveYoungPhysicist() {
        ArrayList<Integer[]> arrayList = new ArrayList<>();

        arrayList.add(new Integer[]{-2, 4, -1});
        arrayList.add(new Integer[]{1, -5, -3});
        arrayList.add(new Integer[]{4, 1, 7});
        assertTrue(YoungPhysicist.solveYoungPhysicist(arrayList) == 0);
        arrayList.clear();

        arrayList.add(new Integer[]{3, -1, 7});
        arrayList.add(new Integer[]{-5, 2, -4});
        arrayList.add(new Integer[]{2, -1, -3});
        assertTrue(YoungPhysicist.solveYoungPhysicist(arrayList) == 1);
        arrayList.clear();

        arrayList.add(new Integer[]{3, -1, 7});
        arrayList.add(new Integer[]{-5, 2, -4});
        arrayList.add(new Integer[]{2, -1, -3});
        assertTrue(YoungPhysicist.solveYoungPhysicist(arrayList) == 1);
    }
}