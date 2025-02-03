public class Main {
    public static void main(String[] args) {
        // Create a fan using the default constructor
        Fan fan1 = new Fan();
        
        // Create a fan using the argument constructor
        Fan fan2 = new Fan(Fan.MEDIUM, true, 8.0, "blue");
        
        // Display the initial state of both fans
        System.out.println("Fan 1 (default constructor): " + fan1);
        System.out.println("Fan 2 (argument constructor): " + fan2);
        
        // Change some attributes of fan1
        fan1.setSpeed(Fan.FAST);
        fan1.setOn(true);
        fan1.setRadius(10.0);
        fan1.setColor("green");
        
        // Display the updated state of fan1
        System.out.println("\nUpdated Fan 1: " + fan1);
        
        // Change some attributes of fan2
        fan2.setSpeed(Fan.SLOW);
        fan2.setOn(false);
        fan2.setRadius(7.0);
        fan2.setColor("red");
        
        // Display the updated state of fan2
        System.out.println("\nUpdated Fan 2: " + fan2);
    }
}
