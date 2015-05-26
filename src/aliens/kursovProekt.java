package aliens;

import java.util.Scanner;

public class kursovProekt {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		System.out.print("Въведете броя на тестовете:");
		int test = sca.nextInt();
		for (int j = 0; j < test; j++) {
			if (test > 40) {
				System.out
						.println("Въведените тестове са повече от 40. Не отговаря на условието!");
				break;
			} else {
				Scanner input = new Scanner(System.in);
				System.out.print("Въведи дума на извънземните:");
				String word = input.nextLine();
				if ((word.length() < 2) || (word.length() > 100000)) {
					System.out.println("Думата не отговаря на условието");
				} else {
					System.out
							.print("Въведи текста, който извънземните говорят:");
					String text = input.nextLine();
					if ((text.length() < word.length())
							|| (text.length() > 100000)) {
						System.out.println("Текста не отговаря на условието");
					} else {
						String quote = text;
						int index = quote.indexOf(word);
						int lastIndex = 0;
						int count = 0;
						while ((lastIndex = text.indexOf(word, lastIndex)) != -1) {
							count++;
							lastIndex += word.length() - 1;
						}
						System.out.println("Въведената дума се повтаря точно "
								+ count + " пъти");
						{
							if (count == 0) {
								System.out.print("");
							} else {

								System.out
										.print("Въведената дума започва от индекси №:");
							}
							while (index != -1) {
								System.out.print(" " + index);
								index = quote.indexOf(word, index + 1);
							}
							{
								System.out.println();
							}
						}
					}
				}
			}
		}
	}
}