import java.util.ArrayList;

public abstract class TSP {
    protected ArrayList<Integer> tour = new ArrayList<>();
    protected final int[][] cost;
    protected final String[] cities;


    public TSP(int[][] cost, String[] cities){
        this.cost = cost;
        this.cities = cities;
    }

    //Creating abstract methods that all algorithms use
    protected abstract ArrayList<Integer> bestRoute();

    protected abstract void tourStarter(int start);

    protected abstract void addNode(int index, int node);

    /*
    * All algorithms use same methods which calculates total costs and creates arraylist that contains city names in tour
    * So no need to use abstract keyword
    */
    public int getTotalCost() {
        int totalCost = 0;
        for (int i = 0; i < tour.size() - 1; i++){
            totalCost += cost[tour.get(i)][tour.get(i+1)];
        }
        return totalCost;
    }

    public ArrayList<String> getTourWithCityNames(){
        ArrayList<String> tourCities = new ArrayList<>();
        for (int i = 0; i < tour.size(); i++){
            tourCities.add(cities[tour.get(i)]);
        }
        return tourCities;
    }

    //All methods must override toString to show total cost and route
    public abstract String toString();
}
