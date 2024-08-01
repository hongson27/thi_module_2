package Service;

import Patient.VIPPatient;

import java.util.List;

public interface IServiceVIPPatient {
    void add(VIPPatient patient);
    List<VIPPatient> display();
}
