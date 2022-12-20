public static String timeConversion(String s) {
    String AMorPM = s.substring(8,10);
    if(AMorPM.equals("AM")) {
        if(s.substring(0,2).equals("12")) {
            return "00" + s.substring(2,8);
        }
        return s.substring(0,8);
    }
    else {
        int hour = Integer.parseInt(s.substring(0,2));
        if(hour != 12) {
            hour +=12;
        }
        return hour + s.substring(2,8);
    }
}