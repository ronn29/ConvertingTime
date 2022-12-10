public class myCode {
    public static void main(String[] args){

        System.out.println(convertMin2Sec(32));//minutes to seconds
        System.out.println(convertSec2min(1920));//seconds to minutes

    }
    public static String convertMin2Sec(int min){

        int sec = min * 60;
        String result = min + " minutes = " + sec + " seconds";

        return result;
    }
    public static String convertSec2min(int sec){

        int min = sec / 60;
        String result = sec + " seconds = " + min + " minutes";

        return result;
    }


}
