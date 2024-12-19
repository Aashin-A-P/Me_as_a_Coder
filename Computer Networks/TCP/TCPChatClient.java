import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class TCPChatClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost",3333);
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(s.getOutputStream(),true);
            String msg="",reply="";
            while (true) {
                msg = in.readLine();
                if (msg.equalsIgnoreCase("end")){
                    System.out.println("Server disconnected");
                    break;
                }
                System.out.println("Server:"+msg);
                System.out.print("Client:");
                reply = input.readLine();
                if(reply.equalsIgnoreCase("end")){
                    System.out.println("Terminating Connection");
                    break;
                }
                else{
                    out.println(reply);
                    out.flush();
                }
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
