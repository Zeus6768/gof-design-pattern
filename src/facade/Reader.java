package facade;

public class Reader {

    private String fileName;

    public Reader(String fileName) {
        this.fileName = fileName;
    }

    public void connect() {
        String message = String.format("Reader %s로 연결합니다.", fileName);
        System.out.println(message);
    }

    public void read() {
        String message = String.format("Reader %s의 내용을 읽습니다.", fileName);
        System.out.println(message);
    }

    public void disconnect() {
        String message = String.format("Reader 연결을 종료합니다.");
        System.out.println(message);
    }

}
