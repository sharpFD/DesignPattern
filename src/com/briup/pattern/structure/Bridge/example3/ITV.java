package com.briup.pattern.structure.Bridge.example3;

//电视机接口
public interface ITV {
	public void on();//开
    public void off();//关
    public void switchChannel(int channel);//换频道
}

class SamsungTV implements ITV {
    @Override
    public void on() {
        System.out.println("Samsung is turned on.");
    }
    @Override
    public void off() {
        System.out.println("Samsung is turned off.");
    }
    @Override
    public void switchChannel(int channel) {
        System.out.println("Samsung: channel - " + channel);
    }
}

class SonyTV implements ITV {
	 
    @Override
    public void on() {
        System.out.println("Sony is turned on.");
    }
 
    @Override
    public void off() {
        System.out.println("Sony is turned off.");
    }
 
    @Override
    public void switchChannel(int channel) {
        System.out.println("Sony: channel - " + channel);
    }
}

