import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoServer{
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(6666);
            System.out.println("Server Listening at Port 6666...");
            Socket cs = ss.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(cs.getInputStream()));
            while(true){
                String msg = in.readLine();
                if(msg.equalsIgnoreCase("end")){
                    System.out.println("Client Terminated the Connection");
                    break;
                }
                System.out.println("Client:"+msg);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}