package server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author delle
 */
public class DataBase {
    private Connection conn = null;
    private PreparedStatement ps = null;   
    private ResultSet rs = null;

    private void InitDatabase() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/?useSSL=false", "root", "");
            Statement stmnt = conn.createStatement();
            int r = stmnt.executeUpdate("CREATE DATABASE IF NOT EXISTS libmans");        
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void OpenConnection(){
        this.InitDatabase();
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/libmans?useSSL=false", "root", "");       
            ps = conn.prepareStatement("CREATE TABLE IF NOT EXISTS admin("
                    + "id INT(2) UNSIGNED AUTO_INCREMENT PRIMARY KEY,"
                    + "staffID VARCHAR(12) NOT NULL,"
                    + "name VARCHAR(100) NOT NULL,"
                    + "phone VARCHAR(13) NOT NULL,"
                    + "email VARCHAR(150) NOT NULL,"
                    + "password VARCHAR(250) NOT NULL,"
                    + "onDate TIMESTAMP)");
            ps.executeUpdate();
            
            ps = conn.prepareStatement("SELECT * FROM admin");
            if(!ps.executeQuery().next()){
                ps = conn.prepareStatement("INSERT INTO admin (staffID, name, phone, email, password) VALUES('-', '-', '-', '-', '1234')");
                ps.executeUpdate();
            }

            ps = conn.prepareStatement("CREATE TABLE IF NOT EXISTS librarian("
                    + "id INT(2) UNSIGNED AUTO_INCREMENT PRIMARY KEY,"
                    + "staffID VARCHAR(12) NOT NULL,"
                    + "name VARCHAR(100) NOT NULL,"
                    + "phone VARCHAR(13) NOT NULL,"
                    + "email VARCHAR(150) NOT NULL,"
                    + "password VARCHAR(250) NOT NULL,"
                    + "isBlocked BOOLEAN DEFAULT 0,"
                    + "msg VARCHAR(250) NULL,"
                    + "addedBy VARCHAR(50) NOT NULL,"
                    + "onDate TIMESTAMP)");
            ps.executeUpdate();
            
            ps = conn.prepareStatement("CREATE TABLE IF NOT EXISTS member("
                    + "id INT(10) UNSIGNED AUTO_INCREMENT PRIMARY KEY,"
                    + "memberID VARCHAR(12) NOT NULL,"
                    + "name VARCHAR(100) NOT NULL,"
                    + "phone VARCHAR(13) NOT NULL,"
                    + "email VARCHAR(150) NOT NULL,"
                    + "p_address VARCHAR(250) NOT NULL,"
                    + "t_address VARCHAR(250) NOT NULL,"
                    + "addedBy VARCHAR(10) NOT NULL,"
                    + "booksBorrowed VARCHAR(526) NOT NULL,"
                    + "onDate TIMESTAMP)");
            ps.executeUpdate();

            ps = conn.prepareStatement("CREATE TABLE IF NOT EXISTS books("
                    + "id INT(15) UNSIGNED AUTO_INCREMENT PRIMARY KEY,"
                    + "name VARCHAR(100) NOT NULL,"
                    + "auther_name VARCHAR(100) NOT NULL,"
                    + "ISBN VARCHAR(50) NOT NULL,"
                    + "quantity INT(3) NOT NULL,"
                    + "status INT(3) NOT NULL,"
                    + "onDate TIMESTAMP)");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet getValueWhere(String table, String query, String condition){
        try {
            ps = conn.prepareStatement("SELECT "+query+" FROM "+table+" WHERE "+condition);
            return ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ResultSet getRows(String table, String condition){
        try {
            ps = conn.prepareStatement("SELECT * FROM "+table+" WHERE "+condition);
            return ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ResultSet getRows(String table){
        try {
            ps = conn.prepareStatement("SELECT * FROM "+table);
            return ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public int insertData(String table, String query){
        try {
            ps = conn.prepareStatement("INSERT INTO "+table+" "+query);
            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int updateData(String table, String query, String condition){
        try {
            ps = conn.prepareStatement("UPDATE "+table+" SET "+query+" WHERE "+condition);
            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int deleteRow(String table, String condition){
        try {
            ps = conn.prepareStatement("DELETE FROM "+table+" WHERE "+condition);
            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public void SessionStart(ResultSet rs){
        this.rs = rs;
    }
    
    public String GetSessionValue(String str){
        try {
            return this.rs.getString(str);
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
