/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import server.DataBase;

/**
 *
 * @author delle
 */
public class Main {
    public static  AdminLogin adminLogin = new AdminLogin();
    public static void main(String[] args){
        DataBase.InitDatabase();
        DataBase.OpenConnection();
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
    
    public static ImageIcon icon = new ImageIcon("D:\\projects\\java_projects\\LibraryManagemant\\src\\assests\\icon.png");
}
