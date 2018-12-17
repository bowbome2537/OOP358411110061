package Lab3;
import java.util.Scanner;


public class ex2 {
    public static void main(String[] args) {

        String name;
        Scanner sc = new Scanner(System.in);
        Scanner tt = new Scanner(System.in);

        System.out.print("What is your nickname? : ");

        name = sc.nextLine();

        System.out.println("Hello,"+name);
//age
        System.out.print("อายุเท่าไร? : ");
        int age = tt.nextInt();
        System.out.println("ฉันอายุ "+age+ " ปี ");

//เพศ
        System.out.print("คุณเพศอะไร? : ");
        String a = sc.nextLine();
        System.out.println("ฉันเพศ "+a+ "  ");

        //ที่อยู่
        System.out.print("คุณอยู่ที่ไหน? : ");
        String add = sc.nextLine();
        System.out.println("ฉันอยู่ที่ "+add+ "  ");

        //  เบอร์โทร
        System.out.print("คุณเบอร์โทรอะไร? : ");
        String phen = sc.nextLine();
        System.out.println("เบอร์โทร. "+phen+ "  ");

    }//main
}//class
