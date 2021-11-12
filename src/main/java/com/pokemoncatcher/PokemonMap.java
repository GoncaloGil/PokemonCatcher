package com.pokemoncatcher;

import java.util.HashSet;
import java.util.Set;

/***
 * Class definition: This class is composed by a Position class which will have the position here Ash is and
 * a Set which will store all positions visited by Ash.
 */
public class PokemonMap {
    private Position currentPosition;
    private final Set<Position> visitedPositions;

    public PokemonMap(){
        this.currentPosition = new Position(0,0);
        this.visitedPositions = new HashSet<>();
        this.visitedPositions.add(this.currentPosition);
    }

    /***
     * Processes and array of directions order, changing the variable currentPosition and adding the new result
     * to visitedPositions Set
     * @param path - Array of Directions with the moves Ash will make
     */
    public void walk(Direction[] path){
        for(Direction step : path){
            this.currentPosition = this.currentPosition.move(step);
            this.visitedPositions.add(this.currentPosition);
        }
    }

    /***
     * Calculates the number of caught Pokemon by returning the size of visitedPositions
     * @return - number of caught Pokemon
     */
    public long caughtPokemons(){
        return this.visitedPositions.size();
    }

    public Position getCurrentPosition(){
        return this.currentPosition;
    }

}
