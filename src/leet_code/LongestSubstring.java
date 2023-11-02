package leet_code;

public class LongestSubstring {
    public static int longestSubstring(String superString){
        int lengthOfString = 0;
        boolean isNotValidSubString = validateIfThereIsASubString(superString);
        if (!isNotValidSubString) {
            for (int chars = 0; chars < superString.length(); chars++) {
                int duplicateIndex = checkOutReplicaOfTheChars(chars, superString);
                String result = superString.substring(chars, duplicateIndex);
                if (result.length() > lengthOfString) {
                    lengthOfString = result.length();
                    chars = lengthOfString;
                }
            }return lengthOfString;
        }else return superString.length();
        }

    private static boolean validateIfThereIsASubString(String superString) {
        int noDuplicate = checkOutDuplicateOfElement(superString);
        if (noDuplicate == superString.length()){
            return true;
        }else {
            return false;
        }
    }

    private static int checkOutDuplicateOfElement(String superString) {
        int count = 0;
        String result = "";
        for (int counter = 0; counter < superString.length(); counter++){
            String value = String.valueOf(superString.charAt(counter));
            for (int counts = counter+1; counts <superString.length(); counts++){
                result += String.valueOf(superString.charAt(counts));
            }
            if (!result.contains(value)) count++;
            result = "";
        }
        return count;
    }

    private static int checkOutReplicaOfTheChars(int chars, String superString) {
        char originalValue = superString.charAt(chars);
        for (int count = chars + 1; count < superString.length(); count++){
            if (originalValue == superString.charAt(count)){
                return count;
            }
        }
        return chars+1;
    }
}
