package com.example.chatui;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

public interface ImageResource {
    Image image1 = new Image(ImageResource.class.getResourceAsStream("saiki.jfif"));
    ImagePattern imagePattern1 = new ImagePattern(image1, 0, 0, 1, 1, true);
        
    Image image2 = new Image(ImageResource.class.getResourceAsStream("nendou.jpg"));
    ImagePattern imagePattern2 = new ImagePattern(image2, 0, 0, 1, 1, true);

    Image image3 = new Image(ImageResource.class.getResourceAsStream("kaidou.jpg"));
    ImagePattern imagePattern3 = new ImagePattern(image3, 0, 0, 1, 1, true);

    Image image4 = new Image(ImageResource.class.getResourceAsStream("teruhashi.jpg"));
    ImagePattern imagePattern4 = new ImagePattern(image4, 0, 0, 1, 1, true);

    Image image5 = new Image(ImageResource.class.getResourceAsStream("reita.jpg"));
    ImagePattern imagePattern5 = new ImagePattern(image5, 0, 0, 1, 1, true);

    Image image6 = new Image(ImageResource.class.getResourceAsStream("kuboyasu.jpg"));
    ImagePattern imagePattern6 = new ImagePattern(image6, 0, 0, 1, 1, true);

    Image image7 = new Image(ImageResource.class.getResourceAsStream("hairo.jpg"));
    ImagePattern imagePattern7 = new ImagePattern(image7, 0, 0, 1, 1, true);

    Image image8 = new Image(ImageResource.class.getResourceAsStream("chono.jpg"));
    ImagePattern imagePattern8 = new ImagePattern(image8, 0, 0, 1, 1, true);
       
}
