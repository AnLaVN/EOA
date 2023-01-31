package DataAccessObject;
//Make by Thành Đạt || Dat09
//Edit by Bình An || AnLaVN || KatoVN

import Controller.DatabaseData;
import ObjectClass.Lop;
import com.AnLa.FILE.Log;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LopDAO extends EOA_DAO<Lop, Object>{

    @Override public void Insert(Lop e) {
        String sql= "INSERT INTO Lop (IDLOP, NAME) VALUES (?, ?)";
        DatabaseData.DB_Update(sql,e.getIDLop(),e.getName());
    }

    @Override public void Delete(Object ID) {
        String sql = "DELETE FROM Lop WHERE IDLOP=?";
        DatabaseData.DB_Update(sql, ID);
    }

    @Override public void Update(Lop e) {
        String sql = "UPDATE Lop SET NAME=? WHERE IDLOP=?";
        DatabaseData.DB_Update(sql,e.getName(),e.getIDLop());
    }
    
    public void InsertGVL(Lop  e, String IDGV){
        String query= "EXEC SP_INSERT_LOP ?, ?, ?";
        DatabaseData.DB_Update(query,IDGV,e.getIDLop(),e.getName());
    }
    
    public ArrayList<Lop> selectAllByGV(String IDGV){
        String sql="SELECT * FROM LOP AS L JOIN GIANGVIEN_LOP AS GVL ON L.IDLOP = GVL.IDLOP WHERE GVL.IDGIANGVIEN = ?";
        return this.selectBySql(sql, IDGV);
    }
    
//    public Lop selectById(int IDLop){
//        String sql="SELECT * FROM Lop WHERE IDLop=?";
//        ArrayList<Lop> list = this.selectBySql(sql, IDLop);
//        return !list.isEmpty() ? list.get(0) : null;
//    }
    
    protected ArrayList<Lop> selectBySql(String sql, Object... args) {
        ArrayList<Lop> list = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = DatabaseData.DB_Query(sql, args);
            while (rs.next()) {
                Lop entity = new Lop();
                entity.setIDLop(rs.getLong("IDLOP"));
                entity.setName(rs.getString("NAME"));
                list.add(entity);
            }
        } catch (SQLException ex) {
            Log.add(ex.toString());
            throw new RuntimeException(ex);
        }
        return list;
    }
}