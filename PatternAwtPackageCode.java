import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
class PatternAwtPackageCode 
{
	public static void main(String[] args) 
	{
		File file = new File("D:\\pushpak\\New folder\\Youtube.png");
		try{
			BufferedImage image = ImageIO.read(file);
			for(int i =0;i<image.getHeight();i++)
			{
				for(int j=0;j<image.getWidth();j++)
				{
					Color cl = new Color(image.getRGB(j,i));
					if(cl.getRed()==0&&cl.getGreen()==0&&cl.getBlue()==0)
						System.out.print(" ");
					else
						System.out.print("#");
				}
				System.out.println();
			}
		}catch(Exception e)
		{
			System.out.print("Something went wrong");
		}
	}
}