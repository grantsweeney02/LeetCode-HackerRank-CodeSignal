public static List<Integer> breakingRecords(List<Integer> scores) {
    int numOfMost = 0;
    int numOfLeast = 0;
    int mostRecord  = scores.get(0);
    int leastRecord = scores.get(0);
    for(int i = 1; i < scores.size(); i++) {
        if(scores.get(i) > mostRecord) {
            numOfMost++;
            mostRecord = scores.get(i);
        }
        if(scores.get(i) < leastRecord) {
            numOfLeast++;
            leastRecord = scores.get(i);
        }
    }
    List<Integer> answer = new ArrayList<>();
    answer.add(numOfMost);
    answer.add(numOfLeast);
    return answer;
}
