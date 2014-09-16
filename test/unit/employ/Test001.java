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
		
		//テストデータ格納
		test.checkName("0123456789");
		//実行
		result= test.getErrMsg();
		//判定
		if (result.equals("")){
			System.out.println("テスト結果OK");
			assertTrue(true);
		}else
			fail("テスト結果NG");
	}

	/**************UT001_002****************/
	@Test
	public void testCheckName_UT001_002() {
		
		System.out.println("UT001_002");
		
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		//テストデータ格納
		test.checkName("あいうえおかきくけこ");
		//実行
		result= test.getErrMsg();
		//判定
		if (result.equals("")){
			System.out.println("テスト結果OK");
			assertTrue(true);
		}else
			fail("テスト結果NG");
	}
	
	/**************UT001_003****************/
	@Test
	public void testCheckName_UT001_003() {
		
		System.out.println("UT001_003");
		
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		//テストデータ格納
		test.checkName("01234567890");
		//実行
		result= test.getErrMsg();
		//判定
		if (result.equals("名前は10桁以内で入力してください。<br />")){
			System.out.println("テスト結果OK");
			assertTrue(true);
		}else
			fail("テスト結果NG");
	}	
	
	/**************UT001_004****************/	
	@Test
	public void testCheckName_UT001_004() {
		
		System.out.println("UT001_004");
		
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		//テストデータ格納
		test.checkName("あいうえおかきくけこさ");
		//実行
		result= test.getErrMsg();
		//判定
		if (result.equals("名前は10桁以内で入力してください。<br />")){
			System.out.println("テスト結果OK");
			assertTrue(true);
		}
		else
			fail("テスト結果NG");
	}	

	/**************UT001_005****************/	
	@Test
	public void testCheckAge_UT001_005(){ 
		
		System.out.println("UT001_005");
		
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		//テストデータ格納
		test.checkAge("16");
		//実行
		result= test.getErrMsg();
		//判定
		if (result.equals("")){
			System.out.println("テスト結果OK");
			assertTrue(true);
		}else
			fail("テスト結果NG");
	}
	
	/**************UT001_006****************/
	@Test
	public void testCheckAge_UT001_006() {
		
		System.out.println("UT001_006");
		
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		//テストデータ格納
		test.checkAge("60");
		//実行
		result= test.getErrMsg();
		//判定
		if (result.equals("")){
			System.out.println("Uテスト結果OK");
			assertTrue(true);
		}else
			fail("テスト結果NG");
	}
	
	/**************UT001_007****************/	
	@Test	
	public void testCheckAge_UT001_007() {
		
		System.out.println("UT001_007");
		
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		//テストデータ格納
		test.checkAge("15");
		//実行
		result= test.getErrMsg();
		//判定
		if (result.equals("年齢は(16-60)の範囲で入力してください。<br />")){
			System.out.println("テスト結果OK");
			assertTrue(true);
		}else
			fail("テスト結果NG");
	}
	
	/**************UT001_008****************/	
	@Test
	public void testCheckAge_UT001_008() {
		
		System.out.println("UT001_008");
		
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		//テストデータ格納
		test.checkAge("61");
		//実行
		result= test.getErrMsg();
		//判定
		if (result.equals("年齢は(16-60)の範囲で入力してください。<br />")){
			System.out.println("テスト結果OK");
			assertTrue(true);
		}else
			fail("テスト結果NG");
	}
	
	/**************UT001_009****************/	
	@Test
	public void testCheckAge_UT001_009() {
		
		System.out.println("UT001_009");
		
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		//テストデータ格納
		test.checkAge("１６");
		//実行
		result= test.getErrMsg();
		//判定
		if (result.equals("年齢は数値(半角)で入力してください。<br />")){
			System.out.println("テスト結果OK");
			assertTrue(true);
		}else
			fail("テスト結果NG");
	}
	
	/**************UT001_010****************/
	@Test
	public void testCheckAge_UT001_010() {
		
		System.out.println("UT001_010");
		
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		//テストデータ格納
		test.checkAge("あいうえお");
		//実行
		result= test.getErrMsg();
		//判定
		if (result.equals("年齢は数値(半角)で入力してください。<br />年齢は(16-60)の範囲で入力してください。<br />")){
			System.out.println("テスト結果OK");
			assertTrue(true);
		}else
			fail("テスト結果NG");
	}
	
	/**************UT001_011****************/
	@Test
	public void testCheckAge_UT001_011() {
		
		System.out.println("UT001_011");
		
		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		//テストデータ格納
		test.checkAge("16あいうえお");
		//実行
		result= test.getErrMsg();
		//判定
		if (result.equals("年齢は数値(半角)で入力してください。<br />年齢は(16-60)の範囲で入力してください。<br />")){
			System.out.println("テスト結果OK");
			assertTrue(true);
		}else
			fail("テスト結果NG");
	}
	
	/**************UT001_012****************/
	@Test
	public void testCheckId_UT001_012() {
		
		System.out.println("UT001_012");

		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		//テストデータ格納
		test.checkId("999");
		//実行
		result= test.getErrMsg();
		//判定
		if (result.equals("")){
			System.out.println("テスト結果OK");
			assertTrue(true);
		}else
			fail("テスト結果NG");	
	}

	/**************UT001_013****************/
	@Test
	public void testCheckId_UT001_013() {
		
		System.out.println("UT001_013");

		RegInfCheck test=new RegInfCheck(); 
		String result=null;
		
		//テストデータ格納
		test.checkId("1000");
		//実行
		result= test.getErrMsg();
		//判定
		if (result.equals("登録可能なID（999）を超えています。管理者に問い合わせてください。<br />")){
			System.out.println("テスト結果OK");
			assertTrue(true);
		}else
			fail("テスト結果NG");	
	}


}


