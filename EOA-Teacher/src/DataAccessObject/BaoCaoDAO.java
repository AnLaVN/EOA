package DataAccessObject;
//Make by Thành Đạt || Dat09
//Edit by Bình An || AnLaVN || KatoVN

import Controller.DatabaseData;
import ObjectClass.BaoCao;
import ObjectClass.BuoiThi;
import com.AnLa.FILE.Log;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BaoCaoDAO extends EOA_DAO<BaoCao, Object> {

    @Override public void Insert(BaoCao e) {}

    @Override public void Delete(Object ID) {
        String sql = "DELETE FROM BaoCao WHERE IDBUOITHI=?";
        DatabaseData.DB_Update(sql, ID);
    }

    @Override public void Update(BaoCao e){}

    public ArrayList<BaoCao> selectAllById(BuoiThi bt, String IDGV) {
        String sql = "EXEC SP_BAOCAO ?, ?, ?";
        return this.selectBySql(sql, bt.getIDBuoiThi(), bt.getIDLop(), IDGV);
    }

    protected ArrayList<BaoCao> selectBySql(String sql, Object... args) {
        ArrayList<BaoCao> list = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = DatabaseData.DB_Query(sql, args);
            while (rs.next()) {
                BaoCao entity = new BaoCao();
                entity.setIDSinhVien(rs.getString("IDSINHVIEN"));
                entity.setName(rs.getString("Name"));
                entity.setStatus(rs.getBoolean("STATUS"));
                entity.setMark(rs.getDouble("MARK"));
                entity.setLostFocus(rs.getInt("LOSTFOCUS"));
                list.add(entity);
            }
        } catch (SQLException ex) {
            Log.add(ex.toString());
            throw new RuntimeException(ex);
        }
        return list;
    }
}