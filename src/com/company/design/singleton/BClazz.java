package com.company.design.singleton;

public class BClazz {

    private SocketClient socketClient;

    public BClazz() {
        this.socketClient = socketClient.getInstance();
        //this.socketClient = new SocketClient();
    }

    public SocketClient getSocketClient() {
        return socketClient;
    }
}
