package gr.aueb.cf.springhello5ult.dto;

public class StudentInsertDTO {
    private String firstname;
    private String lastname;


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
