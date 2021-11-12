package Alive;

import GameInterface.GamePanel;
import GameInterface.KeyHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Person extends Entity{
    GamePanel gp;
    KeyHandler keyH;

    public final int screenX;
    public final int screenY;

    public Person(GamePanel gp, KeyHandler keyH){
        this.gp = gp;
        this.keyH = keyH;

        screenX = gp.screenWidth/2 - (gp.tileSize/2);
        screenY = gp.screenHeight/2;

        setDefaultValues();
        getPlayerImage();
    }

    public void setDefaultValues(){
        worldX = gp.tileSize*23;
        worldY = gp.tileSize*21;
        speed = 4;
        direction = "down";
    }

    public void getPlayerImage(){
        try{

            up1 = ImageIO.read(getClass().getResourceAsStream("/PersonSprites/up1.png"));
            up2 = ImageIO.read(getClass().getResourceAsStream("/PersonSprites/up2.png"));
            down1 = ImageIO.read(getClass().getResourceAsStream("/PersonSprites/down1.png"));
            down2 = ImageIO.read(getClass().getResourceAsStream("/PersonSprites/down2.png"));
            down3 = ImageIO.read(getClass().getResourceAsStream("/PersonSprites/down3.png"));
            right1 = ImageIO.read(getClass().getResourceAsStream("/PersonSprites/right1.png"));
            right2 = ImageIO.read(getClass().getResourceAsStream("/PersonSprites/right2.png"));
            left1 = ImageIO.read(getClass().getResourceAsStream("/PersonSprites/left1.png"));
            left2 = ImageIO.read(getClass().getResourceAsStream("/PersonSprites/left2.png"));


        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void update(){

        if (keyH.upPressed || keyH.rightPressed ||
                keyH.leftPressed || keyH.downPressed) {
            if (keyH.upPressed) {
                direction = "up";
                worldY -= speed;
            } else if (keyH.downPressed) {
                direction = "down";
                worldY += speed;
            } else if (keyH.leftPressed) {
                direction = "left";
                worldX -= speed;
            } else if (keyH.rightPressed) {
                direction = "right";
                worldX += speed;
            }

            spriteCounter++;
            if (spriteCounter > 12) {
                if (spriteNumber == 1) {
                    spriteNumber = 2;
                } else if (spriteNumber == 2) {
                    spriteNumber = 1;
                }
                spriteCounter = 0;
            }
        }
    }

    public void draw(Graphics2D g2){
        BufferedImage image = null;

        switch (direction) {
            case "up":
                if (spriteNumber==1){
                    image = up1;
                }
                if (spriteNumber==2){
                    image = up2;
                }
                break;
            case "down":
                if (spriteNumber==1){
                    image = down1;
                }
                if (spriteNumber==2){
                    image = down2;
                }
                if (spriteNumber==3){
                    image = down3;
                }
                break;
            case "left":
                if (spriteNumber==1){
                    image = left1;
                }
                if (spriteNumber==2){
                    image = left2;
                }
                break;
            case "right":
                if (spriteNumber==1){
                    image = right1;
                }
                if (spriteNumber==2){
                    image = right2;
                }
                break;
        }
        g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);
    }
}
