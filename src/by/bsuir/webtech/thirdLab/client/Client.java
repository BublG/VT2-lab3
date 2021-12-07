package by.bsuir.webtech.thirdLab.client;

import by.bsuir.webtech.thirdLab.client.controller.ClientController;

public class Client {
    public static void main(String[] args) {
        var client = new ClientController();
        client.start();
    }
}
