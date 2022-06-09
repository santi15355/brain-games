package hexlet.code;

public class Utils {
    static final int MIN_NUMBER_FOR_RANDOM_2 = 2;
    static final int MIN_NUMBER_FOR_RANDOM_5 = 5;
    static final int MAX_NUMBER_FOR_RANDOM_99 = 99;

    public static int getRandomNumberFrom5to10() {
        return MIN_NUMBER_FOR_RANDOM_5 + (int) ((Math.random() * (MIN_NUMBER_FOR_RANDOM_5 + 1)));
    }
    public static int getRandomNumberFrom1to99() {
        return (MIN_NUMBER_FOR_RANDOM_2 - 1) + (int) (Math.random() * MAX_NUMBER_FOR_RANDOM_99);
    }
}
