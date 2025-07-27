import java.util.Scanner;
class Dmart{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter name of customer");
        String name= sc.next();
        System.out.println("Enter Gender of customer");
        String gender=sc.next();
        
        System.out.println("Enter item1 name");
        String item1=sc.next();
        System.out.println("Enter quantity of item 1");
        int q1=sc.nextInt();
        System.out.println("Enter price of item1");
        double price1=sc.nextDouble();
        double total1= q1*price1;
        double discount1=0;
        if(q1>4){
            discount1 =((5.0/100)*total1);

        }
        double final1= total1-discount1;

        System.out.println("Enter item2 name");
        String item2=sc.next();
        System.out.println("Enter quantity of item 2");
        int q2=sc.nextInt();
        System.out.println("Enter price of item2");
        double price2=sc.nextDouble();
        double total2= q2*price2;
        double final2= total2;

        System.out.println("Enter item3 name");
        String item3=sc.next();
        System.out.println("Enter quantity of item 3");
        int q3=sc.nextInt();
        System.out.println("Enter price of item3");
        double price3=sc.nextDouble();
        double total3= q3*price3;
        double final3= total3;

        System.out.println("Enter item4 name");
        String item4=sc.next();
        System.out.println("Enter quantity of item 4");
        int q4=sc.nextInt();
        System.out.println("Enter price of item4");
        double price4=sc.nextDouble();
        double total4= q4*price4;
        double final4= total4;

        System.out.println("Enter item5 name");
        String item5=sc.next();
        System.out.println("Enter quantity of item5");
        int q5=sc.nextInt();
        System.out.println("Enter price of item5");
        double price5=sc.nextDouble();
        double total5= q5*price5;
        double discount=0;
        double discount5=((10.0/100)*total5);
        double final5= total5-discount5;
        
        System.out.println("Enter item6 name");
        String item6=sc.next();
        System.out.println("Enter quantity of item 6");
        int q6=sc.nextInt();
        System.out.println("Enter price of item6");
        double price6=sc.nextDouble();
        double total6= q6*price6;
        double final6= total6;

        System.out.println("Enter item7 name");
        String item7=sc.next();
        System.out.println("Enter quantity of item 7");
        int q7=sc.nextInt();
        System.out.println("Enter price of item7");
        double price7=sc.nextDouble();
        double total7= q7*price7;
        double final7= total7;

        System.out.println("Enter item8 name");
        String item8=sc.next();
        System.out.println("Enter quantity of item 8");
        int q8=sc.nextInt();
        System.out.println("Enter price of item8");
        double price8=sc.nextDouble();
        double total8= q8*price8;
        double final8= total8;

        System.out.println("Enter item9 name");
        String item9=sc.next();
        System.out.println("Enter quantity of item 9");
        int q9=sc.nextInt();
        System.out.println("Enter price of item9");
        double price9=sc.nextDouble();
        double total9= q9*price9;
        double final9= total9;

        System.out.println("Enter item10 name");
        String item10=sc.next();
        System.out.println("Enter quantity of item 10");
        int q10=sc.nextInt();
        System.out.println("Enter price of item10");
        double price10=sc.nextDouble();
        double total10= q10*price10;
        double discount10=0;
        discount10=((15.0/100)*total10);
        double final10=total10-discount10;

        double actualtotal=total1+total2+total3+total4+total5+total6+total7+total8+total9+total10;

        double finalprice= final1+final2+final3+final4+final5+final6+final7+final8+final9+final10;

        double billdiscount=0;
        if(finalprice>10000){
            billdiscount=((15.0/100)*finalprice);

        }else if(finalprice>5000 && finalprice<10000)
        {
            billdiscount=((10.0/100)*finalprice);
        }
        
        double afterdiscount= finalprice-billdiscount;
        double gst=((10.0/100)/afterdiscount);

        System.out.println("Do you want a carry bag");
        String carry=sc.next();
        if(carry.equalsIgnoreCase("yes")){
            double aftercarrybag=gst+10+afterdiscount;

            System.out.println("After adding carrybag price "+aftercarrybag);
        }
        double finaltotal=gst+10+afterdiscount;

        System.out.println("Gender is:" +gender);
        if(gender.equalsIgnoreCase("female")){
            System.out.println("gift: Cadeberry");

        }else{
            System.out.println("gift: Ladger wallet");

        }
        System.out.println("enter the date");
        String Date = sc.next();
        System.out.println("                     D-mart");
        System.out.println("name: "+name+"                     Date: " +Date);
        System.out.println("----------------------------------------------------------");
        System.out.println("item   quantity   price1        totalprice  discount ");
        System.out.println(item1+ "    "+q1+"   "+price1+"    "+total1+"     "+final1);
        System.out.println(item2+"     "+q2+"   "+price2+"    "+total2+"     "+final2);
        System.out.println(item3+"     "+q3+"   "+price3+"    "+total3+"     "+final3);
        System.out.println(item4+"     "+q4+"   "+price4+"    "+total4+"     "+final4);
        System.out.println(item5+"     "+q5+"   "+price5+"    "+total5+"     "+final5);
        System.out.println(item6+"     "+q6+"   "+price1+"    "+total6+"     "+final6);
        System.out.println(item7+"     "+q7+"   "+price1+"    "+total7+"     "+final7);
        System.out.println(item8+"     "+q8+"   "+price1+"    "+total8+"     "+final8);
        System.out.println(item9+"     "+q9+"   "+price1+"    "+total9+"     "+final9);
        System.out.println(item10+"    "+q10+"  "+price1+"    "+total10+"    "+final10);

        System.out.println("total price is :" + actualtotal);
        System.out.println("after discount: " + finalprice);

        System.out.println("After gst"+gst);
        System.out.println("---------------------------------------------------------");
        System.out.println("final bill is "+finaltotal);
        System.out.println("Thankyou \n to visit \n D-mart");

            
    }
}
