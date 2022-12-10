package Java_Core.lesson_2;

public class MyArrayDataException extends CustomException {
    public MyArrayDataException(int row, int col) {
        super(String.format("Разбор на исключение int в массиве[%d, %d]", row, col));
    }
}
