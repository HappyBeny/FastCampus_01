package com.company.design.adapter;

public class HomeMain {

    public static void main(String[] args) {
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V adapter1 = new SocketAdapter(cleaner);
        connect(adapter1);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V adapter2 = new SocketAdapter(airConditioner);
        connect(adapter2);
    }
    //콘센트
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}
