import facade.FTP;
import facade.FtpClient;
import facade.Reader;

public class Main {
    public static void main(String[] args) {

        FtpClient client = new FtpClient("www.foo.co.kr", 22, "/home/etc", "text.tmp");

        client.connect();
        client.read();
        client.write();
        client.moveDirectory();
        client.disconnect();

    }
}