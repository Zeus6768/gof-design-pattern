package facade;

public class Writer {

    private String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }

    public void connect() {
        String message = String.format("Writer %s로 연결합니다.", fileName);
        System.out.println(message);
    }

    public void write() {
        String message = String.format("Writer %s의 내용을 씁니다.", fileName);
        System.out.println(message);
    }

    public void disconnect() {
        String message = String.format("Writer 연결을 종료합니다.");
        System.out.println(message);
    }

}
