public class Country {
    private String name;
    private String continent;
    private int pop;
    private double gdp;

    public Country(){
        continent = "Australia";
        pop = 5;
        gdp = 28.3;
        name = "Japan";
    }

    public void printInfo(){
        System.out.println("name: " + name);
        System.out.println("continent: " + continent);
        System.out.println("population: " + pop);
        System.out.println("gdp: " + gdp);
    }

    public void setPop(int newPop){
        pop = newPop;
    }

    public int getPop(){
        return pop;
    }
}
