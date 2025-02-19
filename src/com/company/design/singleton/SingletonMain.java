package com.company.design.singleton;

import com.company.design.singleton.AClazz;
import com.company.design.singleton.BClazz;
import com.company.design.singleton.SocketClient;

public class SingletonMain {
    public static void main(String[] args) {
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        aClient.connect();
        bClient.connect();

        System.out.println("두 개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));
    }
}
