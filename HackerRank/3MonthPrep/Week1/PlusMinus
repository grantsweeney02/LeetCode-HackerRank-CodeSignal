public static void plusMinus(List<Integer> arr) {
    double numPositives = 0;
    double numNegatives = 0;
    for(int i = 0; i < arr.size(); i++) {
        if(arr.get(i) > 0) {
            numPositives++;
        }
        if(arr.get(i) < 0) {
            numNegatives++;
        }
    }
    double numZeros = arr.size() - numPositives - numNegatives;
    DecimalFormat numberFormat = new DecimalFormat("#.000000");
    System.out.println(numberFormat.format(numPositives/arr.size()));
    System.out.println(numberFormat.format(numNegatives/arr.size()));
    System.out.println(numberFormat.format(numZeros/arr.size()));
}