class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapStoT = new HashMap<>();
        HashMap<Character, Character> mapTtoS = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            Character c1 = s.charAt(i);
            Character c2 = t.charAt(i);
            if(mapStoT.containsKey(c1)) {
                if(mapStoT.get(c1) != c2) {
                    return false;
                }
            }
            else {
                mapStoT.put(c1, c2);
            }
            if(mapTtoS.containsKey(c2)) {
                if(mapTtoS.get(c2) != c1) {
                    return false;
                }
            }
            else {
                mapTtoS.put(c2, c1);
            }
        }
        return true;
    }
}