class Patient {
    // Private fields to for data privacy
    private String name;
    private int age;
    private String occupation;
    private String familyHistory;
    private String diseases;
    private String traumaticExperiences;
    private String mentalHealth;

    // Constructor
    Patient(String name, int age, String occupation, String familyHistory, String diseases, String traumaticExperiences, String mentalHealth) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.familyHistory = familyHistory;
        this.diseases = diseases;
        this.traumaticExperiences = traumaticExperiences;
        this.mentalHealth = mentalHealth;
    }

    // Displaying Patient Information (Controlled Access)
    public void displayPatientInfo() {
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Occupation: " + occupation);
        System.out.println("Family History: " + familyHistory);
        System.out.println("Diseases: " + diseases);
        System.out.println("Traumatic Experiences: " + traumaticExperiences);
        System.out.println("Mental Health Status: " + mentalHealth);
    }
}

public class MindSpring {
    public static void main(String[] args) {
        // Creating Patient Objects
        Patient patient1 = new Patient("CR Muhit", 22, "Youtuber", "No family history", "AIDS", "Car accident", "Anxiety");
        Patient patient2 = new Patient("CR Shahed", 22, "Engineer", "No family history", "Nigga", "Bullying", "PTSD");

        //Printing Patient Details
        patient1.displayPatientInfo();
        System.out.println();
        patient2.displayPatientInfo();
    }
}
