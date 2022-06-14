package org.java.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MemberDtoMain {

	public static void main(String[] args) {
		
		MemberDto member1=new MemberDto();
		
		member1.setUserId("kmkm");
		member1.setUserPw("0713");
		member1.setUserName("km");
		member1.setUserAge(25);
		member1.setUserAddr("��");
		member1.setUserPhone("010-0000-0000");
		member1.setDay(new Date());
		
		
		String userId=member1.getUserId();
		String userPw=member1.getUserPw();
		String userName=member1.getUserName();
		int userAge=member1.getUserAge();
		String userAddr=member1.getUserAddr();
		String userPhone=member1.getUserPhone();
		Date day=member1.getDay();
		
		//��¥�� format
		SimpleDateFormat sDay = 
				new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		String now=sDay.format(day);
		
		System.out.println("���̵� : "+userId);
		System.out.println("��й�ȣ : "+userPw);
		System.out.println("�̸� : "+userName);
		System.out.println("���� : "+userAge);
		System.out.println("�ּ� : "+userAddr);
		System.out.println("��ȣ : "+userPhone);
		System.out.println("��¥ : "+now);
		
		System.out.println(member1.toString());
		
		System.out.println("==============================");
		
		MemberDto member2=new MemberDto();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("���̵� �Է��ϼ���.");
		member2.setUserId(scn.next());
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		member2.setUserPw(scn.next());
		System.out.println("�̸��� �Է��ϼ���.");
		member2.setUserName(scn.next());
		System.out.println("���̸� �Է��ϼ���.");
		member2.setUserAge(scn.nextInt());
		System.out.println("�ּҸ� �Է��ϼ���.");
		member2.setUserAddr(scn.next());
		System.out.println("��ȣ�� �Է��ϼ���.");
		member2.setUserPhone(scn.next());
		member2.setDay(new Date()); //���� �ð�
		
		System.out.println("���̵� : "+member2.getUserId());
		System.out.println("��й�ȣ : "+member2.getUserPw());
		System.out.println("�̸� : "+member2.getUserName());
		System.out.println("���� : "+member2.getUserAge());
		System.out.println("�ּ� : "+member2.getUserAddr());
		System.out.println("��ȣ : "+member2.getUserPhone());
		System.out.println("��¥ : "+sDay.format(member2.getDay()));
		
		
		
		
		
	
		
		
	}
}
