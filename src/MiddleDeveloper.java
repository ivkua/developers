public class MiddleDeveloper extends Developer {
    public MiddleDeveloper(String name, double basicSalary, int experience) {
        super(name, basicSalary, experience);
    }

    @Override
    public double getSalary() {
        return (basicSalary * 1.5) +
                (experiance > 0 ? basicSalary * experiance * 0.1 : 0);
    }

    public String getPost(){
        return "middle developer";
    }

}
