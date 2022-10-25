/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterm.Factory;

/**
 *
 * @author icauguarus
 */
public class FrenchFries implements Product{

    //預設有鹽巴的
    String state = "有鹽巴";
    //預設的建構
    protected FrenchFries(){}
    //帶入狀態的建構
    protected FrenchFries(String state){
        this.state = state;
    }

    @Override
    public void describe() {
        System.out.println("我是"+ state +"薯條");
    }
}
