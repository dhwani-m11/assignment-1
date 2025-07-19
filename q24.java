public class q24 {
    public static void main(String[] args) {
        double l1 = 25f;
        double wide=10f;
        double h=7.5f;
        double l2=20*100;
        double high =2*100;
        double thick= 0.75 * 100 ;
        double  vol1=l1*wide*h;
         double vol2 = l2*high*thick;
         double n;
         n= (vol2 / vol1);
         double cost;
         cost=9000;
         double total;
         total =(n/1000)*cost;
         System.out.println(n);
         System.out.println(total);




    

    }
}
