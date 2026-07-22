
public class EntryValidator {
    public static void main(String[] args) {
        //test case 1 : check for null
        assert !isValidEntry(null) : "FAILED : null entry should be invalid";

        //test case 2 : check for empty
        assert !isValidEntry("     ") : "FAILED : empty entry should be invalid";

        //test case 3 : check for min length
        assert !isValidEntry("ab") : "FAILED : length should be greater than equal to 3";

        //test case 4 : check for max length
        assert !isValidEntry("ab".repeat(30)) : "FAILED : length should be less than equal to 50";

        //test case 5 : valid case
        assert isValidEntry("abcd") : "FAILED : Entry is not valid";
    }

    public static boolean isValidEntry(String entry){
        if(entry == null || entry.trim().isEmpty() || entry.length() < 3 || entry.length() > 50) return false;
        return true;
    }
}

