package Repository;

import Patient.VIPPatient;

import java.util.List;

public interface IVIPPatientRepository {
    void add(VIPPatient vipPatient);
    List<VIPPatient> display();
}
