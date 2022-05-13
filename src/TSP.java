import java.util.ArrayList;

public abstract class TSP {
    protected ArrayList<Integer> tour = new ArrayList<>();
    protected final int[][] cost;
    private int totalCost;

    public TSP(int[][] cost){
        this.cost = cost;
    }

    protected abstract ArrayList<Integer> bestRoute();

    protected abstract void tourStarter(int start);

    protected abstract void addNode(int index, int node);

    public int getTotalCost() {
        totalCost = 0;
        for (int i = 0; i < tour.size() - 1; i++){
            totalCost += cost[tour.get(i)][tour.get(i+1)];
        }
        return totalCost;
    }
    
    public abstract String toString();
}
