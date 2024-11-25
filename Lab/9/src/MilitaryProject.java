public class MilitaryProject extends Project{
    private static final int MAX_MEMBERS = 15;
    private String deadline;
    private String password;

    public MilitaryProject(String title, String objective, long funds, String deadline, String password){
        super(title, objective, funds);
        this.deadline = deadline;
        this.password = password;
    }

    public void addMember(Member m){
        if(getMemberCount() < MAX_MEMBERS){
            super.addMember(m);
        }
    }

    public double getRisk(){
        return (double) getMemberCount() / password.length() / getFunds();
    }

    public String toString(){
        return super.toString() + "\nDeadline: " + deadline + "\nPassword: " + password;
    }
}
