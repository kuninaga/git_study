package unit.user.parts;

import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import org.junit.Test;
import com.ibm.icu.text.DateFormat;
import employ.OutLog;
public class Test003 {



/**************UT003****************/
	String FILENAME="C:/test/log/log.txt";
	@SuppressWarnings("static-access")
	@Test
	public void testOutLogDmp_UT003_001() {
		
		//ファイル作成
		if(!fileMake())
			fail("ファイル作成失敗");
			
		OutLog test=new OutLog();
		test.outLogDmp("sample：サンプル");
		
		if(resultGet003("sample：サンプル")){
			System.out.println("UT003_001成功");
			assertTrue(true);
		}else
		fail("テスト結果NG");	
	}

	
	@SuppressWarnings("static-access")
	@Test
	public void testOutLogDmp_UT003_002() {
		
		//ファイル作成
		if(!fileMake())
			fail("ファイル作成失敗");
			
		OutLog test=new OutLog();
		test.outLogDmp("12345");
		
		if(resultGet003("12345")){
			System.out.println("UT003_002成功");
			assertTrue(true);
		}else
		fail("テスト結果NG");
	}

	
	//003ファイル作成
	public boolean fileMake(){
		
		File newfile = new File(FILENAME);
		try {
			
			//ファイルの有無確認
		    if (newfile.exists() & !newfile.delete())
		        return false;
		      
		    //ファイル作成
			if (!newfile.createNewFile()){
		          return false;
		        }
			return true;
		      
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return false;
		}
	}
	
	//003結果確認
	public boolean resultGet003(String testLetter){
		
		File file = new File(FILENAME);
        
		//ファイル存在確認
		if ( !file.exists() ) {
            return false;
        }
		
	    // ファイルか確認
        if ( !file.isFile() ) {
            return false;
        }
        
        // ファイルが読み込み可能かどうかを判定
        if ( !file.canRead() ) {
            // ファイルが読み込み不可の場合は処理終了
            return false;
        }
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader( fr );
            // ファイルを1行ずつ読み込む
			String b=null;
			String str=null;
			while ( ( b = br.readLine() ) != null ){
            	str = new String(b);
            }	
            // ファイルを閉じる
            br.close();
            
            //文字列分割
            String splitLetter[]=str.split(":",4);
            String dateType=splitLetter[0]+":"+splitLetter[1]+":"+splitLetter[2];
            
            //
            DateFormat format = DateFormat.getDateTimeInstance();
            format.setLenient(false);
			format.parse(dateType);
			if(!testLetter.equals(splitLetter[3]))
				return false;

            return true;
            
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return false;
		}catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return false;
		}
	}	
	
}


