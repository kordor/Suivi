package Traitement;


import java.awt.Color;
import java.awt.color.ColorSpace;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import javax.swing.ImageIcon;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class DetecteBalonBleu {
    public DetecteBalonBleu(){
      //  CSeuillage(image);
    }
 // public  BufferedImage imagesible = null;
    
    public BufferedImage DetecteV(BufferedImage image1){
      
      BufferedImage image2 = new BufferedImage(image1.getWidth(),image1.getHeight(),8);
      
    // int[] rgb = new int[3];
      
//    //Resize tt -----------------------------------------------------------------
//		BufferedImage imageReduite = new BufferedImage((int)(image1.getWidth()*0.5),(int)( image1.getHeight()*0.5), image1.getType());
//		AffineTransform reduire = AffineTransform.getScaleInstance(0.5, 0.5);
//		int interpolation = AffineTransformOp.TYPE_BICUBIC;
//		AffineTransformOp retaillerImage = new AffineTransformOp(reduire, interpolation);
//		retaillerImage.filter(image1, imageReduite );
//		image1 = imageReduite ;
//		//------------------------------------------------------------------------------
     
     for (int i = 0; i < image1.getWidth(); i++) 
            {
                   for (int j = 0; j < image1.getHeight(); j++) {
                    
                   // recuperer couleur de chaque pixel
                  // Color pixelcolor= new Color(image1.getRGB(i, j));
                    int RVB = image1.getRGB(i, j);
							int r=(RVB>>16)& 0xFF;
							int g=(RVB>>8)& 0xFF;
							int b=(RVB)& 0xFF;
//B-R>32 , B-G>32
                if((b-r)>32 & (b-g)>32 ){
                        //blanc         
                  image2.setRGB(i, j, 0xffffffff);
                   }else { 
                        //noire
                   image2.setRGB(i, j, 0xff000000);
                }
//                   
//                   if (r<p){ r=0;} else r=255;
//                   if (g<p){ g=0;} else g=255;
//                  if (b<p){ b=0;} else b=255;
                  
//                  int rgb=new Color(r,g,b).getRGB(); 
//                    image2.setRGB(i, j, rgb);
                } 
           
          }
    
  return image2;
    }
    
    public void affiche(){
        
    }

    
  
} //Fin class
