public class Application{
    public static void main(String args[]){
       HDMI hdmi;        
       Thunder thunder;
       TypeC typec;
       TFCard tfcard;
       SDCard sdcard;
       USB3One usb3one;
       USB3Two usb3two;
       LCD lcd=new LCD(); //显示器
       ThundeRobot thunderobot=new ThundeRobot();//主机
       Watch watch=new Watch();//手表
       XiaoMi xiaomi=new XiaoMi();//安卓手机
       Pixel pixel=new Pixel();	//TypeC手机
       Sony sony=new Sony(); //耳机
       TF tf=new TF();	//TF卡
       CF cf=new CF(); 	//CF卡
       SD sd=new SD();	//SD卡
       miniSD minisd=new miniSD();	//miniSD卡
       UsbDisk usbdisk=new UsbDisk();	//U盘
       iPad ipad=new iPad();	//平板
       HardDisk harddisk=new HardDisk();	//移动硬盘
       WIFI wifi=new WIFI();	//路由
       FourteenAdapter adapter = new FourteenAdapter(lcd, thunderobot, watch, xiaomi, pixel, sony, tf, cf, sd, minisd, usbdisk, ipad, harddisk, wifi);
       System.out.println("扩展坞连接：");
       adapter.connectMacbook();
    }
}
class LCD implements HDMI{
	String name;
	LCD (){
		name = "LCD显示屏";
	}
	LCD (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "连接成功");
	}
}
class ThundeRobot implements VGA{
	String name;
	ThundeRobot (){
		name = "雷神RTX";
	}
	ThundeRobot (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "连接成功");
	}
}
class Watch implements Thunder{
	String name;
	Watch (){
		name = "HUAWEI WATCH 2";
	}
	Watch (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "连接成功");
	}
}
class XiaoMi implements Micro{
	String name;
	XiaoMi (){
		name = "小米8";
	}
	XiaoMi (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "连接成功");
	}
}
class Pixel implements TypeC{
	String name;
	Pixel (){
		name = "Google Pixel3 XL";
	}
	Pixel (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "连接成功");
	}
}
class Sony implements OMTP{
	String name;
	Sony (){
		name = "Sony WH-1000XM3";
	}
	Sony (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "连接成功");
	}
}
class TF implements TFCard{
	String name;
	TF (){
		name = "Kingstom TF卡";
	}
	TF (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "连接成功");
	}
}
class CF implements CFCard{
	String name;
	CF (){
		name = "Lenovo CF卡";
	}
	CF (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "连接成功");
	}
}
class SD implements SDCard{
	String name;
	SD (){
		name = "Sumsung SD卡";
	}
	SD (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "连接成功");
	}
}
class miniSD implements miniSDCard{
	String name;
	miniSD (){
		name = "SanDisk 迷你SD卡";
	}
	miniSD (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "连接成功");
	}
}
class UsbDisk implements USB3One{
	String name;
	UsbDisk (){
		name = "Dell U盘";
	}
	UsbDisk (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "连接成功");
	}
}
class iPad implements Lightning{
	String name;
	iPad (){
		name = "iPad 3";
	}
	iPad (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "连接成功");
	}
}
class HardDisk implements USB3Two{
	String name;
	HardDisk (){
		name = "Toshiba数据线";
	}
	HardDisk (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "连接成功");
	}
}
class WIFI implements RJ45{
	String name;
	WIFI (){
		name = "TP-LINK路由器";
	}
	WIFI (String name){
		this.name = name;
	}
	public void connectMacbook() {
		System.out.println("\t" + name + "连接成功");
	}
}