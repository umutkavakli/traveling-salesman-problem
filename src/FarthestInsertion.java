import java.util.ArrayList;

public class FarthestInsertion extends TSP implements BestCost, BestNode{

    public FarthestInsertion(int[][] cost, String[] cities, int start) {
        super(cost, cities);
        this.start = start;
    }

    @Override
    public ArrayList<Integer> bestRoute() {
        int index, node;
        visited = new int[cost.length];

        tourStarter(start);

        while (tour.size() < cost.length + 1){
            node = findNode();
            index = findMinimalCost(node);
            addNode(index, node);
        }
        return tour;
    }

    @Override
    public int findMinimalCost(int node) {
        int min = Integer.MAX_VALUE, index = -1, arc;
        for (int i = 0; i < tour.size() - 1; i++){
            arc = cost[tour.get(i)][node] + cost[node][tour.get(i+1)] - cost[tour.get(i)][tour.get(i+1)];
            if (arc < min){
                min = arc;
                index = i;
            }
        }
        return index;
    }

    @Override
    public int findNode() {
        int max = 0, node = -1;

        for (int i = 0; i < tour.size(); i++){
            for (int j = 0; j < cost.length; j++){
                if (cost[tour.get(i)][j] > max && visited[j] != 1){
                    max = cost[tour.get(i)][j];
                    node = j;
                }
            }
        }
        return node;
    }

    @Override
    public void tourStarter(int start) {
        int max = 0, node = -1;

        for (int i = 0; i < cost.length; i++) {
            if (cost[start][i] > max && i != start) {
                max = cost[start][i];
                node = i;
            }
        }
        addNode(-1, start);
        addNode(0, node);
        addNode(1, start);
    }

    @Override
    public void addNode(int index, int node){
        tour.add(index + 1, node);
        visited[node] = 1;
    }

    @Override
    public String toString(){
        return "FarthestInsertion " +getTotalCost()+ " " +tour;
    }
}

