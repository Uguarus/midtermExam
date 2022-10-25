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
public class CEO extends Handler {
    @Override
    public void handleRequest(Trouble trouble) {
        System.out.println("CEO:" + trouble.getName() + "是誰搞的！叫他過來。");
    }
}
