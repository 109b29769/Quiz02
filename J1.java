import java.util.Scanner;
public class J1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="",str2="",str3="",str4="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("密碼輸入測試");
        System.out.print("請輸入密碼:");
        str1 = scanner.nextLine();
        try 
        {
        	int typenum=0;
        	System.out.print("請再次輸入一次密碼:");
        	str2 = scanner.nextLine();
        	if(str2.equals(str1))
        	{
        		System.out.print("密碼正確,請再次輸入一次密碼:");
        		str3 = scanner.nextLine();
        		if(str3.equals(str1))
        		{
        			System.out.println("密碼正確");
        		}
        	}
        	else 
        	{
        		System.out.println("與第一次輸入的不同");
        		typenum++;
        	}
        	if(typenum==1)
        	{
        		System.out.print("請再次輸入一次密碼:");
            	str3 = scanner.nextLine();
            	if(str3.equals(str1))
            	{
            		System.out.print("請再次輸入一次密碼:");
            		str4 = scanner.nextLine();
            	}
            	else
            	{
            		System.out.println("與第一次輸入的不同");
            		typenum++;
            	} 		
        	}
        	if(typenum==2)
        	{
        		System.out.print("請再次輸入一次密碼:");
            	str4 = scanner.nextLine();
            	if(str4.equals(str1))
            	{
            		System.out.println("密碼正確");
            	}
            	else
            	{
            		System.out.println("與第一次輸入的不同");
            		typenum++;
            	}
            		
        	}
        	if(typenum==3)
        	{
        		throw new RuntimeException();
        	}
        }
        catch(RuntimeException e) 
        {
        	System.out.println("輸入三次錯誤!程式停止");
        }
	}

}
