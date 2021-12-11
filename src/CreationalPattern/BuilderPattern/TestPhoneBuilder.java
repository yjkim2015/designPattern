package CreationalPattern.BuilderPattern;

public class TestPhoneBuilder {
    public static void main(String[] args) {
        Phone phone = new Phone.PhoneBuilder("16GB","skt")
                .set5G(true)
                .setIphone(false)
                .setSamsung(true)
                .build();

        System.out.println(phone);
    }
}