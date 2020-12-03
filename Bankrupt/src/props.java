
public class props {
	
	public int valorVenda;
public int valorAluguel;


public Boolean temDono;
private int  dono;



public props (int valorVenda, int valorAluguel) {
	this.valorAluguel=valorAluguel;
	this.valorVenda=valorVenda;		
}

public void setOwner(int dono ) {
	
}

public void print()
{
	System.out.println("Venda:" +valorVenda);
	}



}
