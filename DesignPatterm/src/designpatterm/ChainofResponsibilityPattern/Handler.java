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
public abstract class Handler {

    Handler successor;

    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    public abstract void handleRequest(Trouble trouble);
}

