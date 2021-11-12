package com.pokemoncatcher;

/***
 * Class definition: This class is composed by two long variables corresponding to the dimensions of Pokemon's World
 */
public class Position{
    public final long x,y;

    public Position(long x, long y){
        this.x = x;
        this.y = y;
    }

    /***
     * Calculates the next position of Ash based on the direction given by the input argument
     * @param direction - The direction of the movement. Can be: N - North, S - South, E - East and W - West.
     *                  - Any other value will return the same position.
     * @return outputPosition - The object matching the new position after the move in the specified direction
     */
    public Position move(Direction direction){
        switch (direction) {
            case EAST: return new Position(this.x + 1, this.y);
            case WEST: return new Position(this.x - 1, this.y);
            case NORTH: return new Position(this.x, this.y + 1);
            case SOUTH: return new Position(this.x, this.y - 1);
            default: return this;
        }
    }


    @Override
    public boolean equals(Object other){
        return other == this ||
                (other instanceof Position &&
                (((Position) other).x == this.x) && (((Position) other).y == this.y));
    }

    @Override
    public int hashCode(){
        return (int) (31 * this.x + this.y);
    }
}
