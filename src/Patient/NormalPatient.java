package Patient;
import java.time.LocalDate;

public class NormalPatient extends Patient {
    private String fee;

    public NormalPatient(int id, String code, String name, LocalDate timeIn, LocalDate timeOut, String description, String fee) {
        super(id, code, name, timeIn, timeOut, description);
        this.fee = fee;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fee: " + fee;
    }
}
