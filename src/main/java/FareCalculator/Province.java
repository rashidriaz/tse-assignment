package FareCalculator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Province {
    private String name;
    private Set<String> cities;

    public Province(String name) {
        this.name = name;
    }

    public Province(String name, Set<String> cities) {
        this.name = name;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCities() {
        return cities.toArray(new String[0]);
    }

    public void addCity(String newCity) {
        cities.add(newCity);
    }

    public void setCities(String[] cities) {
        this.cities = new HashSet<String>(Arrays.asList(cities));
    }
}
