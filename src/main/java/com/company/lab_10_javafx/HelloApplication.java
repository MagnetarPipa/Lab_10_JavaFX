package com.company.lab_10_javafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static Triangles_List tri_list = new Triangles_List();
    public static Triangles_List right_tri_list = new Triangles_List();

    public static void main(String[] args) {

        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {

        TableView<Triangle> triangle_table = new TableView<Triangle>();

        TableColumn<Triangle, String> x1Col = new TableColumn<Triangle, String>("X1");
        TableColumn<Triangle, String> x2Col = new TableColumn<Triangle, String>("X2");
        TableColumn<Triangle, String> x3Col = new TableColumn<Triangle, String>("X3");
        TableColumn<Triangle, String> y1Col = new TableColumn<Triangle, String>("Y1");
        TableColumn<Triangle, String> y2Col = new TableColumn<Triangle, String>("Y2");
        TableColumn<Triangle, String> y3Col = new TableColumn<Triangle, String>("Y3");
        TableColumn<Triangle, String> sideACol = new TableColumn<Triangle, String>("Side A");
        TableColumn<Triangle, String> sideBCol  = new TableColumn<Triangle, String>("Side B");
        TableColumn<Triangle, String> sideCCol = new TableColumn<Triangle, String>("Side C");
        TableColumn<Triangle, String> angle_ACol = new TableColumn<Triangle, String>("Angle A");
        TableColumn<Triangle, String> angle_BCol = new TableColumn<Triangle, String>("Angle B");
        TableColumn<Triangle, String> angle_CCol = new TableColumn<Triangle, String>("Angle C");
        TableColumn<Triangle, String> perimeterCol = new TableColumn<Triangle, String>("Perimeter");
        TableColumn<Triangle, String> squareCol = new TableColumn<Triangle, String>("Square");

        x1Col.setCellValueFactory(new PropertyValueFactory<>("x1"));
        x2Col.setCellValueFactory(new PropertyValueFactory<>("x2"));
        x3Col.setCellValueFactory(new PropertyValueFactory<>("x3"));
        y1Col.setCellValueFactory(new PropertyValueFactory<>("y1"));
        y2Col.setCellValueFactory(new PropertyValueFactory<>("y2"));
        y3Col.setCellValueFactory(new PropertyValueFactory<>("y3"));
        angle_ACol.setCellValueFactory(new PropertyValueFactory<>("angleA"));
        angle_BCol.setCellValueFactory(new PropertyValueFactory<>("angleB"));
        angle_CCol.setCellValueFactory(new PropertyValueFactory<>("angleC"));
        sideACol.setCellValueFactory(new PropertyValueFactory<>("sideA"));
        sideBCol.setCellValueFactory(new PropertyValueFactory<>("sideB"));
        sideCCol.setCellValueFactory(new PropertyValueFactory<>("sideC"));
        perimeterCol.setCellValueFactory(new PropertyValueFactory<>("perimeter"));
        squareCol.setCellValueFactory(new PropertyValueFactory<>("square"));



        x1Col.setSortType(TableColumn.SortType.DESCENDING);
        // y2Col.setSortable(false);

        ObservableList<Triangle> triangles_list = getTriangleList();
        triangle_table.setItems(triangles_list);

        triangle_table.getColumns().addAll(x1Col, x2Col, x3Col,y1Col, y2Col, y3Col,angle_ACol,angle_BCol,angle_CCol,sideACol,sideBCol,sideCCol,perimeterCol,squareCol);


        //--------------------------------------------------------------------------------------------------------------------------------------------------------------
        TableView<Triangle> right_triangle_table = new TableView<Triangle>();

        TableColumn<Triangle, String> right_x1Col = new TableColumn<Triangle, String>("X1");
        TableColumn<Triangle, String> right_x2Col = new TableColumn<Triangle, String>("X2");
        TableColumn<Triangle, String> right_x3Col = new TableColumn<Triangle, String>("X3");
        TableColumn<Triangle, String> right_y1Col = new TableColumn<Triangle, String>("Y1");
        TableColumn<Triangle, String> right_y2Col = new TableColumn<Triangle, String>("Y2");
        TableColumn<Triangle, String> right_y3Col = new TableColumn<Triangle, String>("Y3");
        TableColumn<Triangle, String> right_sideACol = new TableColumn<Triangle, String>("Side A");
        TableColumn<Triangle, String> right_sideBCol  = new TableColumn<Triangle, String>("Side B");
        TableColumn<Triangle, String> right_sideCCol = new TableColumn<Triangle, String>("Side C");
        TableColumn<Triangle, String> right_angle_ACol = new TableColumn<Triangle, String>("Angle A");
        TableColumn<Triangle, String> right_angle_BCol = new TableColumn<Triangle, String>("Angle B");
        TableColumn<Triangle, String> right_angle_CCol = new TableColumn<Triangle, String>("Angle C");
        TableColumn<Triangle, String> right_perimeterCol = new TableColumn<Triangle, String>("Perimeter");
        TableColumn<Triangle, String> right_squareCol = new TableColumn<Triangle, String>("Square");

        right_x1Col.setCellValueFactory(new PropertyValueFactory<>("x1"));
        right_x2Col.setCellValueFactory(new PropertyValueFactory<>("x2"));
        right_x3Col.setCellValueFactory(new PropertyValueFactory<>("x3"));
        right_y1Col.setCellValueFactory(new PropertyValueFactory<>("y1"));
        right_y2Col.setCellValueFactory(new PropertyValueFactory<>("y2"));
        right_y3Col.setCellValueFactory(new PropertyValueFactory<>("y3"));
        right_angle_ACol.setCellValueFactory(new PropertyValueFactory<>("angleA"));
        right_angle_BCol.setCellValueFactory(new PropertyValueFactory<>("angleB"));
        right_angle_CCol.setCellValueFactory(new PropertyValueFactory<>("angleC"));
        right_sideACol.setCellValueFactory(new PropertyValueFactory<>("sideA"));
        right_sideBCol.setCellValueFactory(new PropertyValueFactory<>("sideB"));
        right_sideCCol.setCellValueFactory(new PropertyValueFactory<>("sideC"));
        right_perimeterCol.setCellValueFactory(new PropertyValueFactory<>("perimeter"));
        right_squareCol.setCellValueFactory(new PropertyValueFactory<>("square"));



        x1Col.setSortType(TableColumn.SortType.DESCENDING);
        // y2Col.setSortable(false);

        ObservableList<Triangle> right_triangles_list = getRightTriangleList();
        right_triangle_table.setItems(right_triangles_list);

        right_triangle_table.getColumns().addAll(x1Col, x2Col, x3Col,y1Col, y2Col, y3Col,angle_ACol,angle_BCol,angle_CCol,sideACol,sideBCol,sideCCol,perimeterCol,squareCol);


        Label triangles_label = new Label("Triangles:");
        Label right_triangles_label = new Label("Right Triangles:");
        Label maxTriangleSquare_label = new Label("Max square of triangles : " + tri_list.findTriangle_List_MaxSquare());
        Label minTriangleSquare_label = new Label("Min square of triangles : " + tri_list.findTriangle_List_MinSquare());
        Label maxRightTriangleSquare_label = new Label("Max square of right triangles : " + right_tri_list.findTriangle_List_MaxSquare());
        Label minRightTriangleSquare_label = new Label("Min square of right triangles : " + right_tri_list.findTriangle_List_MaxSquare());
        Label identicalRightTriangles_label = new Label("Numbers of identical right Triangles : " + right_tri_list.findIdentical_List_Triangles());


        triangles_label.setPadding(new Insets(15));
        triangles_label.setFont(Font.font(15));

        right_triangles_label.setPadding(new Insets(15));
        right_triangles_label.setFont(Font.font(15));



        VBox root = new VBox();
        root.setPadding(new Insets(5));
        root.getChildren().add(triangles_label);
        root.getChildren().add(triangle_table);
        root.getChildren().add(maxTriangleSquare_label);
        root.getChildren().add(minTriangleSquare_label);
        root.getChildren().add(right_triangles_label);
        root.getChildren().add(right_triangle_table);
        root.getChildren().add(minRightTriangleSquare_label);
        root.getChildren().add(maxRightTriangleSquare_label);
        root.getChildren().add(identicalRightTriangles_label);

        stage.setTitle("Triangles TableView");


        Scene scene = new Scene(root, 1300, 500);
        stage.setScene(scene);
        stage.show();
    }
    private ObservableList<Triangle> getTriangleList() {

        final int N = 5;
        final int M = 5;
        final int MAX_SIDE_LENGTH = 25;
        int X1, X2, X3;
        int Y1, Y2, Y3;

        ObservableList<Triangle> triangle_list = FXCollections.observableArrayList();


        for (int i = 0; i < N; i++) {
            while (!Triangle.isTriangleExists(X1 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, X2 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, X3 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, Y1 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, Y2 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, Y3 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5)) {
            }
            triangle_list.add(new Triangle(X1, X2, X3, Y1, Y2, Y3));//Чтобы объект не пересоздавать,называется анонимный объект

            tri_list.add(new Triangle(X1, X2, X3, Y1, Y2, Y3));
        }
     //   System.out.println("Triangle with maximal square:" + triangles_list.findTriangle_List_MaxSquare());
        return triangle_list;

    }

    private ObservableList<Triangle> getRightTriangleList() {

        final int N = 5;
        final int M = 15;
        final int MAX_SIDE_LENGTH = 25;
        int X1, X2, X3;
        int Y1, Y2, Y3;

        right_tri_list.add(new Triangle(0,0,0,6,4,1));
        right_tri_list.add(new Triangle(0,0,0,6,4,1));

        ObservableList<Triangle> right_triangle_list = FXCollections.observableArrayList();

        for (int i = 0; i < M; i++) {
            while (!RightTriangle.isTriangleRight(X1 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, X2 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, X3 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, Y1 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, Y2 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, Y3 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5)) {
            }
            right_triangle_list.add(new RightTriangle(X1, X2, X3, Y1, Y2, Y3));//Чтобы объект не пересоздавать,называется анонимный объект
            right_tri_list.add(new RightTriangle(X1, X2, X3, Y1, Y2, Y3));
        }


        return right_triangle_list;

    }
}