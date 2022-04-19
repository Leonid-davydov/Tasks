package Task_10;

public class EmptyFileException extends Exception{
    String filePath;

    EmptyFileException(String message, String filePath) {
        super(message);
        this.filePath = filePath;
    }

    EmptyFileException(String message, Throwable cause, String filePath) {
        super(message, cause);
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return super.getMessage() + filePath;
    }
}
