public class OpenSourceProject extends Project {
    private String mailingList;

    public OpenSourceProject(String title, String objective, long funds, String mailingList) {
        super(title, objective, funds);
        this.mailingList = mailingList;
    }

    public double getRisk() {
        return (double) getMemberCount() / getFunds();
    }

    public String toString() {
        return super.toString() + "\nMailing List: " + mailingList;
    }
}
