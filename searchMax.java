class searchMax {
  public static void main(String[] args) {
    int[] arr = { 2, 25, 64, 1, 44, 65, 46, 84 };
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {

      if (max < arr[i]) {

        max = arr[i];

      }

    }
    System.out.println("MAX ELEMENT IS " + max);
  }
}