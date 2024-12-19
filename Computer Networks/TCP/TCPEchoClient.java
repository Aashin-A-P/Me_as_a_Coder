import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPEchoClient {
    public static void main(String[] args){
        try{
            Socket s= new Socket("localhost",6666);
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(s.getOutputStream(),true);
            while (true) {
                System.out.print("Enter Message:");
                String msg = in.readLine();
                out.println(msg);
                if(msg.equalsIgnoreCase("end")){
                    System.out.println("Terminating Connection");
                    break;
                }                
            }
            in.close();
            out.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
