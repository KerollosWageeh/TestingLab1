import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;


public class MyClassTest {

    @Test
    public void maxOf3() {
        int arr[] = {-1, 0, 1, 100, 150, 200, 300};
        MyClass myClass = new MyClass();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                for (int k = 0; k < 7; k++) {

                    if(arr[i] >= 0 && arr[i] <= 200 && arr[j] >= 0 && arr[j] <= 200 && arr[k] >= 0 && arr[k] <= 200)
                        assertTrue(myClass.maxOf3(arr[i], arr[j], arr[k]) == Math.max(Math.max(arr[i], arr[j]), arr[k]));
                    else
                        assertTrue(myClass.maxOf3(arr[i], arr[j], arr[k]) == null);

                }
            }
        }

        assertEquals(myClass.maxOf3(1,2,3), (Integer) 3);
    }
}