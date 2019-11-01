//十四向适配器模式
public class FourteenAdapter implements HDMI, VGA, Thunder, Micro, TypeC, OMTP, TFCard, CFCard, SDCard, miniSDCard, USB3One, Lightning, USB3Two, RJ45{
	HDMI hdmi;
	VGA vga;
	Thunder thunder;
	Micro micro;
	TypeC typec;
	OMTP omtp;
	TFCard tfcard;
	CFCard cfcard;
	SDCard sdcard;
	miniSDCard minisdcard;
	USB3One usb3one;
	Lightning lightning;
	USB3Two usb3two;
	RJ45 rj45;
	FourteenAdapter(HDMI hdmi, VGA vga, Thunder thunder, Micro micro, TypeC typec, OMTP omtp, TFCard tfcard, CFCard cfcard, SDCard sdcard, miniSDCard minisdcard, USB3One usb3one, Lightning lightning, USB3Two usb3two, RJ45 rj45){
       this.hdmi=hdmi;
       this.vga=vga;
       this.thunder=thunder;
       this.micro=micro;
       this.typec=typec;
       this.omtp=omtp;
       this.tfcard=tfcard;
       this.cfcard=cfcard;
       this.sdcard=sdcard;
       this.minisdcard=minisdcard;
       this.usb3one=usb3one;
       this.lightning=lightning;
       this.usb3two=usb3two;
       this.rj45=rj45;
    }
public void connectMacbook(){
	if(this instanceof HDMI) {
		System.out.println("\t转换成HDMI接口:");
		vga.connectMacbook();	
	}
	if(this instanceof VGA) {
		System.out.println("\t转换成VGA接口:");
		hdmi.connectMacbook();	
	}
	if(this instanceof Thunder) {
		System.out.println("\t转换成雷电接口:");
		micro.connectMacbook();	
	}
	if(this instanceof Micro) {
		System.out.println("\t转换成安卓接口:");
		thunder.connectMacbook();
	}
	if(this instanceof TypeC) {
		System.out.println("\t转换成TypeC接口:");
		omtp.connectMacbook();	
	}
	if(this instanceof OMTP) {
		System.out.println("\t转换成VGA接口:");
		typec.connectMacbook();	
	}
	if(this instanceof TFCard) {
		System.out.println("\t转换成TF卡槽:");
		cfcard.connectMacbook();	
	}
	if(this instanceof CFCard) {
		System.out.println("\t转换成CF卡槽:");
		tfcard.connectMacbook();	
	}
	if(this instanceof SDCard) {
		System.out.println("\t转换成SDCard卡槽:");
		minisdcard.connectMacbook();	
	}
	if(this instanceof miniSDCard) {
		System.out.println("\t转换成miniSDCard卡槽:");
		sdcard.connectMacbook();	
	}
	if(this instanceof USB3One) {
		System.out.println("\t转换成HDMI接口:");
		lightning.connectMacbook();	
	}
	if(this instanceof Lightning) {
		System.out.println("\t转换成VGA接口:");
		usb3one.connectMacbook();	
	}
	if(this instanceof USB3Two) {
		System.out.println("\t转换成HDMI接口:");
		rj45.connectMacbook();	
	}
	if(this instanceof RJ45) {
		System.out.println("\t转换成VGA接口:");
		usb3two.connectMacbook();	
	}
   }
}