import java.util.Scanner;
public class J1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="",str2="",str3="",str4="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("�K�X��J����");
        System.out.print("�п�J�K�X:");
        str1 = scanner.nextLine();
        try 
        {
        	int typenum=0;
        	System.out.print("�ЦA����J�@���K�X:");
        	str2 = scanner.nextLine();
        	if(str2.equals(str1))
        	{
        		System.out.print("�K�X���T,�ЦA����J�@���K�X:");
        		str3 = scanner.nextLine();
        		if(str3.equals(str1))
        		{
        			System.out.println("�K�X���T");
        		}
        	}
        	else 
        	{
        		System.out.println("�P�Ĥ@����J�����P");
        		typenum++;
        	}
        	if(typenum==1)
        	{
        		System.out.print("�ЦA����J�@���K�X:");
            	str3 = scanner.nextLine();
            	if(str3.equals(str1))
            	{
            		System.out.print("�ЦA����J�@���K�X:");
            		str4 = scanner.nextLine();
            	}
            	else
            	{
            		System.out.println("�P�Ĥ@����J�����P");
            		typenum++;
            	} 		
        	}
        	if(typenum==2)
        	{
        		System.out.print("�ЦA����J�@���K�X:");
            	str4 = scanner.nextLine();
            	if(str4.equals(str1))
            	{
            		System.out.println("�K�X���T");
            	}
            	else
            	{
            		System.out.println("�P�Ĥ@����J�����P");
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
        	System.out.println("��J�T�����~!�{������");
        }
	}

}
