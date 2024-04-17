package model;

public class Author {

    private String lastName;
    private String firstName;
    private String nationality;
    private int yearOfBirth;
    private int yearOfDeath;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setYearOfDeath(int yearOfDeath) {
        this.yearOfDeath = yearOfDeath;
    }

    @Override
    public String toString() {
        return "Author{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", yearOfDeath=" + yearOfDeath +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

}
