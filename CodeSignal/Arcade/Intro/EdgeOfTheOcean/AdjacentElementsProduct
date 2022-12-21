int solution(int[] inputArray) {
    int largestProd = Integer.MIN_VALUE;
    for (int i = 0; i < inputArray.length-1; i++) {
        int tempProd = inputArray[i] * inputArray[i+1];
        if(tempProd > largestProd) {
            largestProd = tempProd;
        }
    }
    return largestProd;
}