package Expedia_father;

import java.io.IOException;

import org.junit.BeforeClass;

import Interface.Expedia.Expedia_interface;
import commcon.Common_operations;
import commcon.Process_operation;
import commcon.Start;

//ҵ���߼�����
public class Expdia_sg_father implements Expedia_interface {
	static Common_operations operation;
	 static Process_operation process;	 
	 
	@BeforeClass
	 public static void Start1(){
			
	    	
		   if(!Start.initResult){
				Start.Start();
			}
				
			operation=Start.operation;
				
			process=Start.process;	
			
}
/**
 * 	
 * @param name//���ԵĲ��������ƣ������û���
 * @param value  ����ֵ�������û������Ƕ���
 * @param tu  ��ͼ��·��
 * @return
 * @throws InterruptedException
 * @throws IOException
 */
public static String Process_Login(String name,String value,String tu) throws InterruptedException, IOException {	
		
		
		 operation.input_Alone(name, value, input, expedia_xml, expedia_DB_xml);//ѭ�����input����	 
		
		 operation.click(sing, expedia_xml);  //��¼
		 
		 Thread.sleep(1000);	
		 
		 String name1=picture_url+tu;
		 
		 operation.Screenshot(name1);// ��ͼ
		 
		return operation.getTitle();					
	
	}
}
