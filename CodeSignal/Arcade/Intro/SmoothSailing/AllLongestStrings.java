String[] solution(String[] inputArray) {
    String l = "";
    
    for( String s: inputArray )
    {
        if( l.indexOf("-") == s.length() ) {
            l += s + "-";
        }
        else if ( l.indexOf("-") < s.length() ) {
            l = s + "-";
        }
    }
    return l.split( "-" );
}