/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterm.ChainofResponsibilityPattern;

/**
 *
 * @author icauguarus
 */
public class Trouble {

    private String name;

    private int weight;

    public Trouble(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}
