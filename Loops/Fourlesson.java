//package com.veinik.statements;
//
//public class Fourlesson {
//	public static void main(String args[]){
//		// 9. Цена одного килограмма конфет – 45600 рублей. Напишите программу, которая выводит стоимость 1, 2... 25 килограмм конфет..
//		int i = 1;
//		while (i <= 25) {
//			System.out.println(i * 45600);
//			i++;
//		}
//	}
//}
//
///*public class Fourlesson {
//	public static void main(String args[]){
//		// 10. Напишите программу, которая выводит сумму чисел от 1 до 10000.
//		int sum = 0;
//		int i = 1;
//		while (i <= 1000) {
//			sum = sum + i;
//			i++;
//		}
//		System.out.println(sum);
//	}
//} */
//
///*public class Fourlesson {
//	public static void main(String args[]){
////		5. Перепишите все программы, сделанные с циклом while, с помощью for.
////		5.1. Напишите программу, которая выводит в консоль строку “Hello, World!” ровно 45 раз.
//		for (int i = 0;i < 45;i++) {
//			System.out.println("Hello, World!");
//		}
//	}
//}*/
//
///*public class Fourlesson {
//	public static void main(String args[]){
////		5. Перепишите все программы, сделанные с циклом while, с помощью for.
////		5.2. Напишите программу, которая выводит числа от 4 до 8 в консоль.
//		for (int i = 4;i <= 8;i++) {
//			System.out.println(i);
//		}
//	}
//}*/
//
///*public class Fourlesson {
//	public static void main(String args[]){
////		5. Перепишите все программы, сделанные с циклом while, с помощью for.
////		5.3. Цена одного килограмма конфет – 45600 рублей. Напишите программу, которая выводит стоимость 1, 2... 25 килограмм конфет.
//		for (int i = 1;i <= 25;i++) {
//			System.out.println(i * 45600);
//		}
//	}
//}*/
//
///*public class Fourlesson {
//	public static void main(String args[]){
////		5. Перепишите все программы, сделанные с циклом while, с помощью for.
////		5.4. Напишите программу, которая выводит сумму чисел от 1 до 10000.
//		int summ = 0;
//		for (int i = 1;i<=1000;i++) {
//			summ = summ + i;
//		}
//		System.out.println(summ);
//	}
//}*/
//
///*public class Fourlesson {
//	public static void main(String args[]){
//		// 6. Дано число 5. Возведите его в степень 6 с помощью цикла for.
//		int a = 5;
//		for (int i = 1; i<6; i++) {
//		a*=5;
//		System.out.println(a);
//		}
//	}
//}/*
//
///*public class Fourlesson {
//	public static void main(String args[]){
//		// 7. Даны 2 целых числа (5 и 18). Найдите сумму всех чисел от первого до второго включительно с помощью цикла for.
//		int summ = 0;
//		for (int i = 5; i<=18; i++) {
//		sum = sum + i;
//		System.out.println(summ);
//		}
//		//System.out.println(summ);
//	}
//}*/
//
///*public class Fourlesson {
//	public static void main(String args[]){
//		// 8. Дано 2 целых чисда (5 и 18). Найдите сумму квадратов всех чисел от первого до второго включительно с помощью цикла for.
//		int summ = 0;
//		for (int i = 5; i<=18; i++) {
//		summ += i*i;
//		System.out.println(summ);
//		}
//	}
//}*/
//
///*public class Fourlesson {
//	public static void main(String args[]){
//		// 9. Дано 2 числа – целое N и дробное k. Выведите все степени (от 1 до N) дробного числа с помощью оператора for.
//		double k = 1.2;
//		for (int i = 1; i<9; i++) {
//		k *= 1.2;
//		System.out.println(k);
//		}
//	}
//}*/
//
///*public class Fourlesson {
//	public static void main(String args[]){
//		// 10. Даны 2 целых числа  (5 и 18). Найдите произведение всех чисел между данными числами, включая данные, с помощью оператора for.
//		long productOfNumbers = 1;
//		for (int i = 5; i<=18; i++) {
//		productOfNumbers *= i;
//		System.out.println(productOfNumbers);
//		}
//	}
//} */
//
///*public class Fourlesson {
//	public static void main(String args[]){
//		// 9. Цена одного килограмма конфет – 45600 рублей. Напишите программу, которая выводит стоимость 1, 2... 25 килограмм конфет..
//		int i = 1;
//		do{
//			System.out.println(i * 45600);
//			i++;
//		} while (i <= 25);
//	}
//}*/
//
///*public class Fourlesson {
//	public static void main(String args[]){
//		// 5.  Перепишите программы, сделанные с циклом while, с помощью do … while.
//		// 5.1. Напишите программу, которая выводит в консоль строку “Hello, World!” ровно 45 раз.
//		int i = 0;
//		do{
//			System.out.println("Hello, World!");
//			i++;
//		} while (i < 45);
//	}
//}*/
//
///*public class Fourlesson {
//	public static void main(String args[]){
//		// 5.2. Напишите программу, которая выводит числа от 4 до 8 в консоль..
//		int i = 4;
//		do{
//			System.out.println(i);
//			i++;
//		} while (i <= 8);
//	}
//}*/
//
///*public class Fourlesson {
//	public static void main(String args[]){
//		// 5.3. Цена одного килограмма конфет – 45600 рублей. Напишите программу, которая выводит стоимость 1, 2... 25 килограмм конфет.
//		int i = 1;
//		do{
//			System.out.println(i * 45600);
//			i++;
//		} while (i <= 25);
//	}
//}*/
//
///*public class Fourlesson {
//	public static void main(String args[]){
//		// 5.4. Напишите программу, которая выводит сумму чисел от 1 до 10000.
//		int summ = 0;
//		int i = 1;
//		do{
//			summ = summ + i;
//			i++;
//		} while (i <= 1000);
//		System.out.println(summ);
//	}
//}*/
//
//
//
//
//
//
//
//
//
//
//
//
