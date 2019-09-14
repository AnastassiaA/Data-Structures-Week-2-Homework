import java.io.*;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		try {
			FileWriter fileobj = new FileWriter ("realestatehomes.txt", true);
			
			House houses[] = new House[3];
			Image pictures[] = new Image[3];
			
			//Writer writer = new PrintWriter(System.out);
			
			for(int c = 0; c < 3; c ++) {
				
				House house = new House();
				Image picture = new Image();
				
				System.out.print("ID: ");
				house.setID(input.nextInt());
				
				System.out.print("Price: ");
				house.setPrice(input.nextFloat());
				
				System.out.print("Location: ");
				input.next();
				house.setLocation(input.nextLine());
				
				System.out.print("Advertiser: ");
				house.setAdvertiser(input.nextLine());
				
				System.out.print("Photo (pixels): ");
				picture.setPixels(input.nextInt());
				
				System.out.print("Photo (size): ");
				picture.setSize(input.nextInt());
				
				fileobj.write(house.getID() + "\t" + house.getPrice() + "\t" + house.getLocation() + "\t" + house.getAdvertiser() + "\t" + picture.getPixels() + "\t" + picture.getSize() + "\n");
				
				houses[c] = house;
				
				
				
				//houses[c] = house;
			
			}
			fileobj.close();
			input.close();
		}catch(IOException e) {
			e.printStackTrace();
		}			
	}
}
