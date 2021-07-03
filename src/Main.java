import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       double pearPr=2.14,applePr=3.67, tomatoPr=1.11, bananaPr=0.95,eggplPr=5.0;
       double pear, apple, tomato, banana, eggpl, cost;
       Scanner s=new Scanner(System.in);

       System.out.print("How many kg of pears:");
       pear=s.nextDouble();

        System.out.print("How many kg of apples:");
        apple=s.nextDouble();

        System.out.print("How many kg of tomatoes:");
        tomato=s.nextDouble();

        System.out.print("How many kg of bananas:");
        banana=s.nextDouble();

        System.out.print("How many kg of eggplants:");
        eggpl=s.nextDouble();

        cost=(pearPr*pear)+(applePr*apple)+(tomatoPr*tomato)+(bananaPr*banana)+(eggplPr*eggpl);
        System.out.print("Total cost:"+cost+"₺");






    }
}
