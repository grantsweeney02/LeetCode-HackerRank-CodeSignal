int solution(int[][] matrix) {
    int sum = 0;
    for(int i = 0; i < matrix.length; i++) {
        for(int j = 0; j < matrix[i].length; j++) {
            int val = matrix[i][j];
            if(i == 0) {
                System.out.println(val);
                sum += val;
            }
            else if(matrix[i-1][j] != 0) {
                System.out.println(val);
                sum += val;
            }
            else {
                matrix[i][j] = 0;
            }
        }
    }
    return sum;
}


int solution(int[][] matrix) {
    // not my solution. Goes through column first breaks column if not compatible.
    int s = 0;
    for (int c = 0; c < matrix[0].length; ++c) 
        for (int r = 0; r < matrix.length; ++r) {
            if (matrix[r][c] > 0) 
                s+=matrix[r][c];
            else break;
        }
    return s;
}