public static void miniMaxSum(List<Integer> arr) {    
    long max = Integer.MIN_VALUE;
    long min = Integer.MAX_VALUE;
    long sum = 0;
    for(int i = 0; i < 5; i++) {
        long curr = arr.get(i);
        if(curr < min) {
            min = curr;
        }
        if(curr > max) {
            max = curr;
        }
        sum += curr;
    }
    System.out.print((sum-max)+ " " +(sum-min));
}