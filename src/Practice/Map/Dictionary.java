package Practice.Map;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Dictionary {
	private Map<String, String> dictionary = new TreeMap<>();

	public String addWord(String key, String value) {
		return this.dictionary.put(key, value);
	}

	public String deleteWord(String key) {
		return this.dictionary.remove(key);
	}

	public String searchWord(String key) {
		if (this.dictionary.get(key) != null) {
			return this.dictionary.get(key);
		} else {
			return "Đang cập nhật";
		}
	}

	public void getAllWord() {
		Set<String> listValue = this.dictionary.keySet();
		System.out.println(Arrays.toString(listValue.toArray()));
	}

	public int getCount() {
		return this.dictionary.size();
	}

	public void DeleteAllWord() {
		this.dictionary.clear();
		System.out.println("Xóa tất cả thành công");
	}
}
