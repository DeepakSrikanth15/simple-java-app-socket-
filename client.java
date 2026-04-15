package com.socket.app;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 1234);

        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader input = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));

        output.println("Hello Server!");

        String response = input.readLine();
        System.out.println("Server: " + response);

        socket.close();
    }
}