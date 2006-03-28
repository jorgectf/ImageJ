package ij.plugin;
import ij.*;
import ij.process.*;
import ij.io.*;
import ij.text.*;
import java.awt.*;

/** This plugin implements the File/Save As/Text command. What it does
	is save the contents of TextWindows (e.g., "Log" and "Results"). */
public class TextWriter implements PlugIn {
	private String arg;
    private ImagePlus imp;
    
	public void run(String arg) {
		saveText();
	}
	
	void saveText() {
		Frame frame = WindowManager.getFrontWindow();
		if (frame!=null && (frame instanceof TextWindow)) {
			TextPanel tp = ((TextWindow)frame).getTextPanel();
			tp.saveAs("");
		} else
			IJ.error("Save As Text", "This command requires a TextWindow such as\n"
				+ "the \"Log\" window or an \"Info for...\" window.");
	}
	
}

