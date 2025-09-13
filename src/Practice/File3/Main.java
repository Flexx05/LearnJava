package Practice.File3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {

	public static void deleteFile(File fx) {
		if (fx.isFile()) {
			System.out.println("Đã xóa: " + fx.getAbsolutePath());
			fx.delete();
		} else if (fx.isDirectory()) {
			File[] mangCon = fx.listFiles();
			for (File file : mangCon) {
				deleteFile(file);
			}
			System.out.println("Đã xóa: " + fx.getAbsolutePath());
			fx.delete();
		}
	}

	public static void CopyAllFile(File f1, File f2) {
		try {
			Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (f1.isDirectory()) {
			File[] fileChild = f1.listFiles();
			for (File file : fileChild) {
				File fileNew = new File(f2.getAbsolutePath() + "\\" + file.getName());
				CopyAllFile(file, fileNew);
			}
		}
	}

	public static void main(String[] args) {
		String path = "C:\\Users\\ASUS\\Documents\\workspace-spring-tools-for-eclipse-4.31.0.RELEASE\\LearnJava\\src\\Practice\\File3";
		File f0 = new File(path + "\\folder1");
		File f0_1 = new File(path + "\\folder2");
		File f_file = new File(path + "\\hehe.txt");

//		deleteFile(f0_1);

//		Rename
//		try {
//		File f0_rename = new File(path + "\\folder1_rename");
//			Files.move(f0.toPath(), f0_rename.toPath(), StandardCopyOption.REPLACE_EXISTING);
//			System.out.println("Thành công");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		Move
//		File f_file_new = new File(path + "\\folder2\\hehe.txt");
//		try {
//			Files.move(f_file.toPath(), f_file_new.toPath(), StandardCopyOption.REPLACE_EXISTING);
//			System.out.println("Thành công");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		Copy
		File f0_1_copy = new File(path + "\\folder2_copy");
//		try {
//			Files.copy(f0_1.toPath(), f0_1_copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		CopyAllFile(f0_1, f0_1_copy);
		System.out.println("Thành công");

	}
}
