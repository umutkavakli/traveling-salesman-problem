public class Main {
    public static void main(String[] args) {

        int start = 9;

        ArbitraryInsertion arbitraryInsertion = new ArbitraryInsertion(TurkishNetwork.distances, TurkishNetwork.cities, start);
        CheapestInsertion cheapestInsertion = new CheapestInsertion(TurkishNetwork.distances, TurkishNetwork.cities, start);
        FarthestInsertion farthestInsertion = new FarthestInsertion(TurkishNetwork.distances, TurkishNetwork.cities, start);
        NearestInsertion nearestInsertion = new NearestInsertion(TurkishNetwork.distances, TurkishNetwork.cities, start);
        NearestNeighbor nearestNeighbor = new NearestNeighbor(TurkishNetwork.distances, TurkishNetwork.cities, start);

        arbitraryInsertion.bestRoute();
        cheapestInsertion.bestRoute();
        farthestInsertion.bestRoute();
        nearestInsertion.bestRoute();
        nearestNeighbor.bestRoute();

        System.out.println(arbitraryInsertion.toString()+"\n"
                +cheapestInsertion.toString()+"\n"
                +farthestInsertion.toString()+"\n"
                +nearestInsertion.toString()+"\n"
                +nearestNeighbor.toString());

    }


}
