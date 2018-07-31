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
            int r = stmnt.executeUpdate("CREATE DATABASE IF NOT EXISTS libmans_v1");        
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void OpenConnection(){
        this.InitDatabase();
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/libmans_v1?useSSL=false", "root", "");       
            ps = conn.prepareStatement("CREATE TABLE IF NOT EXISTS admin("
                    + "id INT(2) UNSIGNED AUTO_INCREMENT PRIMARY KEY,"
                    + "staffID VARCHAR(12),"
                    + "name VARCHAR(100),"
                    + "phone VARCHAR(13),"
                    + "email VARCHAR(150),"
                    + "password VARCHAR(250) NOT NULL,"
                    + "onDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP)");
            ps.executeUpdate();
            
            ps = conn.prepareStatement("SELECT * FROM admin");
            if(!ps.executeQuery().next()){
                ps = conn.prepareStatement("INSERT INTO admin (password, onDate) VALUES('1234', CURRENT_TIMESTAMP)");
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
                    + "booksBorrowed VARCHAR(526),"
                    + "isBlocked BOOLEAN DEFAULT false,"
                    + "onDate TIMESTAMP)");
            ps.executeUpdate();

            ps = conn.prepareStatement("CREATE TABLE IF NOT EXISTS books("
                    + "id INT(15) UNSIGNED AUTO_INCREMENT PRIMARY KEY,"
                    + "name VARCHAR(100) NOT NULL,"
                    + "author_name VARCHAR(100) NOT NULL,"
                    + "publication VARCHAR(100) NOT NULL,"
                    + "storage_location VARCHAR(100),"
                    + "ISBN VARCHAR(50) NOT NULL,"
                    + "quantity INT(3) NOT NULL,"
                    + "status INT(3) NOT NULL,"
                    + "price INT(4) NOT NULL,"
                    + "onDate TIMESTAMP)");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet getValueWhere(String table, String condition){
        try {
            ps = conn.prepareStatement("SELECT * FROM "+table+" WHERE "+condition);
            return ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String getValueWhere(String table, String query, String condition){
        try {
            ps = conn.prepareStatement("SELECT * FROM "+table+" WHERE "+condition);
            ResultSet thisrs = ps.executeQuery();
            if(thisrs.next()){
                String result = thisrs.getString(query);
                if(thisrs.wasNull()) return "";
                return result;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public int getIntValueWhere(String table, String query, String condition){
        try {
            ps = conn.prepareStatement("SELECT * FROM "+table+" WHERE "+condition);
            ResultSet thisrs = ps.executeQuery();
            if(thisrs.next()){
                int result = thisrs.getInt(query);
                if(thisrs.wasNull()) return 0;
                return result;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
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
            String result = this.rs.getString(str);
            if(this.rs.wasNull()) return "";
            else return result;
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public int GetSessionValue(String str, String option){
        try {
            if(option.equals("int")){
                int result = this.rs.getInt(str);
                if(this.rs.wasNull()) return 0;
                else return result;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
