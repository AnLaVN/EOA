package DataAccessObject;
//Make by Thành Đạt || Dat09
//Edit by Bình An || AnLaVN || KatoVN

import Controller.DatabaseData;
import ObjectClass.SinhVien;
import com.AnLa.FILE.Log;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SinhVienDAO extends EOA_DAO<SinhVien, Object>{

    @Override public void Insert(SinhVien e) {
        String sql= "INSERT INTO SinhVien (IDSinhVien, NAME, AVATAR, STATUS, IDLOP) VALUES (?, ?, ?, ?, ?)";
        DatabaseData.DB_Update(sql,e.getIDSinhVien(),e.getName(),e.getAvatar(),e.getStatus(),e.getIDLop());
    }

    @Override public void Delete(Object ID) {
        String sql = "DELETE FROM SinhVien WHERE IDSinhVien=?";
        DatabaseData.DB_Update(sql, ID);
    }

    @Override public void Update(SinhVien e) {
        String sql = "UPDATE SinhVien SET STATUS=? WHERE IDSinhVien=?";
        DatabaseData.DB_Update(sql,e.getStatus(),e.getIDSinhVien());
    }
    public SinhVien selectByIDandLop(String IDSV, Long IDLOP){
        String sql="SELECT * FROM SinhVien WHERE IDSINHVIEN=? AND IDLOP=?";
        ArrayList<SinhVien> list = this.selectBySql(sql, IDSV, IDLOP);
        return !list.isEmpty() ? list.get(0) : null;
    }
    
    public ArrayList<SinhVien> selectById(String IDSV){
        String sql="SELECT * FROM SinhVien WHERE IDSINHVIEN=?";
        return this.selectBySql(sql, IDSV);
    }
    
    protected ArrayList<SinhVien> selectBySql(String sql, Object... args) {
        ArrayList<SinhVien> list = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = DatabaseData.DB_Query(sql, args);
            while (rs.next()) {
                SinhVien entity = new SinhVien();
                entity.setIDSinhVien(rs.getString("IDSINHVIEN"));
                entity.setName(rs.getString("NAME"));
                entity.setAvatar(rs.getString("AVATAR"));
                entity.setStatus(rs.getBoolean("STATUS"));
                entity.setIDLop(rs.getLong("IDLOP"));
                list.add(entity);
            }
        } catch (SQLException ex) {
            Log.add(ex.toString());
            throw new RuntimeException(ex);
        }
        return list;
    }
}