public abstract class Developer {
    protected String name;
    protected double basicSalary;
    protected int experiance;

    public Developer(String name, double basicSalary, int experiance){
        this.name = name;
        this.basicSalary = basicSalary;
        this.experiance = experiance;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public int getExperiance() {
        return experiance;
    }

    public String toString(){
        StringBuilder sb;
        sb = new StringBuilder()
                .append(getName())
                .append(" is ")
                .append(getPost())
                .append(" with salary ")
                .append(getSalary());
        return sb.toString();
    }

    public abstract double getSalary();
    public abstract String getPost();
}
