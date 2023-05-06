/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HandlersImagen;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import proyecto2.ImageHandler;

/**
 *
 * @author lenovo
 */
public class RgbJPG extends ImageHandler {
    String nombreCorto;
    BufferedImage jpg = null;
    BufferedImage bRed;
    BufferedImage bBlue;
    BufferedImage bGreen;
    BufferedImage bSepia;
    File btnTemporal;
    
    public RgbJPG(String filename) {
        super(filename);
        File file = new File(filename);
        this.nombreCorto = file.getName().replaceAll("\\.\\w+$", "");
    }

    @Override
    public void readFile() throws Exception {
        File file = new File(getFileName());
        jpg = ImageIO.read(file);
        btnTemporal = new File("src/Imagenes/Temp/Temp.bmp");
        ImageIO.write(jpg, "bmp", btnTemporal);
        bRed = ImageIO.read(btnTemporal);
        bBlue = ImageIO.read(btnTemporal);
        bGreen = ImageIO.read(btnTemporal);
        bSepia = ImageIO.read(btnTemporal);
    }

    @Override
    public void generateFiles() throws Exception {
        //Color Rojo
        for (int x = 0; x < bRed.getWidth(); x++) {
            for (int y = 0; y < bRed.getHeight(); y++) {
                Color color = new Color(bRed.getRGB(x, y));
                Color newColorRed = new Color(color.getRed(), 0, 0);
                bRed.setRGB(x, y, newColorRed.getRGB());
            }
        }
        ImageIO.write(bRed, "jpg", new File("src/Imagenes/Rojo-" + nombreCorto + ".jpg"));
        btnTemporal.delete();
        
        //Color Azul
        for (int x = 0; x < bBlue.getWidth(); x++) {
            for (int y = 0; y < bBlue.getHeight(); y++) {
                Color color = new Color(bBlue.getRGB(x, y));
                Color newColorBlue = new Color(0, 0, color.getBlue());
                bBlue.setRGB(x, y, newColorBlue.getRGB());
            }
        }
        ImageIO.write(bBlue, "jpg", new File("src/Imagenes/Azul-" + nombreCorto + ".jpg"));
        btnTemporal.delete();
        
        //Color Verde
        for (int x = 0; x < bGreen.getWidth(); x++) {
            for (int y = 0; y < bGreen.getHeight(); y++) {
                Color color = new Color(bGreen.getRGB(x, y));
                Color newColorGreen = new Color(0, color.getGreen(), 0);
                bGreen.setRGB(x, y, newColorGreen.getRGB());
            }
        }
        ImageIO.write(bGreen, "jpg", new File("src/Imagenes/Verde-" + nombreCorto + ".jpg"));
        btnTemporal.delete();
        
        //Color Sepia
        for (int x = 0; x < bSepia.getWidth(); x++) {
            for (int y = 0; y < bSepia.getHeight(); y++) {
                Color color = new Color(bSepia.getRGB(x, y));
                Color newColorSepia = new Color((int) (0.4 * color.getRed()), (int) (0.23 * color.getGreen()), (int) (0.16 * color.getBlue()));
                bSepia.setRGB(x, y, newColorSepia.getRGB());
            }
        }
        ImageIO.write(bSepia, "jpg", new File("src/Imagenes/Sepia-" + nombreCorto + ".jpg"));
        btnTemporal.delete();
    }
    
}
