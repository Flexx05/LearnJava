package Practice.File2;

import java.io.File;

public class PracticeFile {
	private File file;

	public PracticeFile(String name) {
		this.file = new File(name);
	}

	public String CheckFileExecute() {
		return this.file.canExecute() ? "Có thể thực thi" : "Không thể thực thi";
	}

	public String CheckFileCanRead() {
		return this.file.canRead() ? "Có thể đọc" : "Không thể đọc";
	}

	public String CheckFileCanWrite() {
		return this.file.canWrite() ? "Có thể ghi" : "Không thể ghi";
	}

	public void showPath() {
		System.out.println(this.file.getAbsolutePath());
	}

	public void getName() {
		System.out.println(this.file.getName());
	}

	public void CheckIsFileOrFolder() {
		if (this.file.isDirectory()) {
			System.out.println("Đây là thư mục");
		} else if (this.file.isFile()) {
			System.out.println("Đây là tập tin");
		}
	}

	public void getChildInFolder() {
		if (this.file.isDirectory()) {
			System.out.println("Các file con: ");
			File[] childFile = this.file.listFiles();
			for (File file : childFile) {
				System.out.println(file.getAbsolutePath());
			}
		} else if (this.file.isFile()) {
			System.err.println("Đây là tập tin. Không có file con.");
		}
	}

	public void GetFolderTree() {
		this.GetDetailFolderTree(file, 1);
	}

	private void GetDetailFolderTree(File f, int bac) {
		for (int i = 0; i < bac; i++) {
			System.out.print("___");
		}
		System.out.println(f.getName());
		if (f.canRead() && f.isDirectory()) {
			File[] childArr = f.listFiles();
			for (File file : childArr) {
				GetDetailFolderTree(file, bac + 1);
			}
		}
	}
}
