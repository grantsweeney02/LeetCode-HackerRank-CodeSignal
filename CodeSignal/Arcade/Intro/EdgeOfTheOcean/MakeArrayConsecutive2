int solution(int[] statues) {
    Arrays.sort(statues);
    int max = 0;
    for (int i = 0; i < statues.length-1; i++) {
        int difference = statues[i+1] - statues[i];
        if (difference != 1) {
            max += difference-1;
        }
    }
    return max;
}