/**
 *
 * @author Joseph Ayo
 * 2/22/2025
 * Project Assignment M10 - CSD 402
 * Program Function: An application that creates two instances of each concrete class (InternationalDivision + DomesticDivision)*/
public class UseDivision {
    public static void main(String[] args) {
        // Instances of InternationalDivision
        InternationalDivision intDiv1 = new InternationalDivision("Volkswagon", 1031, "Germany", "German");
        InternationalDivision intDiv2 = new InternationalDivision("Toyota", 1452, "Japan", "Japanese");

        // Instances of DomesticDivision
        DomesticDivision domDiv1 = new DomesticDivision("Ford", 2201, "Michigan");
        DomesticDivision domDiv2 = new DomesticDivision("Jeep", 2804, "Ohio");

        // Displaying the division details
        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
