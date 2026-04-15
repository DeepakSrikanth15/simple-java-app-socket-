package com.socket.app;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(1234);
        System.out.println("Server started...");

        Socket socket = server.accept();
        System.out.println("Client connected");

        BufferedReader input = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

        String message = input.readLine();
        System.out.println("Client: " + message);

        output.println("Message received");

        socket.close();
        server.close();
    }
}