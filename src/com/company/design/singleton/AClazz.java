package com.company.design.singleton;

public class AClazz {

    private SocketClient socketClient;

    public AClazz() {
        this.socketClient = socketClient.getInstance();
        //this.socketClient = new SocketClient();
    }

    public SocketClient getSocketClient() {
        return socketClient;
    }
}
