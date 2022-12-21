boolean solution(int n) {
    int leftSum = 0;
    int rightSum = 0;
    String nAsString = String.valueOf(n);
    char[] nAsArray = nAsString.toCharArray();
    for (int i = 0; i < nAsArray.length; i++) {
        if (i < nAsArray.length/2) {
            System.out.println(nAsArray[i]);
            leftSum += nAsArray[i];
        }
        else {
            rightSum += nAsArray[i];
        }
    }
    return leftSum == rightSum;
}
