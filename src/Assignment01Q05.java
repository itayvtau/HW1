public class Assignment01Q05 {
public static int findShortestPath(int[][] matrix, int i, int j) {
    if (i == j)
        return 0;

    int n = matrix.length;

    int[] distance = new int[n];
    for (int k = 0; k < n; k++)
        distance[k] = -1;

    distance[i] = 0;

    int[] queue = new int[n];
    int head = 0;
    int tail = 0;

    queue[tail++] = i;

    while (head < tail) {
        int current = queue[head++];

        for (int neighbor = 0; neighbor < n; neighbor++) {
            if (matrix[current][neighbor] == 1
                    && distance[neighbor] == -1) {

                distance[neighbor] = distance[current] + 1;

                if (neighbor == j)
                    return distance[neighbor];

                queue[tail++] = neighbor;
            }
        }
    }

    return -1;
}

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}