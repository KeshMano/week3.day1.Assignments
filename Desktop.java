package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Desktop screen size is:24 inch");
	}
	public static void main(String[] args) {
		Desktop des=new Desktop ();
		des.computerModel();
		des.desktopSize();
	}
}
