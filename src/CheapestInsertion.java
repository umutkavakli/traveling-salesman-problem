import java.util.ArrayList;

public class CheapestInsertion extends TSP implements BestCost {
    int[] visited;
    int start;

    public CheapestInsertion(int[][] cost, int start) {
        super(cost);
        this.start = start;
    }

    @Override
    public ArrayList<Integer> bestRoute() {
        visited = new int[cost.length];

        tourStarter(start);

        while (tour.size() < cost.length + 1) {
            findMinimalCost(-1);
        }

        return tour;
    }

    @Override
    public int findMinimalCost(int node) {
        int min = Integer.MAX_VALUE, index = -1, arc;

        for (int i = 0; i < tour.size() - 1; i++) {
            for (int j = 0; j < cost.length; j++) {
                arc = cost[tour.get(i)][j] + cost[j][tour.get(i + 1)] - cost[tour.get(i)][tour.get(i + 1)];
                if (arc < min && visited[j] != 1) {
                    min = arc;
                    index = i;
                    node = j;
                }
            }
        }
        addNode(index, node);
        return 0;
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
        addNode(-1, start);
        addNode(0, node);
        addNode(1, start);
    }

    @Override
    public void addNode(int index, int node) {
        tour.add(index + 1, node);
        visited[node] = 1;
    }

    @Override
    public String toString() {
        return "CheapestInsertion " + getTotalCost() + " " + tour;
    }
}
