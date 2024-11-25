import java.util.ArrayList;

abstract public class Project implements Risky{
    private Manager manager;
    private ArrayList<Member> members;
    private int memberCount = 0;

    private String title;
    private String objective;
    private long funds;

    public Project(String title, String objective, long funds){
        this.title = title;
        this.objective = objective;
        this.members = new ArrayList<Member>();
        this.funds = funds;
    }

    public void addMember(Member m){
        members.add(m);
        memberCount++;
    }

    public void setManager(Manager m){
        this.manager = m;
    }

    public int getMemberCount(){
        return memberCount;
    }

    public long getFunds(){
        return funds;
    }

    public String toString(){
        String result = "Project: " + title + "\nObjective: " + objective + "\nFunds: " + funds + "\nRisk: " + getRisk() + "\nMembers: ";
        if(manager != null){
            result += "\n" + manager;
        }

        result += "\nMembers: ";

        for(Member m : members){
            result += "\n" + m;
        }

        return result;
    }

    abstract public double getRisk();
}
