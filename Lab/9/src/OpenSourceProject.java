public class OpenSourceProject extends Project {
    private String mailingList;

    public OpenSourceProject(String title, String objective, long funds, String mailingList) {
        super(title, objective, funds);
        this.mailingList = mailingList;
    }

    @Override
    public double getRisk() {
        return (double) getMemberCount() / getFunds();
    }

    @Override
    public String toString() {
        return super.toString() + "\nMailing List: " + mailingList;
    }
}
