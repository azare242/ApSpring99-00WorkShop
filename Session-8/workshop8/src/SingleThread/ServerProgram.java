package SingleThread;
import java.net.*;
import java.io.*;

/**
 * A Server Program To Exercise SocketPrograming
 * @author Alireza Zare Zeynabadi
 * @version 1.0
 * @since 2021.may.25
 */
public class ServerProgram {
    public static void main(String[] args){
        try{
            ServerSocket server = new ServerSocket(6666);
            Socket socket = server.accept();
            System.out.println("A Client Connected");
            DataInputStream din = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
            String texts = "";
            while (true) {
                String str = din.readUTF();
                if (str.equalsIgnoreCase("over")) {
                    System.out.println("client exits");
                    break;
                }
                texts += str + ',';

                dout.writeUTF(texts);
                dout.flush();
            }
            server.close();
            socket.close();
            System.out.println("server closed");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
