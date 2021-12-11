package CreationalPattern.BuilderPattern;

public class Phone {
    private String ram;
    private String network;
    private boolean isIphone;
    private boolean isSamsung;
    private boolean is5G;

    private Phone(PhoneBuilder builder) {
        this.ram = builder.ram;
        this.network = builder.network;
        this.isIphone = builder.isIphone;
        this.isSamsung = builder.isSamsung;
        this.is5G = builder.is5G;
    }

    public String getRam() {
        return ram;
    }

    public String getNetwork() {
        return network;
    }

    public boolean isIphone() {
        return isIphone;
    }

    public boolean isSamsung() {
        return isSamsung;
    }

    public boolean isIs5G() {
        return is5G;
    }

    public static class PhoneBuilder {
        private String ram;
        private String network;
        private boolean isIphone;
        private boolean isSamsung;
        private boolean is5G;

        public PhoneBuilder(String ram, String network) {
            this.ram = ram;
            this.network = network;
        }

        public PhoneBuilder setIphone(boolean isIphone) {
            this.isIphone = isIphone;
            return this;
        }

        public PhoneBuilder setSamsung(boolean isSamsung) {
            this.isSamsung = isSamsung;
            return this;
        }

        public PhoneBuilder set5G(boolean is5G) {
            this.is5G = is5G;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }
}
