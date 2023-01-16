package DataAccessObject;
//Make by Thành Đạt || Dat09
//Edit by Bình An || AnLaVN || KatoVN

import Controller.DatabaseData;
import ObjectClass.DeThi;
import com.AnLa.FILE.Log;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public  class DeThiDAO extends EOA_DAO<DeThi, Object>{

    @Override public void Insert(DeThi e) {
        String sql= "INSERT INTO DeThi (IDDETHI, NAME, TOTAL, IDGIANGVIEN) VALUES (?, ?, ?, ?)";
        DatabaseData.DB_Update(sql,e.getIDDeThi(),e.getName(),e.getTotal(),e.getIDGiangVien());
    }

    @Override public void Delete(Object ID) {
        String sql = "DELETE FROM DeThi WHERE IDDETHI=?";
        DatabaseData.DB_Update(sql, ID);
    }

    @Override public void Update(DeThi e) {
        String sql = "UPDATE DeThi SET NAME=?, TOTAL=?, PercentA=?, PercentB=?, PercentC=?, PercentD=?, PercentT=? WHERE IDDETHI=?";
        DatabaseData.DB_Update(sql,e.getName(),e.getTotal(),e.getPercentA(),e.getPercentB(),e.getPercentC(),e.getPercentD(),e.getPercentT(),e.getIDDeThi());
    }
    
    public ArrayList<DeThi> selectAllByGV(String IDGV){
        String sql="SELECT * FROM DeThi WHERE IDGIANGVIEN = ?";
        return this.selectBySql(sql,IDGV);
    }
    
//    public DeThi selectById(String IDDeThi){
//        String sql="SELECT * FROM DeThi WHERE IDDeThi=?";
//        ArrayList<DeThi> list = this.selectBySql(sql, IDDeThi);
//        return !list.isEmpty() ? list.get(0) : null;
//    }
    
    protected ArrayList<DeThi> selectBySql(String sql, Object...args){
        ArrayList<DeThi> list = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = DatabaseData.DB_Query(sql, args);
            while (rs.next()) {
                DeThi entity = new DeThi();
                entity.setIDDeThi(rs.getLong("IDDETHI"));
                entity.setName(rs.getString("NAME"));
                entity.setTotal(rs.getInt("TOTAL"));
                entity.setPercentA(rs.getInt("PercentA"));
                entity.setPercentB(rs.getInt("PercentB"));
                entity.setPercentC(rs.getInt("PercentC"));
                entity.setPercentD(rs.getInt("PercentD"));
                entity.setPercentT(rs.getInt("PercentT"));
                entity.setIDGiangVien(rs.getString("IDGIANGVIEN"));
                list.add(entity);
            }
        } catch (SQLException ex) {
            Log.add(ex.toString());
            throw new RuntimeException(ex);
        }
        return list;
    }
}