abstract public class Project implements Risky{
    private Manager manager;
    protected Member[] members;
    private int memberCount = 0;
    private int maxMembers;

    private String title;
    private String objective;
    private long funds;

    public Project(String title, String objective, int maxMembers, long funds){
        this.title = title;
        this.objective = objective;
        this.maxMembers = maxMembers;
        this.members = new Member[maxMembers];
        this.funds = funds;
    }

    public void addMember(Member m){
        members[memberCount++] = m;
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

    abstract public double getRisk();

    public String toString(){
        return title + " - " + objective;
    }
}
