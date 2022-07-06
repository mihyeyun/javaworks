package chap09;

public class CheckBox {
	OnSelectListener listener;
	
	void setOnSelectListner(OnSelectListener listener) {
		this.listener = listener;
	}
	
	void select() {
		listener.onSelect();
	}
	
	static interface OnSelectListener{
		void onSelect();
	}
}
