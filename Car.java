public class Car {

    private final int drawLength = 20;

    private double totalDistance; // km
    private double speed; // km/h
    private double time; // h


    Car(double dis, double speed, double time){
        this.totalDistance = dis;
        this.speed = speed;
        this.time = time;
    }

    double getDistanceTraveled(){
        return this.speed * this.time;
    }

    void printDistanceTraveled(){
        System.out.println("Distance traveled: " + this.getDistanceTraveled() + " km");
    }

    void draw(){

        if (this.totalDistance <= 0 ){
            System.out.println("ERROR");
            return;
        }

        double distancePerStep = this.totalDistance / this.drawLength;
        double traveledStep = (int)(this.getDistanceTraveled() / distancePerStep);

        if (traveledStep > this.drawLength) { traveledStep = this.drawLength; }

        String res = "0 km |";

        for (int i = 0; i < traveledStep; i++){ res += "-"; }

        res += ">";

        for (int i = 0; i < this.drawLength - traveledStep; i++){ res += "-"; }

        res += "| " + this.totalDistance + " km";

        System.out.println(res);

    }




}
