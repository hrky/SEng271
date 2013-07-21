/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seng271.group8.ludo.strategies;

import seng271.group8.ludo.Dice;

/**
 *
 * @author alastair
 */
public abstract class AbstractStrategy implements Strategy {
    protected String name = "Abstract Strategy";
    
    @Override
    public String toString(){
            return this.name;
    }
    
    @Override
    public int getRoll(Dice d) {
        return d.roll();
    }
}
