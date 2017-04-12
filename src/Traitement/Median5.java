package Traitement;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
public class Median5 {
	public Median5() {
		// TODO Auto-generated constructor stub

	}
	int Valeur[]=new int[25];
	ArrayList <Integer> list = new ArrayList  <>();
	BufferedImage image2;
	int n =9;
	public BufferedImage DetectV(BufferedImage image1){
image2 = new BufferedImage( image1.getWidth(),image1.getHeight(),BufferedImage.TYPE_INT_RGB );
		
	    int MR[][]= new int[image1.getWidth()][image1.getHeight()] ;
//		int MV[][]= new int[image1.getWidth()][image1.getHeight()] ;
//		int MB[][]= new int[image1.getWidth()][image1.getHeight()] ;
	
      for (int x=0; x<image1.getWidth(); x++){
    	  for (int y=0; y<image1.getHeight(); y++){
    		  int rgb = image1.getRGB(x, y);
    		  Color col = new Color(rgb, true);
    		 MR[x][y]= col.getRed();
//    		 MV[x][y]= col.getGreen();
//    		 MB[x][y]= col.getBlue();
    	  }}
  
      for (int x=1; x<image1.getWidth()-1; x++){
    	  for (int y=1; y<image1.getHeight()-1; y++){
    		  //rrrrrrrrrrrrrrrrrrrrrrrrrrr
    		  Valeur[0]=MR[x-1][y-1];
          Valeur[1]=MR[x][y-1];
          Valeur[2]=MR[x+1][y-1];
          Valeur[3]=MR[x-1][y];
          Valeur[4]=MR[x-1][y+1];
          Valeur[5]=MR[x][y];
          Valeur[6]=MR[x+1][y];
          Valeur[7]=MR[x][y+1];
          Valeur[8]=MR[x+1][y+1];
          
          for(int i=0;i<n;i++)
		  {
			  for(int j=i+1;j<n;j++)
				  if(Valeur[i]>Valeur[j])
				  {
					//interchange values
					  int temp=Valeur[i];
					  Valeur[i]=Valeur[j];
					  Valeur[j]=temp;
				  }
		  }
          MR [x][y] = Valeur[4];
          //rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr
          
          //vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv

//          Valeur[0]=MV[x-1][y-1];
//          Valeur[1]=MV[x][y-1];
//          Valeur[2]=MV[x+1][y-1];
//          Valeur[3]=MV[x-1][y];
//          Valeur[4]=MV[x-1][y+1];
//          Valeur[5]=MV[x][y];
//          Valeur[6]=MV[x+1][y];
//          Valeur[7]=MV[x][y+1];
//          Valeur[8]=MV[x+1][y+1];
//          
//          for(int i=0;i<n;i++)
//		  {
//			  for(int j=i+1;j<n;j++)
//				  if(Valeur[i]>Valeur[j])
//				  {
//					//interchange values
//					  int temp=Valeur[i];
//					  Valeur[i]=Valeur[j];
//					  Valeur[j]=temp;
//				  }
//		  }
//          MV [x][y] = Valeur[4];
////vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
//
////bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
//          Valeur[0]=MB[x-1][y-1];
//          Valeur[1]=MB[x][y-1];
//          Valeur[2]=MB[x+1][y-1];
//          Valeur[3]=MB[x-1][y];
//          Valeur[4]=MB[x-1][y+1];
//          Valeur[5]=MB[x][y];
//          Valeur[6]=MB[x+1][y];
//          Valeur[7]=MB[x][y+1];
//          Valeur[8]=MB[x+1][y+1];
//          
//       /*   System.out.print("given list:");
//		  for(int i=0;i<n;i++)
//		  {
//			  System.out.print(" "+number[i]);
//		  }
//		  System.out.println(" ");*/
//          
//          for(int i=0;i<n;i++)
//		  {
//			  for(int j=i+1;j<n;j++)
//				  if(Valeur[i]>Valeur[j])
//				  {
//					//interchange values
//					  int temp=Valeur[i];
//					  Valeur[i]=Valeur[j];
//					  Valeur[j]=temp;
//				  }
//		  }
          
         /* System.out.print("Sorted list:");
    	  for(int i=0;i<n;i++)
    	  {
    		  System.out.print(" "+number[i]);
    	  }
    	  System.out.println("");
    	  System.out.println(number[4]);*/
          
       //   MB [x][y] = Valeur[4]; 
//bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
   image2.setRGB(x, y, (0xFF<<24)|(MR [x][y]<<16)|(MR [x][y]<<8)|MR [x][y]);
    	  }
    	  
      }
      return image2;
	}
}






//list.add(matriceIN[x-1][y-1]);
//list.add(matriceIN[x][y-1]);
//list.add(matriceIN[x+1][y-1]);
//list.add(matriceIN[x-1][y]);
//list.add(matriceIN[x-1][y+1]);
//list.add(matriceIN[x][y]);
//list.add(matriceIN[x+1][y]);
//list.add(matriceIN[x][y+1]);
//list.add(matriceIN[x+1][y+1]);
//
//list.add(matriceIN[x-2][y-2]);
//list.add(matriceIN[x-1][y-2]);
//list.add(matriceIN[x][y-2]);
//list.add(matriceIN[x][y+2]);
//list.add(matriceIN[x+1][y-2]);
//list.add(matriceIN[x-1][y+2]);
//list.add(matriceIN[x+2][y-2]);
//list.add(matriceIN[x-2][y+2]);
//list.add(matriceIN[x+2][y-1]);
//list.add(matriceIN[x-2][y+1]);
//list.add(matriceIN[x+2][y]);
//list.add(matriceIN[x-2][y]);
//list.add(matriceIN[x+2][y+1]);
//list.add(matriceIN[x-2][y-1]);
//list.add(matriceIN[x+2][y+2]);
//list.add(matriceIN[x+1][y+2]);




