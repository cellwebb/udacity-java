//// lesson 6.1 loops - dim the picture
//
//
//public class Dim {
//
//	/**
//	 * Starting with the first in the top-left corner, dim every 5th pixel.
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Picture mary = new Picture("queen-mary.png");
//		mary.draw();
//
//		int x = mary.getX();
//		int y = mary.getY();
//		int width = mary.getWidth();
//		int height = mary.getHeight();
//		
//		int count = 0;
//		
//		for (int i = 0; i < mary.pixels(); i = i + 5) {
//			mary.setColorAt(i, Color.BLACK);
//		}
//	}
//
//}
