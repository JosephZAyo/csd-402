/**
 *
 * @author Joseph Ayo
 * 2/22/2025
 * Project Assignment M10 - CSD 402
 * Program Function: An abstract class that contains fields for a company's division name and account number. */
abstract class Division {
    protected String divisionName;
    protected int accountNumber;

    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public abstract void display();
}
