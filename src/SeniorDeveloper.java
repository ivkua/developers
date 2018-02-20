public class SeniorDeveloper extends Developer {
    public SeniorDeveloper(String name, double basicSalary, int experience) {
        super(name, basicSalary, experience);
    }

    @Override
    public double getSalary() {
        return (basicSalary * 2) +
                (experiance > 0 ? basicSalary * experiance * 0.1 : 0);
    }

    public String getPost(){
        return "senior developer";
    }

}