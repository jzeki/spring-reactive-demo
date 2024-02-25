package com.weight.idealweigtcalculator.service;

import com.weight.idealweigtcalculator.model.Weight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public class WeightService {
    public Weight calculateWeight(Weight weight) {
        switch(weight.getOption()){
            case 1:
                weight.setWeight(withTwoDecimalPlaces(22*Math.pow(Double.valueOf(weight.getHeight()-10)/100,2)));
                break;
            case 2:
                weight.setWeight(withTwoDecimalPlaces(22*Math.pow(Double.valueOf(weight.getHeight())/100,2)));
                break;
        }
        return weight;
    }
    public  double withTwoDecimalPlaces(double value) {
        DecimalFormat df = new DecimalFormat("#.00");
        return Double.valueOf(df.format(value));
    }
}
