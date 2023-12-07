package com.rccars.model;


import java.math.BigDecimal;

public class AbstractRcCar {
    import java.math.BigDecimal;

    public abstract class AbstractRcCar implements PriceInterface, RCInterface {

        private FrameColors color;
        private String serial;
        private String upcPrefix;
        private String modelNumber;
        private int startingCount;


        public AbstractRcCar(FrameColors color) {
            this.color = color;
        }

        public abstract BigDecimal getPrice();

        public abstract int getStartNumber();

        public abstract String getUpcPrefix();

        public abstract String getModelNumber();

        public abstract String getSerial();

        public FrameColors getColor() {
            return color;
        }

        public void setSerial(String serial) {
            this.serial = serial;
        }

        public String getSerialNumber() {
            return serial;
        }

        public void setUpcPrefix(String upcPrefix) {
            this.upcPrefix = upcPrefix;
        }

        public void setModelNumber(String modelNumber) {
            this.modelNumber = modelNumber;
        }

        public void setColor(FrameColors color) {
            this.color = color;
        }
    }



}
