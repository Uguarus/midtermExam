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
public class Manager extends Handler {

    public Manager(){
//        為了方便在這邊設定上級是誰
//        可以轉換到客戶端設定
        setSuccessor(new CEO());
    }

    @Override
    public void handleRequest(Trouble trouble) {
        if(trouble.getWeight() > 1000){
            successor.handleRequest(trouble);
        }else{

            System.out.println("Manager:" + trouble.getName() + "是小問題，不用擔心。" );
        }
    }
}
