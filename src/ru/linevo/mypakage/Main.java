package ru.linevo.mypakage;

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
        String a = Direction.NORTH.getShortCode();
        System.out.println(a);

        System.out.println(Direction.valueOf("NORTH"));

        System.out.println(Direction.NORTH.name());

        System.out.println(Direction.NORTH.toString());



    }
}