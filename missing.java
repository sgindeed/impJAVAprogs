public class ExArrayMissing {
  public static void main(String[] args) {
    // initialize here.
    int n;

    // take default input array.
    int[] numbers = new int[] {
      1,
      2,
      3,
      4,
      6,
      7
    };

    // last elements.
    n = 7;

    // sum of elements till last value.
    int expected_sum = n * ((n + 1) / 2);
    int sum = 0;

    for (int i: numbers) {
      sum += i;
    }

    // obtain missing elements.
    int m = expected_sum - sum;
    System.out.print("Missing element is : " + m);
    System.out.print("\n");
  }
}
