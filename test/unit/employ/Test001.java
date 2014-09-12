package unit.employ;

import static org.junit.Assert.*;
import org.junit.Test;
import user.parts.*;
public class Test001 {

String FILENAME="C:/test/log/log.txt";
	
	
/**************UT001****************/	
	@Test
	public void testCheckName_UT001_001() {
		
		
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		
		test.checkName("0123456789");
		result= new String(test.getErrMsg());
		if (result.equals("")){
			System.out.println("UT001_001����");
			assertTrue(true);
		}else
			fail("�e�X�g����NG");
	}
	
	@Test
	public void testCheckName_UT001_002() {
		
		
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		test.checkName("��������������������");
		result= new String(test.getErrMsg());
		if (result.equals("")){
			System.out.println("UT001_002����");
			assertTrue(true);
		}else
			fail("�e�X�g����NG");
	}
	
	@Test
	public void testCheckName_UT001_003() {
		
		
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		test.checkName("01234567890");
		result= new String(test.getErrMsg());
		if (result.equals("���O��10���ȓ��œ��͂��Ă��������B<br />")){
			System.out.println("UT001_003����");
			assertTrue(true);
		}else
			fail("�e�X�g����NG");
	}	
	
	
	@Test
	public void testCheckName_UT001_004() {
		
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		test.checkName("����������������������");
		result= new String(test.getErrMsg()); 
		if (result.equals("���O��10���ȓ��œ��͂��Ă��������B<br />")){
			System.out.println("UT001_004����");
			assertTrue(true);
		}
		else
			fail("�e�X�g����NG");
	}	

	
	
	@Test
	public void testCheckAge_UT001_005(){ 
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		test.checkAge("16");
		result= new String(test.getErrMsg()); 
		if (result.equals("")){
			System.out.println("UT001_005����");
			assertTrue(true);
		}else
			fail("�e�X�g����NG");
	}
	
	
	@Test
	public void testCheckAge_UT001_006() {
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		test.checkAge("60");
		result= new String(test.getErrMsg()); 
		if (result.equals("")){
			System.out.println("UT001_006����");
			assertTrue(true);
		}else
			fail("�e�X�g����NG");
	}
	
	
	@Test	
	public void testCheckAge_UT001_007() {
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		test.checkAge("15");
		result= new String(test.getErrMsg()); 
		if (result.equals("�N���(16-60)�͈̔͂œ��͂��Ă��������B<br />")){
			System.out.println("UT001_007����");
			assertTrue(true);
		}else
			fail("�e�X�g����NG");
	}
	
	
	@Test
	public void testCheckAge_UT001_008() {
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		test.checkAge("61");
		result= new String(test.getErrMsg()); 
		if (result.equals("�N���(16-60)�͈̔͂œ��͂��Ă��������B<br />")){
			System.out.println("UT001_008����");
			assertTrue(true);
		}else
			fail("�e�X�g����NG");
	}
	
	
	@Test
	public void testCheckAge_UT001_009() {
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		test.checkAge("�P�U");
		result= new String(test.getErrMsg()); 
		if (result.equals("�N��͐��l(���p)�œ��͂��Ă��������B<br />")){
			System.out.println("UT001_009����");
			assertTrue(true);
		}else
			fail("�e�X�g����NG");
	}
	
	
	@Test
	public void testCheckAge_UT001_010() {
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		test.checkAge("����������");
		result= new String(test.getErrMsg()); 
		if (result.equals("�N��͐��l(���p)�œ��͂��Ă��������B<br />�N���(16-60)�͈̔͂œ��͂��Ă��������B<br />")){
			System.out.println("UT001_010����");
			assertTrue(true);
		}else
			fail("�e�X�g����NG");
	}
	
	
	@Test
	public void testCheckAge_UT001_011() {
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		test.checkAge("16����������");
		result= new String(test.getErrMsg()); 
		if (result.equals("�N��͐��l(���p)�œ��͂��Ă��������B<br />�N���(16-60)�͈̔͂œ��͂��Ă��������B<br />")){
			System.out.println("UT001_011����");
			assertTrue(true);
		}else
			fail("�e�X�g����NG");
	}
	

	@Test
	public void testCheckId_UT001_012() {

		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		test.checkId("999");
		result= new String(test.getErrMsg()); 
		if (result.equals("")){
			System.out.println("UT001_012����");
			assertTrue(true);
		}else
			fail("�e�X�g����NG");	
	}
	
	@Test
	public void testCheckId_UT001_013() {

		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		test.checkId("1000");
		result= new String(test.getErrMsg()); 
		if (result.equals("�o�^�\��ID�i999�j�𒴂��Ă��܂��B�Ǘ��҂ɖ₢���킹�Ă��������B<br />")){
			System.out.println("UT001_013����");
			assertTrue(true);
		}else
			fail("�e�X�g����NG");	
	}


}


