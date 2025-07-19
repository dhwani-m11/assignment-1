public class q43 {
    public static void main(String[] args) {
        
        double height=4;
        double h2=5;
        double rate=10;
        double pi=3.14;
        double radius=Math.sqrt(h2*h2-height*height);
        double barea=pi*radius*radius;
        double cost =barea*rate;
        System.out.println(radius);
        System.out.println(barea);
        System.out.println(cost); 
    
    }
}
