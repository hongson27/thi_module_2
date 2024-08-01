package Patient;

import java.time.LocalDate;

public abstract class Patient {
    private int id;
    private String code;
    private String name;
    private LocalDate timeIn;
    private LocalDate timeOut;
    private String description;

    public Patient(int id, String code, String name, LocalDate timeIn, LocalDate timeOut, String description) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(LocalDate timeIn) {
        this.timeIn = timeIn;
    }

    public LocalDate getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(LocalDate timeOut) {
        this.timeOut = timeOut;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", timeIn=" + timeIn +
                ", timeOut=" + timeOut +
                ", description='" + description + '\'' +
                '}';
    }
}
