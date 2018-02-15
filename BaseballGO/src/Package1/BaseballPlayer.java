package Package1;

import java.util.Scanner;

public class BaseballPlayer {
	
	String Playername;
	double AB; 
	double H;
	double R;
	double DoubleB;
	double TripleB;
	double HR;
	double BB;
	double HBP;
	double SF;
	
	public BaseballPlayer()
	{
	}
	
	public double BA()
	{
		double ba = this.H / this.AB;
		
		return ba;
	}

	public double OBP()
	{
		double obp = (this.H + this.BB + this.HBP) / (this.AB + this.BB + this.HBP + this.SF);
		
		return obp;
	}
	
	public double TB()
	{
		double singles = this.H - this.DoubleB - this.TripleB - this.HR;
		
		double tb = singles + (2 * this.DoubleB) + (3 * this.TripleB) + (4 * this.HR);
		
		return tb;
	}
	
	public double SLG()
	{
		double slg = this.TB() / this.AB;
		
		return slg;
	}
	
	public double OPS()
	{
		double ops = this.OBP() + this.SLG();
		
		return ops;
	}
	

	public String toString()
	{
		return "\nName: " + this.Playername + "\nBA: " + this.BA() + "\nOBP: " + this.OBP() + "\nTB: " + this.TB() + 
				"\nSLG: " + this.SLG() + "\nOPS: " + this.OPS();
	}
	
	public static void main(String[] args)
	{
		Scanner bplayer = new Scanner (System.in);
		
		BaseballPlayer p1 = new BaseballPlayer();
		
		System.out.print("Enter Player's Name: ");
		
		p1.Playername = bplayer.nextLine();
		
		System.out.print("Enter AB: ");
		
		p1.AB = Double.parseDouble(bplayer.nextLine());
		
		System.out.print("Enter H: ");
		
		p1.H = Double.parseDouble(bplayer.nextLine());
		
		System.out.print("Enter R: ");
		
		p1.R = Double.parseDouble(bplayer.nextLine());
		
		System.out.print("Enter 2B: ");
		
		p1.DoubleB = Double.parseDouble(bplayer.nextLine());
				
		System.out.print("Enter 3B: ");
		
		p1.TripleB = Double.parseDouble(bplayer.nextLine());
		
		System.out.print("Enter HR: ");
		
		p1.HR = Double.parseDouble(bplayer.nextLine());
		
		System.out.print("Enter BB: ");
		
		p1.BB = Double.parseDouble(bplayer.nextLine());
		
		System.out.print("Enter HBP: ");
		
		p1.HBP = Double.parseDouble(bplayer.nextLine());
		
		System.out.print("Enter SF: ");
		
		p1.SF = Double.parseDouble(bplayer.nextLine());
		
		bplayer.close();
		
		System.out.println(p1);
	}	
}