package extras;

/** AlgorithmTimer */
public class AlgorithmTimer {
  public static long algorithmTime(Runnable algorithm) {
    long startTime = System.nanoTime();
    algorithm.run();
    long endTime = System.nanoTime();
    return endTime - startTime;
  }
}
