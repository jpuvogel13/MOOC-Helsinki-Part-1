public class StringUtils {

    public static boolean included(String word, String searched) {
        String wordTrim = word.trim();
        String searchedTrim = searched.trim();
        if (word == null || searched == null) {
            return false;
        }
        if (wordTrim.toLowerCase().contains(searchedTrim.toLowerCase())) {
            return true;

        }
        return false;
    }
}


