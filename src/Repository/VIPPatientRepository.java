package Repository;

import Patient.VIPPatient;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VIPPatientRepository implements IVIPPatientRepository {
    private final static List<VIPPatient> list;
    static {
        list = new ArrayList<>();
        VIPPatient p1 = new VIPPatient(1, "270699", "Hồng Sơn", LocalDate.parse("01-08-2024"),
                LocalDate.parse("09-08-2024"), "Đau đầu", "VIP III", LocalDate.parse("30-06-2018") );
        VIPPatient p2 = new VIPPatient(2, "999999", "Hải Dương", LocalDate.parse("05-09-2024"),
                LocalDate.parse("09-09-2024"), "Đau răng", "VIP II", LocalDate.parse("30-06-2018") );
        list.add(p1);
        list.add(p2);
    }

    @Override
    public List<VIPPatient> display() { return list;}

    @Override
    public void add(VIPPatient vipPatient) { list.add(vipPatient); }
}
