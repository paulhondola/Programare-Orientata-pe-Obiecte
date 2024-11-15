class PC {

    private String memory = "";
    private String registry;

    public void store(String information) {
        memory += information;
        registry = information;
    }

    public String load() {
        return registry;
    }
}
