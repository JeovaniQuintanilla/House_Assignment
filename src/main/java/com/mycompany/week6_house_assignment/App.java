package com.mycompany.week6_house_assignment;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
public class App extends Application {

    @Override
    public void start(Stage stage) {
        //creates the scenery behind our building
        Rectangle sky = new Rectangle(0,0,720,640);//creates rectangle at specified location
        sky.setFill(Color.LIGHTSKYBLUE);//sets the sky's color
        Rectangle grass = new Rectangle(0,300,720,640);///creates rectangle at specified location
        grass.setFill(Color.LIMEGREEN);//sets the grass color
        
        Rectangle brick_border = new Rectangle(120,170,480,340);//creates the building's border
        Rectangle brick_building = new Rectangle(122,170,476,338);//creates the actual buidling
        brick_building.setFill(Color.CRIMSON);//sets the building color
        
        Rectangle bottom_roof_part_border = new Rectangle(120,150,480,25);//creates the border for a roof part 
        Rectangle bottom_roof_part = new Rectangle(122,150,476,23);//creates a part below the roof
        bottom_roof_part.setFill(Color.WHITE);
        
        //creates the black border for the roof at specified location
        Polygon roof_border = new Polygon();
        roof_border.getPoints().setAll(
         90.0,150.0,//far left point
         630.0,150.0,//far right point
         360.0,0.0// middle tip point
        );
        //creates the actual roof at specified location
        Polygon roof = new Polygon();
        roof.getPoints().setAll(
         98.0,148.0,//far left point
         622.0,148.0,//far right point
         360.0,2.0// middle tip point
        );
        roof.setFill(Color.WHITE);//sets color to roof as white
        
        Rectangle stairline_border = new Rectangle(120,440,480,7);//creates line border behind stairs
        Rectangle stairline = new Rectangle(122,442,475,4);//creates actual line behind stairs
        stairline.setFill(Color.LIGHTGRAY);//sets color for line
        
        Rectangle left_window_border = new Rectangle(197,314,56,132);//creates left window border
        Rectangle left_window = new Rectangle(199,316,52,130);//creates left wondow
        left_window.setFill(Color.WHITE);//sets color for window
        
        Rectangle right_window_border = new Rectangle(467,314,56,132);//creates right window border
        Rectangle right_window = new Rectangle(469,316,52,130);//creates right window
        right_window.setFill(Color.WHITE);//sets color for window
         
        Rectangle door_border = new Rectangle(332,296,56,160);//creates door border
        Rectangle the_door = new Rectangle(334,298,52,158);//creates the door 
        the_door.setFill(Color.WHITE);//sets color for door 
         
        Rectangle plaque_border = new Rectangle(332,205,56,35);//creates a plaque border
        Rectangle plaque = new Rectangle(334,207,52,31);//creates the plaque
        plaque.setFill(Color.LIGHTGRAY);//sets color for plaque
        
        
        Group gp = new Group(sky,grass,brick_border,brick_building,bottom_roof_part_border,bottom_roof_part,roof_border,roof,stairline_border,
                             stairline,left_window_border,left_window,right_window_border,right_window,door_border,the_door,plaque_border,plaque);
        
        /**
         * code creates the building's stairs
         */
        int size = 11;//array size for stairs
        //array created for border of stairs and then added to gp
        Rectangle stairBorder[] =  new Rectangle[size];
        for(int i =0; i<size; i++){
            stairBorder[i] = new Rectangle(184 - (i%11)*10,440 + ((i%11)*10),352 + ((i%11)*20),12);
            gp.getChildren().add(stairBorder[i]);   
        }
        //array created for stairs and then added to gp
        Rectangle stairGroup[] =  new Rectangle[size];
        for(int i =0; i<size; i++){
            stairGroup[i] = new Rectangle( 186 - (i%11)*10 , 442 + (i%11)*10 , 348 + (i%11)*20 , 8 );
            stairGroup[i].setFill(Color.LIGHTGRAY);//sets stair color
            gp.getChildren().add(stairGroup[i]);   
        }
        
         /**
         * code creates the columns for the building
         */
        int number_of_columns = 4;//array size for columns
        //array created for border of columns
        Rectangle columnGroupBorder[] =  new Rectangle[number_of_columns];
        for(int i =0; i<number_of_columns; i++){
            columnGroupBorder[i] = new Rectangle(138 +(i%4)*134,175,42,265);
            gp.getChildren().add(columnGroupBorder[i]);   
        }
        //array created for columns
        Rectangle columnGroup[] =  new Rectangle[number_of_columns];
        for(int i =0; i<number_of_columns; i++){
            columnGroup[i] = new Rectangle(140 +(i%4)*134,175,38,265);
            columnGroup[i].setFill(Color.WHITE);//sets column color
            gp.getChildren().add(columnGroup[i]);   
        }
        
         /**
         * code creates the building's column slabs
         */
        int num_of_column_slabs = 4;//array size for column slabs
        //array created for border of column slabs
        Rectangle columnSlabsGroupBorder[] =  new Rectangle[num_of_column_slabs];
        for(int i =0; i<number_of_columns; i++){
            columnSlabsGroupBorder[i] = new Rectangle(131 +(i%4)*134 , 425 , 56 , 15);
            gp.getChildren().add(columnSlabsGroupBorder[i]);   
        }
        //array created for column slabs
        Rectangle columnSlabsGroup[] =  new Rectangle[num_of_column_slabs];
        for(int i =0; i<number_of_columns; i++){
            columnSlabsGroup[i] = new Rectangle( 133 +(i%4)*134 , 426 , 52 , 14);
            columnSlabsGroup[i].setFill(Color.WHITE);//sets columnslab color
            gp.getChildren().add(columnSlabsGroup[i]);
        }
        
         /**
         * code creates the circles for the top of each column
         */
        int num_of_circles = 2;
         //array created for border of circles on column1
        Circle circlesOnColumn1Border[] = new Circle[num_of_circles];
        for(int i =0; i<num_of_circles; i++){
            circlesOnColumn1Border[i] = new Circle(137 + (i%2)*46, 189, 16);
            gp.getChildren().add(circlesOnColumn1Border[i]);
        }
         //array created for circles on column1
        Circle circlesOnColumn1[] = new Circle[num_of_circles];
        for(int i =0; i<num_of_circles; i++){
            circlesOnColumn1[i] = new Circle( 137 + (i%2)*46 , 189 , 14 , Color.WHITE);//sets circles size, location, and color
            gp.getChildren().add(circlesOnColumn1[i]);
        }
         //array created for border of circles on column2 
        Circle circlesOnColumn2Border[] = new Circle[num_of_circles];
        for(int i =0; i<num_of_circles; i++){
            circlesOnColumn2Border[i] = new Circle( 270 + (i%2)*46 , 189 , 16);
            gp.getChildren().add(circlesOnColumn2Border[i]);
        }
         //array created for circles on column2
        Circle circlesOnColumn2[] = new Circle[num_of_circles];
        for(int i =0; i<num_of_circles; i++){
            circlesOnColumn2[i] = new Circle( 270 + (i%2)*46 , 189 , 14 , Color.WHITE);//sets circles size, location, and color
            gp.getChildren().add(circlesOnColumn2[i]);
        }
         //array created for border of circles on column3
        Circle circlesOnColumn3Border[] = new Circle[num_of_circles];
        for(int i =0; i<num_of_circles; i++){
            circlesOnColumn3Border[i] = new Circle( 405 + (i%2)*46, 189 , 16);
            gp.getChildren().add(circlesOnColumn3Border[i]);
        }
         //array created for circles on column3
        Circle circlesOnColumn3[] = new Circle[num_of_circles];
        for(int i =0; i<num_of_circles; i++){
            circlesOnColumn3[i] = new Circle( 405 + (i%2)*46 , 189 , 14 , Color.WHITE);//sets circles size, location, and color
            gp.getChildren().add(circlesOnColumn3[i]);
        }
         //array created for border of circles on column4
        Circle circlesOnColumn4Border[] = new Circle[num_of_circles];
        for(int i =0; i<num_of_circles; i++){
            circlesOnColumn4Border[i] = new Circle( 538 + (i%2)*46 , 189 , 16 );
            gp.getChildren().add(circlesOnColumn4Border[i]);
        }
         //array created for circles on column4
        Circle circlesOnColumn4[] = new Circle[num_of_circles];
        for(int i =0; i<num_of_circles; i++){
            circlesOnColumn4[i] = new Circle( 538 + (i%2)*46 , 189 , 14 , Color.WHITE );//sets circles size, location, and color
            gp.getChildren().add(circlesOnColumn4[i]);
        }
         /**
         * code creates the windows panes within the door and left, right windows 
         */
        int num_of_windows = 10;
         //array created for window panes in left window
        Rectangle WindowsGp1[] =  new Rectangle[num_of_windows];
        for(int i =0; i<num_of_windows; i++){
            WindowsGp1[i] = new Rectangle( 208 + (i%2)*23 , 418 - (i%5)*22 , 10 ,17 ); 
            gp.getChildren().add(WindowsGp1[i]);
        }
         //array created for window panes in door 
        Rectangle WindowsGp2[] =  new Rectangle[num_of_windows];
        for(int i =0; i<num_of_windows; i++){
            WindowsGp2[i] = new Rectangle( 343 + (i%2)*23 , 418 - (i%5)*22 , 10 ,17 ); 
            gp.getChildren().add(WindowsGp2[i]);      
        }
         //array created for window panes in right window
        Rectangle WindowsGp3[] =  new Rectangle[num_of_windows];
        for(int i =0; i<num_of_windows; i++){
            WindowsGp3[i] = new Rectangle( 478 + (i%2)*23 , 418 - (i%5)*22 , 10 ,17 ); 
            gp.getChildren().add(WindowsGp3[i]);   
        }
        
        var scene = new Scene(gp, 720, 640);
        stage.setScene(scene);
        stage.setTitle("A House");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}