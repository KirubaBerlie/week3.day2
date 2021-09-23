package week3.day2.classroom;

public class Desktop implements Hardware, Software {

	public void hardwareResources(int RAM, int hardDisk) {
		System.out.println("Hardware Resources are :");
		System.out.println("RAM Size is :" + RAM);
		System.out.println("HardDisk Size is :" + hardDisk + "TB");
	}

	public void softwareResources() {
		System.out.println("Software Resources : Java, Office Tools");
	}

	public void xyz() {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop obj = new Desktop();
		obj.softwareResources();
		obj.hardwareResources(8, 1);
	}

}
