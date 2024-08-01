package Patient;

import java.time.LocalDate;

public class VIPPatient extends Patient {
    private String vipType;
    private LocalDate vipDate;

    public VIPPatient(int id, String code, String name, LocalDate timeIn, LocalDate timeOut, String description, String vipType, LocalDate vipDate) {
        super(id, code, name, timeIn, timeOut, description);
        this.vipType = vipType;
        this.vipDate = vipDate;
    }

    public String getVipType() {
        return vipType;
    }

    public void setVipType(String vipType) {
        this.vipType = vipType;
    }

    public LocalDate getVipDate() {
        return vipDate;
    }

    public void setVipDate(LocalDate vipDate) {
        this.vipDate = vipDate;
    }

    @Override
    public String toString() {
        return super.toString() + "\nVIP Type: " + vipType + "\nVIP Date: " + vipDate;
    }
}
