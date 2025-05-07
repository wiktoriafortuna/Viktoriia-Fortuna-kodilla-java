package com.kodilla.testing.weather.stub;

import java.sql.ClientInfoStatus;
import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double srednia() {
        double result = 0;

        for (Double temperatura : temperatures.getTemperatures().values()) {
            result = result + temperatura;

        }
        return result / temperatures.getTemperatures().values().size();
    }

    public double mediana() {
        List<Double> lista = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(lista);
        int size= lista.size();
        if (size == 0) return 0;
        if (size % 2 == 1) {
            return lista.get(size / 2);
        } else {
            return (lista.get(size / 2 - 1) + lista.get(size / 2)) / 2;
        }
    }

    }

