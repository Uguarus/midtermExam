/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterm;
import designpatterm.TemplateMethodPattern.*;
import designpatterm.Factory.*;
import designpatterm.Proxy.*;
import designpatterm.Bridge.*;
import designpatterm.ChainofResponsibilityPattern.*;

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
        
        FewView fewView = new FewView();
        System.out.println("---- 簡單包包說明 ----");
        fewView.setResources(new Bag());
        fewView.show();
        System.out.println("---- 簡單書本說明 ----");
        fewView.setResources(new Book());
        fewView.show();

        FullView fullView = new FullView();
        System.out.println("---- 詳細包包說明 ----");
        fullView.setResources(new Bag());
        fullView.show();
        System.out.println("---- 詳細書本說明 ----");
        fullView.setResources(new Book());
        fullView.show();
        //------------------------------------------------------
                Handler manager = new Manager();

//        小問題
        Trouble smallTrouble = new Trouble("想加薪500", 500);

        manager.handleRequest(smallTrouble);

//        大問題
        Trouble bigTrouble = new Trouble("搞壞五十萬的機器",500000);

        manager.handleRequest(bigTrouble);

    }
    
}
