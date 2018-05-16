package Tools;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class BytesHandler {
	
	public static byte[] FromImageToByteArray(File f,String format)
	{
		try {
			BufferedImage bi = ImageIO.read(f);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write(bi, format, baos);
			baos.flush();
			return baos.toByteArray();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
	
	public static Boolean SaveByteArrayInDestinationAsImage(byte[] byteArr,String format,String dest)
	{
		InputStream in = new ByteArrayInputStream(byteArr);
		try {
			BufferedImage bi = ImageIO.read(in);
			return ImageIO.write(bi, "jpg", new File(".//src//test.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

}
