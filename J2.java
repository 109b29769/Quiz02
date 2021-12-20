interface iShape03 //界面 iShape03
{
	public void show();
	public int area();
}

interface iColor //界面 iColor
{
	public void showColor();
}

class CWin //類別實作界面，請自行設計
{
	protected int width;
	protected int height;
	protected String color;
	int area;
	public CWin(int w,int h,String str)
	{
		width=w;
		height=h;
		color=str;
	}
	public int area()
	{
		return width*height;
	}
	public void showColor()
	{
		System.out.println("color="+color);
	}
	public void show()
	{
		this.showColor();
		System.out.println("width="+width);
		System.out.println("height="+height);
		System.out.println("area="+area());
	}


}

public class J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CWin win=new CWin(5,7,"Green");
		win.show();
	}

}
