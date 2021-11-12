package Alive;

import Abstract.State;

public class Person {
    State s = new State();

    public String name;
//_________________________________________

    public Person(){}
    Person(String name, int countOfLives, int fear){
        this.name = name;
        s.lives = countOfLives;
        s.fear = fear;
    }

}
