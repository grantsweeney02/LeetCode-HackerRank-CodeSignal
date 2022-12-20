public static int diagonalDifference(List<List<Integer>> arr) {
    int leftToRight = 0;
    int rightToLeft = 0;
    int size = arr.size();
    for (int i = 0; i < size; i++) {
        leftToRight += arr.get(i).get(i);
        rightToLeft += arr.get(i).get(size-i-1);
    }
    return Math.abs(rightToLeft - leftToRight);
}
