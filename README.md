# traveling-salesman-problem

The traveling salesman problem(also called TSP) involves finding the minimum traveling cost for visiting a fixed set of customers. It is an NP-hard problem in combinatorial optimization, important in theoretical computer science and operations research.

The vehicle must visit each customer exactly once and return to its point of origin also called depot.
The objective function is the total cost of the tour.

The total number of solutions is (n-1)! /2 if the distances are symmetric.
For example, if there are 50 customers to visit, the total number of solutions is 49!/2=3.04e62.

Even though the problem is computationally difficult, many heuristics and exact algorithms are known, so that some instances with tens of thousands of cities can be solved completely and even problems with millions of cities can be approximated within a small fraction of 1%.

- [Arbitrary Insertion](src/ArbitraryInsertion.java)
- [Cheapest Insertion](src/CheapestInsertion.java)
- [Farthest Insertion](src/FarthestInsertion.java)
- [Nearest Insertion](src/NearestInsertion.java)
- [Nearest Neighbor](src/NearestNeighbor.java)
