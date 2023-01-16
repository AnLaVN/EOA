package ObjectClass;
// Make By Bình An || AnLaVN || KatoVN

import java.awt.Color;

public class GradientColor {
    private Color StartColor, EndColor;

    //Constructor
    public GradientColor() {}
    public GradientColor(Color StartColor, Color EndColor) {    this.StartColor = StartColor;   this.EndColor = EndColor;   }
    
    //Getter
    public Color getStartColor(){   return StartColor;  }
    public Color getEndColor()  {   return EndColor;    }
    
    //Setter
    public void setStartColor(Color StartColor) {   this.StartColor = StartColor;   }
    public void setEndColor(Color EndColor)     {   this.EndColor = EndColor;       }
}