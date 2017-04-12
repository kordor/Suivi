package Traitement;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;


public class FindSquare {
	public FindSquare(){

	}
	public int [] Line(BufferedImage image1){

		
		int [] po=new int [4];
		
		int iMin =0,iMax=0,jMax=0,jMin =0;

		for (int i = 0; i < image1.getWidth(); i++) 
		{
			for (int j = 0; j < image1.getHeight(); j++) {
				int RVB = image1.getRGB(i, j);
				int r=(RVB>>16)& 0xFF;
				int g=(RVB>>8)& 0xFF;
				int b=(RVB)& 0xFF;
				int valeur = r+b+g;
				
				if ((valeur!=0)& (iMin==0)&(jMin==0)){
					iMin=i;
					jMin=j;
				}
				if (valeur!=0) {
					
					if (i<iMin){
						iMin = i;
					}
					if (j<jMin){
						jMin = j;
					}
					if (i>iMax){
						iMax = i;
					}
					if (j>jMax){
					jMax = j;
					}
				
		}
			}
		}
		po[0]= iMin ;
		po[1]=jMin;
		po[2]=iMax;
		po[3]=jMax;
		
		
		return po;
		
		

	}

}
