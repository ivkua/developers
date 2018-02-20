public class TeamLeadDeveloper extends Developer {
    public TeamLeadDeveloper(String name, double basicSalary,
                             int experience)
    {
        super(name, basicSalary, experience);
    }

    @Override
    public double getSalary() {
        return (basicSalary * 4) +
                (experiance > 0 ? basicSalary * experiance * 0.1 : 0);
    }

    public String getPost(){
        return "TeamLead developer";
    }
}
