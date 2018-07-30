/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.ImageIcon;

/**
 *
 * @author delle
 */
public class Main {
    public static void main(String[] args){
        Login adminLogin = new Login();
        ImageIcon icon = new ImageIcon(System.getProperty("user.dir")+"/src/assests/icon.png");
        SplashScreen splash = new SplashScreen();
        splash.setIconImage(icon.getImage());
        splash.setVisible(true);
        try{
            for(int x = 0; x<=100; x++){
                Thread.sleep((long) (Math.random()*50));
                splash.LoadingBar.setValue(x);
                if(x==100){
                    adminLogin.setIconImage(icon.getImage());
                    splash.setVisible(false);
                    adminLogin.setVisible(true);
                }
            }
        }catch(InterruptedException e){

        }
    }
}
