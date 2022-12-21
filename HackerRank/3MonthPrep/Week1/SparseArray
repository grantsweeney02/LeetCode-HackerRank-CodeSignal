public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    List<Integer> results = new ArrayList<>();
    HashMap<String, Integer> mappy = new HashMap<>();
    for(String daWord: strings) {
        if(mappy.containsKey(daWord)) {
            mappy.put(daWord, mappy.get(daWord)+1);
        }
        else {
            mappy.put(daWord, 1);
        }
    }
    for(String query: queries) {
        int count = 0;
        if(mappy.containsKey(query)) {
            count += mappy.get(query);
        }
        results.add(count);
    }
    return results;
}