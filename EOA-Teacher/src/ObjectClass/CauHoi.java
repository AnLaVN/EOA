package ObjectClass;
//Make by Thành Đạt || Dat09
//Edit by Bình An || AnLaVN || KatoVN

public class CauHoi {
    private String IDCauHoi, Question, AnswerA, AnswerB, AnswerC, AnswerD, CorrectAnswer;
    private int Level;

    //Constructor
    public CauHoi() {}
    public CauHoi(String IDCauHoi, String Question, String AnswerA, String AnswerB, String AnswerC, String AnswerD, String CorrectAnswer, int Level) {
        this.IDCauHoi = IDCauHoi;
        this.Question = Question;
        this.AnswerA = AnswerA;
        this.AnswerB = AnswerB;
        this.AnswerC = AnswerC;
        this.AnswerD = AnswerD;
        this.CorrectAnswer = CorrectAnswer;
        this.Level = Level;
    }

    //Getter
    public String getIDCauHoi()     {   return IDCauHoi;        }
    public String getQuestion()     {   return Question;        }
    public String getAnswerA()      {   return AnswerA;         }
    public String getAnswerB()      {   return AnswerB;         }
    public String getAnswerC()      {   return AnswerC;         }
    public String getAnswerD()      {   return AnswerD;         }
    public String getCorrectAnswer(){   return CorrectAnswer;   }
    public int    getLevel()        {   return Level;           }
    
    //Setter
    public void setIDCauHoi     (String IDCauHoi)       {   this.IDCauHoi = IDCauHoi;           }
    public void setQuestion     (String Question)       {   this.Question = Question;           }
    public void setAnswerA      (String AnswerA)        {   this.AnswerA = AnswerA;             }
    public void setAnswerB      (String AnswerB)        {   this.AnswerB = AnswerB;             }
    public void setAnswerC      (String AnswerC)        {   this.AnswerC = AnswerC;             }
    public void setAnswerD      (String AnswerD)        {   this.AnswerD = AnswerD;             }
    public void setCorrectAnswer(String CorrectAnswer)  {   this.CorrectAnswer = CorrectAnswer; }
    public void setLevel        (int Level)             {   this.Level = Level;                 }
    
}