package test;

import java.util.ArrayList;
import java.util.List;

class Lunch{
	private List<String> foodName;

	public List<String> getFoodName() {
		return foodName;
	}

	public void setFoodName(List<String> foodName) {
		this.foodName = foodName;
	}

	
}

public class �������3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		list.add("�쵿");
		list.add("���ٶ�ö��");
		
		Lunch lunch1 = new Lunch();
		lunch1.setFoodName(list);
		
		
		//����ġ �ؼ� ���
		for(String lunch:lunch1.getFoodName()) {
			System.out.println(lunch);
			
		}

	}

}
