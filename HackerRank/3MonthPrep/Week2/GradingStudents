public static List<Integer> gradingStudents(List<Integer> grades) {
    for (int i = 0; i < grades.size(); i++) {
        int value = grades.get(i);
        if(value >= 38) {
            if ((value % 5) >= 3) {
                System.out.println((value % 5));
                grades.set(i, value + (5 - (value % 5)));
            }
        }
    }
    return grades;
}