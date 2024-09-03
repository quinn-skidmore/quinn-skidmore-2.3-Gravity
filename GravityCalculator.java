public class GravityCalculator{
    public GravityCalculator(){}

    public static double calculateFinalPosition(double gravity, double initialVelocity, double fallingTime, double initialPosition){
        double y = 0.5 * gravity * (Math.pow(fallingTime, 2)) + initialVelocity * fallingTime + initialPosition;
        return y;
    }
}