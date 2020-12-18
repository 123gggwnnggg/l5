import java.util.Scanner;


public class L5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double dis = sc.nextDouble();
        double speed = sc.nextDouble();
        double time = sc.nextDouble();

        Car c = new Car(dis, speed, time);
        c.printDistanceTraveled();
        c.draw();
    }
}
