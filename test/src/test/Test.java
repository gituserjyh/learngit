package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;


public class Test {
	
	public static void main(String[] args) {
		Map map = new HashMap();
		map.get(1);
	}
	
	/**
	 * 文件移动 f1移到f2
	 * @param 源
	 * @param 目标
	 * @return
	 * @throws Exception
	 */
	public static boolean moveFile(String f1, String f2) throws Exception {
		int length = 2097152;
		FileInputStream in = new FileInputStream(f1);
		FileOutputStream out = new FileOutputStream(f2);
		byte[] buffer = new byte[length];
		while (true) {
			int ins = in.read(buffer);
			if (ins == -1) {
				in.close();
				out.flush();
				out.close();
				break;
			} else {
				out.write(buffer, 0, ins);
			}
		}
		File file1 = new File(f1);
		file1.delete();
		return true;
	}
	
	/**
	 * 文件移动 f1中的所有zip文件移到f2
	 * @param 源
	 * @param 目标
	 * @return
	 * @throws Exception
	 */
	public static boolean moveZipFile(String f1, String f2) throws Exception {
		File file = new File(f1);
		File[] fileArray = file.listFiles();
		for (int m = 0; m < fileArray.length; m++) {
			if(fileArray[m].isFile()){
				moveFile(f1 + File.separator + fileArray[m].getName(), f2 + File.separator + fileArray[m].getName());
			}
		}
		return true;
	}
}
