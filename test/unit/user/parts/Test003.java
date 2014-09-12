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
		
		//�t�@�C���쐬
		if(!fileMake())
			fail("�t�@�C���쐬���s");
			
		OutLog test=new OutLog();
		test.outLogDmp("sample�F�T���v��");
		
		if(resultGet003("sample�F�T���v��")){
			System.out.println("UT003_001����");
			assertTrue(true);
		}else
		fail("�e�X�g����NG");	
	}

	
	@SuppressWarnings("static-access")
	@Test
	public void testOutLogDmp_UT003_002() {
		
		//�t�@�C���쐬
		if(!fileMake())
			fail("�t�@�C���쐬���s");
			
		OutLog test=new OutLog();
		test.outLogDmp("12345");
		
		if(resultGet003("12345")){
			System.out.println("UT003_002����");
			assertTrue(true);
		}else
		fail("�e�X�g����NG");
	}

	
	//003�t�@�C���쐬
	public boolean fileMake(){
		
		File newfile = new File(FILENAME);
		try {
			
			//�t�@�C���̗L���m�F
		    if (newfile.exists() & !newfile.delete())
		        return false;
		      
		    //�t�@�C���쐬
			if (!newfile.createNewFile()){
		          return false;
		        }
			return true;
		      
		} catch (IOException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
			return false;
		}
	}
	
	//003���ʊm�F
	public boolean resultGet003(String testLetter){
		
		File file = new File(FILENAME);
        
		//�t�@�C�����݊m�F
		if ( !file.exists() ) {
            return false;
        }
		
	    // �t�@�C�����m�F
        if ( !file.isFile() ) {
            return false;
        }
        
        // �t�@�C�����ǂݍ��݉\���ǂ����𔻒�
        if ( !file.canRead() ) {
            // �t�@�C�����ǂݍ��ݕs�̏ꍇ�͏����I��
            return false;
        }
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader( fr );
            // �t�@�C����1�s���ǂݍ���
			String b=null;
			String str=null;
			while ( ( b = br.readLine() ) != null ){
            	str = new String(b);
            }	
            // �t�@�C�������
            br.close();
            
            //�����񕪊�
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
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
			return false;
		}catch (ParseException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
			return false;
		}
	}	
	
}


