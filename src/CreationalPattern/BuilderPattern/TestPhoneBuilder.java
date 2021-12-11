package CreationalPattern.BuilderPattern;

public class TestPhoneBuilder {
    public static void main(String[] args) {
        Phone phone = new Phone.PhoneBuilder("16GB","skt")
                .set5G(true)
                .setIphone(false)
                .setSamsung(true)
                .build();

        System.out.println(String.format("ram {%s}, network {%s}, is5G{%s}, isIphone{%s}, isSamsung{%s}",
                phone.getRam(), phone.getNetwork(), phone.isIs5G(), phone.isIphone(), phone.isSamsung()));
    }
}
