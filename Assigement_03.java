import java.util.Scanner;
class Cab {
    int fare;
    int d;
    Cab() {        
        fare = 30;

 
    }
}
class RidCab {
    public static void main(String[] args){
    int cd; //distance of cab from user
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the cab distance from user: ");
    cd = sc.nextInt();
    if(cd > 5) {
        Cab ob = new Cab(30 + (cd-5) * 10);
        System.out.print("Enter the distance tarvel: ");
        ob.d=sc.nextInt();


        ob.fare += 10 * ob.d;
        System.out.println("Total Fare:Rs "+ ob.fare);
       
    }


    else {
        Cab ob = new Cab();
        System.out.print("Enter the distance tarvel: ");
        ob.d=sc.nextInt();


        ob.fare += 10*ob.d;
        System.out.println("Total Fare:Rs "+ ob.fare);
        
        Cab ob2 = new Cab(ob);
        System.out.println("Data ob2: " +ob2.fare);
    }
    }
}