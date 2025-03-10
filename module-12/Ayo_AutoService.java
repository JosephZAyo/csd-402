public class AutoService {
    // Standard service charge
    private static final double STANDARD_SERVICE = 300.0;

    // Method with no parameters
    public static double yearlyService() {
        return STANDARD_SERVICE;
    }

    // Method with one parameter 
    public static double yearlyService(double oilChangeFee) {
        return STANDARD_SERVICE + oilChangeFee;
    }

    // Method with two parameters
    public static double yearlyService(double oilChangeFee, double tireRotationFee) {
        return STANDARD_SERVICE + oilChangeFee + tireRotationFee;
    }

    // Method with three parameters
    public static double yearlyService(double oilChangeFee, double tireRotationFee, double couponAmount) {
        return (STANDARD_SERVICE + oilChangeFee + tireRotationFee) - couponAmount;
    }

    public static void main(String[] args) {
        // Method Testing; Two iterations
        System.out.println("Standard Service Cost: $" + yearlyService());
        System.out.println("Standard Service Cost: $" + yearlyService());

        System.out.println("Service with Oil Change: $" + yearlyService(30.0));
        System.out.println("Service with Oil Change: $" + yearlyService(40.0));

        System.out.println("Service with Oil Change and Tire Rotation: $" + yearlyService(30.0, 20.0));
        System.out.println("Service with Oil Change and Tire Rotation: $" + yearlyService(50.0, 25.0));

        System.out.println("Service with Oil Change, Tire Rotation, and Coupon: $" + yearlyService(30.0, 20.0, 15.0));
        System.out.println("Service with Oil Change, Tire Rotation, and Coupon: $" + yearlyService(40.0, 25.0, 20.0));
    }
}
