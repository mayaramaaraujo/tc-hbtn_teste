import java.util.Calendar;

public class Person {
    private String name;
    private String surname;
    private int birthDate;
    private boolean anotherCompanyOwner;
    private boolean Pensioner;
    private boolean PublicServer;
    private float salary;

    public Person(String name, String surname, int birthDate, boolean anotherCompanyOwner, boolean pensioner, boolean publicServer) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.anotherCompanyOwner = anotherCompanyOwner;
        Pensioner = pensioner;
        PublicServer = publicServer;
        this.salary = salary;
    }

    public String fullName(){
        return name + " " + surname;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float calculateYearlySalary() {
        return salary * 12;
    }

    public boolean isMEI() {
        if(calculateYearlySalary() < 130000 && calculateAge() >= 18) {
            return anotherCompanyOwner == false && Pensioner == false && PublicServer == false;
        }

        return false;
    }

    public int calculateAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - birthDate;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public void setPensioner(boolean pensioner) {
        Pensioner = pensioner;
    }

    public void setPublicServer(boolean publicServer) {
        PublicServer = publicServer;
    }
}
