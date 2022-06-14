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
		member1.setUserAddr("집");
		member1.setUserPhone("010-0000-0000");
		member1.setDay(new Date());
		
		
		String userId=member1.getUserId();
		String userPw=member1.getUserPw();
		String userName=member1.getUserName();
		int userAge=member1.getUserAge();
		String userAddr=member1.getUserAddr();
		String userPhone=member1.getUserPhone();
		Date day=member1.getDay();
		
		//날짜를 format
		SimpleDateFormat sDay = 
				new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String now=sDay.format(day);
		
		System.out.println("아이디 : "+userId);
		System.out.println("비밀번호 : "+userPw);
		System.out.println("이름 : "+userName);
		System.out.println("나이 : "+userAge);
		System.out.println("주소 : "+userAddr);
		System.out.println("번호 : "+userPhone);
		System.out.println("날짜 : "+now);
		
		System.out.println(member1.toString());
		
		System.out.println("==============================");
		
		MemberDto member2=new MemberDto();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("아이디를 입력하세요.");
		member2.setUserId(scn.next());
		System.out.println("비밀번호를 입력하세요.");
		member2.setUserPw(scn.next());
		System.out.println("이름을 입력하세요.");
		member2.setUserName(scn.next());
		System.out.println("나이를 입력하세요.");
		member2.setUserAge(scn.nextInt());
		System.out.println("주소를 입력하세요.");
		member2.setUserAddr(scn.next());
		System.out.println("번호를 입력하세요.");
		member2.setUserPhone(scn.next());
		member2.setDay(new Date()); //현재 시간
		
		System.out.println("아이디 : "+member2.getUserId());
		System.out.println("비밀번호 : "+member2.getUserPw());
		System.out.println("이름 : "+member2.getUserName());
		System.out.println("나이 : "+member2.getUserAge());
		System.out.println("주소 : "+member2.getUserAddr());
		System.out.println("번호 : "+member2.getUserPhone());
		System.out.println("날짜 : "+sDay.format(member2.getDay()));
		
		
		
		
		
	
		
		
	}
}
