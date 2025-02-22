/**
 *
 * @author Joseph Ayo
 * 2/22/2025
 * Project Assignment M10 - CSD 402
 * Program Function: A subclass for the Division superclass that contains fields for the state that the divison is located, the language spoken, and a constructor.*/
class DomesticDivision extends Division {
    private String state;

    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Domestic Division: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println("------------------------------");
    }
}
