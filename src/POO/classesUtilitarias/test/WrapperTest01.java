package POO.classesUtilitarias.test;


//classes wrappers
//objetos que vao encapsular os tipos primitivos

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L; //tipos primitivos
        float floatP = 10F;
        double doubleP = 10.0;
        char charP = 'w';
        boolean booleanP = false;


        //wrappers
        //são OBJETOS,passando parametros como referencia
        //poder passar os valores por referencia,facilita muito
        //arrayList,list e pacote collections = nao trabalham com tipos primitivos,tem que usar os wrappers
        //do mesmo jeito que os tipos primitivos funcionam,os wrappers funcionam igual
        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10.0;
        Character charW = 'w';
        Boolean booleanW = false;



        
    }
}
