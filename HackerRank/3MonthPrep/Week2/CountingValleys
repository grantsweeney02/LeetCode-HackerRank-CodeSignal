public static int countingValleys(int steps, String path) {
    int count = 0;
    int numValleys = 0;
    for (int i = 0; i < path.length(); i++) {
        char c = path.charAt(i);
        if(c == 'D') {
            count--;
        }
        else if(c == 'U') {
            count++;
            if(count == 0) {
                numValleys++;
            }
        }
    }
    return numValleys;
}