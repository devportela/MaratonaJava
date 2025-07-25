package POO.interfaces.test;

import POO.interfaces.domain.DataLoader;
import POO.interfaces.domain.DatabaseLoader;
import POO.interfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
        System.out.println("-------------------------");
        databaseLoader.remove();
        fileLoader.remove();

        System.out.println("-----------------");
        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        databaseLoader.retriveMaxDataSize();
    }
}
