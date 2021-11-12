package com.pokemoncatcher;

public enum Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST,
    NONE;

    /***
     * Process the char given by argument, returning the correspondent direction object.
     * @param direction - Direction as char;
     * @return - Direction as a Direction object
     */
    public static Direction fromChar(char direction) {
        switch (direction) {
            case 'N':
            case 'n':
                return Direction.NORTH;

            case 'S':
            case 's':
                return Direction.SOUTH;

            case 'E':
            case 'e':
                return Direction.EAST;

            case 'O':
            case 'o':
                return Direction.WEST;

            default:
                return Direction.NONE;
        }
    }

    /***
     * Process the string given as an input argument returning the equivalent as a Direction array.
     * @param path - Path as a String
     * @return directionPath - Path as a Direction array.
     */
    public static Direction[] fromString(String path){
        Direction[] directionPath = new Direction[path.length()];
        for(int i = 0; i < path.length(); i++){
            directionPath[i] = Direction.fromChar(path.charAt(i));
        }
        return directionPath;
    }
}
