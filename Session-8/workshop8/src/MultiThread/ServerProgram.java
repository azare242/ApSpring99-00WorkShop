package MultiThread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
/**
 * A Server Program To Exercise SocketPrograming
 * @author Alireza Zare Zeynabadi
 * @version 1.0
 * @since 2021.may.25
 */
public class ServerProgram {

    public static void main(String[] args) {
        List<Thread> threadList = new LinkedList<>();
        try {
            ServerSocket server = new ServerSocket(6666);

            while (true) {
                Socket socket = server.accept();

                Thread thread = new Thread(new Handler(server,socket));

                threadList.add(thread);

                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
