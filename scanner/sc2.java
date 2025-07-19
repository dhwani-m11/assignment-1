import java.util.Scanner;
class sc2 {
    public static void main(String[]args){
    Scanner sc= new Scanner (System.in);
    System.out.println("enter the value....");
    int n= sc.nextInt();
    String S = n%2==0 ? "EVEN" : "ODD";
    System.out.println(S);
    }
}
