package Controller;
// Make By Bình An || AnLaVN || KatoVN

import ObjectClass.BuoiThi;
import ObjectClass.DeThi;
import ObjectClass.GiangVien;
import ObjectClass.GradientColor;
import ObjectClass.Lop;
import ObjectClass.Setting;
import com.AnLa.FILE.*;
import com.AnLa.SMTP.SendMail;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

public class LocalData {
    public static final String EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
                            PASSWORD = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$",
                                NAME = ".*[0-9~`!@#$%^&*()_+-={}|:\"<>?;',./].*";
    public static final Setting LocalSetting = (Setting) ObjectData.readData("src/AppData/Setting.dat");            //create local setting from file
    public static boolean UIMode = LocalSetting.getMode();                      //contain values of current ui mode. true is dark, false is light
    public static Properties Lang = new Properties("src/AppData/Languages_"+LocalSetting.getLang()+".properties");  //get file properties contain languages
    public static final Color   BLUR = new Color(150, 150, 150, 100),           //some default color
                                BLIND = new Color(0,0,0,0),
                                PANICO = new Color(107, 120, 136, 150),
                                U_TEXT = new Color(153,153,153),
                                PAN_SEN = new Color(105, 120, 135, 100),    
                                PAN_SEN_LIGHT = new Color(207, 213, 220),
                                PAN_SEN_DARK = new Color(85, 95, 105),
                                TTCOLOR = new java.awt.Color(51, 153, 255);
    public static final Font CUSTOMFONT = new java.awt.Font("Tahoma", 0, 20);
    public static final GradientColor c1 = new GradientColor(new Color(181,151,246), new Color(150,198,234)),     //color of parent pan
                                      c2 = new GradientColor(new java.awt.Color(133, 142, 150), new java.awt.Color(96, 105, 107)); //color of open pan in setting
    public static final String CURRENTVERSION = "v2.7.105.8";      //create current version
    public static Frame ParentFrame;
    public static Component ParentComponent;                    //create parent component to contain joption
    public static Window ParentWindow;                         //create parent windown to contain jfilechooser
    public static final SendMail SMTP = new SendMail("[This content has been censored by AnLaVN owner.]", "[This content has been censored by AnLaVN owner.]");
    
    public static GiangVien CurrentGV;
    public static String AVATAR = "", CurrentID = "", SENDMAIL = "", CurrentPCName = System.getenv("USERNAME")+System.getenv("COMPUTERNAME");
    
    public static boolean onChange = true;
    public static ArrayList<Lop> arrLop = new ArrayList<>();
    public static ArrayList<DeThi> arrDeThi = new ArrayList<>();
    public static ArrayList<BuoiThi> arrBuoiThi = new ArrayList<>();
    
    private static URL url;
    private static BufferedReader br;
    
    public static void repaintW(){
        ParentComponent.repaint();
    }
    public static void setLang(String languages)                {
        Lang.setProperties("src/AppData/Languages_"+languages+".properties");
    }
    
    public static void checkVersion() {
//  [This content has been censored by AnLaVN owner.]
    }
    public static String makeOTP(){
//  [This content has been censored by AnLaVN owner.]
        return null;
    }
    private static String UnicodeDecimal = "";
    public static String StrToUnicodeDecimal(String text){
        UnicodeDecimal = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i); int value = c;
            UnicodeDecimal += "&#" + value + ";";
        }
        return UnicodeDecimal;
    }
    private static final File PATH = new File("src/User");
    public static void WriteLocalUser(GiangVien gv){
        if (!PATH.exists()) PATH.mkdirs(); 
        com.AnLa.FILE.ObjectData.writeData("src/User/LocalUser.dat", gv); 
    }
    public static GiangVien ReadLocalUser(){
        return (GiangVien) com.AnLa.FILE.ObjectData.readData("src/User/LocalUser.dat");
    }
    
    public static void saveAvatar(String url)                   {
        if (!PATH.exists()) PATH.mkdirs(); 
        try ( InputStream in = new URL(url).openStream()) {
            Path path = Paths.get(AVATAR);
            Files.copy(in, path, StandardCopyOption.REPLACE_EXISTING);
        }catch(Exception e){ Log.add("!!! Error try to download Avatar from Cloundinary. !!!");}
    }
    public static void readAvatar()                             {
        String linkAvatar = CurrentGV.getAvatar();
        if(linkAvatar == null || linkAvatar.equals("")){
            AVATAR = UIMode ? "src/AppData/teacher0.png" : "src/AppData/teacher1.png"; 
            Log.add("User doesn't have Avatar, get default Avatar: " + AVATAR); }
        else if(Files.notExists(Paths.get(AVATAR), java.nio.file.LinkOption.NOFOLLOW_LINKS)){
            Log.add("Avatar not available on this device, waiting for download from: " + linkAvatar);
            saveAvatar(linkAvatar);}
    }
    public static void deleAvatar()                             {
        try{    Files.delete(Paths.get(AVATAR));    }
        catch(IOException e){Log.add("!!! Error try to delete Avatar at '"+Paths.get(AVATAR)+"' !!!");}
    }
    
}