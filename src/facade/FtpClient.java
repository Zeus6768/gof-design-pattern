package facade;

public class FtpClient {

    private FTP ftp;
    private Reader reader;
    private Writer writer;

    public FtpClient(FTP ftp, Reader reader, Writer writer) {
        this.ftp = ftp;
        this.reader = reader;
        this.writer = writer;
    }

    public FtpClient(String host, int port, String path, String filename) {
        this.ftp = new FTP(host, port, path);
        this.reader = new Reader(filename);
        this.writer = new Writer(filename);
    }

    public void connect() {
        ftp.connect();
        reader.connect();
        writer.connect();
    }

    public void disconnect() {
        ftp.disconnect();
        reader.disconnect();
        writer.disconnect();
    }

    public void read() {
        reader.read();
    }

    public void write() {
        writer.write();
    }

    public void moveDirectory() {
        ftp.moveDirectory();
    }

}
