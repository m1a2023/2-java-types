package com.example.task07;

public class TentCamp {

    private final Area area;
    private final Tent tent;

    TentCamp(int n, int m, int k) {
        this.area = new Area(n, m);
        this.tent = new Tent(k);
    }

    private void setCorrectArea() {
        Area correctArea = getSidesComparision();

        area.setFirstSide(correctArea.getFirstSide());
        area.setSecondSide(correctArea.getSecondSide());
    }

    private Area getSidesComparision() {

        long firstSide = area.getFirstSide() - (area.getFirstSide() % tent.getArea().getFirstSide());
        long secondSide = area.getSecondSide() - (area.getSecondSide() % tent.getArea().getSecondSide());

        Area correctArea = new Area(firstSide, secondSide);

        return correctArea;
    }

    public long getArea() {
        return this.area.getArea();
    }

    public long getQuantityTentsAtCamp() {
        /**
         * Set correct area
         *
         * For example: N=20, M=50, K=3
         * => N-(N%3) - FirstSide
         * => M-(M%3) - SecondSide
         * => TendArea = K * K
         *
         * => N * M / TentArea = Correctly counted tents at camp
         */

        setCorrectArea();

        return getArea() / tent.getArea().getArea();
    }
 }

