public class OpenSourceProject extends Project {
    private String mailingList;
    private int memberCount;
    public OpenSourceProject(String title, String objective, long funds, int maxMembers, String mailingList) {
        super(title, objective, maxMembers, funds);
        this.memberCount = maxMembers;
        this.mailingList = mailingList;
    }

    public void addMember(Member m) {
        if (memberCount >= getMemberCount()) {
            Member[] newMembers = new Member[memberCount * 2];
            for (int i = 0; i < memberCount; i++) {
                newMembers[i] = members[i];
            }
            members = newMembers;
            memberCount *= 2;
        }
        super.addMember(m);
    }

    public double getRisk() {
        return (double) getMemberCount() / getFunds();
    }
}
