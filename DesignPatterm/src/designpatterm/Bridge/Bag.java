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
public class Bag implements Resources {
    @Override
    public void photo() {
        System.out.println("包包的照片");
    }

    @Override
    public void snippet() {
        System.out.println("包包的簡短說明");
    }

    @Override
    public void describe() {
        System.out.println("包包詳細說明");
    }
}
