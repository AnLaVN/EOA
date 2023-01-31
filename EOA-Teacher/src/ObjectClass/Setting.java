package ObjectClass;
// Make By Bình An || AnLaVN || KatoVN

import java.io.Serializable;

public class Setting implements Serializable{
    private boolean Mode = true;
    private String Lang = "vi_VN";
    //Constructor
    public Setting() {}
    public Setting(boolean Mode, String Lang){  this.Mode = Mode;   this.Lang = Lang;   }

    //Getter
    public boolean getMode(){   return Mode;    }
    public String  getLang(){   return Lang;    }
    
    //Setter
    public void setMode(boolean Mode)   {   this.Mode = Mode;   }
    public void setLang(String Lang)    {   this.Lang = Lang;   }  
}