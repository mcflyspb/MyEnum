package ru.linevo.num;

public class Main {
    enum Direction {
        EAST("E"),
        WEST("W"),
        NORTH("N") {
            public String getShortCode() {
                return "TEST";
            }
        },
        SOUTH("S");

        private final String shortCode;

        Direction(String code) {

            this.shortCode = code;
        }

        public String getShortCode() {

            return this.shortCode;
        }
    }
    public static void main(String[] args) {
        System.out.println(Direction.NORTH.getShortCode());// TEST
        System.out.println(Direction.valueOf("NORTH")); //NORTH
        System.out.println(Direction.NORTH.name()); //NORTH
        System.out.println(Direction.NORTH); //NORTH
        System.out.println(Direction.EAST.getShortCode()); //E
    }
}