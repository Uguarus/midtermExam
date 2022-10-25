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
public abstract class View {

    Resources resources;

    public void setResources(Resources resources){
        this.resources = resources;
    }

//    定義畫面如何擺放
    public abstract void show();

}
