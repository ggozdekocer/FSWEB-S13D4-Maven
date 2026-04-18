package org.example;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0, 0);
        System.out.println("distance()= " + point.distance());
    }


    public static class Point{
        private int x;
        private int y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        public int getX(){
            return x;
        }

        public int getY(){
            return y;
        }

        public void setX(int x){
            this.x = x;
        }

        public void setY(int y){
            this.y = y;
        }

        public double distance(){
            return Math.sqrt((0 - x) * (0 - x) + (0 - y) * (0 - y));
        }

        public double distance(Point p) {
            return Math.sqrt((p.x - x) * (p.x - x) + (p.y - y) * (p.y - y));
        }

        public double distance(int a, int b) {
            return Math.sqrt((a - x) * (a - x) + (b - y) * (b - y));
        }
    }





}

