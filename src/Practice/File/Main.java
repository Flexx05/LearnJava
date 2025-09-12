package Practice.File;

import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		File folder1 = new File(
				"C:\\Users\\ASUS\\Documents\\workspace-spring-tools-for-eclipse-4.31.0.RELEASE\\LearnJava\\src\\Practice\\File");
		File folder2 = new File(
				"C:\\Users\\ASUS\\Documents\\workspace-spring-tools-for-eclipse-4.31.0.RELEASE\\LearnJava\\src\\Practice\\Files");

		System.out.println("Kiểm tra tồn tại folder 1: " + folder1.exists());
		System.out.println("Kiểm tra tồn tại folder 2: " + folder2.exists());

//		Tạo thư mục
//		Cách 1: mkdir(): tạo 1
		File dir1 = new File(
				"C:\\Users\\ASUS\\Documents\\workspace-spring-tools-for-eclipse-4.31.0.RELEASE\\LearnJava\\src\\Practice\\File\\Directory1_1");
		dir1.mkdir();

//		Cách 2: mkdirs(): tạo nhiều
		File dir2 = new File(
				"C:\\Users\\ASUS\\Documents\\workspace-spring-tools-for-eclipse-4.31.0.RELEASE\\LearnJava\\src\\Practice\\File\\Directory_1\\Directory_2");
		dir2.mkdirs();

//		Tạo tập tin
		File file1 = new File(
				"C:\\Users\\ASUS\\Documents\\workspace-spring-tools-for-eclipse-4.31.0.RELEASE\\LearnJava\\src\\Practice\\File\\Vidu1.txt");
		try {
			file1.createNewFile();
		} catch (IOException e) {
//			Không có quyền tạo tập tinh
//			Ổ cứng đầy
//			Sai đường dẫn
			e.printStackTrace();
		}
	}
}
