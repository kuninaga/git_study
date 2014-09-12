package unit.user.parts;

import static org.junit.Assert.*;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import user.bean.RegistrantInfo;
import user.parts.*;
public class Test002 {


/**************UT002****************/
	RegInfDAO regDAO;	
	
	@Test
	public void testRegInfDAO_UT002_001() {

		ArrayList<RegistrantInfo> data = new ArrayList<RegistrantInfo>();
		data=new ArrayList();
		
		RegistrantInfo regInfo = new RegistrantInfo("001","鈴木太郎","35");
		data.add(regInfo);
		regInfo = new RegistrantInfo("002","Tommy","25");
		data.add(regInfo);
		regInfo = new RegistrantInfo("003","山田花子","30");
		data.add(regInfo);
		dataSet002(data);		
	    
		regDAO = new RegInfDAO();
	    regDAO.insert("004","佐藤路未央","28");
	    
		ArrayList<RegistrantInfo> testData = new ArrayList<RegistrantInfo>();
		testData.add(data.get(0));
		testData.add(data.get(1));
		testData.add(data.get(2));
		regInfo = new RegistrantInfo("004","佐藤路未央","28");
		testData.add(regInfo);
		
	    if(resultGet002(testData)){
			System.out.println("UT002_001成功");
			assertTrue(true);
	    }else
	    	fail();
	}

	@Test
	public void testRegInfDAO_UT002_002() {

		ArrayList<RegistrantInfo> data = new ArrayList<RegistrantInfo>();
		data=new ArrayList();
		
		RegistrantInfo regInfo = new RegistrantInfo("001","鈴木太郎","35");
		data.add(regInfo);
		regInfo = new RegistrantInfo("002","Tommy","25");
		data.add(regInfo);
		regInfo = new RegistrantInfo("003","山田花子","30");
		data.add(regInfo);
		dataSet002(data);
		
		//実行
	    regDAO = new RegInfDAO();
	    regDAO.update("002","Michael","29");
	    
	    //結果作成
		ArrayList<RegistrantInfo> testData = new ArrayList<RegistrantInfo>();
		testData.add(data.get(0));
		regInfo = new RegistrantInfo("002","Michael","29");
		testData.add(regInfo);
		testData.add(data.get(2));
		
		//判定
	    if(resultGet002(testData)){
			System.out.println("UT002_002成功");
			assertTrue(true);
	    }else
	    	fail();
	}

	

	@Test
	public void testRegInfDAO_UT002_003() {
		
		ArrayList<RegistrantInfo> data = new ArrayList<RegistrantInfo>();
		data=new ArrayList();
		
		RegistrantInfo regInfo = new RegistrantInfo("001","鈴木太郎","35");
		data.add(regInfo);
		regInfo = new RegistrantInfo("002","Tommy","25");
		data.add(regInfo);
		regInfo = new RegistrantInfo("003","山田花子","30");
		data.add(regInfo);
		dataSet002(data);
		
		//実行
	    regDAO = new RegInfDAO();
	    regDAO.delete("001");
	    
	    //結果作成
		ArrayList<RegistrantInfo> testData = new ArrayList<RegistrantInfo>();
		testData.add(data.get(1));
		testData.add(data.get(2));
		
		
		
	    if(resultGet002(testData)){
			System.out.println("UT002_003成功");
			assertTrue(true);
	    }else
	    	fail();
	    
	}


	@Test
	public void testRegInfDAO_UT002_004() {
		
		ArrayList<RegistrantInfo> data = new ArrayList<RegistrantInfo>();
		data=new ArrayList();
		
		RegistrantInfo regInfo = new RegistrantInfo("001","鈴木太郎","35");
		data.add(regInfo);
		regInfo = new RegistrantInfo("002","Tommy","25");
		data.add(regInfo);
		regInfo = new RegistrantInfo("003","山田花子","30");
		data.add(regInfo);

		dataSet002(data);

	    regDAO = new RegInfDAO();
		
	    //実行
		ArrayList<RegistrantInfo> arrayRegInfo = new ArrayList<RegistrantInfo>();
		arrayRegInfo=regDAO.getReglist();
		
		//結果確認用List
		ArrayList<RegistrantInfo> testData = new ArrayList<RegistrantInfo>();
		testData = data;
	
	    if(resultGet002(testData,arrayRegInfo)){
			System.out.println("UT002_004成功");
			assertTrue(true);
	    }else
	    	fail();
	    
	}


	@Test
	public void testRegInfDAO_UT002_005() {
		
		ArrayList<RegistrantInfo> data = new ArrayList<RegistrantInfo>();
		data=new ArrayList();
		
		dataSet002(data);

	    regDAO = new RegInfDAO();
		
	    //実行
	    String rs=null;
	    rs=regDAO.getNextId();
	
	    if(rs.equals("001")){
			System.out.println("UT002_005成功");
			assertTrue(true);
	    }else
	    	fail();
	    
	}	
	
	
	
	

	private boolean resultGet002(ArrayList<RegistrantInfo> testData,
			ArrayList<RegistrantInfo> arrayRegInfo) {
		// TODO 自動生成されたメソッド・スタブ
		int i=0;
		while(i<testData.size()){
			
			if(!testData.get(i).getrAge().equals(arrayRegInfo.get(i).getrAge()) || 
			   !testData.get(i).getrName().equals(arrayRegInfo.get(i).getrName()) ||
			   !testData.get(i).getrId().equals(arrayRegInfo.get(i).getrId())){
				return false;
			}else
			i++;
		}
			
		if(i!=arrayRegInfo.size())
			return false;
		
		return true;
					
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {


	    System.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.apache.naming.java.javaURLContextFactory");
	    System.setProperty(Context.URL_PKG_PREFIXES, "org.apache.naming");

	    InitialContext ic = new InitialContext();
	    ic.createSubcontext("java:");
	    ic.createSubcontext("java:comp");
	    ic.createSubcontext("java:comp/env");
	    ic.createSubcontext("java:comp/env/jdbc");

	    MysqlDataSource ds = new MysqlDataSource();
	    ds.setUser("root");
	    ds.setPassword("root");
	    ds.setURL("jdbc:mysql://localhost/Task");

	    ic.bind("java:comp/env/jdbc/Task", ds);
	    
	}
	
	@After
	public void tearDown(){
	    regDAO.close();
	}
	
	
	public boolean resultGet002(ArrayList<RegistrantInfo> testData){
		InitialContext initCon;
		DataSource ds;
		Connection con;
		PreparedStatement stmt;
		ResultSet rs;
		
		try {
			initCon = new InitialContext();
			ds = (DataSource)initCon.lookup("java:comp/env/jdbc/Task"); 
			con = ds.getConnection();
		    stmt = con.prepareStatement("select * from task.registrants order by registrant_id");
		    rs=stmt.executeQuery();
		    
		    int i=0;
			while (rs.next()){

				if (!rs.getString("registrant_id").equals(testData.get(i).getrId())){
					return false;
				}else if (!rs.getString("registrant_name").equals(testData.get(i).getrName())){
					
					return false;
				}else if (!rs.getString("registrant_age").equals(testData.get(i).getrAge())){
					return false;
				}else
					i++;
			}
			
			if (i==testData.size())
				return true;
			else
				return false;
			
		} catch (SQLException | NamingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return false;
		}
		

	}
	

	
	
	public void dataSet002(ArrayList<RegistrantInfo> data){
		InitialContext initCon;
		DataSource ds;
		Connection con;
		PreparedStatement stmt;
		ResultSet rs;
		int i=0;
		
		try {
			initCon = new InitialContext();
			ds = (DataSource)initCon.lookup("java:comp/env/jdbc/Task"); 
			con = ds.getConnection();

			
		    con = ds.getConnection();
		    stmt = con.prepareStatement("DELETE FROM task.registrants");
			stmt.executeUpdate();
			
			stmt = con.prepareStatement("INSERT INTO task.registrants VALUES(?,?,?)");
			
			while(i<data.size()){
				;
				stmt.setString(1,data.get(i).getrId());
				stmt.setString(2,data.get(i).getrName());
				stmt.setString(3,data.get(i).getrAge());
				stmt.executeUpdate();
				
				i++;
				
			}
	
			
		} catch (NamingException | SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

	
}


