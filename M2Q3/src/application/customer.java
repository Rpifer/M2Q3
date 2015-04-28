package application;

public class customer
{
	private String FN;
	private String MI;
	private String LN;
	private String G;
	private String A;
	private String C;
	private String S;
	private String ZIP;
	
	public customer(String fN, String mI, String lN, String g, String a,
			String c, String s, String zIP)
	{
		super();
		FN = fN;
		MI = mI;
		LN = lN;
		G = g;
		A = a;
		C = c;
		S = s;
		ZIP = zIP;
	}
	public String getFN()
	{
		return FN;
	}
	public void setFN(String fN)
	{
		FN = fN;
	}
	public String getMI()
	{
		return MI;
	}
	public void setMI(String mI)
	{
		MI = mI;
	}
	public String getLN()
	{
		return LN;
	}
	public void setLN(String lN)
	{
		LN = lN;
	}
	public String getG()
	{
		return G;
	}
	public void setG(String g)
	{
		G = g;
	}
	public String getA()
	{
		return A;
	}
	public void setA(String a)
	{
		A = a;
	}
	public String getC()
	{
		return C;
	}
	public void setC(String c)
	{
		C = c;
	}
	public String getS()
	{
		return S;
	}
	public void setS(String s)
	{
		S = s;
	}
	public String getZIP()
	{
		return ZIP;
	}
	public void setZIP(String zIP)
	{
		ZIP = zIP;
	}
	
	
}
