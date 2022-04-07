```
for(int i=0; i<list.size(); i++){
			if(list.get(i).sal >= 1300){
				System.out.println("============2번============");
				System.out.println("이름 ==> "+list.get(i).ename);
				System.out.println("직업 ==> "+list.get(i).job);
			}	
		}
		//3. 직업이 SALESMAN인 사원 중 급여가 1400달러 이상 받는 사원의 번호,이름 조회
		for(int i=0; i<list.size(); i++){
			// 자바는 문자를 비교할 때 equals(), 자바에서는 문자를 비교할 때 == 사용하면 문자를 비교하는게 아님.
			if(list.get(i).job.equals("SALESMAN") && list.get(i).sal >= 1400){
				System.out.println("============3번============");
				System.out.println("이름 ==> "+list.get(i).ename);
				System.out.println("직업 ==> "+list.get(i).job);
			}	
		}
		//4. 입사년도가 1981년도인 사원의 번호,이름 조회
		for(int i=0; i<list.size(); i++){
			String hireYear = list.get(i).hiredate.split("-")[0];
			if(hireYear.equals("1981")){
				System.out.println("============4번============");
				System.out.println("번호 ==> "+list.get(i).empno);
				System.out.println("이름 ==> "+list.get(i).ename);
			}		
		}
		//5. 직업이 MANAGER인 사원 수 조회
		int managerCnt =0;
		for(int i=0; i<list.size(); i++){
			if(list.get(i).job.equals("MANAGER")){
				++managerCnt;
			}
		}
		System.out.println("============5번============");
		System.out.println("사원 수 ==> "+managerCnt);
		//6. 사원 중 급여를 가장 많이 받는 사원의 번호,이름,입사년도 조회
		int maxSal = 0;
		int index = 0;
		for(int i=0; i<list.size(); i++){
			int sal = list.get(i).sal;
			if(maxSal < sal){
				maxSal = sal;
				index = i;
			}
		}
		System.out.println("============6번============");
		System.out.println("번호 ==> "+list.get(index).empno);
		System.out.println("이름 ==> "+list.get(index).ename);
		System.out.println("입사날짜 ==> "+list.get(index).hiredate);
		//7. 부서번호별 수 조회 ex) 20 : 2명, 30: 3명
		int deptno20 = 0;
		int deptno30 = 0;
		for(int i=0; i<list.size(); i++){
			if(list.get(i).deptno == 20){
				++deptno20;
			}
			if(list.get(i).deptno == 30){
				++deptno30;
			}	
		}	
		System.out.println("============7번============");
		System.out.println("20부서 수 ==> "+deptno20);
		System.out.println("30부서 수==> "+deptno30);
		//8. 입사월이 02월인 사원 수 조회
		int month = 0;
		for(int i=0; i<list.size(); i++){
			String hireMonth = list.get(i).hiredate.split("-")[1];
			if(hireMonth.equals("02")){
				++month;
			}
		}	
		System.out.println("============8번============");
		System.out.println("사원 수 ==> "+month);
```