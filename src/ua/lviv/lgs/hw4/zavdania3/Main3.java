package ua.lviv.lgs.hw4.zavdania3;

public class Main3 {

	public static void main(String[] args) {

		// Завдання 3
		Anymal anymal = new Anymal("Леопард", 25, 5);
		System.out.println("Назва тварини = " + anymal.getNameAnymal() + ", Швидкість тварини = " + anymal.getvAnymal()
				+ " км/год, Вік тварини = " + anymal.getAgAnymal() + " років");
		anymal.setNameAnymal("Бик");
		anymal.setvAnymal(5);
		anymal.setAgAnymal(3);
		System.out.println("Назва тварини = " + anymal.getNameAnymal() + ", Швидкість тварини = " + anymal.getvAnymal()
				+ " км/год, Вік тварини = " + anymal.getAgAnymal() + " років");

	}

}
