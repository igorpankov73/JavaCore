package Java_Core.lesson_2;

public class Main {
    public static void main(String[] args) {
        String[][] correctMatrix = {
                {"1", "2", "1", "1"},
                {"1", "7", "3", "4"},
                {"3", "2", "6", "2"},
                {"0", "2", "6", "2"}
        };
        String[][] wrongSizeMatrix = {
                {"1", "2", "5", "3"},
                {"7", "3", "", ""},
                {"1", "2", "7", "3"},
                {"0", "2", "4", "3"}
        };
        String[][] wrongChar = {
                {"5", "2", "1", "3"},
                {"7", "1", "", "3"},
                {"0", "2", "5", "3"},
                {"5", "2", "6", "1"}
        };

        try {
            System.out.println(Converter.strConverter(correctMatrix));
        } catch (CustomException e) {
            e.getMessage();
        }

        try {
            System.out.println(Converter.strConverter(wrongSizeMatrix));
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(Converter.strConverter(wrongChar));
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }
    }
}
