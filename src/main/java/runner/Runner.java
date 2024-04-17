package runner;

import SAXfabric.SAXparser;
import XMLfabric.FabricSonnet;
import model.Sonnet;
import writer.Writer;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите XML-документ: ");
        String pathToXML = scanner.nextLine();
        System.out.println("Введите 1 для использования DOM-парсера \nВведите 2 для использования SAX-парсера");
        byte a = scanner.nextByte();
        Sonnet sonnet = null;
        if(a == 1) {
            sonnet = FabricSonnet.fabricSonnetFromXML(pathToXML + ".xml");
        }else if(a == 2){
            sonnet = SAXparser.parse(pathToXML + ".xml");
        }else{
            System.out.println("Введено неверное значение");
        }
        if(sonnet == null) {
            System.out.println("файл не найден. ");
            return;
        }
        Writer.writer(sonnet);
    }
}
