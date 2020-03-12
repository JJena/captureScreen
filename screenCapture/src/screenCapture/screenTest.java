package screenCapture;

//Java Program to Capture full 
//Image of Screen 
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle; 
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage; 
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.File; 
import javax.imageio.ImageIO; 

public class screenTest {
	
public static final long serialVersionUID = 1L;
public static String path;
public static int duration;
public static int freq;
public static long startTime = System.currentTimeMillis();
public static long endTime=0;

public static void main(String args[]) throws InterruptedException, AWTException, IOException 
{ 
	 path = args[0];
	 duration = Integer.valueOf(args[1]);
	 freq = Integer.valueOf(args[2]);
	 
	    for (int temp=0;temp<duration;temp++)
	    {
	    	Thread.sleep(freq*1000);
	    	screenTest.scrCapture();
	    	temp=(int) calcDuration(startTime,endTime);
	    }
} 

public static void scrCapture() throws AWTException, IOException
{
	 Robot r = new Robot(); 
	 
	 //System.out.println(path+"\n"+duration+"\n"+freq);
	 
   // It saves screenshot to desired path
   String sdf = new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss.SSS").format(new Date());
   
   String pathnew = path+sdf+".jpg";

   // Used to get ScreenSize and capture image 
   
   Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
   Rectangle captureRect = new Rectangle(0, 0, screenSize.width*2, screenSize.height*2); //Increase the multiplication factor if it trims your screenshot 
   BufferedImage screenFullImage = r.createScreenCapture(captureRect);
   ImageIO.write(screenFullImage, "jpg", new File(pathnew));
   
   r=null;
}

public static int calcDuration(long startTime, long endTime)
{
	 endTime = System.currentTimeMillis();
	 int duration = (int) ((endTime - startTime)/1000);
	 return (duration);
}

} 
