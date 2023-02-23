import java.util.Scanner;
import java.util.ArrayList;

public class welcome {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String n = k.next();
        System.out.println("Welcome " + n);
        int exit = 1;
        while (exit != 3) {
            System.out.println("-----------------------------");
            System.out.println("Please choice");
            System.out.println("1-self development");
            System.out.println("2-free time");
            System.out.println("3-exit");
            int select1 = k.nextInt();
            if (select1 == 1) {
                System.out.println("Welcome " + n + " in the self development ");
                System.out.println("Please choice ");
                System.out.println("1-physice health");
                System.out.println("2-intellectual heath");
                int select2 = k.nextInt();
                if (select2 == 1) {
                    System.out.println("Please enter your informatin ");
                    System.out.println("Enter your age: ");
                    int a1 = k.nextInt();
                    System.out.println("Enter your weight: ");
                    double w1 = k.nextDouble();
                    System.out.println("Enter your length in meter: ");
                    double e1 = k.nextDouble();
                    physice_health p1 = new physice_health(w1, e1, a1);
                    p1.calculateBMI();
                    System.out.println(p1.type());

                } else if (select2 == 2) {
                    String bok = "", gam = "";
                    System.out.println("Please enter your informatin ");
                    System.out.println("Enter your age: ");
                    int a1 = k.nextInt();
                    System.out.println("Enter your weight: ");
                    double w1 = k.nextDouble();
                    System.out.println("Enter your length in meter: ");
                    double e1 = k.nextDouble();
                    System.out.println("Do you like reading books or playing games? ");
                    System.out.println("Enter R for reading or B for Book G for Games");
                    char s = k.next().charAt(0);
                    if (s == 'B' || s == 'b') {
                        System.out.println("Enter title of book: ");
                        bok = k.next();

                    } else if (s == 'G' || s== 'g') {
                        System.out.println("Enter name of game: ");
                        gam = k.next();

                    }
                    intellectual_heath int1 = new intellectual_heath(bok, gam, w1, e1, a1);

                    
                } 

            } else if (select1 == 2) {
                FreeTime free = new FreeTime();
                System.out.println("Welcome in free time");
                System.out.println("We have documentaries and comedy Movies ");
                System.out.println("Enter number of documentaries: ");
                int dc1 = k.nextInt();
                for (int i = 0; i < dc1; i++) {
                    System.out.println("Enter title: ");
                    String s1 = k.next();
                    free.adddocumentaries(s1);
                }
                System.out.println("Enter number of comedy: ");
                int dc2 = k.nextInt();
                for (int i = 0; i < dc2; i++) {
                    System.out.println("Enter title: ");
                    String s2 = k.next();
                    free.addcomedyMovies(s2);
                }
                System.out.println("The documentaries");
                System.out.println(free.docveiw());
                System.out.println("The comedy moveies");
                System.out.println(free.comveiw());
            } else if (select1 == 3)
                exit = 3;
            
            else {
                    System.out.println("Error choice");
                }
        }
    }

}
