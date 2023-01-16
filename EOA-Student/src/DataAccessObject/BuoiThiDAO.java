package DataAccessObject;
//Make by Thành Đạt || Dat09
//Edit by Bình An || AnLaVN || KatoVN

import Controller.DatabaseData;
import ObjectClass.BuoiThi;
import com.AnLa.FILE.Log;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BuoiThiDAO extends EOA_DAO<BuoiThi, Object> {

    @Override public void Insert(BuoiThi e) {
        String sql = "INSERT INTO BuoiThi (IDBUOITHI, NAME, START, DELAY, TIME, IDDETHI, IDGIANGVIEN) VALUES (?, ?, ?, ?, ?, ?, ?)";
        DatabaseData.DB_Update(sql, e.getIDBuoiThi(), e.getName(), new java.sql.Timestamp(e.getStart().getTime()), e.getDelay(), e.getTime(), e.getIDDeThi(), e.getIDGiangVien());
    }

    @Override public void Delete(Object ID) {
        String sql = "DELETE FROM BuoiThi WHERE IDBUOITHI=?";
        DatabaseData.DB_Update(sql, ID);
    }

    @Override public void Update(BuoiThi e) {
        String sql = "UPDATE BuoiThi SET NAME=?, START=?, DELAY=?, TIME=?, IDDETHI=? WHERE IDBUOITHI=?";
        DatabaseData.DB_Update(sql, e.getName(), new java.sql.Timestamp(e.getStart().getTime()), e.getDelay(), e.getTime(), e.getIDDeThi(), e.getIDBuoiThi());
    }
    public ArrayList<BuoiThi> selectAllByIdLop(Long IDLop){
        String sql = "SELECT * FROM BUOITHI AS BT JOIN BUOITHI_LOP AS BTL ON BTL.IDBUOITHI = BT.IDBUOITHI WHERE BTL.IDLOP = ? AND DATEADD(hh, 13, GETDATE()) < DATEADD(mi, BT.TIME, BT.START) ORDER BY START ASC";
        return this.selectBySql(sql, IDLop);
    }
    public BuoiThi selectById(Long IDBUOITHI) {
        String sql = "SELECT * FROM BuoiThi WHERE IDBUOITHI=?";
        ArrayList<BuoiThi> list = this.selectBySql(sql, IDBUOITHI);
        return !list.isEmpty() ? list.get(0) : null;
    } 
    protected ArrayList<BuoiThi> selectBySql(String sql, Object... args) {
        ArrayList<BuoiThi> list = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = DatabaseData.DB_Query(sql, args);
            while (rs.next()) {
                BuoiThi entity = new BuoiThi();
                entity.setIDBuoiThi(rs.getLong("IDBUOITHI"));
                entity.setName(rs.getString("NAME"));
                entity.setStart(rs.getTimestamp("START"));
                entity.setDelay(rs.getInt("DELAY"));
                entity.setTime(rs.getInt("TIME"));
                entity.setIDDeThi(rs.getLong("IDDETHI"));
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