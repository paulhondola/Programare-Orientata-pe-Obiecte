public class CommercialProject extends Project{
    private static final int MAX_MEMBERS = 15;
    private String deadline;
    private long marketingFunds = getFunds()/2;
    private int teams;

    public CommercialProject(String title, String objective, long funds, String deadline, int teams){
        super(title, objective, funds);
        this.deadline = deadline;
        this.teams = teams;
    }

    @Override
    public void addMember(Member m){
       if(getMemberCount() < MAX_MEMBERS){
           super.addMember(m);
       }
    }

    @Override
    public double getRisk(){
        return (double) teams * 3 / getMemberCount() / (getFunds() - marketingFunds);
    }

    @Override
    public String toString(){
        return super.toString() + "\nDeadline: " + deadline + "\nMarketing Funds: " + marketingFunds + "\nTeams: " + teams;
    }
}
