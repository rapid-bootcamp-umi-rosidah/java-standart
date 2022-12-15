package genericType;

public class MainDataGeneric {
    public static void main(String[] args) {
        DataGeneric<String> data1 = new DataGeneric<String>();
        data1.setData("Umi Rosidah");
        System.out.println("data1 Value Customer Name: "+ data1.getData());

        //data1.setData(1234567); => error

        DataGeneric<Integer> data2 = new DataGeneric<Integer>();
        data2.setData(9876678);
        System.out.println("data2 Value ID Order     : "+ data2.getData());

        DataGeneric<Boolean> data3 = new DataGeneric<Boolean>();
        data3.setData(true);
        System.out.println("data2 Value Status       : "+ data3.getData());

        DataGeneric<Product> data4 = new DataGeneric<Product>();
        //data4.setData(new Product("Ajinomoto",2500.00));
        Product product1 = new Product("Obat Batuk",10000.0);
        data4.setData(product1);
        System.out.println("data4 Value "+ data4.getData());

        DataGeneric<Product> data5 = new DataGeneric<Product>();
        Product product2 = new Product("Obat Jerawat",35000.0);
        data5.setData(product2);
        System.out.println("data4 Value "+ data5.getData());

        DataGeneric<Product> data6 = new DataGeneric<Product>();
        Product product3 = new Product("Obat Tetes Mata",15000.0);
        data6.setData(product3);
        System.out.println("data4 Value "+ data6.getData());

    }
}

