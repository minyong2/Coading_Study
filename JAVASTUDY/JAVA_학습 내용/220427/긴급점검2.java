package test;

import java.util.ArrayList;
import java.util.List;

class Food{
	private String foodName;

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	
	public void print() {
//		System.out.println(this.foodName);
	}



	
}

public class �������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] array = {1,2,3,4,5};
		
		//�迭 ! �迭�ϰ� �ٸ��� ���̸� ���������� ��Ʈ��
		//�÷��� �� list
		//1. list�ȿ� ������ Ÿ�� Ȯ��
		List<Food> list = new ArrayList<Food>();
		//2. Ŭ���� Ÿ���̸� Ŭ������ ȣ�����ش�. (String ����)
		Food f = new Food();
		//3. ȣ���� Ŭ������ list�� ��´�.
		f.setFoodName("��ġ�쵿");
		list.add(f); //set�� ���� ����Ʈ�� �߰� ��


		//���1. Ŭ�������� ����ϰ���� �޼ҵ尡 ������
		Food f2 = new Food();
		f2.setFoodName("�쵿");
		f2.print();
		list.add(f2);
		//���2. ��� 1���ۿ� ����
		list.add(new Food());
		
		
//		Food f3 = list.get(0);
		
		//-------------------------------
//		new Food().setFoodName("�쵿");
//		new Food().setFoodName("�쵿");
//		new Food().setFoodName("�쵿");
		//�� 3���� ���� �ٸ���.
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i).getFoodName());
//		}
		
		for(Food food : list) { //== Food f3 = list.get(0); (get������!!)
			System.out.println("��"+food.getFoodName());
		}
	}

}
