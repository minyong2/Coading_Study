package final_test;
import java.util.ArrayList;
import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		List<EmpVO> list = new ArrayList<EmpVO>();
		list.add(new EmpVO(100, "ALLEN", 100));
		list.add(new EmpVO(110, "SMITH", 100));
		list.add(new EmpVO(120, "WILLSON", 200));
		list.add(new EmpVO(130, "SANGWON", 50));
		list.add(new EmpVO(140, "BRIAN", 600));
		list.add(new EmpVO(150, "KING", 3000));


		EmpServiceImpl service = new EmpService();
		
		
		
		//1��. ��ü ��� 200�޷� �޿� �λ��ϰ� ��� ����Ʈ�� ���� �Ͻÿ�. 
		System.out.println("*** 1 �� ***");
		service.getEmpList(list);
		//2��. �޿��� ���� ���� ����� ���� �Ͻÿ�. (��, �޿� �ߺ��� ���ٰ� ����)
		System.out.println("\n *** 2 �� *** ");
		service.getEmp(list);
		
		//3��. ��� �� �޿��� 300���Ϸ� �ް� �ִ� ��� ���� ���Ͻÿ�.
		System.out.println("\n *** 3 �� ***");
		service.getCount(list, 0);
		//4��. Ư�� ����� �μ���ȣ 10, �μ��̸� SALES �μ��� �߰��ϰ� ����� �����Ͻÿ�.
		
		System.out.println("\n *** 4 �� ***");
		service.setDept(list.get(0));
		System.out.println("��� �̸� : "+list.get(0).getEname());
		System.out.println("��� ��ȣ : "+list.get(0).getEmpno());
		System.out.println("�μ���ȣ : "+list.get(0).getList().get(0).getDeptno());
		System.out.println("�μ��� : "+list.get(0).getList().get(0).getDname());
	}
}