package com.skySpider;

import java.util.Timer;


public class AppStart {
    public static void main( String[] args ){
       Timer timer = new Timer();
       timer.schedule(null, System.currentTimeMillis(), 3*1000);
    }
}
