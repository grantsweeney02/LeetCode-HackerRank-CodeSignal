public static int lonelyintegerOnlyPairs(List<Integer> a) {
    int ans = 0;
    for(int i: a) {
        ans ^= i;
    }
    return ans;
}

public static int lonelyinteger(List<Integer> a) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (Integer integer : a) {
        map.put(integer, map.getOrDefault(integer, 0) + 1);
    }
    for (Map.Entry<Integer, Integer> entrySet: map.entrySet()) {
        if(entrySet.getValue() == 1) {
            return entrySet.getKey();
        }
    }
    return -1;
}