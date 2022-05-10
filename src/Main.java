public class Main {
    public static void main(String[] args) {

        ArbitraryInsertion arbitraryInsertion = new ArbitraryInsertion(TurkishNetwork.distances);
        CheapestInsertion cheapestInsertion = new CheapestInsertion(TurkishNetwork.distances);
        FarthestInsertion farthestInsertion = new FarthestInsertion(TurkishNetwork.distances);
        NearestInsertion nearestInsertion = new NearestInsertion(TurkishNetwork.distances);
        NearestNeighbor nearestNeighbor = new NearestNeighbor(TurkishNetwork.distances);

        arbitraryInsertion.bestRoute(9);
        cheapestInsertion.bestRoute(9);
        farthestInsertion.bestRoute(9);
        nearestInsertion.bestRoute(9);
        nearestNeighbor.bestRoute(9);

        System.out.println(arbitraryInsertion.toString()+"\n"
                +cheapestInsertion.toString()+"\n"
                +farthestInsertion.toString()+"\n"
                +nearestInsertion.toString()+"\n"
                +nearestNeighbor.toString());
    }
}
