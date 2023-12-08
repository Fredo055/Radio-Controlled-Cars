package com.rccars.model;


import java.math.BigDecimal;

public abstract class AbstractRcCar implements PriceInterface, RCInterface{




        private FrameColors color;
        private String serial;



        public AbstractRcCar(FrameColors color) {
            this.color = color;
        }

        public abstract BigDecimal getPrice();
        public abstract int getStartNumber();
        public abstract String getPrefix();
        public abstract String getWheelType();
        public abstract String getOptionName();
        public abstract String getOptionAmount();

        public FrameColors getColor() {
            return color;
        }

        public void setSerialNumber(String serial) {
            this.serial = serial;
        }

        public String getSerialNumber() {
            return serial;
        }
        `

        @Override
    public String  testTransmitterAndReceiver() {
            String transmitterMessage = "we test the signal strength of the remote.";
            String receiverMessage = "We test the signal strength of the receiver.";
            return transmitterMessage +"\n"+receiverMessage;
        }

        @Override
    public String assembleAndTestDrive() {
            String assemble = "We assemble our rc cars to spec and torque.";
            String drive = "We test drive our rc cars to ensure everything is working properly.";
            return assemble +"\n"+ drive;
        }




    }




