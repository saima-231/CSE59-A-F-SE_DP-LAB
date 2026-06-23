interface BonusEligible {
    void calculateBonus();
}

class TeamMember {
    protected String name;

    public TeamMember(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Employee extends TeamMember implements BonusEligible {
    public Employee(String name) {
        super(name);
    }

    @Override
    public void calculateBonus() {
        System.out.println(name + ": Calculating employee bonus ...");
    }
}

class Contractor extends TeamMember {
    public Contractor(String name) {
        super(name);
    }

    public void submitInvoice() {
        System.out.println(name + ": Submitting contractor invoice ...");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice");
        emp.calculateBonus();
        Contractor contractor = new Contractor("Bob");
        contractor.submitInvoice();
    }
}

