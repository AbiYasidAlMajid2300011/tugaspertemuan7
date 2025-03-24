package com.abiyasidalmajid2300011.tugaspertemuan7;

public class StopWatch {
    private long startTime;
    private long endTime;
    
    StopWatch() {
        startTime = System.currentTimeMillis();
    }
    
    void start() {
        startTime = System.currentTimeMillis();
    } 
    
    void stop() {
        endTime = System.currentTimeMillis();
    }
    
    long getElapsedTime() {
        return endTime - startTime;
    }
}