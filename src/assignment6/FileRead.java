/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import javax.imageio.ImageIO;

/**
 *
 * @author stahc1596
 */
public class FileRead {

    private Location[] places;
    private String starting;
    private int startlook;
    private BufferedImage[] place;
    private String[] wIw;

    public FileRead() {
        this.places = new Location[23];
        place = new BufferedImage[95];
        wIw = new String[95];
        String file = "images/images/";
        int i = 0;
        int imgnum = 45;
        FileReader mages = null;
        try {
            //Creating the file reader
            mages = new FileReader("src//assignment6//Images");
        } catch (Exception e) {
            //Handle the error
            //Print out the lovely red errors
            e.printStackTrace();
            //Stop program
            System.exit(0);
        }
        for (int j = 0; j < 3; j++) {
            place[i] = loadImage(file + "IMG_00" + imgnum + ".JPG");
            wIw[i] = "IMG_00" + imgnum + ".JPG";
            i++;
            imgnum++;
        }
        imgnum++;
        for (int j = 0; j < 12; j++) {
            place[i] = loadImage(file + "IMG_00" + imgnum + ".JPG");
            wIw[i] = "IMG_00" + imgnum + ".JPG";
            i++;
            imgnum++;
        }
        imgnum++;
        for (int j = 0; j < 37; j++) {
            place[i] = loadImage(file + "IMG_00" + imgnum + ".JPG");
            wIw[i] = "IMG_00" + imgnum + ".JPG";
            i++;
            imgnum++;
        }
        place[i] = loadImage(file + "IMG_00" + imgnum + ".JPG");
        wIw[i] = "IMG_00" + imgnum + ".JPG";
        i++;
        imgnum++;
        place[i] = loadImage(file + "IMG_0" + imgnum + ".JPG");
        wIw[i] = "IMG_0" + imgnum + ".JPG";
        i++;
        imgnum++;
        imgnum++;
        for (int j = 0; j < 20; j++) {
            place[i] = loadImage(file + "IMG_0" + imgnum + ".JPG");
            wIw[i] = "IMG_0" + imgnum + ".JPG";
            i++;
            imgnum++;
        }
        imgnum++;
        for (int j = 0; j < 21; j++) {
            place[i] = loadImage(file + "IMG_0" + imgnum + ".JPG");
            wIw[i] = "IMG_0" + imgnum + ".JPG";
            i++;
            imgnum++;
        }

        Scanner in = new Scanner(mages);
        this.starting = in.next();
        in.nextLine();
        String currdirect = in.next();
        in.nextLine();
        if ("N".equals(currdirect)) {
            this.startlook = 1;
        } else if ("E".equals(currdirect)) {
            this.startlook = 2;
        } else if ("S".equals(currdirect)) {
            this.startlook = 3;
        } else {
            this.startlook = 4;
        }

        for (i = 0; i < 23; i++) {
            this.places[i] = new Location();
            String place = in.nextLine();
            this.places[i].setName(place);
            in.next();
            String image = in.next();
            String isBlock = in.next();
            String nextLocal = null;
            String nextDirect = null;
            if ("false".equals(isBlock)) {
                nextLocal = in.next();
                nextDirect = in.next();
            }
            this.places[i].SetNorthDirect(image, isBlock, nextLocal, nextDirect);
            in.nextLine();
            in.next();
            image = in.next();
            isBlock = in.next();
            nextLocal = null;
            nextDirect = null;
            if ("false".equals(isBlock)) {
                nextLocal = in.next();
                nextDirect = in.next();
            }
            this.places[i].SetEastDirect(image, isBlock, nextLocal, nextDirect);
            in.nextLine();
            in.next();
            image = in.next();
            isBlock = in.next();
            nextLocal = null;
            nextDirect = null;
            if ("false".equals(isBlock)) {
                nextLocal = in.next();
                nextDirect = in.next();
            }
            this.places[i].SetSouthDirect(image, isBlock, nextLocal, nextDirect);
            in.nextLine();
            in.next();
            image = in.next();
            isBlock = in.next();
            nextLocal = null;
            nextDirect = null;
            if ("false".equals(isBlock)) {
                nextLocal = in.next();
                nextDirect = in.next();
            }
            this.places[i].SetWestDirect(image, isBlock, nextLocal, nextDirect);
            in.nextLine();
        }
    }

    public BufferedImage getLocatonImage(String imageName) {
        int i = 0;
        while (!this.wIw[i].equals(imageName)) {
            i++;
        }
        return place[i];
    }

    private BufferedImage loadImage(String name) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(name));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return img;
    }

    public String getNextLocation(String current, int direction) {
        int i = 0;
        while (!current.equals(this.places[i].getLocation())) {
            i++;
        }
        return this.places[i].getNext(direction);
    }

    public int getNextDirection(String location, int direction) {
        int i = 0;
        while (!location.equals(this.places[i].getLocation())) {
            i++;
        }
        String Direct = this.places[i].nextDirection(direction);
        if ("1".equals(Direct)) {
            return 1;
        } else if ("2".equals(Direct)) {
            return 2;
        } else if ("3".equals(Direct)) {
            return 3;
        } else {
            return 4;
        }
    }

    public int GetStartingDirection() {
        return this.startlook;
    }

    public String GetStartingLocation() {
        return this.starting;
    }

    public boolean isBlocked(String location, int direction) {
        int i = 0;
        while (!location.equals(this.places[i].getLocation())) {
            System.out.println(this.places[i].getLocation());
            System.out.println(location);
                i++;
        }
        return this.places[i].isBlocked(direction);
    }

    public String getPlacesImage(String location, int direction) {
        int i = 0;
        while (!location.equals(this.places[i].getLocation())) {
           i++;
        }
        return this.places[i].getImage(direction);
    }
}
