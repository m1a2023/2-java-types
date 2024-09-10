package com.example.task07;

public class Area {

    private long n;
    private long m;

    public Area(long n, long m) {
        this.n = n;
        this.m = m;
    }

    public long getArea() {
        return n * m;
    }

    public long getFirstSide() {
        return this.n;
    }

    public long getSecondSide() {
        return this.m;
    }

    public void setFirstSide(long n) {
        this.n = n;
    }

    public void setSecondSide(long m) {
        this.m = m;
    }
}
