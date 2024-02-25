package com.weight.idealweigtcalculator.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Weight {
    private int option;
    private int height = 170;
    private double weight;
}
