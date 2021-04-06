package resources;

import java.net.URL;

import javax.swing.ImageIcon;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Resources {

	final private static String ImageURL = "Resources/images/";
	
	// Loads the image in a resource file located relative to this class file.
	// Resource files can be in subdirectories. If so, specify the filename
	// with a relative path. For example, use filename "icons/foo.png" to
	// load the PNG image in the file "edu/ou/cs/hci/resources/icons/foo.png".
	public static ImageIcon	getImage(String filename)
	{
		return new ImageIcon(getResource(filename));
	}
	
	// Gets the URL of a resource file located relative to this class file.
	// Resource files can be in subdirectories. If so, specify the filename
	// with a relative path. For example, use filename "docs/names.txt" to
	// get the URL of the file "edu/ou/cs/hci/resources/docs/names.txt".
	public static final URL	getResource(String filename)
	{
		return Resources.class.getResource(ImageURL + filename);
	}
	
	// Convenience method to create a node for an image located in resources
	// relative to the FX_ICON package. See static member definitions above.
	public static ImageView createImage(String url, double w, double h) {
		Image image = new Image(ImageURL + url, w, h, false, true);
		
		return new ImageView(image);
	}
}
