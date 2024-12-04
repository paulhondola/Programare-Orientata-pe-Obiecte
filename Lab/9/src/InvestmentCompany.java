import java.util.LinkedList;

public class InvestmentCompany {
    private LinkedList<Project> projects = new LinkedList<>();

    public void addProject(Project p){
        projects.add(p);
    }

    public Project getBestInvestment(){
        Project best = projects.get(0);
        for(Project p : projects){
            if(p.getRisk() > best.getRisk()){
                best = p;
            }
        }
        return best;
    }

    public static void main(String[] args){
        Project p1 = new CommercialProject("Project 1", "Objective 1", 1000000, "12/31/2030", 5);

        Project p2 = new MilitaryProject("Project 2", "Objective 2", 2000000, "12/31/2040", "password");

        Project p3 = new OpenSourceProject("Project 3", "Objective 3", 3000000, "mailing list");

        Member manager1 = new Manager("Manager 1", 40);
        Member manager2 = new Manager("Manager 2", 45);
        Member manager3 = new Manager("Manager 3", 50);
        Member empl1 = new Employee("Employee 1", 25);
        Member empl2 = new Employee("Employee 2", 30);
        Member empl3 = new Employee("Employee 3", 35);
        Member empl4 = new Employee("Employee 4", 40);
        Member empl5 = new Employee("Employee 5", 45);
        Member empl6 = new Employee("Employee 6", 50);
        Member empl7 = new Employee("Employee 7", 55);
        Member empl8 = new Employee("Employee 8", 60);
        Member empl9 = new Employee("Employee 9", 65);

        p1.setManager((Manager)manager1);
        p2.setManager((Manager)manager2);
        p3.setManager((Manager)manager3);

        p1.addMember(empl1);
        p1.addMember(empl2);
        p1.addMember(empl3);

        p2.addMember(empl4);
        p2.addMember(empl5);
        p2.addMember(empl6);

        p3.addMember(empl7);
        p3.addMember(empl8);
        p3.addMember(empl9);

        InvestmentCompany ic = new InvestmentCompany();
        ic.addProject(p1);
        ic.addProject(p2);
        ic.addProject(p3);

        System.out.println(p1);
        System.out.println("-----------------------------------------");
        System.out.println(p2);
        System.out.println("-----------------------------------------");
        System.out.println(p3);
        System.out.println("-----------------------------------------");

        Project best = ic.getBestInvestment();
        System.out.println(best);
    }
}
