/**
 *
 * @author Joseph Ayo
 * 2/22/2025
 * Project Assignment M10 - CSD 402
 * Program Function: A subclass for the Division superclass that contains fields for the country that the division is located in, the language spoken there, and a constructor. */
class InternationalDivision extends Division {
    private String country;
    private String language;

    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("International Division: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println("------------------------------");
    }
}
