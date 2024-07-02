public class Birds {
    
    private String name;
    private String latin;
    private Integer observations;
    
    public Birds(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.observations = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatin() {
        return latin;
    }

    public Integer getObservations() {
        return observations;
    }
    
    public void addObservation() {
        this.observations++;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.latin + "): " + this.observations + " observations";
    }
    
    
    
    
    
}
