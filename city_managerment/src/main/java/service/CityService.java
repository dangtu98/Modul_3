package service;

import model.City;

import java.util.ArrayList;

public class CityService {
    private final static  ArrayList<City> cities;

    static {
        cities = new ArrayList<>();
        cities.add(new City(1,"HN",100000,40000,10000000, "vn"));
    }

    public City getCity(int id){
        for (City city : cities){
            if (city.getId() == id){
                return city;
            }
        }
        return  null;
    }

    public void createCity(City city){
        cities.add(city);
    }

    public void deleteCity(City city){
        cities.remove(city);
    }

    public   void editCity(City city , int index){
        cities.set(index,city);
    }

    public ArrayList<City> getCities(){
        return cities;
    }
}
