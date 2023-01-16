package Controller;
//Make by Thành Đạt || Dat09
//Edit by Bình An || AnLaVN || KatoVN

import static Controller.LocalData.Lang;
import static Controller.LocalData.ParentComponent;
import DataAccessObject.BaoCaoDAO;
import DataAccessObject.BuoiThiDAO;
import DataAccessObject.CauHoiDAO;
import DataAccessObject.DeThiDAO;
import DataAccessObject.GiangVienDAO;
import DataAccessObject.LopDAO;
import DataAccessObject.SinhVienDAO;
import com.AnLa.FILE.Log;
import com.AnLa.JDBC.SQL;
import com.AnLa.UI.Mode;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DatabaseData {
    private static final String URL = "[This content has been censored by AnLaVN owner.]",
                                DB_USERNAME = "[This content has been censored by AnLaVN owner.]",
                                DB_PASSWORD = "[This content has been censored by AnLaVN owner.]";
    
    public static final SQL EOA_DB = new SQL(URL, DB_USERNAME, DB_PASSWORD);
    
    public static GiangVienDAO GVDAO = new GiangVienDAO();
    
    public static LopDAO LDAO = new LopDAO();
    public static DeThiDAO DTDAO = new DeThiDAO();
    public static BuoiThiDAO BTDAO = new BuoiThiDAO();
    public static BaoCaoDAO BCDAO = new BaoCaoDAO();
    public static SinhVienDAO SVDAO = new SinhVienDAO();
    public static CauHoiDAO CHDAO = new CauHoiDAO();
    
    public static void DB_Connect(){
        try{    EOA_DB.Connect();   }
        catch(Exception ex){
            Mode.WMessage(ParentComponent, Lang.getString("DBError").replaceFirst("\\.", ".\n"), Lang.getString("Notifi"), JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
    
    private static PreparedStatement get_PreparedStatement(String query, Object... args) throws SQLException{
        PreparedStatement ps = null;
        if (query.trim().startsWith("{"))   {   ps = EOA_DB.getConnect().prepareCall(query);        }
        else                                {   ps = EOA_DB.getConnect().prepareStatement(query);   }
        for(int i = 0; i < args.length; i++){   ps.setObject(i + 1, args[i]);                       }
        return ps;
    }
    
    public static void DB_Update(String query, Object... args){
        try {
            PreparedStatement ps = get_PreparedStatement(query, args);
            ps.executeUpdate(); }
        catch (SQLException ex) {
            Log.add("!!! Error try to execute update query: " + query);
            Logger.getLogger(DatabaseData.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException();}
    }

    public static ResultSet DB_Query(String query, Object... args) {
        try {
            PreparedStatement ps = get_PreparedStatement(query, args);
            return ps.executeQuery();   }
        catch (SQLException ex) {
            Log.add("!!! Error try to execute query: " + query);
            Logger.getLogger(DatabaseData.class.getName()).log(Level.SEVERE, null, ex); }
        throw new RuntimeException();
    }
}