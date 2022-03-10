public class MyClass {
    public Integer maxOf3(int a, int b, int c){
        if(a < 0 || a > 200 || b < 0 || b > 200 || c < 0 || c > 200) return null;
        if(a > b)
        {
            if(a > c) return a;
            else return c;
        }
        else
        {
            if(b > c) return b;
            else return c;
        }
    }
}
