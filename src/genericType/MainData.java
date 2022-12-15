package genericType;

public class MainData {
    public static void main(String[] args) {
        Data data = new Data();
        data.setData("Umi Rosidah");
        System.out.println("data Value Nama        : "+ data.getData());

        Data data1 = new Data();
        data1.setData("Tegal");
        System.out.println("data Value Domisili    : "+ data1.getData());

        Data data2 = new Data();
        data2.setData(15000.00);
        System.out.println("data Value Pengeluaran : "+ data2.getData());

        Data data3 = new Data();
        data3.setData(85000.00);
        System.out.println("data Value Saldo       : "+ data3.getData());

    }
}

