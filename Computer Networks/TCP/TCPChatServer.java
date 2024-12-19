import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPChatServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(3333);
            System.out.println("Server Listening at port 3333....");
            Socket cs = ss.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(cs.getInputStream()));
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(cs.getOutputStream(),true);
            String msg="",reply="";
            while (true) { 
                System.out.print("Server:");
                msg = input.readLine();
                if(msg.equalsIgnoreCase("end")){
                    System.out.println("Terminating Connection...");
                    break;
                }
                out.println(msg);
                reply = in.readLine();
                if (reply.equalsIgnoreCase("end")){
                    in.close();
                    input.close();
                    ss.close();
                    System.out.println("Client terminated Connection...");
                    break;
                }
                System.out.println("Client:"+reply);
                out.println(reply);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
