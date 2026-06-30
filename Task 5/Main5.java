class UniversityMember {
    public void attendLecture() {
        System.out.println("Attending a lecture.");
    }
}

interface Researcher {
    void conductLabResearch();
}

class UndergraduateStudent extends UniversityMember {
    // No research responsibility
}

class GraduateResearchAssistant extends UniversityMember implements Researcher {
    @Override
    public void conductLabResearch() {
        System.out.println("Running experiments and publishing papers.");
    }
}

class Professor extends UniversityMember implements Researcher {
    @Override
    public void conductLabResearch() {
        System.out.println("Leading advanced research projects.");
    }
}

public class Main5 {
    public static void main(String[] args) {
        UniversityMember student = new UndergraduateStudent();
        student.attendLecture();
        Researcher gra = new GraduateResearchAssistant();
        gra.conductLabResearch();
        Researcher professor = new Professor();
        professor.conductLabResearch();
    }
}

