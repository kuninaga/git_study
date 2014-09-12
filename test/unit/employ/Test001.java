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
			System.out.println("UT001_001成功");
			assertTrue(true);
		}else
			fail("テスト結果NG");
	}
	
	@Test
	public void testCheckName_UT001_002() {
		
		
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		test.checkName("あいうえおかきくけこ");
		result= new String(test.getErrMsg());
		if (result.equals("")){
			System.out.println("UT001_002成功");
			assertTrue(true);
		}else
			fail("テスト結果NG");
	}
	
	@Test
	public void testCheckName_UT001_003() {
		
		
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		test.checkName("01234567890");
		result= new String(test.getErrMsg());
		if (result.equals("名前は10桁以内で入力してください。<br />")){
			System.out.println("UT001_003成功");
			assertTrue(true);
		}else
			fail("テスト結果NG");
	}	
	
	
	@Test
	public void testCheckName_UT001_004() {
		
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		test.checkName("あいうえおかきくけこさ");
		result= new String(test.getErrMsg()); 
		if (result.equals("名前は10桁以内で入力してください。<br />")){
			System.out.println("UT001_004成功");
			assertTrue(true);
		}
		else
			fail("テスト結果NG");
	}	

	
	
	@Test
	public void testCheckAge_UT001_005(){ 
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		test.checkAge("16");
		result= new String(test.getErrMsg()); 
		if (result.equals("")){
			System.out.println("UT001_005成功");
			assertTrue(true);
		}else
			fail("テスト結果NG");
	}
	
	
	@Test
	public void testCheckAge_UT001_006() {
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		test.checkAge("60");
		result= new String(test.getErrMsg()); 
		if (result.equals("")){
			System.out.println("UT001_006成功");
			assertTrue(true);
		}else
			fail("テスト結果NG");
	}
	
	
	@Test	
	public void testCheckAge_UT001_007() {
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		test.checkAge("15");
		result= new String(test.getErrMsg()); 
		if (result.equals("年齢は(16-60)の範囲で入力してください。<br />")){
			System.out.println("UT001_007成功");
			assertTrue(true);
		}else
			fail("テスト結果NG");
	}
	
	
	@Test
	public void testCheckAge_UT001_008() {
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		test.checkAge("61");
		result= new String(test.getErrMsg()); 
		if (result.equals("年齢は(16-60)の範囲で入力してください。<br />")){
			System.out.println("UT001_008成功");
			assertTrue(true);
		}else
			fail("テスト結果NG");
	}
	
	
	@Test
	public void testCheckAge_UT001_009() {
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		test.checkAge("１６");
		result= new String(test.getErrMsg()); 
		if (result.equals("年齢は数値(半角)で入力してください。<br />")){
			System.out.println("UT001_009成功");
			assertTrue(true);
		}else
			fail("テスト結果NG");
	}
	
	
	@Test
	public void testCheckAge_UT001_010() {
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		test.checkAge("あいうえお");
		result= new String(test.getErrMsg()); 
		if (result.equals("年齢は数値(半角)で入力してください。<br />年齢は(16-60)の範囲で入力してください。<br />")){
			System.out.println("UT001_010成功");
			assertTrue(true);
		}else
			fail("テスト結果NG");
	}
	
	
	@Test
	public void testCheckAge_UT001_011() {
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		test.checkAge("16あいうえお");
		result= new String(test.getErrMsg()); 
		if (result.equals("年齢は数値(半角)で入力してください。<br />年齢は(16-60)の範囲で入力してください。<br />")){
			System.out.println("UT001_011成功");
			assertTrue(true);
		}else
			fail("テスト結果NG");
	}
	

	@Test
	public void testCheckId_UT001_012() {

		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		test.checkId("999");
		result= new String(test.getErrMsg()); 
		if (result.equals("")){
			System.out.println("UT001_012成功");
			assertTrue(true);
		}else
			fail("テスト結果NG");	
	}
	
	@Test
	public void testCheckId_UT001_013() {

		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		test.checkId("1000");
		result= new String(test.getErrMsg()); 
		if (result.equals("登録可能なID（999）を超えています。管理者に問い合わせてください。<br />")){
			System.out.println("UT001_013成功");
			assertTrue(true);
		}else
			fail("テスト結果NG");	
	}


}


