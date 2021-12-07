package by.bsuir.webtech.thirdLab.server;


import by.bsuir.webtech.thirdLab.server.controller.ServerController;

public class Server {
    public static void main(String[] args) {
        var server = new ServerController();
        server.start();
    }
}
