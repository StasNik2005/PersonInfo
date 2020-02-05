package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.Files.*;

public class Controller {
    final FileChooser fileChooser = new FileChooser();
    @FXML
    ImageView image;

    public void mouseClick(MouseEvent mouseEvent)
    {
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Current relative path is: " + s);
//        Image image = new Image("../nophoto.jpg");
//        this.image.setImage(image);
//        this.image.setCache(true);

/*
        File file = fileChooser.showOpenDialog(null);
        if (file != null) {
            System.out.println(file.getPath().replace("\\","\\\\"));
            Image image = new Image(file.getPath().replace("\\","\\\\"));
            this.image.setImage(image);
            this.image.setCache(true);
        }
        */
     }

    public void btnClick(ActionEvent actionEvent) {
    }
}