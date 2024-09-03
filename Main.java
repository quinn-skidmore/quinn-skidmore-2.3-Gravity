public class Main{
    public static void main(String[] args){
        double initialVelocity = 1;
        double fallingTime = 1;
        double initialPosition = 1;

        double finalPosition = GravityCalculator.calculateFinalPosition(-9.8, initialVelocity, fallingTime, initialPosition);
        System.out.println("After " + fallingTime + " seconds, the final position is " + finalPosition);
    }
}