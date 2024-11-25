public class CommercialProject extends Project{
    private static final int MAX_MEMBERS = 15;
    private String deadline;
    private long marketingFunds = getFunds()/2;
    private int teams;

    public CommercialProject(String title, String objective, long funds, String deadline, int teams){
        super(title, objective, MAX_MEMBERS, funds);
        this.deadline = deadline;
        this.teams = teams;
    }

    public void addMember(Member m){
       if(getMemberCount() < MAX_MEMBERS){
           super.addMember(m);
       }
    }

    public double getRisk(){
        return (double) teams * 3 / getMemberCount() / (getFunds() - marketingFunds);
    }
}
