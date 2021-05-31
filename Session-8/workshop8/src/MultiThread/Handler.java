package MultiThread;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * A Handler Class For Run Multi Clients On A Server
 * @author Alireza Zare Zeynabadi
 * @version 1.0
 * @since 2021.may.25
 */
public class Handler implements Runnable{

    /** Handler Fields*/
    private ServerSocket server;
    private Socket socket;

    /**
     * Handler Constructor
     *
     * Initialize Server And Socket
     * @param server server
     * @param socket socket
     */
    public Handler(ServerSocket server, Socket socket) {
        super();
        this.server = server;
        this.socket = socket;
    }

    /**
     * Run A Client Handler on Server
     */
    public void run(){
        try {
            DataInputStream din = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
            String texts = "";
            while (true) {
                String str = din.readUTF();
                if (str.equalsIgnoreCase("over")) {
                    System.out.println("client exits");
                    break;
                }
                System.out.println("client sends: " + str);
                texts += str + '\t';

                dout.writeUTF(texts);
                dout.flush();
            }
            dout.close();
            din.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
