
public class Main {

    public static void main(String[] args) {
        System.out.println(isAWeekDay("mon"));
        System.out.println(isAWeekDay("wed"));
        System.out.println(isAWeekDay("fri"));
        System.out.println(isAWeekDay("abc"));
        System.out.println(isAWeekDay("sunday"));
        System.out.println("");
        System.out.println(allVowels("i"));
        System.out.println(allVowels("ou"));
        System.out.println(allVowels("rt"));
        System.out.println(allVowels("aen"));
        System.out.println(allVowels("aiu"));
        System.out.println("");
    }

    public static boolean isAWeekDay(String string) {
        String days = "(mon|tue|wed|thu|fri|sat|sun)";

        return string.matches(days);
    }

    public static boolean allVowels(String string) {
        String vowels = "[aeiouäö]*";

        return string.matches(vowels);
    }

    public static boolean clockTime(String string) {
        String wordSplit[] = string.split(":");
        try {
            if (wordSplit.length == 3) {
                if (Integer.parseInt(wordSplit[0]) <= 23 && wordSplit[0].length() == 2) {
                    if(Integer.parseInt(wordSplit[1]) <= 60 && wordSplit[1].length() == 2){
                        if(Integer.parseInt(wordSplit[2]) <= 60 && wordSplit[2].length() == 2) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("The form is wrong.");
            return false;
        }
        return false;
    }
}
