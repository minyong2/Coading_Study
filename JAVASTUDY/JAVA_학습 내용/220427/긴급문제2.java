package test;

import java.util.ArrayList;
import java.util.List;

class FruitVO{
	private String fruitName;

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
}

class FruitService{
	public FruitVO getfruit(List<FruitVO> list, String fruitName) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getFruitName().equals(fruitName)) {
				System.out.println(list.get(i).getFruitName());
				return list.get(i);
		}
	}
		return null;
}
}
public class ��޹���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<FruitVO> list = new ArrayList<FruitVO>();
		FruitVO fg = new FruitVO();
		fg.setFruitName("����");
		FruitVO fw = new FruitVO();
		fw.setFruitName("����");
		FruitVO fc = new FruitVO();
		fc.setFruitName("����");
		
		list.add(fg);
		list.add(fw);
		list.add(fc);
		
		
		List<FruitService> list2 = new ArrayList<FruitService>();
		
		FruitService f = new FruitService();
		f.getfruit(list,"����");
		
		

		}
	}


