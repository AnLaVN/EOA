package DataAccessObject;
//Make by Thành Đạt || Dat09
//Edit by Bình An || AnLaVN || KatoVN

import Controller.DatabaseData;
import ObjectClass.GiangVien;
import com.AnLa.FILE.Log;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GiangVienDAO extends EOA_DAO<GiangVien, Object>{
    
    @Override public void Insert(GiangVien e) {
        String query= "INSERT INTO GIANGVIEN (IDGIANGVIEN, NAME, EMAIL, AVATAR, PASSWORD) VALUES (?, ?, ?, ?, ?)";
        DatabaseData.DB_Update(query,e.getIDGiangVien(),e.getName(),e.getEmail(),e.getAvatar(),e.getPassword());
    }

    @Override public void Delete(Object ID) {
        String query = "DELETE FROM GIANGVIEN WHERE IDGIANGVIEN=?";
        DatabaseData.DB_Update(query, ID);
    }

    @Override public void Update(GiangVien e) {
        String query = "UPDATE GIANGVIEN SET NAME=?, EMAIL=?, AVATAR=? , PASSWORD=? WHERE IDGIANGVIEN=?";
        DatabaseData.DB_Update(query,e.getName(),e.getEmail(),e.getAvatar(),e.getPassword(),e.getIDGiangVien());
    }
//    public List<GiangVien> selectAll(){
//        String query="SELECT * FROM GiangVien";
//        return this.selectBySql(query);
//    }
    
    public GiangVien selectById(String IDGV){
        String query="SELECT * FROM GiangVien WHERE IDGIANGVIEN=?";
        List<GiangVien> list = this.selectBySql(query, IDGV);
        return !list.isEmpty() ? list.get(0) : null;
    }
    public GiangVien selectByEmail(String Email){
        String query="SELECT * FROM GiangVien WHERE EMAIL=?";
        List<GiangVien> list = this.selectBySql(query, Email);
        return !list.isEmpty() ? list.get(0) : null;
    }

    protected List<GiangVien> selectBySql(String query, Object... args) {
        List<GiangVien> list = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = DatabaseData.DB_Query(query, args);
            while (rs.next()) {
                GiangVien entity = new GiangVien();
                entity.setIDGiangVien(rs.getString("IDGIANGVIEN"));
                entity.setName(rs.getString("NAME"));
                entity.setAvatar(rs.getString("AVATAR"));
                entity.setEmail(rs.getString("EMAIL"));
                entity.setPassword(rs.getString("PASSWORD"));
                list.add(entity);
            }
        } catch (SQLException ex) { 
            Log.add(ex.toString());
            throw new RuntimeException(ex);
        }
        return list;
    }
}