package com.careerdevs.objectfactory;

//Class Name: Country Fields: name (String), population (long), capital (String)



public class CountryFactory{
        public String name;
        public Long population;
        public String capital;


        //constructor
        CountryFactory(String name, Long population, String capital) {
                this.name = name;
                this.population = population;
                this.capital = capital;
        }

}
