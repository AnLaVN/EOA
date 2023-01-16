package DataAccessObject;
//Make by Thành Đạt || Dat09
//Edit by Bình An || AnLaVN || KatoVN

import Controller.DatabaseData;
import ObjectClass.BaoCao;
import com.AnLa.FILE.Log;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BaoCaoDAO extends EOA_DAO<BaoCao, Object> {

    @Override public void Insert(BaoCao e) {
        String sql = "INSERT INTO BaoCao (IDSINHVIEN, IDLOP, IDBUOITHI, MARK, LOSTFOCUS) VALUES (?, ?, ?, ?, ?)";
        DatabaseData.DB_Update(sql, e.getIDSinhVien(), e.getIDLop(), e.getIDBuoiThi(), e.getMark(), e.getLostFocus());
    }

    @Override public void Delete(Object ID) {
        String sql = "DELETE FROM BaoCao WHERE IDBUOITHI=?";
        DatabaseData.DB_Update(sql, ID);
    }

    @Override public void Update(BaoCao e) {
        String sql = "UPDATE BaoCao SET MARK=?, LOSTFOCUS=? WHERE IDBUOITHI=? AND IDSINHVIEN=? AND IDLOP=?";
        DatabaseData.DB_Update(sql,e.getMark(),e.getLostFocus(),e.getIDBuoiThi(),e.getIDSinhVien(),e.getIDLop());
    }

    public ArrayList<BaoCao> selectAll() {
        String sql = "SELECT * FROM BaoCao";
        return this.selectBySql(sql);
    }

    public BaoCao selectById(String IDBUOITHI) {
        String sql = "SELECT * FROM BaoCao WHERE IDBUOITHI=?";
        ArrayList<BaoCao> list = this.selectBySql(sql, IDBUOITHI);
        return !list.isEmpty() ? list.get(0) : null;
    }

    protected ArrayList<BaoCao> selectBySql(String sql, Object... args) {
        ArrayList<BaoCao> list = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = DatabaseData.DB_Query(sql, args);
            while (rs.next()) {
                BaoCao entity = new BaoCao();
                entity.setIDBuoiThi(rs.getLong("IDBUOITHI"));
                entity.setIDSinhVien(rs.getString("IDSINHVIEN"));
                entity.setIDLop(rs.getLong("IDLOP"));
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