public class Fan {
    // Constants for fan speed
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor that sets default values
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    // Constructor with arguments to set custom values
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter and setter methods
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method to return the fan's state
    @Override
    public String toString() {
        String state = (on ? "on" : "off");
        String speedDescription = "";
        switch (speed) {
            case STOPPED:
                speedDescription = "STOPPED";
                break;
            case SLOW:
                speedDescription = "SLOW";
                break;
            case MEDIUM:
                speedDescription = "MEDIUM";
                break;
            case FAST:
                speedDescription = "FAST";
                break;
        }
        return "Fan [Speed=" + speedDescription + ", State=" + state + ", Radius=" + radius + ", Color=" + color + "]";
    }
}