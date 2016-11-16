package mx.com.everis.tallerjava.Text;

import mx.com.everis.tallerjava.Excepcion.MiExcepcion;
public class TestExcepcion {

	public static void main(String[] args) throws MiExcepcion {
		// TODO Auto-generated method stub
		int []arr={2,-4,-1,5,7};
		TestExcepcion.validar(arr);

	}
    public static void validar(int []arr)throws MiExcepcion
    {
        if(arr.length>5)
        {
        	throw new MiExcepcion("El arreglo tiene mas de 5 elementos");
        }
    	for(int i=0;i<arr.length;i++)
    	{
    		
    		
    		if(arr[i]<0)
    		{
    			throw new MiExcepcion("Numero negatico");
    		}
    		
    		if(arr[i]==9)
    		{
    			throw new MiExcepcion("Numero es nueve");
    		}
    }
   }
}
