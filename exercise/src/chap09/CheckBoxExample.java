package chap09;

public class CheckBoxExample {
	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListner(new BackgroundChangeListener());
		checkBox.select();
	}
}
