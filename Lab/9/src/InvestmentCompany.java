public class InvestmentCompany {
    private Project[] projects;
    private int projectsCount;

    public InvestmentCompany(){
        projects = new Project[100];
        projectsCount = 0;
    }

    public void addProject(Project p){
        if(projectsCount >= projects.length){
            Project[] newProjects = new Project[projects.length * 2];
            for(int i = 0; i < projectsCount; i++){
                newProjects[i] = projects[i];
            }
            projects = newProjects;
        }
        projects[projectsCount++] = p;
    }

    public Project getBestInvestment(){
        Project best = projects[0];
        for(int i = 1; i < projectsCount; i++){
            if(projects[i].getRisk() < best.getRisk()){
                best = projects[i];
            }
        }
        return best;
    }

    public static void main(String[] args){
        Project p1 = new CommercialProject("Project 1", "Objective 1", 20, "2021-12-31", 3);
        p1.setManager(new Manager("Manager 1", 50));
        Member m1 = new Employee("Employee 1", 30);
        Member m2 = new Employee("Employee 2", 35);
        p1.addMember(m1);
        p1.addMember(m2);

        Project p2 = new OpenSourceProject("Project 2", "Objective 2", 10, 5, "Mailing List 1");
        p2.setManager(new Manager("Manager 2", 40));
        Member m3 = new Employee("Employee 3", 25);
        Member m4 = new Employee("Employee 4", 20);
        p2.addMember(m3);
        p2.addMember(m4);

        InvestmentCompany ic = new InvestmentCompany();
        ic.addProject(p1);
        ic.addProject(p2);

        Project best = ic.getBestInvestment();
        System.out.println("Best Investment: " + best + " - Risk: " + best.getRisk());
    }
}
