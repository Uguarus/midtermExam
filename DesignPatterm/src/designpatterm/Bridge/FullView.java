/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterm.Bridge;

/**
 *
 * @author icauguarus
 */
public class FullView extends View {
    @Override
    public void show() {
        resources.photo();
        resources.describe();
    }
}
