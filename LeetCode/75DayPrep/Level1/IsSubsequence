class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals(t) || s.length() == 0) {
            return true;
        }
        if(t.length() == 0) {
            return false;
        }
        int num = 0;
        char toFind = s.charAt(num);
        for(int i = 0; i < t.length(); i++) {
            if(t.charAt(i) == toFind) {
                num++;
                if(num==s.length()) {
                    return true;
                }
                toFind = s.charAt(num);
            }
        }
        return false;
    }
}