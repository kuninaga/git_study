package unit.employ;

import static org.junit.Assert.*;
import org.junit.Test;
import user.parts.*;
public class Test001 {

String FILENAME="C:/test/log/log.txt";
	
/**********************************UT001**********************************/


	/**************UT001_001****************/
	@Test
	public void testCheckName_UT001_001() {
		
		System.out.println("UT001_001");

		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		//�e�X�g�f�[�^�i�[
		test.checkName("0123456789");
		//���s
		result= test.getErrMsg();
		//����
		if (result.equals("")){
			System.out.println("�e�X�g����OK");
			assertTrue(true);
		}else
			fail("�e�X�g����NG");
	}

	/**************UT001_002****************/
	@Test
	public void testCheckName_UT001_002() {
		
		System.out.println("UT001_002");
		
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		//�e�X�g�f�[�^�i�[
		test.checkName("��������������������");
		//���s
		result= test.getErrMsg();
		//����
		if (result.equals("")){
			System.out.println("�e�X�g����OK");
			assertTrue(true);
		}else
			fail("�e�X�g����NG");
	}
	
	/**************UT001_003****************/
	@Test
	public void testCheckName_UT001_003() {
		
		System.out.println("UT001_003");
		
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		//�e�X�g�f�[�^�i�[
		test.checkName("01234567890");
		//���s
		result= test.getErrMsg();
		//����
		if (result.equals("���O��10���ȓ��œ��͂��Ă��������B<br />")){
			System.out.println("�e�X�g����OK");
			assertTrue(true);
		}else
			fail("�e�X�g����NG");
	}	
	
	/**************UT001_004****************/	
	@Test
	public void testCheckName_UT001_004() {
		
		System.out.println("UT001_004");
		
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		//�e�X�g�f�[�^�i�[
		test.checkName("����������������������");
		//���s
		result= test.getErrMsg();
		//����
		if (result.equals("���O��10���ȓ��œ��͂��Ă��������B<br />")){
			System.out.println("�e�X�g����OK");
			assertTrue(true);
		}
		else
			fail("�e�X�g����NG");
	}	

	/**************UT001_005****************/	
	@Test
	public void testCheckAge_UT001_005(){ 
		
		System.out.println("UT001_005");
		
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		//�e�X�g�f�[�^�i�[
		test.checkAge("16");
		//���s
		result= test.getErrMsg();
		//����
		if (result.equals("")){
			System.out.println("�e�X�g����OK");
			assertTrue(true);
		}else
			fail("�e�X�g����NG");
	}
	
	/**************UT001_006****************/
	@Test
	public void testCheckAge_UT001_006() {
		
		System.out.println("UT001_006");
		
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		//�e�X�g�f�[�^�i�[
		test.checkAge("60");
		//���s
		result= test.getErrMsg();
		//����
		if (result.equals("")){
			System.out.println("U�e�X�g����OK");
			assertTrue(true);
		}else
			fail("�e�X�g����NG");
	}
	
	/**************UT001_007****************/	
	@Test	
	public void testCheckAge_UT001_007() {
		
		System.out.println("UT001_007");
		
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		//�e�X�g�f�[�^�i�[
		test.checkAge("15");
		//���s
		result= test.getErrMsg();
		//����
		if (result.equals("�N���(16-60)�͈̔͂œ��͂��Ă��������B<br />")){
			System.out.println("�e�X�g����OK");
			assertTrue(true);
		}else
			fail("�e�X�g����NG");
	}
	
	/**************UT001_008****************/	
	@Test
	public void testCheckAge_UT001_008() {
		
		System.out.println("UT001_008");
		
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		//�e�X�g�f�[�^�i�[
		test.checkAge("61");
		//���s
		result= test.getErrMsg();
		//����
		if (result.equals("�N���(16-60)�͈̔͂œ��͂��Ă��������B<br />")){
			System.out.println("�e�X�g����OK");
			assertTrue(true);
		}else
			fail("�e�X�g����NG");
	}
	
	/**************UT001_009****************/	
	@Test
	public void testCheckAge_UT001_009() {
		
		System.out.println("UT001_009");
		
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		//�e�X�g�f�[�^�i�[
		test.checkAge("�P�U");
		//���s
		result= test.getErrMsg();
		//����
		if (result.equals("�N��͐��l(���p)�œ��͂��Ă��������B<br />")){
			System.out.println("�e�X�g����OK");
			assertTrue(true);
		}else
			fail("�e�X�g����NG");
	}
	
	/**************UT001_010****************/
	@Test
	public void testCheckAge_UT001_010() {
		
		System.out.println("UT001_010");
		
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		//�e�X�g�f�[�^�i�[
		test.checkAge("����������");
		//���s
		result= test.getErrMsg();
		//����
		if (result.equals("�N��͐��l(���p)�œ��͂��Ă��������B<br />�N���(16-60)�͈̔͂œ��͂��Ă��������B<br />")){
			System.out.println("�e�X�g����OK");
			assertTrue(true);
		}else
			fail("�e�X�g����NG");
	}
	
	/**************UT001_011****************/
	@Test
	public void testCheckAge_UT001_011() {
		
		System.out.println("UT001_011");
		
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		//�e�X�g�f�[�^�i�[
		test.checkAge("16����������");
		//���s
		result= test.getErrMsg();
		//����
		if (result.equals("�N��͐��l(���p)�œ��͂��Ă��������B<br />�N���(16-60)�͈̔͂œ��͂��Ă��������B<br />")){
			System.out.println("�e�X�g����OK");
			assertTrue(true);
		}else
			fail("�e�X�g����NG");
	}
	
	/**************UT001_012****************/
	@Test
	public void testCheckId_UT001_012() {
		
		System.out.println("UT001_012");

		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		//�e�X�g�f�[�^�i�[
		test.checkId("999");
		//���s
		result= test.getErrMsg();
		//����
		if (result.equals("")){
			System.out.println("�e�X�g����OK");
			assertTrue(true);
		}else
			fail("�e�X�g����NG");	
	}

	/**************UT001_013****************/
	@Test
	public void testCheckId_UT001_013() {
		
		System.out.println("UT001_013");

		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		//�e�X�g�f�[�^�i�[
		test.checkId("1000");
		//���s
		result= test.getErrMsg();
		//����
		if (result.equals("�o�^�\��ID�i999�j�𒴂��Ă��܂��B�Ǘ��҂ɖ₢���킹�Ă��������B<br />")){
			System.out.println("�e�X�g����OK");
			assertTrue(true);
		}else
			fail("�e�X�g����NG");	
	}


}


