int solution(String s1, String s2) {
    int count = 0;
    for (int i = 0; i < s1.length(); i++) {
        int j = s2.indexOf(s1.charAt(i));
        if(j >= 0) {
            count++;
            s2 = s2.replaceFirst("" + s1.charAt(i),"");
        }
    }
    return count;
}