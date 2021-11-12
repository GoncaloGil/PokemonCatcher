package com.pokemoncatcher;


/***
 * Since there's only 1 Pokemon in each position then:
 *  - The number of caught pokemons is the number of unique positions Ash's has visited.
 *  - If all positions are added to a Set structure, this structure will manage the duplicate positions.
 *  - The size of this Set structure is equal to the number of Pokemons caught.
 */

public class Main {
    public static void main(String[] args) {
        if(args.length <= 0 || args[0] == null) {
            System.out.println(1);
            return;
        }
        PokemonMap map = new PokemonMap();
        map.walk(Direction.fromString(args[0]));
        System.out.println(map.caughtPokemons());
    }
}
