/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foundations.of.ai.project.pkg2;

/**
 *
 * @author Brandon
 */
public class Literal {
    
    String name;
    
    boolean positive;
    boolean gamma;

    public Literal(String input, boolean pos, boolean neg) {
        name = input;
        positive = pos;
        gamma = neg;
    }

    @Override
    public String toString() {
        return "{" + name + '}';
    }
    
    

    public void setName(String name) {
        this.name = name;
    }

    public void setPositive(boolean positive) {
        this.positive = positive;
    }

    public void setNegative(boolean negative) {
        this.gamma = negative;
    }

    public String getName() {
        return name;
    }

    public boolean isPositive() {
        return positive;
    }

    public boolean isNegative() {
        return gamma;
    }
    
    
}
