package com.example.task07;

public class Tent {

   private final Area area;

   Tent(int k) {
       this.area = new Area(k, k);
   }

   public Area getArea() {
       return area;
   }
}
