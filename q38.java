public class q38 {
    public static void main(String[] args) {
        double volume =1287;
        double pi=3.14;
    
        double r=10;
        double h= volume/ (pi* r*r);

        double surfacearea=2*pi*r*r+(r+h);
        System.out.println(h);
        System.out.println(surfacearea);

    }

}
