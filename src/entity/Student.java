package entity;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirthDay;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirthDay() {
        return dateOfBirthDay;
    }

    public void setDateOfBirthDay(LocalDate dateOfBirthDay) {
        this.dateOfBirthDay = dateOfBirthDay;
    }

    public Student(Long id, String firstName, String lastName, LocalDate dateOfBirthDay) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirthDay = dateOfBirthDay;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirthDay=" + dateOfBirthDay +
                '}';
    }
}
