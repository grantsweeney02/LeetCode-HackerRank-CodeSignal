public static String pangrams(String s) {
    HashMap<Character, Integer> alphabet = new HashMap<>();
    s = s.toLowerCase().replace(" ", "");
    for (int i = 0; i < s.length(); i++) {
        Character c = s.charAt(i);
        if(!alphabet.containsKey(c)) {
            alphabet.put(c, 1);
        }
    }
    if(alphabet.keySet().size() != 26) {
        return "not pangram";
    }
    return "pangram";
}
