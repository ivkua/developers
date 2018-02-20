public class Main {
    public static void main(String[] args) {
        Developer[] list = {
                new JuniorDeveloper("Mike", 500, 0),
                new JuniorDeveloper("Dima", 500, 1),
                new JuniorDeveloper("Vova", 500, 2),
                new MiddleDeveloper("Jane", 500, 3),
                new SeniorDeveloper("Jack", 500, 5),
                new SeniorDeveloper("Kate", 500, 6),
                new TeamLeadDeveloper("Robby", 500, 7)
        };

        for (Developer d : list){
            if(d instanceof SeniorDeveloper){
                if (d.getSalary() > 1000){ // there is no >1500, as in task
                    StringBuilder sb;
                    sb = new StringBuilder()
                            .append(d.getName())
                            .append(" is ")
                            .append(((SeniorDeveloper) d).getPost())
                            .append(" with salary ")
                            .append(d.getSalary());
                    System.out.println(sb.toString());
                }
            }
        }
        System.out.println("___________________________________");

        int juniorCounter = 0;
        for (Developer d : list){
            if (d instanceof JuniorDeveloper){
                juniorCounter++;
            }
        }

        Developer[] juniorDeveloperList = new Developer[juniorCounter];
        for (Developer d : list){
            int counter = 0;
            if (d instanceof JuniorDeveloper){
                juniorDeveloperList[counter] = d;
                counter++;
                System.out.println(d.toString());
            }
        }
    }
}
