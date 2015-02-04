package org.jb2011.swing9patch.utils;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.jb2011.ninepatch4j.NinePatch;

/**
 * NinePatch图辅助工厂类.
 * 
 * @author Jack Jiang(jb2011@163.com), 2011-12-22
 * @version 1.0
 */
public class NPHelper
{
	/**
	 * Creates the nine patch.
	 *
	 * @param fileUrl the file url
	 * @param convert the convert
	 * @return the nine patch
	 * @see NinePatch#load(URL, boolean)
	 */
	public static NinePatch createNinePatch(URL fileUrl, boolean convert)
	{
		try
		{
			return NinePatch.load(fileUrl, convert);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Creates the nine patch.
	 *
	 * @param stream the stream
	 * @param is9Patch the is9 patch
	 * @param convert the convert
	 * @return the nine patch
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @see NinePatch#load(InputStream, boolean, boolean)
	 */
	public static NinePatch createNinePatch(InputStream stream, boolean is9Patch,boolean convert) throws IOException
	{
		return NinePatch.load(stream, is9Patch, convert);
	}
	
	/**
	 * Creates the nine patch.
	 *
	 * @param image the image
	 * @param is9Patch the is9 patch
	 * @param convert the convert
	 * @return the nine patch
	 * @see NinePatch#load(BufferedImage, boolean, boolean)
	 */
	public static NinePatch createNinePatch(BufferedImage image, boolean is9Patch,boolean convert)
	{
		return NinePatch.load(image, is9Patch, convert);
	}
}
