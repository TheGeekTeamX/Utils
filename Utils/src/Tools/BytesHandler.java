package Tools;

import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.ImageIO;

import ResponsesEntitys.ProtocolLine;
import javafx.scene.shape.Line;

public class BytesHandler {
	
	public static byte[] FromImageToByteArray(String path,String format)
	{
		try {
			BufferedImage bi = ImageIO.read(new File(path));
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
			return ImageIO.write(bi, format, new File(dest));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public static ArrayList<ProtocolLine> fromTextFileToProtocol(String path)
	{
			try {
				ArrayList<ProtocolLine> list = new ArrayList<>();
				File file = new File(path);
				Scanner sc;
				sc = new Scanner(file);
				sc.useDelimiter("\\,");
				while(sc.hasNext())
					{
						String line = sc.next();
						String[] strArr = line.split(":");
						if(strArr.length == 2)
						{
							list.add(new ProtocolLine(strArr[0],strArr[1]));
						}
					}
				return list;
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		return null;
	}
	
	public static void fromProtocolToTextFile(ArrayList<ProtocolLine> list,String path)
	{
		FileWriter fw = null;
		BufferedWriter bw =null;
		try{
			fw = new FileWriter(new File(path));
			bw = new BufferedWriter(fw);
			for(int i = 0; i<list.size();i++)
			{
				bw.write(""+list.get(i).getName()+":"+list.get(i).getText()+",");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
