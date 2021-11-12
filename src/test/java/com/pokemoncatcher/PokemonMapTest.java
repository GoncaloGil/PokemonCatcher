package com.pokemoncatcher;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class PokemonMapTest {

    @Test
    void walkNORTH(){
        //Given
        PokemonMap map = new PokemonMap();
        Position expected = new Position(0,1);
        Direction[] path = Direction.fromString("N");
        //When
        map.walk(path);

        //Then
        assertEquals(expected,map.getCurrentPosition());
    }

    @Test
    void walkSouth(){
        //Given
        PokemonMap map = new PokemonMap();
        Position expected = new Position(0,-1);
        Direction[] path = Direction.fromString("S");
        //When
        map.walk(path);

        //Then
        assertEquals(expected,map.getCurrentPosition());
    }

    @Test
    void walkEAST(){
        //Given
        PokemonMap map = new PokemonMap();
        Position expected = new Position(1,0);
        Direction[] path = Direction.fromString("E");
        //When
        map.walk(path);

        //Then
        assertEquals(expected,map.getCurrentPosition());
    }

    @Test
    void walkWEST(){
        //Given
        PokemonMap map = new PokemonMap();
        Position expected = new Position(-1,0);
        Direction[] path = Direction.fromString("O");
        //When
        map.walk(path);

        //Then
        assertEquals(expected,map.getCurrentPosition());
    }

    @Test
    void path1(){
        //Given
        PokemonMap map = new PokemonMap();
        Direction[] path = Direction.fromString("NSEO");

        //When
        map.walk(path);

        //Then
        assertEquals(3,map.caughtPokemons());
    }


    @Test
    void path2(){
        //Given
        PokemonMap map = new PokemonMap();
        Direction[] path = Direction.fromString("NOSSEENN");

        //When
        map.walk(path);

        //Then
        assertEquals(9,map.caughtPokemons());
    }

    @Test
    void path3(){
        //Given
        PokemonMap map = new PokemonMap();
        Direction[] path = Direction.fromString("NOSSEENNOOSSEENN");

        //When
        map.walk(path);

        //Then
        assertEquals(9,map.caughtPokemons());
    }

    @Test
    void path4(){
        //Given
        PokemonMap map = new PokemonMap();
        Direction[] path = Direction.fromString("NOSSEENNabc");

        //When
        map.walk(path);

        //Then
        assertEquals(9,map.caughtPokemons());
    }

    @Test
    void path5(){
        //Given
        PokemonMap map = new PokemonMap();
        Direction[] path = Direction.fromString("ENSSSESESNSOSSEESSSESSEE");

        //When
        map.walk(path);

        //Then
        assertEquals(22,map.caughtPokemons());
    }

    @Test
    void path6(){
        //Given
        PokemonMap map = new PokemonMap();
        Direction[] path = Direction.fromString("SENSNEEEENNNNEONSNESNEEESSSSOEOSONENSNSSEESSESSENEOOSOEESNEOSESOSSSSOENSSONEEEEEONSESNEEOSNESSEOSNEOOEENNOOEEOSSEEENSNSEEESSSNNESEEOEESESESONEOOSSSSEENESESESSEONSOEEEOSEOSOENEESOOEONENSOEEENEEEESNSENOSEESOOENSOEENNENNOONESEONSSENSEENNNSOONSSNSSSNOEOONENNSESOSSESSSEEESEOSEEEEOESSSNSOSSSOOENONSNSOESSNSOSNEONSEEENSEESSOSEEESSNENSOOEEOSEENOEEESSSNSSONOSESESNSSENNSSSSSEESONEESSSONEONEEOESSESEENNOESEEESESEOSNENSSOSESENEEOEEENONEENSSSSSSSOOOOSENNOONEENNESENEEEESOSNSSEEONNNSSSSSSESESSENENSNNNSNOENSSSENSEEOSNESSSENSNNSSOOSOSOSENESNESOOESNESESSESEENEEOEEESESEESNNNOSNSNSENSESEOOEOSEOSOEENEEOESSESENEONEONSSSNESSOSOOEEOSNNSESSNSONOESSEESESSSSEESSSSOSESNOOSOSOOSESESEONSNNSOOEEOSSENEENENESSOEESEEESESOSSSNENEONSNNOSEOSESENNESSNESOESOSOEOSNOEONOSSSSOENONESOESEONNEOEEOSESSEEEESSSEESESSOEESOONNEESSSOSSOOESESNNOOSSSEENESEENSSSNOESEONESENESESOEOESEEESNEENSSNSSSEOESSESENOENSEESEESNOSESENSSONOEESOEESOSEEESSSOENNSNEENENSEENEESNEESSSOSSSESOEESSESSSSSESSEOEONSNSSEESEOSOEOOOENNNENENSEONSESESESSESSNSSSSSNEENEOE");

        //When
        map.walk(path);

        //Then
        assertEquals(628,map.caughtPokemons());
    }
}
