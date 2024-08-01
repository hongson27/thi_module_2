package Service;

import Repository.IVIPPatientRepository;
import Repository.VIPPatientRepository;
import Patient.VIPPatient;

import java.util.List;

public class ServiceVIPPatient implements IServiceVIPPatient {
    private IVIPPatientRepository iVipPatientRepository = new VIPPatientRepository();

    @Override
    public void add(VIPPatient vipPatient) { iVipPatientRepository.add(vipPatient); }

    @Override
    List<VIPPatient> display() { return iVipPatientRepository.display();}}
