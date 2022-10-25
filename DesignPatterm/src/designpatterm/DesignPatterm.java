/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterm;
import designpatterm.TemplateMethodPattern.*;
import designpatterm.Factory.*;
import designpatterm.Proxy.*;

/**
 *
 * @author icauguarus
 */
public class DesignPatterm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //範本方法模式---------------------------------------------
        
        SoftwareManager softwareManager = new SoftwareManager();

        softwareManager.completeSoftware();

        softwareManager.redoSoftware();
        
        //--------------------------------------------------------
        
        //工廠方法模式---------------------------------------------
        Factory friesFac = new FrenchFriesFactory();
        Product fries = friesFac.getProduct();
        Product myfries = ((FrenchFriesFactory) friesFac).getProduct("無鹽的");

        fries.describe();//我是有鹽巴薯條
        myfries.describe();//我是無鹽的薯條
         //--------------------------------------------------------
        
         //代理模式---------------------------------------------
        IBuyHouse littleEngineer = new LittleEngineer();

        IBuyHouse estateAgent = new Agent(littleEngineer);

        estateAgent.findHouse();
        estateAgent.priceTooHigh();
        estateAgent.defendPrice();
        estateAgent.finish();
        
        //--------------------------------------------------------
    }
    
}
