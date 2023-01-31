package DataAccessObject;
//Make by Thành Đạt || Dat09
//Edit by Bình An || AnLaVN || KatoVN

import Controller.DatabaseData;
import ObjectClass.CauHoi;
import com.AnLa.FILE.Log;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CauHoiDAO extends EOA_DAO<CauHoi, Object>{

    @Override public void Insert(CauHoi e) {
        String sql= "INSERT INTO CauHoi (IDCAUHOI, LEVEL, QUESTION, ANSWERA, ANSWERB, ANSWERC, ANSWERD, CORRECTANSWER) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        DatabaseData.DB_Update(sql,e.getIDCauHoi(),e.getLevel(),e.getQuestion(),e.getAnswerA(),e.getAnswerB(),e.getAnswerC(),e.getAnswerD(),e.getCorrectAnswer());
    }

    @Override public void Delete(Object ID) {
        String sql = "DELETE FROM CauHoi WHERE IDCAUHOI=?";
        DatabaseData.DB_Update(sql, ID);
    }

    @Override public void Update(CauHoi e) {
        String sql = "UPDATE CauHoi SET LEVEL=?, QUESTION=?, ANSWERA=?, ANSWERB=?, ANSWERC=?, ANSWERD=?,CORRECTANSWER=?  WHERE IDCAUHOI=?";
        DatabaseData.DB_Update(sql,e.getLevel(),e.getQuestion(),e.getAnswerA(),e.getAnswerB(),e.getAnswerC(),e.getAnswerD(),e.getCorrectAnswer(),e.getIDCauHoi());
    }
    public void InsertCHDT(CauHoi e, Long IDDeThi){
        Insert(e);
        String query= "INSERT INTO CAUHOI_DETHI VALUES(?,?)";
        DatabaseData.DB_Update(query, e.getIDCauHoi(), IDDeThi);
    }
    public ArrayList<CauHoi> selectAllByDeThi(Long DeThi){
        String sql="SELECT * FROM CauHoi as CH JOIN CAUHOI_DETHI AS CHDT ON CHDT.IDCAUHOI = CH.IDCAUHOI WHERE CHDT.IDDETHI=?";
        return this.selectBySql(sql, DeThi);
    }
    
    protected ArrayList<CauHoi> selectBySql(String sql, Object...args){
        ArrayList<CauHoi> list = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = DatabaseData.DB_Query(sql, args);
            while (rs.next()) {
                CauHoi entity = new CauHoi();
                entity.setIDCauHoi(rs.getString("IDCAUHOI"));
                entity.setLevel(rs.getInt("LEVEL"));
                entity.setQuestion(rs.getString("QUESTION"));
                entity.setAnswerA(rs.getString("ANSWERA"));
                entity.setAnswerB(rs.getString("ANSWERB"));
                entity.setAnswerC(rs.getString("ANSWERC"));
                entity.setAnswerD(rs.getString("ANSWERD"));
                entity.setCorrectAnswer(rs.getString("CORRECTANSWER"));
                list.add(entity);
            }
        } catch (SQLException ex) {
            Log.add(ex.toString());
            throw new RuntimeException(ex);
        }
        return list;
    }
}