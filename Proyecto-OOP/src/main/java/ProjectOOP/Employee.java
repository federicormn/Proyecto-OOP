package ProjectOOP;

public class Employee {
    private String name;
    private String lastname;
    private int id;
    private int phoneNumber;
    private String seniority;


    public Employee(int id, String name, String lastname, int phoneNumber, String seniority) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.seniority = seniority;
    }


    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSeniority() {
        return seniority;
    }

    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }

}
