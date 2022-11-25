//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package homeWork;

// Java-программа для проверки того, является ли
// число треугольным числом
class GFG
{
	
	// Возвращает значение true, если 'num' равно
    // треугольному, в противном случае false
	static boolean isTriangular(int num)
	{
		
		if (num < 0)
			return false;
	
		// Треугольное число должно быть
        // сумма первых n натуральных чисел
		int sum = 0;
		
		for (int n = 1; sum <= num; n++)
		{
			sum = sum + n;
			if (sum == num)
				return true;
		}
	
		return false;
	}
	public class task2 {
	    public static void main (String[] args)
	{   
		    int n = 55;
		    if (isTriangular(n))
			    System.out.print("число "
				    + "является треугольным числом");
		    else
			    System.out.print("число"
			    + " не треугольное");
	    }
    }

}
