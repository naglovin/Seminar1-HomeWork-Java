// Вывести все простые числа от 1 до 1000
package homeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task2 {
	public static void main(String[] args) {
		System.out.println(findPrimeNumbers(100));
	}

// генерация последнего из простых чисел от 2 до заданного числа
// использование алгоритма сита Эратосфена
	private static List findPrimeNumbers(int n) {
		//инициализирую массив с помощью "true", индекс обозначает числа от 0 до n.
		boolean[] primes = new boolean[n + 1];
		Arrays.fill(primes, true);

		//цикл от 2 до x, пока x * x не станет больше n
		for (int i = 2; i * i < n; i++) {
			// если номер еще не отмечен
			if (primes[i]) {
				// найти кратные числа и пометьте их как ложные
				for (int j = i * i; j <= n; j += i)
					primes[j] = false;
			}
		}

		// заполним список простых чисел из массива и вернем его
		List primeNumbers = new ArrayList<>();
		for (int i = 2; i <= n; i++) {
			if (primes[i])
				primeNumbers.add(i);
		}
		return primeNumbers;
	}

}