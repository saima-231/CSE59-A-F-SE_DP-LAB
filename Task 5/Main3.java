class Patient {
    private String patientName;
    private String nationId;

    public Patient(String patientName, String nationId) {
        this.patientName = patientName;
        this.nationId = nationId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getNationId() {
        return nationId;
    }
}

class IdValidator {
    public boolean validate(String nationId) {
        return nationId.length() == 10 || nationId.length() == 17;
    }
}

class SmsService {
    public void sendConfirmation(Patient patient, IdValidator validator) {
        if (validator.validate(patient.getNationId())) {
            System.out.println("Sending SMS to " + patient.getPatientName() + ": Registration successful.");
        } else {
            System.out.println("Invalid National ID.");
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        Patient patient = new Patient("Rahim", "1234567890");
        IdValidator validator = new IdValidator();
        SmsService smsService = new SmsService();
        smsService.sendConfirmation(patient, validator);
    }
}

