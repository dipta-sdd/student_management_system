
public class b extends NewClass{
    @Override
    void addition(int a,int b,int c,int d){
        System.out.println((a+b)*(c-d));
        super.addition(a, b, c, d);
    }
    public static void main(String[] args) {
        b obj=new b();
        obj.addition(2,3,4,5);
    }
}
