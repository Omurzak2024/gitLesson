package entity;

import java.time.LocalDate;

public class University {
    private Long id;
    private String name;
    private  String address;
    private LocalDate startDate;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public University(Long id, String name, String address, LocalDate startDate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}
