import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		String[] str = {"A1315Z", "S1212G", "H1234L", "T12351"};
		String FILE_PATH = "D:\\Raychenko\\Lesson29\\file.txt";

		for(String txt : str) {
			System.out.println(txt);
		}

		Dog dog = new Dog();
		Cat cat = new Cat();

		System.out.println();
		System.out.println("Мухтар проходит определённую дистанцию за " + dog.CheckRun() + " минут.");
		System.out.println("Мухтар побеждает и громко говорит : " + dog.CheckVoice());
		System.out.println("Барсик проходит определённую дистанцию за " + cat.CheckRun() + " минут.");
		System.out.println("Барсик грустно говорит : " + cat.CheckVoice());

		System.out.println();
		Scanner in = new Scanner(System.in);
		System.out.println("Как вас зовут?");
		String name = in.nextLine();

		System.out.println("В каком городе проживаете?");
		String sity = in.nextLine();

		System.out.println("Сколько вам лет?");
		String lvl = in.nextLine();
		System.out.println("Stop!");
		in.close();

		try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH)))
        {
            bw.write(name + "\r\n");
            bw.write(sity + "\r\n");
            bw.write(lvl + "\r\n");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

		System.out.println(dog.distance(5));
	}
}
