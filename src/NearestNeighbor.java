import java.util.ArrayList;

public class NearestNeighbor extends TSP implements BestNode{
    int[] visited;
    public NearestNeighbor(int[][] cost){
        super(cost);
    }

    @Override
    public ArrayList<Integer> bestRoute(int start){
        visited = new int[cost.length];
        int index, node;

        tourStarter(start);

        while (tour.size() < cost.length + 1){

            node = findNode();
            index = tour.size() - 1;
            addNode(index, node);
        }
        return tour;
    }

    @Override
    public int findNode() {
        int min = Integer.MAX_VALUE, node = -1, lastElement = tour.get(tour.size() - 2);
        for (int i = 0; i < cost.length; i++) {
            if (cost[lastElement][i] < min && visited[i] != 1){
                min = cost[lastElement][i];
                node = i;
            }
        }
        return node;
    }

    @Override
    public void tourStarter(int start) {
        int min = Integer.MAX_VALUE, node = -1;

        for (int i = 0; i < cost.length; i++) {
            if (cost[start][i] < min && i != start) {
                min = cost[start][i];
                node = i;
            }
        }
        addNode(0, start);
        addNode(1, node);
        addNode(2, start);
    }

    @Override
    public void addNode(int index, int node) {
        tour.add(index, node);
        visited[node] = 1;
    }

    @Override
    public String toString(){
        return "NearestNeighbor " +getTotalCost()+ " " +tour;
    }
}
