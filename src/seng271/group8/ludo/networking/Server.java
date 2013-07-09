package seng271.group8.ludo.networking;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author Alastairs
 */
public class Server implements Runnable {
    
    private static int MAX_CLIENTS = 3;
    private static int LISTEN_PORT = 6789;
    private static final ArrayList<Thread> receivers = new ArrayList<Thread>();
    private static ServerSocket listenSocket;
    private static Socket incomingSocket;
    
    public Server() {
        try {
           listenSocket = new ServerSocket(LISTEN_PORT);
        } catch(IOException e){
            System.out.println("Server socket error");
        }
    }
    
    public void listen() {
        while(true) {
            try {
                incomingSocket = listenSocket.accept();
                if(receivers.size() < MAX_CLIENTS) {
                    Receive r = new Receive(incomingSocket);
                    Thread th = new Thread(r);
                    th.start();
                    receivers.add(th);
                } else {
                    
                }
            } catch (IOException e) {
                
            }
        }
    }

    @Override
    public void run() {
       this.listen();
    }
}